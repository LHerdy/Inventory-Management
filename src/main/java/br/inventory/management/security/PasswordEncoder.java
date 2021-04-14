package br.inventory.management.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
public class PasswordEncoder {

    public BCryptPasswordEncoder bCryptPasswordEncoder;
    //falta config.

}
