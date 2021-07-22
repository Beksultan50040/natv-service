package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Discounts;
import kg.megacom.natvservice.models.json.DiscountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface DiscountRepo extends JpaRepository<Discounts, Long> {

    @Query(value = "select new kg.megacom.natvservice.models.json.DiscountDto( u.midDays, u.percent) from Discounts u where u.channels.id = ?1 and ?2 between  u.starDate and u.endDate")
    List<DiscountDto> findDiscountsByChannelId(Long channelId, Date date);
}
