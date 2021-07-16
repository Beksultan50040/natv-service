package kg.megacom.natvservice.models;

import javax.persistence.*;

public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channels idChannels;

    @ManyToOne
    @JoinColumn(name = "id_orders")
    private Channels idOrders;

    private double price;


}
