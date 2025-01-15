package org.rekonvald.lab1.service;

import org.rekonvald.lab1.entity.DeliveryStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryService {

  private final List<DeliveryStatus> deliveryStatuses;

  public DeliveryService() {
    deliveryStatuses = new ArrayList<>();
    deliveryStatuses.add(new DeliveryStatus("1", "On the way", "20 minutes"));
    deliveryStatuses.add(new DeliveryStatus("2", "Preparing", "45 minutes"));
    deliveryStatuses.add(new DeliveryStatus("3", "Delivered", "0 minutes"));
  }

  public List<DeliveryStatus> getAllDeliveryStatuses() {
    return deliveryStatuses;
  }
}