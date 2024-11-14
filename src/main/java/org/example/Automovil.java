package org.example;

public class Automovil {
    // Atributos del automóvil
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;

    // Constructor
    public Automovil(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0; // Inicialmente, la velocidad es 0
    }

    // Métodos para acelerar y desacelerar
    public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            velocidadActual = velocidadMaxima; // No superar la velocidad máxima
            System.out.println("La velocidad máxima ha sido alcanzada: " + velocidadMaxima + " km/h");
        } else {
            velocidadActual += incremento;
            System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            velocidadActual = 0; // No permitir velocidad negativa
            System.out.println("El automóvil se ha detenido.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Desacelerando. Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    // Método para calcular el tiempo estimado de llegada
    public double tiempoEstimadoLlegada(double distancia) {
        if (velocidadActual == 0) {
            return -1; // Indica que no se puede calcular porque el automóvil está detenido
        }
        return distancia / velocidadActual; // Tiempo en horas
    }
}