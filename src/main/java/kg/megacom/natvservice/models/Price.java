package kg.megacom.natvservice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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

    private Date startDate;
    private Date endDate;
    private double price;
}
