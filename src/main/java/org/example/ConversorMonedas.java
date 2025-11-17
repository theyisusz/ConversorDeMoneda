package org.example;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class ConversorMonedas {
    public static JsonObject obtenerTasas() {
        try {
            String url_str = "https://v6.exchangerate-api.com/v6/0bace1fb6d29c19840ca11b1/latest/COP";

            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            return jsonobj.get("conversion_rates").getAsJsonObject();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de la API.");
            return null;
        }
    }

    // Convierte COP a la moneda deseada
    public static double convertirDesdeCOP(double cantidad, double tasa) {
        return cantidad * tasa;
    }

    // Convierte otra moneda a COP
    public static double convertirACOP(double cantidad, double tasa) {
        return cantidad * (1 / tasa);
    }
}
