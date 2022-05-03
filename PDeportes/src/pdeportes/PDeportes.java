package pdeportes;

import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class PDeportes {

    private String nombre[];
    private int edad[];
    private String sexo[];
    private int estatura[];
    private int peso[];
    private String deporte[];

    private int nroelementos;

    public PDeportes(int tam) {
        nroelementos = tam;
        nombre = new String[tam];
        edad = new int[tam];
        sexo = new String[tam];
        estatura = new int[tam];
        peso = new int[tam];
        deporte = new String[tam];
    }

    public int getNroelementos() {
        return nroelementos;
    }

    public void setNroelementos(int nroelementos) {
        this.nroelementos = nroelementos;
    }

    public String getNombre(int posicion) {
        return nombre[posicion];
    }

    public void setNombre(String elemento, int posicion) {
        nombre[posicion] = elemento;
    }

    public int getEdad(int posicion) {
        return edad[posicion];
    }

    public void setEdad(int elemento, int posicion) {
        edad[posicion] = elemento;
    }

    public String getSexo(int posicion) {
        return sexo[posicion];
    }

    public void setSexo(String elemento, int posicion) {
        sexo[posicion] = elemento;
    }

    public int getEstatura(int posicion) {
        return estatura[posicion];
    }

    public void setEstatura(int elemento, int posicion) {
        estatura[posicion] = elemento;
    }

    public int getPeso(int posicion) {
        return peso[posicion];
    }

    public void setPeso(int elemento, int posicion) {
        peso[posicion] = elemento;
    }

    public String getDeporte(int posicion) {
        return deporte[posicion];
    }

    public void setDeporte(String elemento, int posicion) {
        deporte[posicion] = elemento;
    }

    public void aggNroelementos() {
        nroelementos++;
    }

    /* Metodos */
    public String evaluarAdmitidos(int i) {
        String Deporte = "";
        if ("M".equals(getSexo(i)) && getEdad(i) < 17 && getEstatura(i) >= 170 && getPeso(i) >= 60) {
            Deporte = "Futbol";

        } else if ("F".equals(getSexo(i)) && getEdad(i) < 18 && getPeso(i) >= 50) {
            Deporte = "Futbol";

        } else if ("M".equals(getSexo(i)) && getEstatura(i) >= 180) {
            Deporte = "Basquetball";

        } else if ("F".equals(getSexo(i)) && getEstatura(i) >= 170) {
            Deporte = "Basquetball";

        } else if ("M".equals(getSexo(i)) && getEdad(i) > 18) {
            Deporte = "Voleiball";

        } else if ("F".equals(getSexo(i)) && getEdad(i) > 18) {
            Deporte = "Voleiball";

        } else {
            Deporte = "No clasifica";

        }
        return Deporte;
    }

    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    private Date getFechaHoy() {
        Date fechaHoy = null;
        try {
            /*Obteniendo la fecha de hoy*/
            LocalDate now = LocalDate.now();
            int año = now.getYear();
            int dia = now.getDayOfMonth();
            int mes = now.getMonthValue();

            String fechaInicial = dia + "/" + mes + "/" + año;
            fechaHoy = formatoFecha.parse(fechaInicial);

        } catch (ParseException ex) {

        }
        return fechaHoy;
    }

    public int edadPersona(Date Fecha) {
        int milisegundosDias = 86400000;
        int año = (int) ((getFechaHoy().getTime() - Fecha.getTime()) / milisegundosDias) / 365;

        return año;
    }
}
