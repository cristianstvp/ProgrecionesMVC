/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author USUARIO
 */
public class PanelResultados extends JPanel
{
    private JTextArea taResultado;
    private JScrollPane spResultado;
    
    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        taResultado.setLineWrap(true);
        
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,10, 450, 280);
        taResultado.setFont(new Font("Arial", 2, 15));
        taResultado.setEditable(false);
        add(spResultado);
    }
    
    //Mostrar resultado
    public void mostrarResultado(String msj)
    {
        taResultado.append(msj+"\n");
    } 
}
