package com.kuldeep.lil.sbet.web;

import com.kuldeep.lil.sbet.business.service.GuestService;
import com.kuldeep.lil.sbet.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestWebController {
    private final GuestService guestService;

    @Autowired
    public GuestWebController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public String getGuests(Model model) {
        List<Guest> guestsList = this.guestService.getHotelGuests();
        model.addAttribute("guests", guestsList);
        return "guests";
    }

}
