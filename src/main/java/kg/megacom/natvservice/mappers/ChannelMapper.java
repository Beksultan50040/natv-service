package kg.megacom.natvservice.mappers;

import kg.megacom.natvservice.models.Channels;
import kg.megacom.natvservice.models.dto.ChannelsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChannelMapper {

    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

    ChannelsDto toDto(Channels channels);
    Channels toEntity(ChannelsDto channelsDto);

    List<ChannelsDto> toDtos(List<Channels> channels);
    List<Channels> toEntities(List<ChannelsDto> channelsDto);

}
