package calcuradora.test.application;

import org.springframework.stereotype.Service;


@Service
public class CalculadoraService {
    public int calculadoraSumar(int a, int b){
        return a+b;
    }
    public int calculadoraRestar(int a, int b){
        return a-b;
    }
    public int calculadoraDividir(int a, int b){
        return a/b;
    }
    public int calculadoraMultiplicar(int a, int b){
        return a*b;
    }

}
