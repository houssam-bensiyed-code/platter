package com.fooddelivery.observer;


public interface OrderObserver {
    void onStatusChange(String orderId, OrderStatus oldStatus, OrderStatus newStatus);

    String getObserverName();
}
