package ejecutable;

import vista.VentanaPrincipal;
import modelo.PlanTelefonia;
import controlador.Controlador;

public class Test {

    
    public static void main(String[] args) {
         
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miTelefonia = new PlanTelefonia(0, null, 0, 0);

        Controlador mControlador = new Controlador(miVentana, miTelefonia);
    }
}
