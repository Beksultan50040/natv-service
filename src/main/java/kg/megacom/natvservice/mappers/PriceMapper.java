package kg.megacom.natvservice.mappers;


import kg.megacom.natvservice.models.Price;
import kg.megacom.natvservice.models.dto.PriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    PriceDto toDto(Price price);
    Price toEntity(PriceDto priceDto);

    List<PriceDto> toDtos(List<Price> price);
    List<Price> toEntities(List<PriceDto> priceDto);

}
