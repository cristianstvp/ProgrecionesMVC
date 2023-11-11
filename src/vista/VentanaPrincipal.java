package vista;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VentanaPrincipal extends JFrame
{
    public PanelDatos miDatos;
    public PanelResultados miResultados;

    public VentanaPrincipal() {
        
        setLayout(null);
        setBackground(Color.WHITE);
        
        miDatos = new PanelDatos();
        miDatos.setBounds(5,5,470,200); 
        add(miDatos);
        miDatos.setVisible(true);
        
        miResultados = new PanelResultados();
        miResultados.setBounds(5,210,470,300); 
        add(miResultados);
        miResultados.setVisible(true);
        
        //Caracteristicas de la ventana
        setTitle("Sucesiones");
        setSize(500,555); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
        
}
