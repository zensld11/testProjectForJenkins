package com.bakaitest.smtptest.service;

import com.bakaitest.smtptest.entity.EmailDetails;

public interface EmailService {
    void sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}