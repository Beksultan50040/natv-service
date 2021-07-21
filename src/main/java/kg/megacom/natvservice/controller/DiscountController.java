package kg.megacom.natvservice.controller;

import kg.megacom.natvservice.models.dto.DiscountsDto;
import kg.megacom.natvservice.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/discount")
public class DiscountController implements BaseController<DiscountsDto, Long> {

    @Autowired
    private DiscountService discountService;

    @Override
    public DiscountsDto save(DiscountsDto discountsDto) {
         return discountService.save(discountsDto);
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
    public DiscountsDto findById(Long id) {
        return null;
    }
}
