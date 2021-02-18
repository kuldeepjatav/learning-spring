package com.kuldeep.lil.learningspring.web;

import com.kuldeep.lil.learningspring.business.service.ReservationService;
import com.kuldeep.lil.learningspring.business.service.StaffService;
import com.kuldeep.lil.learningspring.data.entity.Room;
import com.kuldeep.lil.learningspring.data.entity.Staff;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffWebController {
    public final StaffService staffService;

    @Autowired
    public StaffWebController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getStaff(Model model) {
        List<Staff> staffList = this.staffService.getHotelStaff();
        model.addAttribute("staffs", staffList);
        return "staff";
    }
}
