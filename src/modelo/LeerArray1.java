package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;

import java.util.Set;



public class LeerArray1 {



    public static void main(String[] args) {
        

        try (BufferedReader br = new BufferedReader(new FileReader("src\\modelo\\diccionario.json"))) { 
            
            JSONParser parser = new JSONParser();

            // Paso 1: parsear (leer y convertir el JSON)
            Object objetoParseado = parser.parse(br);
            
            // Paso 2: hacer casting a JSONObject (lo que recibimos es un json)
            JSONObject jsonPrincipal = (JSONObject) objetoParseado;

            List<Palabra> palabras = new ArrayList<>();

            // Recorremos todas las categorías (llaves) del JSON
            Set<String> categorias = jsonPrincipal.keySet();

            System.out.println(categorias);

            for (String categoria : categorias) {
                // Paso 1: obtener el valor de la categoría (como Object)
                Object valor = jsonPrincipal.get(categoria);

                // Paso 2: convertir ese valor a JSONArray
                JSONArray array = (JSONArray) valor;
                
                for (Object obj : array) {
                    JSONObject j = (JSONObject) obj; // cada objeto que hay en el array es un json
                    String espanol = (String) j.get("espanol");
                    String tikuna = (String) j.get("tikuna");
                    String imagen = (String) j.get("imagen");
                    String audio_en = (String) j.get("audio_en");

                    // Creamos la palabra solo si espanol y tikuna no son nulos
                    if (espanol != null && tikuna != null) {
                        palabras.add(new Palabra(espanol, tikuna, imagen, audio_en, categoria));
                    }
                }
            }

            System.out.println(palabras);

          

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
