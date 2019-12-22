package ua.kpi.tef.pubsubtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.tef.pubsubtest.PubSubTestApplication.PubsubOutboundGateway;

@RestController
public class Controller {

    @Autowired
    private PubsubOutboundGateway messagingGateway;

    @PostMapping("/publishMessage")
    public String publishMessage(@RequestParam("message") String message) {
        messagingGateway.sendToPubsub(message);
        return "Ok";
    }
}
