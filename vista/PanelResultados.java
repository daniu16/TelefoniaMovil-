package vista;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelResultados extends JPanel{

    private JTextArea taResultado;
    private JScrollPane spResultado;

    public PanelResultados(){

        this.setLayout(null);
        this.setBackground(Color.decode("#A388F5"));

        //Crear y agregar area de texto Resultados
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,440,150);
        this.add(spResultado);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
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

    public void mostrarResultado(String msg){
        taResultado.append(msg);
    }

    public void borrar(){
        taResultado.setText("");
    }

}