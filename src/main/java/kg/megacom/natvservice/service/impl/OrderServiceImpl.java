package kg.megacom.natvservice.service.impl;

import kg.megacom.natvservice.dao.OrderDetailRepo;
import kg.megacom.natvservice.dao.OrderRepo;
import kg.megacom.natvservice.mappers.ChannelMapper;
import kg.megacom.natvservice.mappers.OrderMapper;
import kg.megacom.natvservice.mappers.OrdersMapper;
import kg.megacom.natvservice.models.OrderDetail;
import kg.megacom.natvservice.models.Orders;
import kg.megacom.natvservice.models.Response;
import kg.megacom.natvservice.models.dto.OrdersDto;
import kg.megacom.natvservice.models.dto.RequestDto;
import kg.megacom.natvservice.service.ChannelService;
import kg.megacom.natvservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderDetailRepo orderDetailRepo;

    @Autowired
    private ChannelService channelService;


    @Override
    public Response save(RequestDto requestDto) {
        Response response = Response.getResponse();

        Orders orders = OrdersMapper.INSTANCE.toEntity(requestDto.getOrders());
        orders.setAddDate(new Date());
        orders.setEditDate(new Date());
        orders.setStatus(true);
        orderRepo.save(orders);

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setIdChannels(ChannelMapper.INSTANCE.toEntity(channelService.findBy(requestDto.getChannels().get(0).getChannelId())));
        orderDetail.setIdOrders(OrderMapper.INSTANCE.toEntity(findById(requestDto.getOrders().getId())));
        orderDetail.setPrice(requestDto.getChannels().get(0).getPrice());
        orderDetailRepo.save(orderDetail);

        response.setMessage("Ok");
        return response;
    }

    @Override
    public OrdersDto findById(Long id) {

        Orders orders = orderRepo.findById(id).get();

        return OrderMapper.INSTANCE.toDto(orders);
    }


}
