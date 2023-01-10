package mallhossun.domain;

import mallhossun.domain.*;
import mallhossun.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;

    public StockDecreased(Inventory aggregate){
        super(aggregate);
    }
    public StockDecreased(){
        super();
    }
}
