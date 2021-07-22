package kg.megacom.natvservice.service.impl;

import kg.megacom.natvservice.dao.DiscountRepo;
import kg.megacom.natvservice.mappers.DiscountMapper;
import kg.megacom.natvservice.models.Discounts;
import kg.megacom.natvservice.models.dto.DiscountsDto;
import kg.megacom.natvservice.models.json.DiscountDto;
import kg.megacom.natvservice.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRepo discountRepo;


    @Override
    public DiscountsDto save(DiscountsDto discountsDto) {
        Discounts discounts = DiscountMapper.INSTANCE.toEntity(discountsDto);
        discounts.setStarDate(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 10);
        discounts.setEndDate(calendar.getTime());
        discounts = discountRepo.save(discounts);
        return DiscountMapper.INSTANCE.toDto(discounts);
    }

    @Override
    public DiscountsDto update(DiscountsDto discountsDto) {
        return null;
    }

    @Override
    public List<DiscountsDto> findAll() {
        return null;
    }

    @Override
    public DiscountsDto findBy(Long id) {
        return null;
    }

    @Override
    public List<DiscountDto> findDiscountsByChannelId(Long id) {
        return discountRepo.findDiscountsByChannelId(id, new Date());
    }
}
