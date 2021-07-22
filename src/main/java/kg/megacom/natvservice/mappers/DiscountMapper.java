package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.Discounts;
import kg.megacom.natvservice.models.dto.DiscountsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    DiscountsDto toDto(Discounts discounts);
    Discounts toEntity(DiscountsDto discountsDto);

    List<DiscountsDto> toDtos(List<Discounts> discounts);
    List<Discounts> toEntities(List<DiscountsDto> discountsDto);
}