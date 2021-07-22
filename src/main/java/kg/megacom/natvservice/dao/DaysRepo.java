package kg.megacom.natvservice.dao;

import kg.megacom.natvservice.models.Days;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaysRepo extends JpaRepository<Days, Long> {
}
