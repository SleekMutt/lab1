package org.rekonvald.lab1.entity;

public record DeliveryStatus(String orderId, String status, String estimatedTime) {
}
