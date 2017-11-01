
package projetoutilizandoconcorrencia.GUI;

public interface IGerenciadorImpressora {
     
    void atualizarListaPrioridadeImpressao();
    void imprimir(int tempo);
    boolean existeArquivoParaImprimir();
    void pausarThread(String nomeThread);
    void continuarThread(String nomeThread);
    
} 
