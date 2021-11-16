package pl.szymon.pizza.data.entity.order;

import nonapi.io.github.classgraph.json.Id;
import pl.szymon.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")

public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "client_address")
    private String clientaddress;

    @Column(name = "floor")
    private Integer floor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_At")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_At")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_At")
    private Date expectedAt;

    @Column(name = "token")
    private String token;
}
