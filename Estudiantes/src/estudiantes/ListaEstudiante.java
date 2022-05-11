package estudiantes;

public class ListaEstudiante {
    private int tam;
    private Estudiantes lista[];
    
    public ListaEstudiante(int tam){
        this.tam = tam;
        lista = new Estudiantes[tam];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Estudiantes getEstudiate(int pos){
        return lista [pos];
    }
    
    public void setEstudiantes(int cod, String name, String matery, float note, int pos){
        Estudiantes est = new Estudiantes();
        
        est.setCodigo(cod);
        est.setNombre(name);
        est.setMateria(matery);
        est.setNota(note);
        lista[pos] = est;
    }
    
    public int buscarEstudiante(int cod, int numest){
        int i = 0;
        int res = -1;
        while(i < numest){
            if(cod == lista[i].getCodigo()){
                res = i;
                break;
            }else{
                i++;
            }
        }
        return res;
    }
    
    public boolean validarEstudiantes(int cod, int numest){
        boolean encontrado = false;
        
        if(numest > 0){
            for (int i = 0; i < numest; i++) {
                if(lista[i].getCodigo() == cod){
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }
}
