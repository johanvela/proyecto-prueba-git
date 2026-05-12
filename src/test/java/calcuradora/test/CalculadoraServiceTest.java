package calcuradora.test;
import calcuradora.test.application.CalculadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraServiceTest {
    CalculadoraService service = new CalculadoraService();
    @Test
    void suma(){
        assertEquals(4,service.calculadoraSumar(2, 2));
    }
    @Test
    void restar(){
        assertEquals(2, service.calculadoraRestar(5, 03));
    }
    @Test 
    void dividir(){
        assertEquals(2, service.calculadoraDividir(4, 2));
    }
    @Test
    void dividirPorCero(){
        assertThrows(ArithmeticException.class,() -> service.calculadoraDividir(4, 0));
    }
    @Test 
    void multiplicar(){
        assertEquals(10, service.calculadoraMultiplicar(5, 2));
    }
}
