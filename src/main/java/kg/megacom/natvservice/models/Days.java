package kg.megacom.natvservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "days")
@Data
public class Days {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_order_details")
    private OrderDetail idOrderDetail;

    private String day;


}
