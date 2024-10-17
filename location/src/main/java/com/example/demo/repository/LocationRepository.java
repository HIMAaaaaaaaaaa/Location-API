package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import com.example.demo.entity.LocationEntity;
@EntityScan(basePackages = "com.example.demo.entity")
public interface LocationRepository extends JpaRepository<LocationEntity, Long> {

	//LocationServices save(LocationServices location);

	//List<LocationServices> findByCITY(String city);

}
