/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import modelo.Aritmetica;
import vista.VentanaPrincipal;
import controlador.Controlador;
import modelo.Fivonacci;
import modelo.Geometrica;

/**
 *
 * @author USUARIO
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Aritmetica miAritmetica = null;
        Geometrica miGeometrica = null;
        Fivonacci miFivonacci = null;
        Controlador miControlador = new Controlador(miAritmetica, miVentanaPrincipal, miGeometrica, miFivonacci);
    }
    
}
