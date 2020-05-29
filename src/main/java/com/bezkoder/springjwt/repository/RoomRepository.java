package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Room;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    Room findOneById (Long id);

    List<Room> findAll();


}
