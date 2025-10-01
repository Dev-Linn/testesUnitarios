import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    
    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Escaleno", Triangulo.classificarTriangulo(3, 4, 5));
    }
    
    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Equilátero", Triangulo.classificarTriangulo(5, 5, 5));
    }
    
    @Test
    public void testTrianguloIsoscelesValido() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 3, 4));
    }
    
    @Test
    public void testTrianguloIsoscelesPermutacao1() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 3, 4));
    }
    
    @Test
    public void testTrianguloIsoscelesPermutacao2() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 4, 3));
    }
    
    @Test
    public void testTrianguloIsoscelesPermutacao3() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(4, 3, 3));
    }
    
    @Test
    public void testLadoZero() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(0, 3, 4));
    }
    
    @Test
    public void testLadoNegativo() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(-1, 3, 4));
    }
    
    @Test
    public void testSomaIgualTerceiroLado1() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(1, 2, 3));
    }
    
    @Test
    public void testSomaIgualTerceiroLado2() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(1, 3, 2));
    }
    
    @Test
    public void testSomaIgualTerceiroLado3() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(3, 1, 2));
    }
    
    @Test
    public void testSomaMenorQueTerceiroLado1() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(1, 2, 4));
    }
    
    @Test
    public void testSomaMenorQueTerceiroLado2() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(1, 4, 2));
    }
    
    @Test
    public void testSomaMenorQueTerceiroLado3() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(4, 1, 2));
    }
    
    @Test
    public void testTodosLadosZero() {
        assertEquals("Não é um triângulo válido", Triangulo.classificarTriangulo(0, 0, 0));
    }
    
    @Test
    public void testValoresNaoInteiros() {
        assertEquals("Escaleno", Triangulo.classificarTriangulo(2, 3, 4));
    }
    
    @Test
    public void testNumeroIncorretoDeValores() {
        assertEquals("Número incorreto de lados", Triangulo.classificarTriangulo(3, 4));
    }
    
    @Test
    public void testNumeroIncorretoDeValoresMais() {
        assertEquals("Número incorreto de lados", Triangulo.classificarTriangulo(3, 4, 5, 6));
    }
}
