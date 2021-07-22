package kg.megacom.natvservice.service;

import kg.megacom.natvservice.models.dto.ChannelsDto;
import kg.megacom.natvservice.models.json.ChannelDto;

import java.util.List;

public interface ChannelService extends BaseService<ChannelsDto, Long> {

    List<ChannelDto> findAllChannels();
}
