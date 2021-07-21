package kg.megacom.natvservice.models.dto;


import kg.megacom.natvservice.models.Channels;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class DiscountsDto {

    private Long id;

    private ChannelsDto channels;

    private int percent;
    private Date starDate;
    private Date endDate;
    private int midDays;
}
