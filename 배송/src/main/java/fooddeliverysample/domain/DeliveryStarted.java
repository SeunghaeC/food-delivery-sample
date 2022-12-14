package fooddeliverysample.domain;

import fooddeliverysample.domain.*;
import fooddeliverysample.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted( aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
