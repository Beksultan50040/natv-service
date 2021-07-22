package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.OrderDetail;
import kg.megacom.natvservice.models.dto.OrderDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface OrderDetailMapper {

    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);
    OrderDetail toEntity(Optional<OrderDetail> orderDetailDto);
    OrderDetailDto toDto(OrderDetail orderDetail);

}
