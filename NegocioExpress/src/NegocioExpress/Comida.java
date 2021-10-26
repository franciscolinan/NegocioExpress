package NegocioExpress;

abstract class Comida {
    protected int precio_;
    protected int tamanio; //1 chico, 2 medio, 3 grande
    protected String nombre;
    abstract String GetNombre();
    abstract int CalcularPrecio();
}
