package modelo;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;

import java.util.Set;



public class LeerArrayPalabras {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try (BufferedReader br = new BufferedReader(new FileReader("src\\modelo\\diccionario.json"))) {

            // Parseamos el JSON principal
            JSONObject jsonPrincipal = (JSONObject) parser.parse(br);

            List<Palabra> palabras = new ArrayList<>();

            // Recorremos todas las categorías (llaves) del JSON
            Set<String> categorias = jsonPrincipal.keySet();
            for (String categoria : categorias) {
                JSONArray array = (JSONArray) jsonPrincipal.get(categoria);

                for (Object obj : array) {
                    JSONObject j = (JSONObject) obj;
                    String espanol = (String) j.get("espanol");
                    String tikuna = (String) j.get("tikuna");
                    String imagen = (String) j.get("imagen");
                    String audio_en = (String) j.get("audio_en");

                    // Creamos la palabra solo si espanol y tikuna no son nulos
                    if (espanol != null && tikuna != null) {
                        palabras.add(new Palabra(espanol, tikuna, imagen, audio_en));
                    }
                }
            }

            // Imprimimos todas las palabras
            for (Palabra p : palabras) {
                System.out.println(p.espanol + " - " + p.tikuna + " - " + p.imagen + " - " + p.audio_en);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}