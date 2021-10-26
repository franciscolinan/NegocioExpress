package NegocioExpress;

// Esta clase tiene una promoción de 3 x 1
//
public class Pizza extends Comida{
    Pizza(int tamanio)
    {
        this.tamanio = tamanio;
        this.precio_ = 100;
        
        // Setear el nombre de la comida
        //
        if (tamanio == 1)
        {
            this.nombre = "Pizza chica";
        }
        
        if (tamanio == 2)
        {
            this.nombre = "Pizza mediana";
        }
        
        if (tamanio == 3)
        {
            this.nombre = "Pizza grande";
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
        // Si la pizza es de tamaño chico entonces sale la mitad
        //
        if (this.tamanio == 1)
        {
            precio /= 2;
        }
        
        // Si la pizza es de tamaño medio entonces el precio no cambia
        //
        
        //Si la pizza es de tamaño grande entonces el precio sale el doble
        //
        if (this.tamanio == 3)
        {
            precio *= 2;
        }
        
        return precio;
    }
}
