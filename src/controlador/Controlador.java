/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Aritmetica;
import modelo.Fivonacci;
import modelo.Geometrica;
import vista.VentanaPrincipal;

/**
 *
 * @author USUARIO
 */
public class Controlador implements ActionListener 
{
    private VentanaPrincipal venPrin;
    private Aritmetica aritmetic;
    private Geometrica geometric;
    private Fivonacci Fivonac;
            
    public Controlador(Aritmetica miAritmetica, VentanaPrincipal miVentanaPrincipal,Geometrica pGeometrica, Fivonacci pFivonacci) 
    {
        this.aritmetic = miAritmetica;
        this.venPrin = miVentanaPrincipal;
        this.geometric = pGeometrica;
        this.Fivonac = pFivonacci;
        this.venPrin.miDatos.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String Comando = e.getActionCommand();
        
        if(Comando.equals("aritmetica"))
        {
            double VInicial=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrece el valor inicial de la sucesión"));
            double Incremento=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrece el incremento que sufre esa suceción"));
            double NoSuceciones=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrece el numero de suceciones a realizar"));
            
            aritmetic = new Aritmetica(VInicial,Incremento,NoSuceciones);
            venPrin.miResultados.mostrarResultado(String.valueOf(aritmetic));
        }
        
        if(Comando.equals("geometrica"))
        {
            double VInicial=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrece el valor inicial de la sucesión"));
            double RazonC=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrece la razón de cambio"));
            double NoSuceciones=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrece el numero de suceciones a realizar"));
            
            geometric = new Geometrica(VInicial, RazonC, NoSuceciones);
            venPrin.miResultados.mostrarResultado(String.valueOf(geometric));
        }
        
        if(Comando.equals("fibonacci"))
        {
            int NoSuceciones=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrece el numero de suceciones a realizar"));
            
            Fivonac = new Fivonacci(NoSuceciones);
            venPrin.miResultados.mostrarResultado(String.valueOf(Fivonac));
        }
    }
    
}
