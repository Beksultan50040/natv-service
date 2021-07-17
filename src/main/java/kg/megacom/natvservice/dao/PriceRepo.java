package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<Price, Long> {
}
