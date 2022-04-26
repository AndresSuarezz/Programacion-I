package hogwarts;

public class Hogwarts {

    private String nombre[];
    private String asignatura[];
    private float nota[];
    private int nroelementos;
    
    public Hogwarts(int tam){
        nroelementos = tam;
        nombre = new String[tam];
        asignatura = new String[tam];
        nota = new float[tam];
    }

    public String getNombre(int posicion) {
        return nombre[posicion];
    }

    public void setNombre(String elemento, int posicion) {
        nombre[posicion] = elemento;
    }

    public String getAsignatura(int posicion) {
        return asignatura[posicion];
    }

    public void setAsignatura(String elemento, int posicion) {
        asignatura[posicion] = elemento;
    }

    public float getNota(int posicion) {
        return nota[posicion];
    }

    public void setNota(int posicion, float elemento) {
        nota[posicion] = elemento;
    }

    public int getNroelementos() {
        return nroelementos;
    }

    public void setNroelementos(int nroelementos) {
        this.nroelementos = nroelementos;
    }
    
    public void aggelementos(){
        nroelementos++;
    }
    
    //Metodos
    public int buscarArreglo(String element){
        int posicion = -1;
        int indice = 0;
        
        while(posicion == -1 && indice < getNroelementos()){
            if(element.equalsIgnoreCase(getNombre(indice))){
                posicion = indice;
            }else{
                indice++;
            }
        }
        return posicion;
    }
}
