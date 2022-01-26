package com.springcssapipolicy.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Config {

    @Autowired
    DbConfig dbConfig;

    @Autowired
    MuleConfig muleConfig;

    @Autowired
    OktaConfig oktaConfig;

    @Autowired
    SalesforceConfig salesforceConfig;


}
