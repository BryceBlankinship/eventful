package com.bryceblankinship.eventful.controllers;

import com.bryceblankinship.eventful.dto.CoordinatesDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinatesController {

    @GetMapping("/coordinates")
    public CoordinatesDTO coordinates(@RequestParam(value="longitude") float longitude, @RequestParam(value="latitude") float latitude){
        return new CoordinatesDTO(longitude, latitude);
    }

}
