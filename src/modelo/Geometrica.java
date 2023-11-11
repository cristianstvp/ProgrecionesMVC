package modelo;

public class Geometrica extends Progresion
{
    private double Ninicial;
    private double RazonCam;
    private double sucesion;
    private String NSucesiones="";
    
    public Geometrica(double pInicial,double pRazonC,double pSucesiones) 
    {
        super("Geometrica");
        Ninicial = pInicial;
        RazonCam=pRazonC;
        sucesion=pSucesiones;
    }

    @Override
    protected String calcularSucesion() 
    {
        for(int i=0;i<sucesion;i++)
        {
            NSucesiones= NSucesiones + (Ninicial*Math.pow(RazonCam, i))+" , ";
        }
        return "\nNumero inicial: "+Ninicial+"\nRazon de cambio: "+RazonCam+"\n{ "+NSucesiones+" }\n\n";
    }
}
