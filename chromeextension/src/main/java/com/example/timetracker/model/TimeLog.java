package com.example.timetracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "time_logs")
public class TimeLog {
    @Id
    private String id;
    private String website;
    private long timeSpent; // Time in seconds
    private String userId; // (Optional for JWT)
}