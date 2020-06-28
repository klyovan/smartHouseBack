package com.klyovan.springjwt.service;

import com.klyovan.springjwt.models.Room;
import com.klyovan.springjwt.repository.RoomRepository;
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

    public Long updateRoom(Long isCreated) {
        return null;
    }
}
