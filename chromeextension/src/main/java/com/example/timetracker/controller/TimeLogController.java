package com.example.timetracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.timetracker.model.TimeLog;
import com.example.timetracker.repository.TimeLogRepository;

import java.util.List;

@RestController
@RequestMapping("/api/timelogs")
@CrossOrigin("*") // Allow Angular to call the API
public class TimeLogController {

    @Autowired
    private TimeLogRepository timeLogRepository;

    @PostMapping("/track")
    public TimeLog trackTime(@RequestBody TimeLog timeLog) {
        return timeLogRepository.save(timeLog);
    }

    @GetMapping("/{userId}")
    public List<TimeLog> getUserLogs(@PathVariable String userId) {
        return timeLogRepository.findByUserId(userId);
    }
}