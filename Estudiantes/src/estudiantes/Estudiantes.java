package estudiantes;

public class Estudiantes {
    
    private String nombre;
    private String materia;
    private int codigo;
    private float nota;
    
    public Estudiantes(){
        nombre = "";
        materia = "";
        codigo = 0;
        nota = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
   
}
