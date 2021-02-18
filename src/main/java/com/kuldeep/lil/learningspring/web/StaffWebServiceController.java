package com.kuldeep.lil.learningspring.web;

import com.kuldeep.lil.learningspring.business.service.StaffService;
import com.kuldeep.lil.learningspring.data.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffWebServiceController {
    public final StaffService staffService;

    @Autowired
    public StaffWebServiceController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getHotelStaff() {
        return this.staffService.getHotelStaff();
    }
}
