package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelOperaciones extends JPanel {
    
    private JButton btCalcular;
    private JButton btBorrar;
    private JButton btSalir;

    private JLabel lbNumcelular;
    private JTextField tfNumCelular;
    private JLabel lbCanMinutos;
    private JTextField tfCanMinutos;
    private JLabel lbValMinutos;
    private JTextField tfValMinutos;
    
    private JComboBox<String> cbOperadores;
    private JLabel lbOperadores;

    public PanelOperaciones() {
        this.setLayout(null);
        this.setBackground(Color.decode("#A388F5"));

        // Crear y agregar número de celular, cantidad de minutos y el valor de minutos
        lbNumcelular = new JLabel("Numero de celular: ");
        lbNumcelular.setBounds(30, 50, 140, 20);
        this.add(lbNumcelular);

        tfNumCelular = new JTextField();
        tfNumCelular.setBounds(170, 50, 100, 25);
        this.add(tfNumCelular);

        lbCanMinutos = new JLabel("Cantidad de minutos: ");
        lbCanMinutos.setBounds(30, 90, 140, 20);
        this.add(lbCanMinutos);

        tfCanMinutos = new JTextField();
        tfCanMinutos.setBounds(170, 90, 100, 25);
        this.add(tfCanMinutos);

        lbValMinutos = new JLabel("Valor de los minutos: ");
        lbValMinutos.setBounds(30, 130, 140, 20);
        this.add(lbValMinutos);

        tfValMinutos = new JTextField();
        tfValMinutos.setBounds(170, 130, 100, 25);
        this.add(tfValMinutos);

        // agregar y crear jcombox
        cbOperadores = new JComboBox<>();
        cbOperadores.setBounds(170, 190, 200, 20);
        cbOperadores.addItem("Wom");
        cbOperadores.addItem("Claro");
        cbOperadores.addItem("Movistar");
        cbOperadores.addItem("Tigo");
        this.add(cbOperadores);

        lbOperadores = new JLabel("Operador que desea: ");
        lbOperadores.setBounds(30, 190, 140, 20);
        this.add(lbOperadores);


        //agregar y crear calcular, borrar, salir
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(290, 265, 120, 25);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(290, 310, 120, 25);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(290, 355, 120, 25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }

    // pintar panel
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#80A3FA")); // color de la línea diagonal

        for (int i = 0; i <= 780; i = i + 1) {

            // dibuja muchas línea diagonal por la mitad del panel
            g.drawLine(i, getHeight(), getWidth() , getHeight() / 10);
            g.drawLine(i + 1, getHeight(), getWidth() , getHeight() / 10);
            i = i + 1;
        }

    }

    public int getIndexEmpleado() {
        return cbOperadores.getSelectedIndex();
    }

    public void agregarOyentesBotones(ActionListener pAL, VentanaPrincipal ventanaPrincipal){
        btCalcular.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
        cbOperadores.addActionListener(pAL);
        ventanaPrincipal.mOperaciones.tfNumCelular = tfNumCelular; 
        ventanaPrincipal.mOperaciones.tfCanMinutos = tfCanMinutos; 
        ventanaPrincipal.mOperaciones.tfValMinutos = tfValMinutos; 
    }
    public String getNumCelular() {
        return tfNumCelular.getText();
    }

    public String getCantidadMinutos() {
        return tfCanMinutos.getText();
    }

    public String getValorMinutos() {
        return tfValMinutos.getText();
    }

    public String getOperador() {
        return cbOperadores.getSelectedItem().toString();
    }
}
