package com.bongcoy.email_sender.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {
    private static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending Mock mail to "+to);
        log.info("with subject  "+subject);
        log.info("and body "+body);
    }

}
