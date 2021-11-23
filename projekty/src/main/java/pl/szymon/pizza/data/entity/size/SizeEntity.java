package pl.szymon.pizza.data.entity.size;


import nonapi.io.github.classgraph.json.Id;
import org.hibernate.mapping.Set;
import pl.szymon.pizza.data.entity.orders_sizes.Orders_sizesEntity;
import pl.szymon.pizza.data.entity.pizza.PizzaEntity;
import pl.szymon.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="pizzas")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="size_type")
    private SizeType sizeType;

    @Column(name="price_base")
    private BigDecimal priceBase;

    @Column(name="pizza_id")
    private Integer pizzaId;
    
    @ManyToOne
    @JoinColumn(name="pizza_id", insertable = false, updatable=false)
    private PizzaEntity pizza;

    @OneToMany(mappedBy = "size")
    private Set<Orders_sizesEntity> orderSize;


}
