package com.kuldeep.lil.sbet.web;

import com.kuldeep.lil.sbet.business.service.GuestService;
import com.kuldeep.lil.sbet.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestWebServiceController {
    private final GuestService guestService;

    @Autowired
    public GuestWebServiceController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public List<Guest> getHotelGuests() {
        return this.guestService.getHotelGuests();
    }
}
