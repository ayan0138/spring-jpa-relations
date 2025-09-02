package ek.osnb.jpa.orders.dto;


import java.time.LocalDate;
import java.util.List;

public record OrderLineDto(Long id, double unitPrice, int quantity, String product) {
}