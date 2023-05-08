package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    // ----------------------
    // Atributos
    // ----------------------
    public PanelOperaciones mOperaciones;
    public PanelResultados mResultados;

    // ----------------------
    // Metodos
    // ----------------------

    // Constructor
    public VentanaPrincipal() {

        this.setLayout(null);

        // Creación y adición del PanelOperaciones
        mOperaciones = new PanelOperaciones();
        mOperaciones.setBounds(10, 10, 465, 410);
        this.add(mOperaciones);

        // Creación y adición del PanelResultados
        mResultados = new PanelResultados();
        mResultados.setBounds(10, 425, 465, 180);
        this.add(mResultados);

        // Caracteristicas de la ventana
        this.setTitle("Telefonia");
        this.setSize(500, 650);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }
    
}