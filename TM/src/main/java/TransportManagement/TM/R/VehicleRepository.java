package TransportManagement.TM.R;

import org.springframework.data.jpa.repository.JpaRepository;

import TransportManagement.TM.M.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
