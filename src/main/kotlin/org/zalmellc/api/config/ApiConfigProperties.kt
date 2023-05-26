package org.zalmellc.api.config

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "apiconfig")
public class ApiConfigProperties {

    var property: String = "prop one"

}