package NegocioExpress;

import java.util.Scanner;

public class Menu {
    
    private Scanner in_ = new Scanner(System.in);
    
    public Menu()
    {
        Login.IniciarSesion();
    }
    
    public boolean MostrarMenu()
    {
        // Devuelve false si el usuario decidió terminar
        //
        
        System.out.println("--- Menú ---");
        System.out.println("[1] - Agregar pedido");
        System.out.println("[2] - Cancelar pedido por nombre de cliente");
        System.out.println("[3] - Mostrar pedidos");
        System.out.println("[4] - Mostrar total por cliente");
        System.out.println("[5] - Realizar pago y finalizar");
        
        int opcion = 0;
        
        // Verificar que el usuario ingresó un entero
        //
        try
        {
            opcion = in_.nextInt();
        }
        catch (Exception e){
            in_.nextLine();
            return true;
        }
        
        switch  (opcion)
        {
            case 1:
                // Agregar pedido
                //
                
                // Solicitar información del cliente
                System.out.println("Nombre del cliente: ");
                String nombre = in_.next();
                Cliente cliente = new Cliente(nombre);
                
                // Solicitar información del pedido
                System.out.println("--- Tamaño de la comida ---");
                System.out.println("[1] - Chico");
                System.out.println("[2] - Mediano");
                System.out.println("[3] - Grande");
                
                // Verificar que el usuario ingresó un entero
                //
                try
                {
                    opcion = in_.nextInt();
                }
                catch (Exception e){
                    in_.nextLine();
                    return true;
                }
                
                int tamanio = opcion;
                
                System.out.println("--- Tipo de comida ---");
                System.out.println("[1] - Pizza");
                System.out.println("[2] - Empanada");
                System.out.println("[3] - Hamburguesa");
                Comida comida;
                
                // Verificar que el usuario ingresó un entero
                //
                try
                {
                    opcion = in_.nextInt();
                }
                catch (Exception e){
                    in_.nextLine();
                    return true;
                }
                
                switch  (opcion)
                {
                    case 1:
                        comida = new Pizza(tamanio);
                        break;
                        
                    case 2:
                        comida = new Empanada(tamanio);
                        break;
                        
                    case 3:
                        comida = new Hamburguesa(tamanio);
                        break;
                        
                    default:
                        comida = new Pizza(tamanio);
                }
                
                // Agregar el pedido a la lista de pedidos
                //
                Cocina.AgregarPedido(cliente, comida);
                
                return true;
                
            case 2:
                // Cancelar pedido
                //
                
                System.out.println("Ingrese el nombre del cliente: ");
                Cocina.CancelarPedido(in_.next());
                
                return true;
                
            case 3:
                // Mostrar pedidos
                //
                
                Cocina.MostrarPedidos();
                
                return true;
            
            case 4:
                // Mostrar total a pagar por cada cliente
                //
                
                Cocina.TotalAPagar();
                
                return true;
                
            case 5:
                // Finalizar
                //

                Cocina.FinalizarPedidos();
                Cocina.MostrarPedidos();
                
                System.out.println("Gracias por comprar en NegocioExpress ;D");
                
                return false;
                
            default:
                return false;
        }
    }
}
