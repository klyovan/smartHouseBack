package com.klyovan.springjwt.service;

import com.klyovan.springjwt.models.Sensor;
import com.klyovan.springjwt.repository.SensorRepository;
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
