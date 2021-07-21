package kg.megacom.natvservice.models.dto;

import kg.megacom.natvservice.models.Channels;
import lombok.Data;

import java.util.Date;


@Data
public class PriceDto {

    private Long id;

    private ChannelsDto channels;

    private Date startDate;
    private Date endDate;
    private double price;
}
