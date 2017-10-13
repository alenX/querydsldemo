package com.example.querydsldemo.config;

import com.querydsl.jpa.HQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.EntityManager;

//@Configuration
//@EnableJpaAuditing
public class JpaFactoryConfig {

//    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
        return new JPAQueryFactory(new HQLTemplates(), entityManager);
    }
}
