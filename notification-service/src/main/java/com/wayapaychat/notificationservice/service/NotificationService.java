package com.wayapaychat.notificationservice.service;

import com.wayapaychat.notificationservice.configs.MQConfig;
import com.wayapaychat.notificationservice.details.NotificationLog;
import com.wayapaychat.notificationservice.repository.NotificationLogger;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.NotActiveException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class NotificationService {

    private final NotificationLogger mNotificationLogger;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void consumeNotification(NotificationLog notification)
            throws NotActiveException {

        log.info("::: receiving notification...");
        if (notification == null) {

            log.error("::: error, no notification at this time :::");
            throw new NotActiveException("No active notification sent at this time");
        }

        NotificationLog notificationLog = mNotificationLogger.save(notification);

        log.info("::: notification logged of entity: [{}] :::", notificationLog);

    }
}
