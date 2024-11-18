package com.bakaitest.smtptest.service.impl;

import com.bakaitest.smtptest.service.PasswordService;
import com.bakaitest.smtptest.utils.StringUtils;
import com.bakaitest.smtptest.utils.random.RandomStringGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@RequiredArgsConstructor
public class PasswordServiceImpl implements PasswordService {

    @Value("${booking.dates.representation-format}")
    private String dateRepresentationFormat;

    @Value(value = "${booking.security.auth.password.min.length}")
    private int passwordMinLength;

    @Value("${booking.security.auth.password.min.letters-count}")
    private int passwordMinLettersCount;

    @Value("${booking.security.auth.password.min.upper-letters-count}")
    private int passwordMinUpperLettersCount;

    @Override
    public String generateSomePassword() {
        String password = RandomStringGenerator.randomNumbers(this.passwordMinLength) +
                RandomStringGenerator.randomLowerLetters(this.passwordMinLettersCount) +
                RandomStringGenerator.randomUpperLetters(this.passwordMinUpperLettersCount);
        return StringUtils.shuffle(password);
    }
}
