package mallhossun.domain;

import mallhossun.domain.*;
import mallhossun.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private String productName;
    private String status;
    private Integer qty;
    private String address;
}


