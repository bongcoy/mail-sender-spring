package com.bongcoy.email_sender.mail;

public interface MailSender {
    void send(String to, String subject, String body);
}
