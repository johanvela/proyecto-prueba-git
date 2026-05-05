package prueba3.cuenta.presentation;

import prueba3.cuenta.domain.Cuenta;
import prueba3.cuenta.application.CuentaService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
    private final CuentaService service;
    public CuentaController(CuentaService service){
        this.service = service;
    }
    @GetMapping
    public List<Cuenta> listar(){
        return service.listar();
    }
    @PostMapping
    public String agregarCuenta(@RequestParam Long id, @RequestParam String titular,@RequestParam Double saldo){
        service.agregarCuenta(new Cuenta(id, titular, saldo));
        return "Cuenta agregada con éxito";
    }
    @GetMapping("/{id}")
    public Cuenta buscarId(@PathVariable Long id){
        return service.buscarId(id);
        
    }
    @DeleteMapping
    public String eliminarCuenta(@RequestParam Long id){
        service.eliminarCuenta(id);
        return "Cuenta eliminado con éxito";
    }
    @PutMapping("/{id}/deposito")
    public String depositar(@PathVariable Long id, @RequestParam Double monto){
        service.depositar(id, monto);
        return "Deposito con éxito";
    }
    @PutMapping("/{id}/retiro")
    public String retirar(@PathVariable Long id, @RequestParam Double monto){
        service.retirar(id,monto);
        return "Retiro con éxito";
    }
}   
