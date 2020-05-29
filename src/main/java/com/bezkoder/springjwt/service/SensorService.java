package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Room;
import com.bezkoder.springjwt.models.Sensor;
import com.bezkoder.springjwt.repository.SensorRepository;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    public Sensor getSensor(Long sensorId){
      return  sensorRepository.findOneById(sensorId);
    }

    public Long saveSensor (Sensor sensor){
        sensorRepository.save(sensor);
        return sensor.getId();
    }

    public List<Sensor> getAllSensorsForRoom(Long roomId){
       return sensorRepository.findAllByRoomId(roomId);
    }

    public Long deleteSensor(Long sensorId){
        sensorRepository.deleteById(sensorId);
        return sensorId;
    }
}
