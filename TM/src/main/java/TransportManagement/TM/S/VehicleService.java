package TransportManagement.TM.S;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportManagement.TM.M.Vehicle;
import TransportManagement.TM.R.VehicleRepository;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}


