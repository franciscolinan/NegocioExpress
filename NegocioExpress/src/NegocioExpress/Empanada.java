package NegocioExpress;

public class Empanada extends Comida{
    Empanada(int tamanio)
    {
        this.tamanio = tamanio;
        this.precio_ = 50;
        
        // Setear el nombre de la comida
        //
        if (tamanio == 1)
        {
            this.nombre = "Empanada chica";
        }
        
        if (tamanio == 2)
        {
            this.nombre = "Empanada mediana";
        }
        
        if (tamanio == 3)
        {
            this.nombre = "Empanada grande";
        }
    }
    
    @Override
    public String GetNombre()
    {
        return this.nombre;
    }
    
    @Override
    public int CalcularPrecio()
    {
        int precio = this.precio_;
        // Si la empanada es de tamaño chico entonces sale 1/3 del precio
        //
        if (this.tamanio == 1)
        {
            precio *= 0.3;
        }
        
        // Si la empanada es de tamaño medio entonces el precio no cambia
        //
        
        //Si la empanada es de tamaño grande entonces el precio sale 1/3 más
        //
        if (this.tamanio == 3)
        {
            precio *= 1.3;
        }
        
        return precio;
    }
}
