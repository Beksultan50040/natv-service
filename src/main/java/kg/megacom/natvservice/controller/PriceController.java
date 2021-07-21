package kg.megacom.natvservice.controller;

import kg.megacom.natvservice.models.dto.PriceDto;
import kg.megacom.natvservice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController implements BaseController<PriceDto, Long> {

    @Autowired
    private PriceService priceService;

    @Override
    public PriceDto save(PriceDto priceDto) {
        return priceService.save(priceDto);
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
    public PriceDto findById(Long id) {
        return null;
    }
}
