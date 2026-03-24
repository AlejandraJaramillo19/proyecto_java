package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;

public class LeerLugares {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src\\modelo\\lugares.json"))) {

            JSONParser parser = new JSONParser();

            // Paso 1: parsear el JSON
            Object objetoParseado = parser.parse(br);

            // Paso 2: convertir a JSONArray (porque tu JSON es un arreglo [])
            JSONArray array = (JSONArray) objetoParseado;

            List<Lugar> lugares = new ArrayList<>();

            // Recorremos cada objeto del array
            for (Object obj : array) {

                JSONObject j = (JSONObject) obj;

                String nombre = (String) j.get("nombre");
                String ubicacion = (String) j.get("ubicación");
                String pais = (String) j.get("pais");
                String direccion = (String) j.get("direccion");
                String tel = String.valueOf(j.get("tel"));
                String informacion = (String) j.get("informacion");
                String imagen = (String) j.get("Imagen");

                lugares.add(new Lugar(nombre, ubicacion, pais, direccion, tel, informacion, imagen));
     
            }

            // Imprimimos todos los lugares
            for (Lugar l : lugares) {
                System.out.println(
                        l.nombre + " - " +
                        l.pais + " - " +
                        l.direccion + " - " +
                        l.tel
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

