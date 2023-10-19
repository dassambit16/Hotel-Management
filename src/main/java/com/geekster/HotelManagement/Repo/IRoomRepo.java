package com.geekster.HotelManagement.Repo;

import com.geekster.HotelManagement.Model.Room;
import com.geekster.HotelManagement.Model.RoomType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<Room, Long> {
    List<Room> findByRoomType(RoomType roomType);

    List<Room> findByRoomTypeAndRoomAvailableStatus(RoomType roomType, boolean b);

}
