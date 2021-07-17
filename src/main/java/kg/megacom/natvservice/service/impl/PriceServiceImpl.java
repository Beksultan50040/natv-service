package kg.megacom.natvservice.service.impl;

import kg.megacom.natvservice.dao.PriceRepo;
import kg.megacom.natvservice.mappers.PriceMapper;
import kg.megacom.natvservice.models.Price;
import kg.megacom.natvservice.models.dto.PriceDto;
import kg.megacom.natvservice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepo priceRepo;


    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.toEntity(priceDto);
        price = priceRepo.save(price);
        return PriceMapper.INSTANCE.toDto(price);
    }
    @Override
    public PriceDto update(PriceDto priceDto) {
        return null;
    }

    @Override
    public List<PriceDto> findAll() {
        return null;
    }

    @Override
    public PriceDto findBy(Long id) {
        return null;
    }
}
