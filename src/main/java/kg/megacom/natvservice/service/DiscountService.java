package kg.megacom.natvservice.service;

import kg.megacom.natvservice.models.dto.DiscountsDto;
import kg.megacom.natvservice.models.json.DiscountDto;

import java.util.List;

public interface DiscountService extends BaseService<DiscountsDto, Long> {

    List<DiscountDto> findDiscountsByChannelId(Long id);
}
