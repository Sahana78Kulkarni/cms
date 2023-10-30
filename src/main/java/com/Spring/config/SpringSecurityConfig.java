
  package com.Spring.config;
  
  import org.springframework.context.annotation.Bean; 
  import org.springframework.context.annotation.Configuration;
  //import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
 // import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
  //import org.springframework.security.config.annotation.web.builders.HttpSecurity;
 // import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; 
 // import org.springframework.security.core.userdetails.User;
//  import org.springframework.security.core.userdetails.UserDetails;
  //import org.springframework.security.core.userdetails.UserDetailsService;
  //import org.springframework.security.crypto.password.NoOpPasswordEncoder;
 // import org.springframework.security.crypto.password.PasswordEncoder;
//  import org.springframework.security.provisioning.InMemoryUserDetailsManager; 
 // import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
  
  
  //@Configuration //@EnableWebSecurity
  public class SpringSecurityConfig{
  
		/*
		 * @Bean public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		 * UserDetails admin=User.withUsername("sahana")
		 * .password(encoder.encode("password")).roles("ADMIN").build();
		 * 
		 * return new InMemoryUserDetailsManager(admin); }
		 * 
		 * @SuppressWarnings("removal") public void configure(HttpSecurity http) throws
		 * Exception{ http.csrf().disable();
		 * http.authorizeRequests().requestMatchers("/api/v1/faculties/*")
		 * .hasAuthority("ADMIN") .anyRequest().authenticated()
		 * .anyRequest().permitAll().and().formLogin().and().httpBasic(); }
		 * 
		 * 
		 * @Bean public PasswordEncoder getPasswordEncoder() { return
		 * NoOpPasswordEncoder.getInstance(); }
		 */
	  }
 