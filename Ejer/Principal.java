package Ejer;

import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack <Tienda> pila = new Stack<>();
       

         m.MostrarPila(pila);
        boolean bandera = true;
        int opt =0;
       
        while (bandera) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar elementos");
            System.out.println("2. Buscar elemento");
            System.out.println("3. Vender prenda");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Modificar prenda");
            System.out.println("6. Salir");
            System.out.println("------------------------------------");
            opt = ss.nextInt();
            switch (opt) {
                case 1:
                    m.Llenar(pila);
                    break;
                case 2:
                m.ConsultarPrenda(pila);
                    
                    break;
                case 3:
                m.VenderPrenda(pila);
        
                    break;
                case 4:
                m.MostrarPila(pila);
                    break;
                case 5:
                m.ModificarPrenda(pila);
                    break;
               
                default:
                if (opt ==6) {
                    bandera = false;
                }
                    break;
               }
        
        }
       

    }
    
}
