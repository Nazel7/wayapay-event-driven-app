package com.wayapaychat.notificationservice.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class NotificationLog {
    @Id
    private String id;
    @Indexed
    private DataInfo data;
    private String eventType;
    private String initiator;

}
