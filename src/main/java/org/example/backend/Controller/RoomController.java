package org.example.backend.Controller;

import lombok.RequiredArgsConstructor;
import org.example.backend.DTO.RoomDto;
import org.example.backend.Service.RoomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @RequestMapping("rooms")
    public List<RoomDto> getAllRooms() {
        return roomService.getAllRooms();
    }
}
