package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Automóvil
        Automovil miAutomovil = new Automovil("Honda", "Civic", 200); // Cambié la marca y modelo

        // Acelerar el automóvil a una nueva velocidad
        miAutomovil.acelerar(60); // Aumentar la velocidad en 60 km/h
        miAutomovil.acelerar(80); // Intentar aumentar la velocidad en 80 km/h

        // Calcular el tiempo estimado de llegada a un destino a 350 km de distancia
        double tiempoEstimado = miAutomovil.tiempoEstimadoLlegada(350);
        if (tiempoEstimado == -1) {
            System.out.println("No se puede calcular el tiempo estimado de llegada (el automóvil está detenido).");
        } else {
            // Mostrar el tiempo estimado con decimales
            System.out.printf("Tiempo estimado de llegada: %.2f horas.%n", tiempoEstimado);
        }

        // Desacelerar el automóvil
        miAutomovil.desacelerar(30); // Disminuir la velocidad en 30 km/h
        miAutomovil.desacelerar(50); // Intentar disminuir la velocidad en 50 km/h

        // Calcular el tiempo estimado de llegada nuevamente
        tiempoEstimado = miAutomovil.tiempoEstimadoLlegada(350);
        if (tiempoEstimado == -1) {
            System.out.println("No se puede calcular el tiempo estimado de llegada (el automóvil está detenido).");
        } else {
            // Mostrar el tiempo estimado con decimales
            System.out.printf("Tiempo estimado de llegada: %.2f horas.%n", tiempoEstimado);
        }
    }
}