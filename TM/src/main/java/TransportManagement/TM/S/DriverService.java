package TransportManagement.TM.S;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TransportManagement.TM.M.Driver;
import TransportManagement.TM.R.DriverRepository;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElse(null);
    }

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
