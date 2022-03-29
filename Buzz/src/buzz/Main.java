package buzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner Entrada = new Scanner(System.in);
        Buzz Obj = new Buzz();

        System.out.println("Dado un número, mostrar Los números de 1 hasta el número.\n"
                + "Pero para múltiplos de tres imprimir \"buzz\" en Lugar del número\n"
                + "y para Los múlLtiplos de cinco imprimir \"Lightyear\".\n"
                + "Para múltiplos de tres y cinco imprimir \"Buzzlightyear\"");

        System.out.print("Dijite la cantidad de numeros: ");
        num = Integer.parseInt(Entrada.nextLine());
        Obj.setNumeros(num);
        Obj.toyStories();
    }

}
