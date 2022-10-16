package com.bryceblankinship.eventful.controllers;

import com.bryceblankinship.eventful.dto.EventDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * EventController exposes several http methods
 *
 * GET an Event
 * GET multiple Events (for creating a map of events)
 *
 * POST an Event
 *
 * PATCH an Event
 *
 * Delete an Event
 */

@RestController
public class EventController {

    @GetMapping("/event")
    public EventDTO event(@RequestParam(value="eventID") UUID eventID, String name, String desc){
        return new EventDTO(eventID, name, desc);
    }

    @PostMapping("/event")
    public ResponseEntity<String> post(){
        return new ResponseEntity<>("Posted, in front of the trap.", HttpStatus.OK);
    }

    @PatchMapping("/event")
    public ResponseEntity<String> patch(@RequestParam(value="eventID") UUID eventID){
        return new ResponseEntity<>("Successfully patched EventID: " + eventID, HttpStatus.OK);
    }

}
