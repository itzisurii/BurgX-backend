package edu.iCET.model.dto;

import edu.iCET.model.enums.OrderStatus;
import edu.iCET.model.enums.ServiceType;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long orderId;
    private OrderStatus orderStatus;
    private ServiceType serviceType;
    private BigDecimal totalValue;

    private List<OrderItemDTO> items;

}
