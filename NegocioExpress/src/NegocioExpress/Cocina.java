package NegocioExpress;

import java.util.*;

public class Cocina {
    static Hashtable<String, ArrayList<Comida>> pedidos = new Hashtable<String, ArrayList<Comida>>();
    
    static void AgregarPedido(Cliente cliente, Comida comida)
    {
        // Si el cliente ya esta en pedidos
        //
        if (pedidos.containsKey(cliente.GetNombre()))
        {
            // Agregar comida a la lista de este cliente
            //
            pedidos.get(cliente.GetNombre()).add(comida); 
        }
        else
        {
            // Si es un cliente nuevo, crearle una nueva lista de comidas
            //
            ArrayList<Comida> lista = new ArrayList<Comida>();
            lista.add(comida);
            pedidos.put(cliente.GetNombre(), lista);
        }
    }
    
    static void CancelarPedido(String nombre)
    {
        pedidos.remove(nombre);
    }
    
    static void MostrarPedidos()
    {        
        // Recorrer todos los clientes
        //
        for (Map.Entry<String, ArrayList<Comida>> entry : pedidos.entrySet()) 
        {
            String nombre = entry.getKey();
            ArrayList<Comida> lista = entry.getValue();
            
            // Imprimir el nombre del cliente
            //
            System.out.println(nombre + ": ");
            
            // Imprimir cada comida del cliente
            //
            for (int i = 0; i < lista.size(); i++) 
            {
                System.out.println("Nombre: " + lista.get(i).GetNombre());
                System.out.println("Precio: " + lista.get(i).CalcularPrecio());
            }
        }
    }
    
    static void TotalAPagar()
    {
        // Recorrer todos los clientes
        //
        for (Map.Entry<String, ArrayList<Comida>> entry : pedidos.entrySet()) 
        {
            String nombre = entry.getKey();
            ArrayList<Comida> lista = entry.getValue();
            
            int total = 0;
            
            // Calcular total a pagar del cliente
            //
            for (int i = 0; i < lista.size(); i++) 
            {
                total += lista.get(i).CalcularPrecio();
            }
            
            // Imprimir el nombre del cliente y su deuda
            //
            System.out.println(nombre + " debe pagar: " + total);
        }
    }
    
    static void FinalizarPedidos()
    {
        // Recorrer todos los clientes
        //
        for (Map.Entry<String, ArrayList<Comida>> entry : pedidos.entrySet()) 
        {
            System.out.println("Ingrese la dirección del delivery para el cliente " + entry.getKey());
            new Scanner(System.in).next();
        }
    }
}
