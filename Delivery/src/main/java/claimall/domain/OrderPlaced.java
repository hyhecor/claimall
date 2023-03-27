package claimall.domain;

import claimall.domain.*;
import claimall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String coustomerId;
    private Long productId;
    private String productName;
    private Integer qty;
}
