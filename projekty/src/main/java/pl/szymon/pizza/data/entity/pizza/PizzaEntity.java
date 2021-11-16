package pl.szymon.pizza.data.entity.pizza;


import nonapi.io.github.classgraph.json.Id;
import javax.persistence.*;

@Entity
@Table(name ="pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="id")

    private String name;

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
