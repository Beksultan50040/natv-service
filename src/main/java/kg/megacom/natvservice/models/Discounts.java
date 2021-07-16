package kg.megacom.natvservice.models;


import lombok.Data;

import javax.persistence.*;

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
    private String starDate;
    private String endDate;
    private int midDays;
}
