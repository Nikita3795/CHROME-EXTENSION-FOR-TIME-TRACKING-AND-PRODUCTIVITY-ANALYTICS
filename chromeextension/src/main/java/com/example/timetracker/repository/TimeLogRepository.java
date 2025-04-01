package com.example.timetracker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.timetracker.model.TimeLog;

import java.util.List;

public interface TimeLogRepository extends MongoRepository<TimeLog, String> {
    List<TimeLog> findByUserId(String userId);
}