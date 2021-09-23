package com.wayapaychat.notificationservice.details;

import java.util.List;

import lombok.Data;

@Data
public class DataInfo {

    String message;
    List<Receipient> recipients;
}
