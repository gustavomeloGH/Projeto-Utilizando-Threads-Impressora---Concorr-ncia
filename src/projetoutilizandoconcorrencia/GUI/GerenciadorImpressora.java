
package projetoutilizandoconcorrencia.GUI;

import projetoutilizandoconcorrencia.Controler.ControladorImpressora;
import projetoutilizandoconcorrencia.Controler.IControladorImpressora;
import projetoutilizandoconcorrencia.Entity.HashMapOrder;
import projetoutilizandoconcorrencia.Util.Mensagens;

public class GerenciadorImpressora implements  IGerenciadorImpressora {
    
    private final IControladorImpressora control;
    private  HashMapOrder listaPrioridadeImpressao;
    IFrameGUIImpressora iFrameGUIImpressora;
    
    public GerenciadorImpressora(IFrameGUIImpressora iFrameGUIImpressora) {
        listaPrioridadeImpressao =  new HashMapOrder();
        control = new ControladorImpressora(iFrameGUIImpressora);
        this.iFrameGUIImpressora = iFrameGUIImpressora;
        resetImpressora();
    }
    
    @Override
    public synchronized void atualizarListaPrioridadeImpressao()  {
        try {
            listaPrioridadeImpressao = control.atualizarListaPrioridades(listaPrioridadeImpressao);
        } catch (Exception ex) {
            // System.err.println(Thread.currentThread().getName() + " " +  ex.getMessage());
            // Já que este método vai ficar como "listening" da pasta de arquivos, 
            // é conveniente que não mostre mensagens, toda vez que a lista for vazia
        }
    }
    
    @Override
    public void imprimir(int tempo) {
  
        String nomeArquivo = null;
        synchronized(this) {
            if(existeArquivoParaImprimir()) {
                nomeArquivo = (String) listaPrioridadeImpressao.removeFirst();
                try {
                    definirBarraDeProgressoDaTelaGUIImpressora(nomeArquivo);
                    control.moverArquivoParaImprimindo(nomeArquivo);
                 } catch (Exception ex) {
                    System.err.println(Thread.currentThread().getName() + " " +  ex.getMessage());
                }
                atualizarListaPrioridadeImpressao();
              }
          }
           
         try {
            if (nomeArquivo != null) control.imprimirArquivo(nomeArquivo, tempo);
         } catch (Exception ex) {
             System.err.println(Thread.currentThread().getName() + " " +  ex.getMessage());
         }
    }
    
    @Override
    public synchronized  boolean existeArquivoParaImprimir() {
            return (!listaPrioridadeImpressao.isEmpty());
    }
    
    @Override
    public void pausarThread(String nomeThread) {
        try {
            control.pausarThread(nomeThread);
        } catch (Exception ex) {
            System.err.println(Thread.currentThread().getName() + " " +  ex.getMessage());
        }
    }
    
    @Override
    public void continuarThread(String nomeThread) {
        control.continuarThread(nomeThread);
    }
   
    private void resetImpressora() {
        try {
            control.resetImpressora();
        } catch (Exception ex) {
            //método não precisa ser exposto
        }
    }
    
    private void definirBarraDeProgressoDaTelaGUIImpressora(String nomeArquivo) throws Exception {
        int tamanho = control.obterQuantidadeLinhasArquivo(nomeArquivo) + 1;
        String nomeThread = Thread.currentThread().getName();
        iFrameGUIImpressora.defineJProgressBar(0, tamanho, nomeThread);
        iFrameGUIImpressora.atualizajProgressBar(0, nomeThread);
        iFrameGUIImpressora.atualizarLabelThread(nomeThread, Mensagens.PRINTING + nomeArquivo);
    }
    
}