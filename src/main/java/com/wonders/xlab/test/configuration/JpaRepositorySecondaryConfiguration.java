package com.wonders.xlab.test.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;

/**
 * Created by wangqiang on 15/10/20.
 */
@Configuration
@EnableJpaRepositories(
        basePackages = "com.wonders.**.repository.secondary",
        entityManagerFactoryRef = "entityManagerFactorySecondary",
        transactionManagerRef = "transactionManagerSecondary"
)
public class JpaRepositorySecondaryConfiguration {

    @Autowired
    @Qualifier("entityManagerFactorySecondary")
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public PlatformTransactionManager transactionManagerSecondary() {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
