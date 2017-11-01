package projetoutilizandoconcorrencia.DAO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.Scanner;
import projetoutilizandoconcorrencia.Entity.HashMapOrder;
import projetoutilizandoconcorrencia.Exceptions.Excecao;
import projetoutilizandoconcorrencia.GUI.IFrameGUIImpressora;
import projetoutilizandoconcorrencia.Util.Constantes;
import projetoutilizandoconcorrencia.Util.Mensagens;

public class Dao implements IDao {
    
    private boolean estaPausado;
    private ArrayList listaThredsParados;
    private final IFrameGUIImpressora iFrameGUIImpressora;
    private int cont;
    
    public Dao(IFrameGUIImpressora iFrameGUIImpressora) {
         estaPausado = false;
         listaThredsParados = new ArrayList<>();
         this.iFrameGUIImpressora = iFrameGUIImpressora;
         cont = 0;
    }
    
     @Override
     public File[] listar(String caminho) throws Exception  {
                File diretorio = new File(caminho);
                return diretorio.listFiles();
     }
     
     @Override
     public void imprimirArquivo(String nomeArquivo, int tempo) throws Exception  {
               
            File arquivo;
            Scanner arqReader;

            try {
                 arquivo =  pegarArquivo(Constantes.DIRECTORY_PATH_IMPRIMINDO, nomeArquivo);                 
                 arqReader = new Scanner(arquivo);
                 String linha;
                  Mensagens.printStartImpressao(Thread.currentThread().getName(), nomeArquivo);
                  
                  while(arqReader.hasNext()) {
                      if ( cont != listaThredsParados.size() ) {
                          System.out.println("Tamanho lista: " + listaThredsParados.size() + " condição:  " + (cont != listaThredsParados.size()));
                           pausarThread();
                      } else  {
                           linha = arqReader.next();
                           System.out.println(Thread.currentThread().getName() + " -  " +  nomeArquivo + "\n\t" +  linha);
                           alterarBarraDeProgressoNaTelaGUIImpressora(nomeArquivo);
                           Thread.sleep(tempo);
                      }
                  }
                 arqReader.close();
                 Mensagens.printFinishImpressao(Thread.currentThread().getName(), nomeArquivo);

                 moverArquivoParaPasta(arquivo, Constantes.DIRECTORY_PATH_FINALIZADOS);

            } catch (IOException e) {
                    throw new Exception(e.getMessage());
            }
     }
     

    @Override
    public synchronized void continuarThread(String nomeThread) {
        System.out.println("Removendo agora!!! +" + nomeThread);
            String mensagem = alterarMensagemLabel(nomeThread, Mensagens.PRINTING);
            iFrameGUIImpressora.atualizarLabelThread(nomeThread, mensagem);
            estaPausado = false;
            cont = 0;
            notifyAll();
    }
    
    @Override
     public boolean existeArquivosNaPasta(String caminho) throws Excecao {

             File diretorio = new File(caminho);
             boolean boo;
             if (!diretorio.isDirectory()) {
                      boo = diretorio.isDirectory();
             } else {
                     File[] files = diretorio.listFiles();
                     boo = files.length > 0;
              }
             return boo;
      }
        
    @Override 
    public boolean existeEsteArquivo(String caminho, String nome) {
            return pegarArquivo(caminho, nome) .exists();
    }

    @Override
    public HashMapOrder atualizarListaPrioridade(HashMapOrder listaPrioridadeImpressao) throws  Exception {

            File [] arquivos = listar(Constantes.DIRECTORY_PATH_IMPRESSOS);
            for (File file : arquivos) {
                 if( !listaPrioridadeImpressao.containsKey(file.getName()))  {
                     String nomeArquivo = file.getName();
                     int prioridadeArquivo = pegarPrioridadeArquivo(file.getName());
                     int tamanhoArquivo = (int) file.length();
                     Integer [] especificacoesArquivo = {prioridadeArquivo, tamanhoArquivo};
                     listaPrioridadeImpressao.put(nomeArquivo, especificacoesArquivo);
                 }
            }
            return listaPrioridadeImpressao;          
    }

