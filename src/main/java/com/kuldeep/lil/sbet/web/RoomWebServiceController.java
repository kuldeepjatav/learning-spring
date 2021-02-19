package com.kuldeep.lil.sbet.web;

import com.kuldeep.lil.sbet.business.service.RoomService;
import com.kuldeep.lil.sbet.data.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomWebServiceController {
    public final RoomService roomService;

    @Autowired
    public RoomWebServiceController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getHotelRooms() {
        return this.roomService.getHotelRooms();
    }
}

