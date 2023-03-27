package claimall.domain;

import claimall.domain.*;
import claimall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;

    public StockDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
