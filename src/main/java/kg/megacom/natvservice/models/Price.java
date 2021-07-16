package kg.megacom.natvservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "prices")
@Data
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channels channels;

    private String starDate;
    private String endDate;
    private double price;
}
