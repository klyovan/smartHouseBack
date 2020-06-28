package com.klyovan.springjwt.repository;

import com.klyovan.springjwt.models.Sensor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor,Long> {
    Sensor findOneById (Long id);

    List<Sensor> findAllByRoomId(Long id);


}
