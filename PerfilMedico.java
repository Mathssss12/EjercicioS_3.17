import javax.swing.*;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;
    /*Creacion de constructores*/

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public PerfilMedico() {
    }

    /*Creacion de Metodos  getter and setter*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /*Metodos del programador*/

    public int calcularEdad(int anioAc) {
        return (anioAc - anio);
    }

    public int calcularFrecuenciaCardiacaMaxima(int anioAc) {
        return 220 - calcularEdad(anioAc);
    }
    public double calcularRangoMinimo(int anioAc) {
        return calcularFrecuenciaCardiacaMaxima(anioAc) * 0.50;
    }

    public double calcularRangoMaximo(int anioAc) {
        return calcularFrecuenciaCardiacaMaxima(anioAc) * 0.85;
    }

    public double calcularBMI() {
        return this.peso / (this.altura * this.altura);
    }

    public String getCategoriaBMI(){
        double bmi = calcularBMI();
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }

    }


    public void ImprimirDatosPaciente() {
        String mensaje = "\nDatos del Paciente:\n" +
                "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Sexo: " + this.sexo + "\n" +
                "Fecha de Nacimiento: " + this.dia + "/" +
                this.mes + "/" +
                this.anio + "\n" +
                "Altura: " + this.altura + " m\n" +
                "Peso: " + this.peso + " kg";

        JOptionPane.showMessageDialog(null, mensaje);

    }
    public void mostrarFrecuenciaCardiaca(int anioAc) {
        String mensaj = "\nDatos de Frecuencia Cardiaca:\n" +
                "Edad: " + calcularEdad(anioAc) + " años\n" +
                "Frecuencia cardiaca maxima: " + calcularFrecuenciaCardiacaMaxima(anioAc) + " bpm\n" +
                "Rango de frecuencia cardiaca esperada: " +
                calcularRangoMinimo(anioAc) + " - " +
                calcularRangoMaximo(anioAc) + " bpm";

        JOptionPane.showMessageDialog(null, mensaj);


    }
    public void ImprimirDatosBMI() {
        String mensajes = "\nDatos de BMI:\n" +
                "Altura: " + this.altura + " m\n" +
                "Peso: " + this.peso + " kg\n" +
                "BMI: " + calcularBMI() + " (" + getCategoriaBMI() + ")";


        JOptionPane.showMessageDialog(null, mensajes);
    }

