package com.bongcoy.email_sender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bongcoy.email_sender.mail.MailSender;

@RestController
public class MailController {
    private MailSender mailSender;

    public MailController(MailSender smtp) {
        this.mailSender = smtp;
    }

    @GetMapping("/mail")
    public String hello() {
        mailSender.send("mail@example.com", "Testing", "Hai Test");
        return "Mail sent";
    }
}
