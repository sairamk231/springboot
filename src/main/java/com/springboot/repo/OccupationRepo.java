package com.springboot.repo;

import com.springboot.entity.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupationRepo extends JpaRepository<Occupation,Integer> {
}
