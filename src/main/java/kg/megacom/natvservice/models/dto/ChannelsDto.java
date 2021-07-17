package kg.megacom.natvservice.models.dto;

import lombok.Data;

import javax.persistence.*;


@Data
public class ChannelsDto {

    private Long id;

    private String name;
    private String photo;
    private boolean active;
    private int orderNum;
}
