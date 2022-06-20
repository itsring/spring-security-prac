package com.psj.securityclone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * JPA auditor enable
 */

// jpa 설정
@Configuration
@EnableJpaAuditing // JpaAuditing을 Enable
public class JpaAuditorConfig {
}
