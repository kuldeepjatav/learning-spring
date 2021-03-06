package com.kuldeep.lil.sbet.data.repository;

import com.kuldeep.lil.sbet.data.entity.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {
}
