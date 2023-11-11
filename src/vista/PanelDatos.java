/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class PanelDatos extends JPanel
{
    private JButton btAritmetica,btGeometrica,btFivonacci;
    private JLabel lbTexto;

    public PanelDatos() {
        setLayout(null);
        setBackground(Color.WHITE);
        
//        JLabel
        lbTexto = new JLabel("Progreción Aritmetica");
        lbTexto.setBounds(160,50, 200, 20);
        add(lbTexto);
        
        lbTexto = new JLabel("Progreción Geometrica");
        lbTexto.setBounds(160,90, 200, 20);
        add(lbTexto);
        
        lbTexto = new JLabel("Progreción De Fivonacci");
        lbTexto.setBounds(160,130, 200, 20);
        add(lbTexto);
        
        lbTexto = new JLabel("Indique el tipo de Progreción",JLabel.CENTER);
        lbTexto.setBounds(0,10, 490, 20);
        lbTexto.setFont(new Font("Arial",1,15));
        add(lbTexto);
        
//        JButton
        btAritmetica = new JButton("Aritmetica");
        btAritmetica.setBounds(20,50,100,20);
        add(btAritmetica);
        btAritmetica.setActionCommand("aritmetica");
        
        btGeometrica = new JButton("geométrica");
        btGeometrica.setBounds(20,90,100,20);
        add(btGeometrica);
        btGeometrica.setActionCommand("geometrica");
        
        btFivonacci = new JButton("Fibonacci");
        btFivonacci.setBounds(20,130,100,20);
        add(btFivonacci);
        btFivonacci.setActionCommand("fibonacci");
        
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAritmetica.addActionListener(pAL);
        btFivonacci.addActionListener(pAL);
        btGeometrica.addActionListener(pAL);
    }
}
