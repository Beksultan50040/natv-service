package kg.megacom.natvservice.models.dto;

import kg.megacom.natvservice.models.Channels;
import lombok.Data;

import javax.persistence.*;

@Data
public class PriceDto {

    private Long id;

    private ChannelsDto channels;

    private String starDate;
    private String endDate;
    private double price;
}
