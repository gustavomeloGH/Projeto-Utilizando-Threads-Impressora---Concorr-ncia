
package projetoutilizandoconcorrencia.Controler;

import projetoutilizandoconcorrencia.GUI.IFrameGUIImpressora;

public class FabricaControlador {
        
    
    public static IControladorImpressora getInstanciaDao(IFrameGUIImpressora iFrameGUIImpressora) {
        return new ControladorImpressora(iFrameGUIImpressora);
    }
}
