package kg.megacom.natvservice.models.dto;


import kg.megacom.natvservice.models.Channels;
import lombok.Data;

import javax.persistence.*;

@Data
public class DiscountsDto {

    private Long id;

    private ChannelsDto channels;

    private int percent;
    private String starDate;
    private String endDate;
    private int midDays;
}
