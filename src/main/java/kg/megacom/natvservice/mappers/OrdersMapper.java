package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.Orders;
import kg.megacom.natvservice.models.dto.OrdersDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper {

    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);

    OrdersDto toDto(Orders orders);
    Orders toEntity(OrdersDto ordersDto);
}
