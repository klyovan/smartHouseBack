package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Room;
import com.bezkoder.springjwt.repository.RoomRepository;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public Room getRoom(Long roomId) {
        return roomRepository.findOneById(roomId);
    }

    public Long saveRoom (Room room){
      roomRepository.save(room);
      return room.getId();
    }


    public List<Room> getAllRooms(){
     return roomRepository.findAll();
    }

    public Long deleteRoom(Long roomId){
         roomRepository.deleteById(roomId);
        return roomId;
    }
}
