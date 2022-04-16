package com.dev.auto.config;

import com.dev.auto.config.service.TransactionService;
import com.dev.auto.config.service.TransactionServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TransactionService.class)
public class TransactionServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TransactionService getTransactionServiceBean(){
        return new TransactionServiceImpl();
    }
}
