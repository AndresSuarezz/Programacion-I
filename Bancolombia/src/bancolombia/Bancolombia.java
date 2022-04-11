package bancolombia;

public class Bancolombia {

    private float valor;
    private float saldo;
    private String nroCuenta;
    private String ComprobarnroCuenta;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getComprobarnroCuenta() {
        return ComprobarnroCuenta;
    }

    public void setComprobarnroCuenta(String ComprobarnroCuenta) {
        this.ComprobarnroCuenta = ComprobarnroCuenta;
    }
    
       
    //Metodos
    public float consignar() {
        return saldo + valor;
    }

    public float retirar() {
        return saldo - valor;
    }
}
