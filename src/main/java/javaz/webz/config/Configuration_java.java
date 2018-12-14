package javaz.webz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class Configuration_java extends WebSecurityConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    @Bean
//    public AccessDeniedHandler accessDeniedHandler() {
//        return new CustomAccessDeniedHandler();
//    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("superadmin").password("superadmin").roles("SUPERADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off

        // ensures that any request to our application requires
        // the user to be authenticated
        http.authorizeRequests()
                // any user can access root of the application
                .antMatchers("/").permitAll()
                // only users with role ROLE_ADMIN (yes, ROLE_<rolename>)
                // can access pages in /protected section
                .antMatchers("/protected/**").access("hasRole('ROLE_ADMIN')")
                // only users with role ROLE_SUPERADMIN
                // can access pages in /confidential section
                .antMatchers("/confidential/**").access("hasRole('ROLE_SUPERADMIN')")
//                .and().formLogin()
                // specifies where users will go after authenticating successfully
                // if they have not visited a secured page prior to authenticating
                // or alwaysUse is true.
                //  .defaultSuccessUrl("/", false)
                // allows users to authenticate with form based login
                .and().formLogin()
                .loginPage("/newlogin").permitAll()
                .and().logout().permitAll()
//                .and().exceptionHandling().accessDeniedHandler(accessDeniedHandler())
        ;
        // @formatter:on
    }
}
