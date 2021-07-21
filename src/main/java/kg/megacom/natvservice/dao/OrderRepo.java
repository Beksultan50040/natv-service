package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Long> {
}
