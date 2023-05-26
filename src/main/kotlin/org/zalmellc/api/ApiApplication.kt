package org.zalmellc.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties
class ApiApplication

fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}
