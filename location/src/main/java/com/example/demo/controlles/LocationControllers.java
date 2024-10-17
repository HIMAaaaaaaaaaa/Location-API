package com.example.demo.controlles;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.LocationEntity;
import com.example.demo.services.LocationServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
@EntityScan(basePackages = "com.example.demo.entity")
public class LocationControllers {
	private final LocationServices locationService;

	public LocationControllers(LocationServices locationService) {
		this.locationService = locationService;
	}

	@GetMapping
	public List<LocationEntity> selectAllLocations() {
		return locationService.selectAllLocations();
	}

	@GetMapping("/{locationId}")
	public LocationEntity selectLocationById(@PathVariable Long locationId) {
		Optional<LocationEntity> location = locationService.selectLocationById(locationId);
		return location.orElse(null); // You can return an appropriate response if not found
	}

	/*
	 * @PostMapping public LocationServices addLocation(@RequestBody
	 * LocationServices location) { return locationService.addLocation(location); }
	 * 
	 * @PutMapping("/{locationId}") public LocationServices
	 * updateLocation(@PathVariable Long locationId,
	 * 
	 * @RequestBody LocationServices updatedLocation) { return
	 * locationService.updateLocation(locationId, updatedLocation); }
	 * 
	 */
	@DeleteMapping("/{locationId}")
	public void deleteLocation(@PathVariable Long locationId) {
		locationService.deleteLocation(locationId);
	}
	/*
	 * @GetMapping("/find") public List<LocationServices>
	 * findLocationsByCity(@RequestParam String city) { return
	 * locationService.findLocationsByCity(city); }
	 */
}
