package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Price;
import kg.megacom.natvservice.models.json.ChannelDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface PriceRepo extends JpaRepository<Price, Long> {

    @Query( value = "select new kg.megacom.natvservice.models.json.ChannelDto(u.channels.id, u.channels.name, u.channels.photo, u.price) from Price u") /*where ?1 between u.startDate and u.endDate and u.channels.active = true")*/
    List<ChannelDto> findChannelsWithPrice(/*Date date*/);
}
