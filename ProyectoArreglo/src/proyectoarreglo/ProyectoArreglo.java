package proyectoarreglo;

public class ProyectoArreglo {

    private String[] listaNombre;
    private int longitud;

    //HACER
    public String getListaNombre(int posicion) {
        return listaNombre[posicion];
    }

    public void setListaNombre(String elemento, int posicion) {
        listaNombre[posicion] = elemento;
    }
    //

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Creando Arreglo
    public ProyectoArreglo(int longitud) {
        this.longitud = longitud;
        listaNombre = new String[longitud];
    }
    
    //Metodo para añadir elementos a la lista
    public void setElementos(int indice, String e){
        listaNombre[indice] = e;
    }

    //Metodo para buscar en el arreglo
    public int searchArray(String e) {
        int posicion = -1;
        int indice = 0;
        //boolean encontrar = false;
        
        while(posicion == -1 && indice < getLongitud()){
            if(e.equals(getListaNombre(indice))){
                posicion = indice;
            }else{
                indice++;
            }
        }
        
        /*
        while (posicion < getLongitud()) {
            if (!e.equals(getListaNombre(posicion))) {
                posicion++;
                encontrar = false;
            } else {
                encontrar = true;
                break;
            }
        }
        
        if (encontrar == false) {
            posicion = -1;
        }
        */
        
        return posicion;
    }
    
    public void ordenarCadenas(){
        String temporal;
        for(int i = 0; i < longitud; i++){
            for(int j =0; j < longitud; j++){
                if(getListaNombre(j).compareTo(getListaNombre(j+1)) >= 1){
                    temporal = getListaNombre(j+1);
                    listaNombre[j+1] = getListaNombre(j);
                    listaNombre[j] = temporal;
                }
            }
        }
    }
}