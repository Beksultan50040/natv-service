package kg.megacom.natvservice.controller;

import kg.megacom.natvservice.models.json.ChannelDto;
import kg.megacom.natvservice.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/func")
public class FunctionController {

    @Autowired
    private ChannelService channelService;

    @GetMapping("/channel/list")
    public List<ChannelDto> findChannels(){

        return channelService.findAllChannels();
    }
}
