package com.bakaitest.smtptest.service.impl;

import com.bakaitest.smtptest.entity.EmailDetails;
import com.bakaitest.smtptest.service.EmailService;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    private final JavaMailSender mailSender;

//    @Value(value = "${spring.mail.username}")
//    private String sender;

    @Override
    public void sendSimpleMail(EmailDetails details) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, false);

            mimeMessageHelper.setTo(details.getRecipient());
            mimeMessageHelper.setText(details.getMsgBody());
            mimeMessageHelper.setSubject(details.getSubject());

            mailSender.send(message);
        } catch (Exception e) {
            throw new RuntimeException("Error while send" + e.getMessage());
        }
    }

    @Override
    public String sendMailWithAttachment(EmailDetails details) {
//        MimeMessage mimeMessage
//                = mailSender.createMimeMessage();
//        MimeMessageHelper mimeMessageHelper;
//
//        try {
//            mimeMessageHelper = new MimeMessageHelper(mimeMessage, false);
//            mimeMessageHelper.setFrom(sender);
//            mimeMessageHelper.setTo(details.getRecipient());
//            mimeMessageHelper.setText(details.getMsgBody(), false);
//            mimeMessageHelper.setSubject(details.getSubject());
//            details.getSubject();
//            if (details.getMsgBody() == null || details.getMsgBody().isEmpty()) {
//                throw new MessagingException("Тело сообщения не может быть пустым");
//            }
//            //FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));
//            //mimeMessageHelper.addAttachment(file.getFilename(), file);
//            mailSender.send(mimeMessage);
//            return "Сообщение отправлено удачно";
//        } catch (MessagingException e) {
//            return "Ошибка при отпрвке сообщения";
//        }
        return null;
    }
}