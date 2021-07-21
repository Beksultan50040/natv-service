package kg.megacom.natvservice.service;

import kg.megacom.natvservice.models.Response;
import kg.megacom.natvservice.models.dto.OrdersDto;
import kg.megacom.natvservice.models.dto.RequestDto;

public interface OrderService {

    Response save(RequestDto requestDto);

    OrdersDto findById(Long id);
}
