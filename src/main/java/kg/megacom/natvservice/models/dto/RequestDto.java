package kg.megacom.natvservice.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class RequestDto {

    private OrdersDto orders;
    private List<RequestDto2> channels;
}
