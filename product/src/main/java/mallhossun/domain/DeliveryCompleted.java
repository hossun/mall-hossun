package mallhossun.domain;

import mallhossun.domain.*;
import mallhossun.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private String productName;
    private String address;
    private String status;
}


