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
    private Date startDate;
    private Date endDate;
    private int midDays;

    public DiscountsDto(Long id, int percent, Date startDate, Date endDate, int midDays) {
        this.id = id;
        this.percent = percent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.midDays = midDays;
    }
}
