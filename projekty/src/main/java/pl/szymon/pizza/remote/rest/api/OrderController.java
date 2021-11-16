package pl.szymon.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.szymon.pizza.remote.rest.dto.request.AddOrderDto;
import pl.szymon.pizza.remote.rest.dto.request.UpdateOrderDto;
import pl.szymon.pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.szymon.pizza.remote.rest.dto.response.OrderStatusDto;
import pl.szymon.pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
public class OrderController {

    @PostMapping

    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto) {
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrder(@RequestParam("status") OrderStatusDto orderStatusDto,
                                                       @RequestHeader("Access-Toten") String token) {
        return ResponseEntity.ok(null);
    }
    @PutMapping("/{order-id")
    public ResponseEntity<Void> updateOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId,
                                            @RequestBody UpdateOrderDto updateOrderDto) {

        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{order-id")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token, @PathVariable("order-id") Integer orderId) {

        return ResponseEntity.ok().build();
    }
}
