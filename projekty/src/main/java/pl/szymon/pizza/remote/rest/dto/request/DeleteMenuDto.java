package pl.szymon.pizza.remote.rest.dto.request;

import pl.szymon.pizza.remote.rest.dto.response.PizzaDto;

public class DeleteMenuDto {
    private PizzaDto pizzas;

    public DeleteMenuDto() {
    }

    public DeleteMenuDto(PizzaDto pizzas) {
        this.pizzas = pizzas;
    }

    public PizzaDto getPizzas() {
        return pizzas;
    }

    public void setPizzas(PizzaDto pizzas) {
        this.pizzas = pizzas;
    }
}
