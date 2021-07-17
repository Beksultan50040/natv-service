package kg.megacom.natvservice.service.impl;

import kg.megacom.natvservice.dao.ChannelsRepo;
import kg.megacom.natvservice.mappers.ChannelMapper;
import kg.megacom.natvservice.models.Channels;
import kg.megacom.natvservice.models.dto.ChannelsDto;
import kg.megacom.natvservice.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelsRepo channelsRepo;

    @Override
    public ChannelsDto save(ChannelsDto channelsDto) {
        Channels channels = ChannelMapper.INSTANCE.toEntity(channelsDto);
        channels = channelsRepo.save(channels);
        return ChannelMapper.INSTANCE.toDto(channels);
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
    public ChannelsDto findBy(Long id) {
        return null;
    }
}
