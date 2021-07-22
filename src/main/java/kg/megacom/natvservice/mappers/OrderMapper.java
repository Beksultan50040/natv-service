package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.Orders;
import kg.megacom.natvservice.models.dto.OrdersDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    Orders toEntity(OrdersDto ordersDto);
    OrdersDto toDto(Orders orders);
}
