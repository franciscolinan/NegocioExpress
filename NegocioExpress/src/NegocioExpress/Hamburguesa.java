package NegocioExpress;

public class Hamburguesa extends Comida{
    Hamburguesa(int tamanio)
    {
        this.tamanio = tamanio;
        this.precio_ = 300;
        
        // Setear el nombre de la comida
        //
        if (tamanio == 1)
        {
            this.nombre = "Hamburguesa chica";
        }
        
        if (tamanio == 2)
        {
            this.nombre = "Hamburguesa mediana";
        }
        
        if (tamanio == 3)
        {
            this.nombre = "Hamburguesa grande";
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
        // Si la hamburguesa es de tamaño chico entonces sale un 80% del total
        //
        if (this.tamanio == 1)
        {
            precio *= 0.8;
        }
        
        // Si la hamburguesa es de tamaño medio entonces el precio no cambia
        //
        
        //Si la hamburguesa es de tamaño grande entonces el precio sale 2.5 más
        //
        if (this.tamanio == 3)
        {
            precio *= 2.5;
        }
        
        return precio;
    }
}
