package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Channels;
import kg.megacom.natvservice.models.json.DiscountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChannelsRepo extends JpaRepository<Channels, Long> {


}
