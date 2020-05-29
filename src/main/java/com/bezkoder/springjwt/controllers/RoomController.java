package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Room;
import com.bezkoder.springjwt.models.Sensor;
import com.bezkoder.springjwt.service.RoomService;
import com.bezkoder.springjwt.service.SensorService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private SensorService sensorService;

    @GetMapping("/room")
    public List<Room> getRooms() {
        return roomService.getAllRooms();
    }

    @PostMapping("/room")
    @PreAuthorize("hasRole('ADMIN')")
    public Long createRoom(@RequestBody Room room){
        return roomService.saveRoom(room);
    }

    @DeleteMapping("/room/{roomId}")
    public Long deleteRoom(@PathVariable Long roomId){
        return roomService.deleteRoom(roomId);
    }



    @GetMapping("/room/{roomId}")
    public List<Sensor> getSensorsForRoom(@PathVariable Long roomId){
    return sensorService.getAllSensorsForRoom(roomId);
    }



    @PostMapping("/sensor")
    @PreAuthorize("hasRole('ADMIN')")
    public Long createSensor(@RequestBody Sensor sensor){
        return sensorService.saveSensor(sensor);
    }

    @DeleteMapping("/sensor/{sensorId}")
    public Long deleteSensor(@PathVariable Long sensorId){
        return sensorService.deleteSensor(sensorId);
    }

//
//    @GetMapping("/")
//    @PreAuthorize("hasRole('ADMIN')")
//    public String userAccess() {
//        return "User Content.";
//    }
}
