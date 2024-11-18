package com.bakaitest.smtptest.controller;

import com.bakaitest.smtptest.entity.EmailDetails;
import com.bakaitest.smtptest.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails emailDetails) {
        emailService.sendSimpleMail(emailDetails);
        return "OKEY";
    }

    @PostMapping("/sendMailAttachment")
    public String sendMailA(@RequestBody EmailDetails emailDetails) {
        emailService.sendMailWithAttachment(emailDetails);
        return "OKEY with Attachment";
    }
}