
package projetoutilizandoconcorrencia.Util;

public class Mensagens {
    
    public static final String ERROR_FILE_NOT_FINDED = "Não foi possível realizar a impressão, pois não há arquivos a serem imprimidos!";
    public static final String ERROR_FILE_NOT_READED = "Não foi possível realizar a leitura dos arquivos!";
    public static final String PRINTING  = "Imprimindo: ";
    public static final String FINALIZED = "Finalizado:";
    public static final String PAUSED = "Pausado:";
    
    public static void printStartImpressao(String nomeThread, String nomeArquivo) {
        System.out.printf("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n---------------->> %s - %s - COMEÇOU A IMPRESSÃO <<-------------\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n", nomeThread, nomeArquivo);
    }
    
     public static void printFinishImpressao(String nomeThread, String nomeArquivo) {
        System.out.printf("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n################>> %s - %s - FINALIZOU A IMPRESSÃO <<###############\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n", nomeThread, nomeArquivo);
    }
    
}
