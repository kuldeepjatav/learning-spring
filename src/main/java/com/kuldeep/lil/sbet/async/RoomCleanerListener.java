package com.kuldeep.lil.sbet.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuldeep.lil.sbet.business.service.RoomService;
import com.kuldeep.lil.sbet.data.entity.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RoomCleanerListener {
    private static final Logger LOG = LoggerFactory.getLogger(RoomCleanerListener.class);

    private final ObjectMapper objectMapper;
    private final RoomService roomService;

    public RoomCleanerListener(ObjectMapper objectMapper, RoomService roomService) {
        this.objectMapper = objectMapper;
        this.roomService = roomService;
    }
    public void receiveMessage(String message){
        try{
            AsyncPayload asyncPayload= objectMapper.readValue(message,AsyncPayload.class);
            if("ROOM".equalsIgnoreCase(asyncPayload.getModel()))
            {
                Room room=roomService.getById(asyncPayload.getId());
                LOG.info("ROOM {}:{} needs to be cleaned", room.getRoomNumber(),room.getRoomName());
            }else{
                LOG.warn("Unknown model type");
            }
        }catch(JsonProcessingException e)
        {
            e.printStackTrace();
        }
    }
}
