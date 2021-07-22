package kg.megacom.natvservice.controller;


import kg.megacom.natvservice.models.dto.ChannelsDto;
import kg.megacom.natvservice.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController implements BaseController<ChannelsDto, Long> {

    @Autowired
    private ChannelService channelService;

    @Override
    public ChannelsDto save(ChannelsDto channelsDto) {
        return channelService.save(channelsDto);
    }

    @Override
    public ChannelsDto update(ChannelsDto channelsDto) {
        return null;
    }

    @Override
    public List<ChannelsDto> findAll() {
        return null;
    }

    @Override
    public ChannelsDto findById(Long id) {
        return null;
    }
}
