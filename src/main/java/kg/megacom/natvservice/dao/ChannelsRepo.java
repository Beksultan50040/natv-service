package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Channels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelsRepo extends JpaRepository<Channels, Long> {
}
