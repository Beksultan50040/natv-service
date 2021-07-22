package kg.megacom.natvservice.models.dto;

import kg.megacom.natvservice.models.Channels;
import kg.megacom.natvservice.models.Orders;
import lombok.Data;

import javax.persistence.*;


@Data
public class OrderDetailDto {


    private Long id;

    private ChannelsDto idChannels;

    private OrdersDto idOrders;

    private double price;


}
