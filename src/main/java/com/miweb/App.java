package com.miweb;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Koyeb nos da el puerto en una variable de entorno
        String portStr = System.getenv("PORT");
        int port = (portStr != null) ? Integer.parseInt(portStr) : 8080;
        port(port);

        get("/", (req, res) -> "¡Hola! Mi aplicación Java ya funciona en Koyeb Mohammed🚀");
    }
}
