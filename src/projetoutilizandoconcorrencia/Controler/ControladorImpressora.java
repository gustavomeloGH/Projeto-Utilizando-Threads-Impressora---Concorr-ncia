
package projetoutilizandoconcorrencia.Controler;

import projetoutilizandoconcorrencia.DAO.FabricaDao;
import projetoutilizandoconcorrencia.DAO.IDao;
import projetoutilizandoconcorrencia.Entity.HashMapOrder;
import projetoutilizandoconcorrencia.Exceptions.Excecao;
import projetoutilizandoconcorrencia.GUI.IFrameGUIImpressora;
import projetoutilizandoconcorrencia.Util.Constantes;
import projetoutilizandoconcorrencia.Util.Mensagens;

public class ControladorImpressora implements IControladorImpressora {
        
    private final IDao dao;

    public ControladorImpressora(IFrameGUIImpressora iFrameGUIImpressora) {
        dao = FabricaDao.getInstanciaDao(iFrameGUIImpressora);
    }

    @Override
    public void imprimirArquivo (String fileName, int tempo) throws Exception {
            if(dao.existeEsteArquivo(Constantes.DIRECTORY_PATH_IMPRIMINDO, fileName)) {
                    dao.imprimirArquivo(fileName, tempo);
            } else {
                    throw  new Excecao (Mensagens.ERROR_FILE_NOT_READED);
            }
    }

    @Override
    public HashMapOrder atualizarListaPrioridades(HashMapOrder listaPrioridadeImpressao) throws Exception {
        if (dao.existeArquivosNaPasta(Constantes.DIRECTORY_PATH_IMPRESSOS)) {
                    return dao.atualizarListaPrioridade(listaPrioridadeImpressao);
            } else {
                    throw new Excecao(Mensagens.ERROR_FILE_NOT_FINDED);
            }
    }

    @Override
    public void resetImpressora() throws Exception {
        if(dao.existeArquivosNaPasta(Constantes.DIRECTORY_PATH_IMPRIMINDO)) {
                dao.resetArquivoImprimindo();
        } else {
            throw new Excecao(Mensagens.ERROR_FILE_NOT_FINDED);
        }
    }

    @Override
    public void moverArquivoParaImprimindo(String nomeArquivo) throws Exception {
            if(dao.existeEsteArquivo(Constantes.DIRECTORY_PATH_IMPRESSOS, nomeArquivo)) {
                    dao.moverArquivoParaPasta(nomeArquivo, Constantes.DIRECTORY_PATH_IMPRIMINDO);
            }
    }

    @Override
    public int obterQuantidadeLinhasArquivo(String nomeArquivo) throws Exception {
        int qtdLinhas = 0;
        if (dao.existeEsteArquivo(Constantes.DIRECTORY_PATH_IMPRESSOS, nomeArquivo)) {
                qtdLinhas = dao.obterQuantidadeLinhasArquivo(Constantes.DIRECTORY_PATH_IMPRESSOS, nomeArquivo);
        }
        return qtdLinhas;
    }

    @Override
    public void pausarThread(String nomeThread) throws Exception {
        dao.addArrayList(nomeThread);
    }

    @Override
    public void continuarThread(String nomeThread) {
        dao.removeArrayList(nomeThread);
        dao.continuarThread(nomeThread);
    }
        
}
