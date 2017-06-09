package com.andsamp;

import org.apache.log4j.spi.LoggingEvent;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by osboxes on 6/8/17.
 */
@Component
public class Listener {

    @JmsListener(destination = "LOG.APP_LOGS", containerFactory = "listenerFactory")
    public void recieveLogMessage(LoggingEvent log) {
        System.out.println("found<"+log.toString()+">");
    }
}
