package NegocioExpress;

import java.util.Scanner;

public class Login {
    static Scanner in_ = new Scanner(System.in);
    static boolean logueado_ = false;
    
    public static void IniciarSesion()
    {
        // Metodo implementado de forma recursiva
        //
        System.out.println("Ingrese la contraseña: ");
        
        logueado_ = in_.next().equals("admin");
        
        if (logueado_ == false)
        {
            IniciarSesion();
        }
    }
}
