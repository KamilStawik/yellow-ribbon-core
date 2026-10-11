package pl.yellowribbon.core.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.yellowribbon.core.entities.AppointmentEntity;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, UUID> {
}
