package br.com.carlosrodrigues.config;

import br.com.carlosrodrigues.core.enums.enums_usuarios.TipoUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/admin/login", "/admin/logout").permitAll()
                        .requestMatchers("/admin/**").hasAuthority(TipoUsuario.ADMIN.toString())
                        .anyRequest().authenticated())

                .formLogin(login -> login
                        .loginPage("/admin/login")
                        .usernameParameter("email")
                        .passwordParameter("senha")
                        .defaultSuccessUrl("/admin/produtos/listaGeral")
                        .permitAll())

                .logout(logout -> logout
                        .logoutRequestMatcher(new AntPathRequestMatcher("/admin/logout", "GET"))
                        .logoutSuccessUrl("/admin/login"));


        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {

        return (Web) -> Web.ignoring()
                .requestMatchers("/webjars/**", "/css/**", "/js/**", "/img/**", "/favicon.ico");
    }
}