   @Override
   public void resetArquivoImprimindo() throws Exception {
            File [] arquivos = listar(Constantes.DIRECTORY_PATH_IMPRIMINDO);
            for (File arquivo : arquivos) {
                moverArquivoParaPasta(arquivo, Constantes.DIRECTORY_PATH_IMPRESSOS);
             } 
    }

    @Override
   public void moverArquivoParaPasta(File arquivo, String caminhoDestino) throws IOException {
            String nomeArquivo = arquivo.getName();
            mover(arquivo, nomeArquivo, caminhoDestino);
    }

   @Override
   public void moverArquivoParaPasta(String nomeArquivo, String caminhoDestino) throws IOException {
            File arquivo = pegarArquivo(Constantes.DIRECTORY_PATH_IMPRESSOS, nomeArquivo);
            mover(arquivo, nomeArquivo, caminhoDestino);
   }

   @Override
   public int obterQuantidadeLinhasArquivo(String caminho, String nomeArquivo) throws Exception { 
        File arquivo = pegarArquivo(caminho, nomeArquivo);
        LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivo));
        linhaLeitura.skip(arquivo.length());
        linhaLeitura.close();
        return linhaLeitura.getLineNumber();
   }
   
       @Override 
    public void addArrayList(String string) {
        listaThredsParados.add(string);
    }
    
    @Override 
    public void removeArrayList(String string) {
        listaThredsParados.remove(string);
    }
     
     
    private synchronized void pausarThread() throws InterruptedException {
        String nomeThreadAtual = Thread.currentThread().getName();
         System.out.println("Entrou na pausa de thread ->>" + nomeThreadAtual);
        String mensagem = alterarMensagemLabel(nomeThreadAtual, Mensagens.PAUSED);
         if (listaThredsParados.contains(nomeThreadAtual)) { 
                iFrameGUIImpressora.atualizarLabelThread(nomeThreadAtual, mensagem);
                estaPausado = true;
                cont += 1;
                 System.out.println("Entrou IF --> FIM DE TUDO ->>" + nomeThreadAtual + "  contador ->> " + cont);
                while(estaPausado) {
                    wait();
                }
          }
   }


   private void mover (File arquivo, String nomeArquivo, String caminhoDestino) throws IOException {
       Files.move(arquivo.toPath(), Paths.get(caminhoDestino, nomeArquivo), REPLACE_EXISTING);
   }

    private Integer pegarPrioridadeArquivo(String nomeArquivo) {
            String [] splitPorPrioridade = (nomeArquivo.split("-"));
            return splitPorPrioridade.length > 1 ? 
                    Integer.parseInt(splitPorPrioridade[1].replace(".txt", ""))    :     0;
    }

    private File pegarArquivo(String caminho, String name) {
            return new File(caminho,  name);
    }

    private synchronized void alterarBarraDeProgressoNaTelaGUIImpressora(String nomeArquivo) {
         String nomeThread = Thread.currentThread().getName();
         int progressoAtual = iFrameGUIImpressora.pegarProgressoAtual(nomeThread) + 1;
         int progressoMax =  iFrameGUIImpressora.pegarMaxProgressoAtual(nomeThread);
         iFrameGUIImpressora.atualizajProgressBar(progressoAtual, nomeThread);
         if(progressoAtual >= progressoMax) {
                String mensagem = alterarMensagemLabel(nomeThread, Mensagens.FINALIZED);
                 iFrameGUIImpressora.atualizarLabelThread(nomeThread, mensagem);
         }
    }

    
    private String alterarMensagemLabel(String nomeThread, String mensagem) {
        String mensagemLabel = iFrameGUIImpressora.pegarNomeLabelAtual(nomeThread);
        return mensagemLabel.replace(mensagemLabel.substring(0, (mensagemLabel.indexOf(":")+1)), mensagem);
    }


    

}