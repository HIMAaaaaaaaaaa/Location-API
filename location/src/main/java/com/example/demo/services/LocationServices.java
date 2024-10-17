package com.example.demo.services;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServices {
	private final LocationRepository locationRepository ;

    public LocationServices(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<LocationEntity> selectAllLocations() {
        return locationRepository.findAll();
    }

    public Optional<LocationEntity> selectLocationById(Long locationId) {
        return locationRepository.findById(locationId);
    }
/*
    public LocationServices addLocation(LocationServices location) {
        return locationRepository.save(location);
    }

    public LocationServices updateLocation(Long locationId, LocationServices updatedLocation) {
        Optional<LocationEntity> existingLocation = locationRepository.findById(locationId);
        if (existingLocation.isPresent()) {
            updatedLocation.setLOCATION_ID(locationId);
            return locationRepository.save(updatedLocation);
        }
        return null; // You can handle the not found scenario differently
    }
*/
    private void setLOCATION_ID(Long locationId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteLocation(Long locationId) {
        locationRepository.deleteById(locationId);
    }
/*
    public List<LocationServices> findLocationsByCity(String city) {
        return locationRepository.findByCITY(city);
    }
    */
}
