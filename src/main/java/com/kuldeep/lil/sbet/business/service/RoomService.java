package com.kuldeep.lil.sbet.business.service;

import com.kuldeep.lil.sbet.data.entity.Room;
import com.kuldeep.lil.sbet.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getHotelRooms() {
        Iterable<Room> rooms = this.roomRepository.findAll();
        List<Room> roomList = new ArrayList<>();
        rooms.forEach(room -> {
            roomList.add(room);
        });
        roomList.sort(new Comparator<Room>() {
            @Override
            public int compare(Room o1, Room o2) {
                if (o1.getRoomNumber() == o2.getRoomNumber()) {
                    return o1.getRoomName().compareTo(o2.getRoomName());
                }
                return o1.getRoomNumber().compareTo(o2.getRoomNumber());
            }
        });
        return roomList;

    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}
