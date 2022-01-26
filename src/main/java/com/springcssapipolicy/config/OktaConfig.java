package com.springcssapipolicy.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("okta-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OktaConfig {
    private String authn;
    private  String updateprofile;
    private  String clientId;
    private  String secret;

}
