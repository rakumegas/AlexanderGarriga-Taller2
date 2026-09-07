/*
 * TODO 1 (NIVEL 2 - Javadoc): Convierte este comentario de bloque a un comentario Javadoc oficial (/** ... */)
 * Incluye las etiquetas @author (tu Nombre y Cédula) y @version 1.0
 */
public class PerfilEstudianteUTP {

    public static void main(String[] args) {

        // ==============================================================
        // NIVEL 1: IDENTIFICADORES Y TIPOS DE DATOS PRIMITIVOS
        // ==============================================================
        
        // TODO 2.1: Corrige este identificador ilegal (inicia con un número) a camelCase
        String 1erNombre = "Carlos Pérez";

        // TODO 2.2: Corrige este identificador ilegal (usa un guion medio) a camelCase
        int creditos-matriculados = 18;

        // TODO 2.3: Corrige el tipo de dato para almacenar el costo exacto con decimales (15.50)
        int costoCredito = 15.50;

        // TODO 2.4: Corrige el tipo de dato al tipo primitivo boolean (sin comillas de texto)
        String estaPazYSalvo = "true";

        // TODO 2.5: Declara una variable de tipo char con la inicial del segundo nombre
        // Nombre de variable: inicialSegundoNombre | Valor de prueba: 'M'
        


        // ==============================================================
        // NIVEL 2: CONSTANTES (final) E INMUTABILIDAD
        // ==============================================================
        
        // TODO 3.1: Declara la constante de la cuota con 'final' y convención UPPER_SNAKE_CASE (5.00)
        double carnet_estudiantil = 5.00;

        // TODO 3.2: Elimina la siguiente línea que viola la inmutabilidad de la constante
        carnet_estudiantil = 10.00;


        // ==============================================================
        // NIVEL 3: CÁLCULO ARITMÉTICO Y SALIDA FORMATO COMPROBANTE
        // ==============================================================
        
        // TODO 4: Utiliza tus variables y constantes corregidas para calcular subtotal y total
        double subtotalMatricula = creditos-matriculados * costoCredito;
        double totalPagar = subtotalMatricula + carnet_estudiantil;

        System.out.println("==========================================");
        System.out.println("    FICHA DE MATRÍCULA ESTUDIANTIL UTP");
        System.out.println("==========================================");
        System.out.println("Estudiante : " + 1erNombre);
        System.out.println("Paz y Salvo: " + estaPazYSalvo);
        System.out.println("Subtotal   : $" + subtotalMatricula);
        System.out.println("Total      : $" + totalPagar);
        System.out.println("==========================================");
    }
}
