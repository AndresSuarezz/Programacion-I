/*

Dado un número, mostrar Los números de 1 hasta el número.
Pero para múltiplos de tres imprimir "buzz" en Lugar del número
y para Los múlLtiplos de cinco imprimir "Lightyear".
Para múltiplos de tres y cinco imprimir "Buzzlightyear".

 */
package buzz;

public class Buzz {

    //Atributos y encapsulado
    private int numeros;

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    //Constructor
    public void Buzz(int numeros) {
        setNumeros(numeros);
    }

    //Metodos
    public void toyStories() {
        for (int i = 1; i <= numeros; i++) {
            if(i % 3 == 0){
                System.out.println("Buzz");
            }
            if(i % 5 == 0){
                System.out.println("LigtYear");
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("BuzzLigtyear");
            }else{
                System.out.println(i);
            }
        }
    }

}
