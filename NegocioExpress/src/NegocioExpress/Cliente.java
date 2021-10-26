package NegocioExpress;

public class Cliente 
{
    private String nombre_;
    
    public Cliente(String nombre)
    {
        this.nombre_ = nombre;
    }
    
    public String GetNombre()
    {
        return this.nombre_;
    }
}
