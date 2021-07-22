package kg.megacom.natvservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "channels")
@Data
public class Channels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String photo;
    private boolean active;
    private int orderNum;


}
