package TransportManagement.TM.C;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import TransportManagement.TM.M.Driver;
import TransportManagement.TM.M.Route;
import TransportManagement.TM.M.Vehicle;
import TransportManagement.TM.R.DriverRepository;
import TransportManagement.TM.R.RouteRepository;
import TransportManagement.TM.R.VehicleRepository;

@Controller
@RequestMapping("/transport")
public class TransportController {

    private final DriverRepository driverRepo;
    private final VehicleRepository vehicleRepo;
    private final RouteRepository routeRepo;

    public TransportController(DriverRepository driverRepo, VehicleRepository vehicleRepo, RouteRepository routeRepo) {
        this.driverRepo = driverRepo;
        this.vehicleRepo = vehicleRepo;
        this.routeRepo = routeRepo;
    }

    // Home page
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("drivers", driverRepo.findAll());
        model.addAttribute("vehicles", vehicleRepo.findAll());
        model.addAttribute("routes", routeRepo.findAll());
        return "home";
    }

    // Driver CRUD
    @GetMapping("/drivers/new")
    public String newDriverForm(Model model) {
        model.addAttribute("driver", new Driver());
        return "driver-form";
    }

    @PostMapping("/drivers")
    public String saveDriver(@ModelAttribute Driver driver) {
        driverRepo.save(driver);
        return "redirect:/transport/";
    }

    @GetMapping("/drivers/edit/{id}")
    public String editDriverForm(@PathVariable Long id, Model model) {
        model.addAttribute("driver", driverRepo.findById(id).orElseThrow());
        return "driver-form";
    }

    @PostMapping("/drivers/update")
    public String updateDriver(@ModelAttribute Driver driver) {
        driverRepo.save(driver);
        return "redirect:/transport/";
    }

    @GetMapping("/drivers/delete/{id}")
    public String deleteDriver(@PathVariable Long id) {
        driverRepo.deleteById(id);
        return "redirect:/transport/";
    }

    // Vehicle CRUD
    @GetMapping("/vehicles/new")
    public String newVehicleForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle-form";
    }

    @PostMapping("/vehicles")
    public String saveVehicle(@ModelAttribute Vehicle vehicle) {
        vehicleRepo.save(vehicle);
        return "redirect:/transport/";
    }

    @GetMapping("/vehicles/edit/{id}")
    public String editVehicleForm(@PathVariable Long id, Model model) {
        model.addAttribute("vehicle", vehicleRepo.findById(id).orElseThrow());
        return "vehicle-form";
    }

    @PostMapping("/vehicles/update")
    public String updateVehicle(@ModelAttribute Vehicle vehicle) {
        vehicleRepo.save(vehicle);
        return "redirect:/transport/";
    }

    @GetMapping("/vehicles/delete/{id}")
    public String deleteVehicle(@PathVariable Long id) {
        vehicleRepo.deleteById(id);
        return "redirect:/transport/";
    }

    // Route CRUD
    @GetMapping("/routes/new")
    public String newRouteForm(Model model) {
        model.addAttribute("route", new Route());
        return "route-form";
    }

    @PostMapping("/routes")
    public String saveRoute(@ModelAttribute Route route) {
        routeRepo.save(route);
        return "redirect:/transport/";
    }

    @GetMapping("/routes/edit/{id}")
    public String editRouteForm(@PathVariable Long id, Model model) {
        model.addAttribute("route", routeRepo.findById(id).orElseThrow());
        return "route-form";
    }

    @PostMapping("/routes/update")
    public String updateRoute(@ModelAttribute Route route) {
        routeRepo.save(route);
        return "redirect:/transport/";
    }

    @GetMapping("/routes/delete/{id}")
    public String deleteRoute(@PathVariable Long id) {
        routeRepo.deleteById(id);
        return "redirect:/transport/";
    }
}
