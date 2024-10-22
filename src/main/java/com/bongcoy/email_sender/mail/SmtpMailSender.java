package com.bongcoy.email_sender.mail;

import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender implements MailSender {

    // private JavaMailSender javaMailSender;

    @Override
    public void send(String to, String subject, String body) {
        
    }
}
