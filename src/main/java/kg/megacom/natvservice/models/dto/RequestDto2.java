package kg.megacom.natvservice.models.dto;

import kg.megacom.natvservice.models.Days;
import lombok.Data;

import java.util.List;

@Data
public class RequestDto2 {

    private Long channelId;
    private double price;
    private List<DaysDto> days;
}
