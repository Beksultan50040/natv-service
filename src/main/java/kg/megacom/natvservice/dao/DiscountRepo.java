package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discounts, Long> {
}
