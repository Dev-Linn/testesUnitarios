public class Triangulo {
    
    public static String classificarTriangulo(int... lados) {
        if (lados.length != 3) {
            return "Numero incorreto de lados";
        }
        
        int lado1 = lados[0];
        int lado2 = lados[1];
        int lado3 = lados[2];
        
        if (!TrianguloValido(lado1, lado2, lado3)) {
            return "Não é um triangulo valido";
        }
        
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    private static boolean TrianguloValido(int lado1, int lado2, int lado3) {
        
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) return false;
        
        //soma de dois lados > terceiro lado
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
