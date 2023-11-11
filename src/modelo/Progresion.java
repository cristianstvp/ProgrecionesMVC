package modelo;

public abstract class Progresion 
{
    protected String Tipo;

    public Progresion(String pTipo) 
    {
        this.Tipo=pTipo;
    }
    
    protected abstract String calcularSucesion();
    
    @Override
    public String toString()
    {
        return "Sucecion "+Tipo+calcularSucesion();
    }
}
