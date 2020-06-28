package com.klyovan.springjwt.repository;

import com.klyovan.springjwt.models.Room;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    Room findOneById (Long id);

    List<Room> findAll();



}
