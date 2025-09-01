package ek.osnb.jpa.orders.service;

import ek.osnb.jpa.orders.model.Order;
import ek.osnb.jpa.orders.model.OrderStatus;
import ek.osnb.jpa.orders.repository.OrderLineRepository;
import ek.osnb.jpa.orders.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

private final OrderRepository orderRepository;
private final OrderLineRepository orderLineRepository;


public OrderServiceImpl(OrderRepository orderRepository, OrderLineRepository orderLineRepository) {
    this.orderRepository = orderRepository;
    this.orderLineRepository = orderLineRepository;
}

    @Override
    public List<Order> getAllOrders(OrderStatus status) {
        return List.of();
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }

    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }
}

