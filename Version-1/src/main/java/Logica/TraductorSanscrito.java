package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TraductorSanscrito {

    private static final Map<String, String> diccionario = new HashMap<>();

    static {
        diccionario.put("tadasana", "Postura de la Montaña");
        diccionario.put("adho mukha svanasana", "Perro mirando hacia abajo");
        diccionario.put("virabhadrasana i", "Guerrero I");
        diccionario.put("virabhadrasana ii", "Guerrero II");
        diccionario.put("vrikshasana", "Postura del Árbol");
        diccionario.put("balasana", "Postura del Niño");
        diccionario.put("ardha bhujangasana", "Postura de la Cobra a la mitad");
        diccionario.put("paschimottanasana", "Flexión hacia adelante sentado");
        diccionario.put("setu bandhasana", "Postura del Puente");
        diccionario.put("shavasana", "Postura del Cadáver");
        diccionario.put("trikonasana", "Postura del Triángulo");
        diccionario.put("kumbhakasana", "Postura de la Plancha");
        diccionario.put("urdhva mukha svanasana", "Perro mirando hacia arriba");
        diccionario.put("matsyasana", "Postura del Pez");
        diccionario.put("utkatasana", "Postura de la Silla");
        diccionario.put("malasana", "Postura de la Guirnalda");
        diccionario.put("eka pada rajakapotasana", "Postura de la Paloma");
        diccionario.put("urdhva hastasana", "Saludo hacia arriba");
        diccionario.put("parivrtta trikonasana", "Postura del Triángulo Invertido");
        diccionario.put("parivrtta janu sirsasana", "Postura de la Cabeza a la Rodilla Invertida");

        diccionario.put("asana", "postura");
        diccionario.put("adho", "abajo");
        diccionario.put("ardha", "mitad");
        diccionario.put("urdhva", "arriba");
        diccionario.put("mukha", "rostro");
        diccionario.put("svana", "perro");
        diccionario.put("virabhadra", "guerrero");
        diccionario.put("vriksha", "árbol");
        diccionario.put("bala", "niño");
        diccionario.put("bhujanga", "cobra");
        diccionario.put("paschi", "oeste");
        diccionario.put("setu", "puente");
        diccionario.put("shava", "cadáver");
        diccionario.put("trikona", "triángulo");
        diccionario.put("matsya", "pez");
        diccionario.put("mala", "guirnalda");
        diccionario.put("eka", "uno");
        diccionario.put("pada", "pie");
        diccionario.put("raja", "real");
        diccionario.put("kapota", "paloma");
        diccionario.put("hasta", "mano");
        diccionario.put("parivrtta", "invertido");
        diccionario.put("janu", "rodilla");
        diccionario.put("sirsa", "cabeza");

    }

    public String traducir(String palabraSanskrita) {
        // Intenta encontrar la traducción directa
        String traduccion = diccionario.get(palabraSanskrita);
        if (traduccion != null) {
            return traduccion;
        }

        // Si no se encuentra una traducción directa, busca palabras compuestas
        String traduccionCompuesta = traduccionCompuesta(palabraSanskrita);

        if (traduccionCompuesta != null) {
            return traduccionCompuesta;
        }
        return "No se encontró traducción";
    }

    private String traduccionCompuesta(String palabraSanskrita) {
        StringTokenizer token = new StringTokenizer(palabraSanskrita, " ");
        ArrayList<String> tokensArray = new ArrayList<>();

        while (token.hasMoreTokens()) {
            tokensArray.add(token.nextToken());
        }

        StringBuilder traduccionCompuesta = new StringBuilder();

        for (String palabra : tokensArray) {
            // Encuentra todas las subcadenas posibles de la palabra y verifica si están en el diccionario
            ArrayList<String> subcadenas = obtenerSubcadenas(palabra);
            for (String subcadena : subcadenas) {
                if (diccionario.containsKey(subcadena)) {
                    // Si la subcadena está en el diccionario, agrega la traducción
                    traduccionCompuesta.append(diccionario.get(subcadena)).append(" ");
                }
            }
        }

        System.out.println("Palabra compuesta: " + palabraSanskrita);
        System.out.println("Descomponiendo (según subcadenas encontradas en el diccionario): " + traduccionCompuesta.toString());
        return traduccionCompuesta.toString();
    }

    private ArrayList<String> obtenerSubcadenas(String palabra) {
        ArrayList<String> subcadenas = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = i + 1; j <= palabra.length(); j++) {
                subcadenas.add(palabra.substring(i, j));
            }
        }
        return subcadenas;
    }

}
