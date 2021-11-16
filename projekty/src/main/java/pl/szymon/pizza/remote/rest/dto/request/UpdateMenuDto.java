package pl.szymon.pizza.remote.rest.dto.request;

import pl.szymon.pizza.remote.rest.dto.response.PizzaDto;

import java.util.List;

public class UpdateMenuDto {
    private List<PizzaDto> pizzas;

    public UpdateMenuDto() {
    }

    public UpdateMenuDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
