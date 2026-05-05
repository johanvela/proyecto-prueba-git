package prueba3.cuenta.domain;

public class Cuenta {
    private Long id;
    private String titular;
    private Double saldo;

    public Cuenta(Long id, String titular, Double saldo){
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }
    public Long getId(){
        return id;
    }
    public String getTitular(){
        return titular;
    }
    public Double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo =saldo;
    }
}
