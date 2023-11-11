package modelo;

public class Fivonacci extends Progresion
{
    private int sucesion;
    private String NSucesiones="";
    
    public Fivonacci(int NoSuceciones) 
    {
        super("de Fivonacci");
        sucesion = NoSuceciones;
    }

    @Override
    protected String calcularSucesion() 
    {
        for(int i=0;i<sucesion;i++)
        {
            NSucesiones= NSucesiones + (int)(1/Math.sqrt(5)*(Math.pow(((1+Math.sqrt(5))/2), i)-Math.pow(((1-Math.sqrt(5))/2), i)))+" , ";
        }
        return "\nPrimeros "+sucesion+" terminos:\n{ "+NSucesiones+" }\n\n";
    }
}
