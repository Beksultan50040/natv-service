package kg.megacom.natvservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String name;
    private String phone;
    private String email;
    private long totalPrice;
    private String addDate;
    private String editDate;
    private boolean status;

}
