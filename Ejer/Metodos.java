package Ejer;

import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner ss = new Scanner(System.in);
    

    public void Llenar(Stack <Tienda> pi){
        
        boolean continuar = true;
        String agregar = "";

        while (continuar) {
            Tienda t = new Tienda();
            System.out.print("Ingresa la marca: ");
            t.setMarca(ss.next());
            System.out.print("Ingresa la referencia: ");
            t.setReferencia(ss.next());
            System.out.print("Ingresa el precio: ");
            t.setPrecio(ss.nextDouble());
            System.out.print("Ingresa la cantidad: ");
            t.setCantidad(ss.nextInt());
            pi.push(t);

            System.out.println("Desea agregar mas registros?  S/N");
            agregar = ss.next();
            if (agregar.equalsIgnoreCase("N")) {
                continuar=false;
            }
        }
    }

    public String ConsultarPrenda(Stack<Tienda> pila){
        String busca ="";
        System.out.println("Ingresa la referencia de la prenda a buscar: ");
        busca = ss.next();
        for (Tienda tienda : pila) {
            if (tienda.getReferencia().equalsIgnoreCase(busca)) {
                System.out.println("La prenda si esta: ");
                System.out.print("Referencia:  "+tienda.getReferencia());
                System.out.print("Marca: "+tienda.getMarca());
                System.out.print("Precio: "+tienda.getPrecio());
                System.out.println("Cantidad: "+tienda.getCantidad());
                
            }else{
                System.out.println("La prenda cosultada no existe");
            }
        }
                return busca;

    }

    public void ModificarPrenda(Stack<Tienda> pila){
        String modificar = "";
        System.out.println("Ingrese la referencia a modificar: ");
        modificar = ss.next();
        for (Tienda tienda : pila) {
            if (modificar.equalsIgnoreCase(tienda.getReferencia())) {
                System.out.println("Prenda encontrada: Modificando ");
                System.out.print("Referencia: ");
                tienda.setReferencia(ss.next());
                System.out.println("Marca:");
                tienda.setMarca(ss.next());
                System.out.println("Precio: ");
                tienda.setPrecio(ss.nextInt());
                System.out.println("Cantidad: ");
                tienda.setCantidad(ss.nextInt());    
                
            }else{
                System.out.println("La referencia a modificar no esta disponible");
            }
        }
    }

    public void VenderPrenda(Stack<Tienda> pila){
        String Vender ="";
        System.out.println("Ingresa la referencia de la prenda que desea vender:");
        Vender = ss.next();
        for (Tienda tienda : pila) {
            if (tienda.getReferencia().equalsIgnoreCase(Vender)) {
                System.out.print("Cantidad que desea vender: ");
                int cant = ss.nextInt();
                if (cant<tienda.getCantidad()) {
                    tienda.setCantidad(tienda.getCantidad()-cant);
                }else{
                    System.out.println("La cantidad que desea vender excede el stock");
                    break;
                }
            }
        }
    }

    public void MostrarPila(Stack<Tienda> pila){
        for (Tienda tienda : pila) {
            System.out.println("Referencia: "+tienda.getReferencia());
            System.out.println("Marca: "+tienda.getMarca());
            System.out.println("Stock disponible: "+tienda.getCantidad());
            System.out.println("-------------------------------------------");
        }
    }


    
}
