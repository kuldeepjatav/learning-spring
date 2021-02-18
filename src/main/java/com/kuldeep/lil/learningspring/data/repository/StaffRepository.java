package com.kuldeep.lil.learningspring.data.repository;

import com.kuldeep.lil.learningspring.data.entity.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff,Long> {
}
