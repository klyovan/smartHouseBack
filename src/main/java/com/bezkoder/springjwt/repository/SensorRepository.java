package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Room;
import com.bezkoder.springjwt.models.Sensor;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor,Long> {
    Sensor findOneById (Long id);

    List<Sensor> findAllByRoomId(Long id);


}
