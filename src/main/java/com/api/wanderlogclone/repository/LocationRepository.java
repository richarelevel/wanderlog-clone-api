package com.api.wanderlogclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.wanderlogclone.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
