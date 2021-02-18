package com.kuldeep.lil.learningspring.business.service;

import com.kuldeep.lil.learningspring.data.entity.Staff;
import com.kuldeep.lil.learningspring.data.repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getHotelStaff() {
        Iterable<Staff> staffIterable = this.staffRepository.findAll();
        List<Staff> staffList = new ArrayList<>();
        staffIterable.forEach(staff -> {staffList.add(staff);});
        staffList.sort(new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1.getLastName()== o2.getLastName()) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return staffList;

    }

}

