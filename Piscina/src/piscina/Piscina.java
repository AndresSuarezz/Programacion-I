package piscina;

public class Piscina {
    
    private float largo;
    private float ancho;
    private float profundidad;

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }
    
    //Metodos
    public float areaPiso(){
        return largo * ancho;
    }
    
    public float areaParedes1(){
        return (largo * profundidad) * 2;
    }
    
    public float areaParedes2(){
        return (ancho * profundidad) * 2;
    }
    
    public float cementoPiso(){
        return (float) (areaPiso() * 0.25) * 51000;
    }
    
    public float cementoPared1(){
        return (float) (areaParedes1() * 0.1) * 51000;
    }
    
    public float cementoPared2(){
        return (float) (areaParedes2() * 0.1) * 51000;
    }
    
    public float pisoBaldosa(){
        return (float) (areaPiso() * 47500);
    }
    
    public float paredBaldosa1(){
        return (float) (areaParedes1() * 47500);
    }
    
    public float paredBaldosa2(){
        return (float) (areaParedes2() * 47500);
    }
    
    public float volumenPiscina(){
        return largo * ancho * profundidad; 
    }
    
    public float valorAgua(){
        return (float) (volumenPiscina() * 22000);
    }
    
    public long totalPagar(){
        return (long) (cementoPiso() + cementoPared1() + cementoPared2() + pisoBaldosa() + paredBaldosa1() + paredBaldosa2() + valorAgua());
    }
}
