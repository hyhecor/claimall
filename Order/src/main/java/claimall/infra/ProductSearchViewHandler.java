package claimall.infra;

import claimall.config.kafka.KafkaProcessor;
import claimall.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ProductSearchViewHandler {

    @Autowired
    private ProductSearchRepository productSearchRepository;
}
