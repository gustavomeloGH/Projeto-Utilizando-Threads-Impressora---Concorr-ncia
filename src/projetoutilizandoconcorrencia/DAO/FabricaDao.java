
package projetoutilizandoconcorrencia.DAO;

import projetoutilizandoconcorrencia.GUI.IFrameGUIImpressora;

public class FabricaDao {
    
    public static IDao getInstanciaDao(IFrameGUIImpressora iFrameGUIImpressora) {
            return new Dao(iFrameGUIImpressora);
    }
    
}
