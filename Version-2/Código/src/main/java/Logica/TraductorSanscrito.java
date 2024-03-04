package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;



public class TraductorSanscrito {

    public static final Map<String, String> DICCIONARIO = new HashMap<>();

    static {
        //Listado de Asanas
        DICCIONARIO.put("adho mukha svanasana", "Perro mirando hacia abajo");
        DICCIONARIO.put("ardha bhujangasana", "Postura de la Cobra a la mitad");
        DICCIONARIO.put("balasana", "Postura del Niño");
        DICCIONARIO.put("eka pada rajakapotasana", "Postura de la Paloma");
        DICCIONARIO.put("kumbhakasana", "Postura de la Plancha");
        DICCIONARIO.put("malasana", "Postura de la Guirnalda");
        DICCIONARIO.put("matsyasana", "Postura del Pez");
        DICCIONARIO.put("parivrtta janu sirsasana", "Postura de la Cabeza a la Rodilla Invertida");
        DICCIONARIO.put("parivrtta trikonasana", "Postura del Triángulo Invertido");
        DICCIONARIO.put("paschimottanasana", "Flexión hacia adelante sentado");
        DICCIONARIO.put("setu bandhasana", "Postura del Puente");
        DICCIONARIO.put("shavasana", "Postura del Cadáver");
        DICCIONARIO.put("tadasana", "Postura de la Montaña");
        DICCIONARIO.put("trikonasana", "Postura del Triángulo");
        DICCIONARIO.put("utkatasana", "Postura de la Silla");
        DICCIONARIO.put("urdhva hastasana", "Saludo hacia arriba");
        DICCIONARIO.put("urdhva mukha svanasana", "Perro mirando hacia arriba");
        DICCIONARIO.put("virabhadrasana i", "Guerrero I");
        DICCIONARIO.put("virabhadrasana ii", "Guerrero II");
        DICCIONARIO.put("vrikshasana", "Postura del Árbol");
        //Morfemas y palabras base
        DICCIONARIO.put("asana", "postura");
        DICCIONARIO.put("adho", "abajo");
        DICCIONARIO.put("ardha", "mitad");
        DICCIONARIO.put("urdhva", "arriba");
        DICCIONARIO.put("mukha", "rostro");
        DICCIONARIO.put("svana", "perro");
        DICCIONARIO.put("virabhadra", "guerrero");
        DICCIONARIO.put("vriksha", "árbol");
        DICCIONARIO.put("bala", "niño");
        DICCIONARIO.put("bhujanga", "cobra");
        DICCIONARIO.put("paschi", "oeste");
        DICCIONARIO.put("setu", "puente");
        DICCIONARIO.put("shava", "cadáver");
        DICCIONARIO.put("trikona", "triángulo");
        DICCIONARIO.put("matsya", "pez");
        DICCIONARIO.put("mala", "guirnalda");
        DICCIONARIO.put("eka", "uno");
        DICCIONARIO.put("pada", "pie");
        DICCIONARIO.put("raja", "real");
        DICCIONARIO.put("kapota", "paloma");
        DICCIONARIO.put("hasta", "mano");
        DICCIONARIO.put("parivrtta", "invertido");
        DICCIONARIO.put("janu", "rodilla");
        DICCIONARIO.put("sirsa", "cabeza");

    }

    public String traducir(String palabraSanskrita) {
        // Intenta encontrar la traducción directa
        String traduccion = DICCIONARIO.get(palabraSanskrita);
        if (traduccion != null) {
            return traduccion;
        }
        // Si no se encuentra una traducción directa, busca palabras compuestas
        String traduccionCompuesta = traduccionCompuesta(palabraSanskrita);

        if (traduccionCompuesta != null) {
            return traduccionCompuesta;
        }
        return null;
    }

    private String traduccionCompuesta(String palabraSanskrita) {
        StringTokenizer token = new StringTokenizer(palabraSanskrita, " ");
        ArrayList<String> tokensArray = new ArrayList<>();
        // Llena el ArrayList con los tokens obtenidos
        while (token.hasMoreTokens()) {
            tokensArray.add(token.nextToken());
        }

        StringBuilder traduccionCompuesta = new StringBuilder();

        for (String palabra : tokensArray) {
            // Encuentra todas las subcadenas posibles de la palabra y verifica si están en el diccionario
            ArrayList<String> subcadenas = obtenerSubcadenas(palabra);
            for (String subcadena : subcadenas) {
                if (DICCIONARIO.containsKey(subcadena)) {
                    // Si la subcadena está en el diccionario, agrega la traducción
                    traduccionCompuesta.append(DICCIONARIO.get(subcadena)).append(" ");
                }
            }
        }
        // Se imprime información de depuración
        System.out.println("Palabra compuesta: " + palabraSanskrita);
        System.out.println("Descomponiendo (según subcadenas encontradas en el diccionario): " + traduccionCompuesta.toString());
        // Se devuelve la traducción compuesta como una cadena
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
