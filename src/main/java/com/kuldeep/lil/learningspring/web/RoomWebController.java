package com.kuldeep.lil.learningspring.web;

import com.kuldeep.lil.learningspring.business.service.ReservationService;
import com.kuldeep.lil.learningspring.business.service.RoomService;
import com.kuldeep.lil.learningspring.data.entity.Guest;
import com.kuldeep.lil.learningspring.data.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.relation.RelationService;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomWebController {
    private final RoomService roomService;

    @Autowired
    public RoomWebController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getRooms(Model model) {
        List<Room> roomsList = this.roomService.getHotelRooms();
        model.addAttribute("rooms", roomsList);
        return "rooms";
    }
}
