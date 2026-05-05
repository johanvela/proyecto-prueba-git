package prueba3.cuenta.application;

import prueba3.cuenta.domain.Cuenta;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CuentaService {
    List<Cuenta> listaCuentas = new ArrayList<>();
    public List<Cuenta> listar(){
        return listaCuentas;
    } 
    public CuentaService(){
       listaCuentas.add(new Cuenta(1L, "Juan", 1000.0));
    }

    public void agregarCuenta(Cuenta cuenta){
        if(cuenta.getSaldo()<0){
            throw new RuntimeException("Saldo no válido");
        }
        listaCuentas.add(cuenta);
    }
    public Cuenta buscarId(Long id){
        return listaCuentas.stream()
                .filter(c ->c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public void eliminarCuenta(Long id){
        listaCuentas.removeIf(c ->c.getId().equals(id));
    }
    public void depositar(Long id, Double monto){
        Cuenta cuenta = buscarId(id);
        if(cuenta == null){
            throw new RuntimeException("La cuenta no existe");
        }
        if(monto <=0){
            throw new RuntimeException("Monto no válido");
        }
        cuenta.setSaldo(cuenta.getSaldo()+monto);
    }
    public void retirar(long id, Double monto){
        Cuenta cuenta = buscarId(id);

        if(cuenta == null){
            throw new RuntimeException("La cuenta no existe");
        }
        if(monto <=0 || monto > cuenta.getSaldo()){
            throw new RuntimeException("Monto no válido");
        }
        cuenta.setSaldo(cuenta.getSaldo()-monto);
    }
}
