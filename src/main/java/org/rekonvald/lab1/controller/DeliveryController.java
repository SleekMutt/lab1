package org.rekonvald.lab1.controller;

import org.rekonvald.lab1.entity.DeliveryStatus;
import org.rekonvald.lab1.service.DeliveryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DeliveryController {
  private final DeliveryService deliveryService;

  public DeliveryController(DeliveryService deliveryService) {
    this.deliveryService = deliveryService;
  }

  @GetMapping("/delivery-status")
  public ResponseEntity<List<DeliveryStatus>> getDeliveryStatus() {
    return ResponseEntity.ok(deliveryService.getAllDeliveryStatuses());
  }
}
