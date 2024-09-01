package com.example.task_manager.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@DynamoDbBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskAudit {
    private String taskId;

    private String eventId;

    private String eventDescription;

    private LocalDateTime eventTimestamp;

    @DynamoDbPartitionKey
    public String getTaskId() {
        return taskId;
    }

    @DynamoDbSortKey
    public String getEventId() {
        return eventId;
    }
}