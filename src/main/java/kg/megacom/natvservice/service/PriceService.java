package kg.megacom.natvservice.service;

import kg.megacom.natvservice.models.dto.PriceDto;
import kg.megacom.natvservice.models.json.ChannelDto;

import java.util.List;

public interface PriceService extends BaseService<PriceDto, Long> {

    List<ChannelDto> findChannelWithPrice();
}
