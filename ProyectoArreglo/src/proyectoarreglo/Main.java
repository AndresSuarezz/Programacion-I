package proyectoarreglo;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        vista view = new vista();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setResizable(false);
        
        /*
        int dato;
        Scanner Entrada = new Scanner(System.in);
        
        System.out.print("Tamaño del arreglo: ");
        dato = Integer.parseInt(Entrada.nextLine());
        ProyectoArreglo arreglo = new ProyectoArreglo(dato);        
        
        for(int i = 0; i < arreglo.getLongitud(); i++){
            String elemento;
            System.out.print("Introduce cualquier dato: ");
            elemento = Entrada.nextLine();
            arreglo.setElementos(i, elemento);
        }
        
        for(int i = 0; i < arreglo.getLongitud(); i++){
            System.out.println(arreglo.getListaNombre(i));
        }
        
        System.out.print("Cual elemento desea saber su indice: ");
        String e = Entrada.nextLine();
        System.out.print("El indice del elemento es: " + arreglo.searchArray(e));
                    
        */
    }
}
