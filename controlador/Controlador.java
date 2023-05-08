package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPrincipal;
import modelo.PlanTelefonia;

public class Controlador implements ActionListener {

    // Atributos
    private VentanaPrincipal vP;
    private PlanTelefonia miTelefonia;

    // Constructor
    public Controlador(VentanaPrincipal vP, PlanTelefonia miTelefonia) {
    this.vP = vP;
    this.miTelefonia = miTelefonia;
    this.vP.mOperaciones.agregarOyentesBotones(this, vP); // Se agrega vP como argumento
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();

        // calcular
        if (event.equals("calcular")) {
            int numCelular = Integer.parseInt(vP.mOperaciones.getNumCelular());
            int cantidadMinuto = Integer.parseInt(vP.mOperaciones.getCantidadMinutos());
            double valorMinuto = Double.parseDouble(vP.mOperaciones.getValorMinutos());
            String operador = vP.mOperaciones.getOperador();

            PlanTelefonia emple = new PlanTelefonia(numCelular, operador, cantidadMinuto, valorMinuto);
            String lista = emple.obtenerTotalPagar();
            vP.mResultados.mostrarResultado("Telefonia movil \n" + lista);
        }

        // Salir
        if (event.equals("salir")) {
            System.exit(0);
        }

        // borrar
        if (event.equals("borrar")) {
            vP.mResultados.borrar();
        }
    }
}
