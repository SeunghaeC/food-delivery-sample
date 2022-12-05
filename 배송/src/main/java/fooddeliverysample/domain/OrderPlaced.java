package fooddeliverysample.domain;

import fooddeliverysample.domain.*;
import fooddeliverysample.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String qty;
}


