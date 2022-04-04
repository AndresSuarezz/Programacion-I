package calculadora;

public class logica {

    private float num1;
    private float num2;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float suma() {
        return num1 + num2;
    }

    public float resta() {
        return num1 - num2;
    }

    public float multiplicacion() {
        int prod = 0;
        for (int i = 0; i < num2; i++) {
            prod = (int) (prod + num1);
        }
        return prod;
    }

    public float division() {
        int cont = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            cont++;
        }
        return cont;
    }

    public float potencia() {
        float cont = num1;

        for (int i = 0; i < num2 - 1; i++) {
            float acum = 0;
            for (int j = 0; j < num1; j++) {
                acum = acum + cont;
            }
            cont = acum;
        }

        return cont;
    }
}
