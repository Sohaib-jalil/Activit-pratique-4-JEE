package ma.enset.hospitalapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // Utilisée pour déclarer une classe comme une source de configuration pour Spring
@EnableWebSecurity // Utilisée pour activer la configuration de la sécurité Web pour l'application
@EnableMethodSecurity(prePostEnabled = true)
// Utilisée dans les applications JEE pour activer la sécurité des méthodes.
// Elle permet d'activer les autorisations préalables et postérieures pour les méthodes de l'application
// et nécessite également la définition d'un gestionnaire de sécurité pour gérer les autorisations des méthodes
public class securityConfig {
    @Autowired // Utilisée pour effectuer l'injection de dépendances automatique
    private PasswordEncoder passwordEncoder;

    @Bean // Utilisée pour définir des méthodes de configuration qui produisent des instances de bean gérées par Spring
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        //  est une classe fournie par Spring Security pour stocker les informations sur les utilisateurs
        //  en mémoire plutôt que dans une base de données. Elle est utile pour les applications de petite taille
        //  ou pour les tests. Cette classe stocke les informations sur les utilisateurs dans une liste en mémoire,
        //  qui peut être initialisée au démarrage de l'application ou modifiée en cours d'exécution.
        return new InMemoryUserDetailsManager(
                User.withUsername("user1").password(passwordEncoder.encode("1234")).roles("USER").build(),
                User.withUsername("user2").password(passwordEncoder.encode("1234")).roles("USER").build(),
                User.withUsername("admin").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()
        );
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.formLogin().loginPage("/login").defaultSuccessUrl("/", true).permitAll();
        httpSecurity.rememberMe();
        httpSecurity.authorizeHttpRequests().requestMatchers("/webjars/**").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/user/**").hasRole("USER");
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN");
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        httpSecurity.exceptionHandling().accessDeniedPage("/notAuthorized");
        return httpSecurity.build();
    }
}
