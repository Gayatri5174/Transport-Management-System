package TransportManagement.TM.S;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportManagement.TM.M.Route;
import TransportManagement.TM.R.RouteRepository;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Long id) {
        return routeRepository.findById(id).orElse(null);
    }

    public Route saveRoute(Route route) {
        return routeRepository.save(route);
    }

    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}
