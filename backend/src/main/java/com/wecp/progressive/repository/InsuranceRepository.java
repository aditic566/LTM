package com.wecp.progressive.repository;

<<<<<<< HEAD
public interface InsuranceRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer>{
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}
