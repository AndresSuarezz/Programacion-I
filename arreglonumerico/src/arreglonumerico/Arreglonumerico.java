package arreglonumerico;

public class Arreglonumerico {

    private int numeros1[];
    private int numeros2[];
    private int nroelementos;

    //se hace el constructor para inizializar las variables
    public Arreglonumerico(int tam) {
        nroelementos = tam;
        numeros1 = new int[tam];//asignamos el tamaño en el arreglo
        numeros2 = new int[tam];
    }

    public void setNumeros1(int pos, int val) {
        this.numeros1[pos] = val;
    }

    public int getNumeros1(int pos) {
        return numeros1[pos];
    }

    public void setNumeros2(int pos, int val) {
        this.numeros2[pos] = val;
    }

    public int getNumeros2(int pos) {
        return numeros2[pos];
    }

    public int getnroelementos() {
        return nroelementos;
    }

    public void aggelemento() {
        nroelementos++;
    }

    public void oredenarNumeros1() {
        int temporal;
        for (int j = 0; j < getnroelementos() - 1; j++) {
            for (int i = 0; i < getnroelementos() - 1; i++) {
                if (getNumeros1(i) > getNumeros1(i + 1)) {
                    temporal = getNumeros1(i);
                    setNumeros1(i, getNumeros1(i + 1));
                    setNumeros1(i + 1, temporal);
                }
            }
        }
    }

    public void oredenarNumeros2() {
        int temporal;
        for (int j = 0; j < getnroelementos() - 1; j++) {
            for (int i = 0; i < getnroelementos() - 1; i++) {
                if (getNumeros2(i) > getNumeros2(i + 1)) {
                    temporal = getNumeros2(i);
                    setNumeros2(i, getNumeros2(i + 1));
                    setNumeros2(i + 1, temporal);
                }
            }
        }
    }

    public boolean determinarIgualdad() {
        boolean igual = true;
        int i = 0;
        while ((i < getnroelementos()) && (igual)) {
            igual = getNumeros1(i) == getNumeros2(i);
            i++;
        }

        return igual;
    }
}
