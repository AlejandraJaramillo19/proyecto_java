// package modelo;
// 
// import org.json.simple.JSONObject;
// import org.json.simple.parser.JSONParser;
// 
// import java.io.FileReader;
// 
// public class LeerArray {
//     public static void main(String[] args) {
//         JSONParser parser = new JSONParser();
// 
//         try {
//             Object obj = parser.parse(new FileReader("src\\modelo\\datos.json"));
// 
//             JSONObject jsonObject = (JSONObject) obj;
// 
//             String nombre = (String) jsonObject.get("nombre");
//             long edad = (long) jsonObject.get("edad");
//             String ciudad = (String) jsonObject.get("ciudad");
// 
//             System.out.println("Nombre: " + nombre);
//             System.out.println("Edad: " + edad);
//             System.out.println("Ciudad: " + ciudad);
// 
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


//package modelo;
//
//import java.io.*;
//import org.json.simple.*;
//import org.json.simple.parser.*;
//
//public class LeerArray {
//
//    public static void main(String[] args) {
//
//        JSONParser jp = new JSONParser();
//
//        try (BufferedReader br = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("src\\\\modelo\\\\datos.json")))) {
//
//            JSONArray ja = (JSONArray) jp.parse(br);
//
//            System.out.println(ja);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;


public class LeerArray {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try (BufferedReader br = new BufferedReader(new FileReader("src\\modelo\\datos.json"))) {

            // Parseamos el JSON a JSONArray
            JSONArray array = (JSONArray) parser.parse(br);

            // Lista de personas
            List<Persona> personas = new ArrayList<>();

            for (Object obj : array) {
                JSONObject jsonPersona = (JSONObject) obj;

                String nombre = (String) jsonPersona.get("nombre");
                long edad = (long) jsonPersona.get("edad");
                String ciudad = (String) jsonPersona.get("ciudad");

                // Creamos un objeto Persona
                Persona persona = new Persona(nombre, edad, ciudad);
                personas.add(persona);
            }

            // Mostramos las personas
            for (Persona p : personas) {
                System.out.println(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
