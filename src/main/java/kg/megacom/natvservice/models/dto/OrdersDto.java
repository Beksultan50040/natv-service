package kg.megacom.natvservice.models.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class OrdersDto {

    private Long id;

    private String text;
    private String name;
    private String phone;
    private String email;
    private long totalPrice;
    private Date addDate;
    private Date editDate;
    private boolean status;

}
