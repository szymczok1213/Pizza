package pl.szymon.pizza.remote.rest.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.szymon.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.szymon.pizza.remote.rest.dto.response.PizzaDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value ="/api/v1/pizzas", produces=APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {
    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody AddPizzaDto addPizzaDto,
                                             @RequestHeader("Access-Token") String token){
        return ResponseEntity.ok(null);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody AddPizzaDto addPizzaDto,
                                                @RequestHeader("Access-Token") String token,
                                                @PathVariable("id)") Integer pizzaId){
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePizza(@RequestHeader("Access-Token") String token,
                                            @PathVariable("id") Integer pizzaId) {

        return ResponseEntity.ok().build();
    }
}
