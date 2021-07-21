package kg.megacom.natvservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channels idChannels;

    @ManyToOne
    @JoinColumn(name = "id_orders")
    private Orders idOrders;

    private double price;


}
