package TransportManagement.TM.R;

import org.springframework.data.jpa.repository.JpaRepository;

import TransportManagement.TM.M.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}