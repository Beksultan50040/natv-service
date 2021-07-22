package kg.megacom.natvservice.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "discounts")
@Data
public class Discounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channels channels;

    private int percent;
    private Date starDate;
    private Date endDate;
    private int midDays;
}
