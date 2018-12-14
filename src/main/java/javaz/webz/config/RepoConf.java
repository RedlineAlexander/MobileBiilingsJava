package javaz.webz.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "javaz.webz.entity")
public class RepoConf {
}
