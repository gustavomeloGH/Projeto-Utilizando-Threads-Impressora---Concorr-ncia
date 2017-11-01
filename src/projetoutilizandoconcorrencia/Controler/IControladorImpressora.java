
package projetoutilizandoconcorrencia.Controler;

import projetoutilizandoconcorrencia.Entity.HashMapOrder;

public interface IControladorImpressora {
     
    void imprimirArquivo (String fileName, int tempo) throws Exception;
    HashMapOrder atualizarListaPrioridades(HashMapOrder listaPrioridadeImpressao) throws Exception;
    void resetImpressora() throws Exception;
    void moverArquivoParaImprimindo(String nomeArquivo) throws Exception;
    int obterQuantidadeLinhasArquivo(String nomeArquivo) throws Exception;
    void pausarThread(String nomeThread) throws Exception;
    void continuarThread(String nomeThread);
}

