package ua.kpi.tef.pubsubtest.publisher.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.tef.pubsubtest.publisher.outbound.PubsubOutboundGateway;

@Slf4j
@RestController
public class Controller {

    @Autowired
    private PubsubOutboundGateway messagingGateway;

    @PostMapping("/publishMessage")
    public String publishMessage(@RequestParam("message") String message) {
        messagingGateway.sendToPubsub(message);
        log.info("Message was published: {}", message);
        return "Ok";
    }
}
