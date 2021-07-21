package kg.megacom.natvservice.controller;

import kg.megacom.natvservice.models.Response;
import kg.megacom.natvservice.models.dto.RequestDto;
import kg.megacom.natvservice.service.OrderService;
import kg.megacom.natvservice.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public Response save (@RequestBody RequestDto requestDto){
        return orderService.save(requestDto);
    }
}
