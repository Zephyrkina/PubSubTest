package ua.kpi.tef.pubsubtest.publisher.outbound;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "pubsubOutputChannel")
public interface PubsubOutboundGateway {
    void sendToPubsub(String text);
}
