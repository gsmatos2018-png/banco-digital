package br.com.digitalbanco.controller; import br.com.digitalbanco.dto.*; import br.com.digitalbanco.service.BankService; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api") @CrossOrigin(origins={"http://localhost:5173","http://localhost:3000"}) public class BankController{
private final BankService service; public BankController(BankService s){service=s;}
@PostMapping("/customers") @ResponseStatus(HttpStatus.CREATED) public Map<String,Object> register(@Valid @RequestBody RegisterRequest r){return service.register(r);}
@PostMapping("/auth/login") public Map<String,Object> login(@Valid @RequestBody LoginRequest r){return service.login(r);}
@GetMapping("/accounts/{id}/balance") public Map<String,Object> balance(@PathVariable Long id){return service.balance(id);}
@GetMapping("/accounts/{id}/statement") public List<Map<String,Object>> statement(@PathVariable Long id){return service.statement(id);}
@PostMapping("/accounts/{id}/pix") public Map<String,Object> pix(@PathVariable Long id,@Valid @RequestBody TransferRequest r){return service.transfer(id,r);}
@GetMapping("/health") public Map<String,String> health(){return Map.of("status","online");}
}