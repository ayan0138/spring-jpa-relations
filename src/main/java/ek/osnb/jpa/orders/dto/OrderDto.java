package ek.osnb.jpa.orders.dto;

import java.time.LocalDate;

public record OrderDto(Long id, LocalDate orderDate, String status, List<OrderLineDto> orderLines) {
}