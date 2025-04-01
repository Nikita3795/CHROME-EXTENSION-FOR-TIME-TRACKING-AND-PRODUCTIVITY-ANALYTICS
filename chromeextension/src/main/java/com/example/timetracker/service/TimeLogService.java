package com.example.timetracker.service;

import com.example.timetracker.model.TimeLog;
import com.example.timetracker.repository.TimeLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeLogService {
    @Autowired
    private TimeLogRepository timeLogRepository;

    public TimeLog saveTimeLog(TimeLog timeLog) {
        return timeLogRepository.save(timeLog);
    }

    public List<TimeLog> getTimeLogsByUser(String userId) {
        return timeLogRepository.findByUserId(userId);
    }
}
