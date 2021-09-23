package com.wayapaychat.notificationservice.repository;

import com.wayapaychat.notificationservice.details.NotificationLog;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationLogger extends MongoRepository<NotificationLog, String> {

}
