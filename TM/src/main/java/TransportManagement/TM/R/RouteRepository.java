package TransportManagement.TM.R;

import org.springframework.data.jpa.repository.JpaRepository;

import TransportManagement.TM.M.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {
}