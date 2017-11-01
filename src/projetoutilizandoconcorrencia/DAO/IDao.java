
package projetoutilizandoconcorrencia.DAO;

import java.io.File;
import java.io.IOException;
import projetoutilizandoconcorrencia.Entity.HashMapOrder;
import projetoutilizandoconcorrencia.Exceptions.Excecao;

public  interface  IDao {
    
    File[] listar(String caminho) throws Exception;
    void imprimirArquivo(String fileName, int tempo) throws Exception;
    boolean existeArquivosNaPasta(String caminho) throws Excecao;
    boolean existeEsteArquivo(String caminho, String nome);
    HashMapOrder atualizarListaPrioridade(HashMapOrder listaPrioridadeImpressao) throws  Exception;
    void resetArquivoImprimindo() throws Exception;
    void moverArquivoParaPasta(File arquivo, String caminhoDestino) throws IOException;
    void moverArquivoParaPasta(String nomeArquivo, String caminhoDestino) throws IOException;
    int obterQuantidadeLinhasArquivo(String caminho, String nomeArquivo) throws Exception;
    void continuarThread(String nomeThread);
    void addArrayList(String string);
     void removeArrayList(String string);
            
}
