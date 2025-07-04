package org.example.repository;

import org.example.model.WimbledonResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WimbledonResultRepository extends JpaRepository<WimbledonResult, Integer>{

}
