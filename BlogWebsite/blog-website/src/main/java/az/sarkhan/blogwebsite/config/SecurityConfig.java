package az.sarkhan.blogwebsite.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 

@Configuration
@EnableWebSecurity
 
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET,"/").permitAll() 
    .antMatchers(HttpMethod.GET,"/scripts/**").permitAll()
    .antMatchers(HttpMethod.GET,"/styles/**").permitAll()
    .antMatchers(HttpMethod.GET,"/assets/**").permitAll() 
    .antMatchers(HttpMethod.GET,"/blog").permitAll() 
    .antMatchers(HttpMethod.GET,"/home").permitAll() 
    .antMatchers(HttpMethod.GET,"/photos").permitAll() 
    .antMatchers(HttpMethod.GET,"/files/**").permitAll() 
    .antMatchers(HttpMethod.GET,"/blog").permitAll() 
    .antMatchers(HttpMethod.GET,"/footer").permitAll() 
    .antMatchers(HttpMethod.GET,"/about").permitAll() 

    .anyRequest().authenticated().and().
    formLogin().loginPage("/login").loginProcessingUrl("/authenticate").permitAll()
    .and().logout().permitAll();
}
     
    
}