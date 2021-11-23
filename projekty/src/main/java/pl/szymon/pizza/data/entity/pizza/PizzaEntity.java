package pl.szymon.pizza.data.entity.pizza;


import nonapi.io.github.classgraph.json.Id;
import pl.szymon.pizza.data.entity.orders_sizes.Orders_sizesEntity;

import javax.persistence.*;
import javax.swing.*;
import java.util.Set;

@Entity
@Table(name ="pizzas")
public class PizzaEntity<SizeEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="id")

    private String name;

    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;

    public PizzaEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PizzaEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
