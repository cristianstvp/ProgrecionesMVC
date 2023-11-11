package modelo;

public class Aritmetica extends Progresion
{
    private double Ninicial;
    private double Incremento;
    private double sucesion;
    private String Sucesiones="";

    public Aritmetica(double pVInicial, double pIncremento, double pSucecion) {
        super("Aritmetica");
        this.Ninicial=pVInicial;
        this.Incremento=pIncremento;
        this.sucesion=pSucecion;
    }

    @Override
    protected String calcularSucesion() 
    {
        for(int i=0;i<sucesion;i++)
        {
            Sucesiones= Sucesiones + (Ninicial+((i)*Incremento))+" , ";
        }
        return "\nNumero inicial: "+Ninicial+"\nIncremento: "+Incremento+"\n{ "+Sucesiones+" }\n\n";
    }
}
