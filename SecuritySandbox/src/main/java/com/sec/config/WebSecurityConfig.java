package com.sec.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.sec.filter.JWTAuthenticationFilter;
import com.sec.filter.JWTAuthorizationFilter;
import org.springframework.security.authentication.AuthenticationManager;


@EnableWebSecurity
@Configuration
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig {
	@Value("${spring.security.debug:false}")
    boolean securityDebug;
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager auth) throws Exception {
	    http.csrf()
	      .disable()
	      .authorizeHttpRequests()
	      .requestMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/favicon.ico")
	      .permitAll()
	      .requestMatchers(HttpMethod.POST, AuthenticationConfigConstants.SIGN_UP_URL)
	      .permitAll()
	      .requestMatchers(HttpMethod.DELETE)
	      .hasRole("ADMIN")
	      .requestMatchers("/admin/**")
	      .hasRole("ADMIN")
	      .requestMatchers("/user/**")
	      .hasAnyRole("USER", "ADMIN")
	      .requestMatchers("/login/**")
	      .anonymous()
	      .anyRequest()
	      .authenticated()
	      .and()
	      .addFilter(new JWTAuthenticationFilter(auth))
	      .addFilter(new JWTAuthorizationFilter(auth))
	      .sessionManagement()
	      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		
		

	    return http.build();
	}
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsService userDetailService) 
	  throws Exception {
	    return http.getSharedObject(AuthenticationManagerBuilder.class)
	      .userDetailsService(userDetailService)
	      .passwordEncoder(bCryptPasswordEncoder)
	      .and()
	      .build();
	}

//
//	@Bean
//	public WebSecurityCustomizer webSecurityCustomizer() {
//	    return (web) -> web.debug(securityDebug)
//	      .ignoring()
//	      .requestMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/favicon.ico");
//	}
//	
	
	

}