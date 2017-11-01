
package projetoutilizandoconcorrencia.Entity;

import projetoutilizandoconcorrencia.GUI.GerenciadorImpressora;

public class RunnableImpressora implements Runnable {
    
    private int tempo;
    private String nome;
    private final GerenciadorImpressora impressora;
    private boolean ligado;
    
    public RunnableImpressora (String nome, int tempo, GerenciadorImpressora impressora) {
           this.tempo = tempo;
           this.nome = nome;
           this.impressora = impressora;
           initializeThread();
           ligado = false;
    }
    
    private void initializeThread() {
        Thread thread = new Thread(this, nome);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.start();
    }
    
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ligarDesligarImpressora (boolean estado) {
           this.ligado = estado;
    }
    
    @Override
    public void run() {
        while(true) {
            while(ligado) {
                impressora.atualizarListaPrioridadeImpressao();
                 if(impressora.existeArquivoParaImprimir())  {
                     impressora.imprimir(tempo);
                 }
           }
        }
     } 
    
    
}
