package ma.enset.hospitalapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // utilisée pour marquer une classe Java comme étant un contrôleur de requête
public class SecurityController {
    @GetMapping("/notAuthorized") // Utilisée pour mapper une méthode de contrôleur à une URL spécifique
    public String notAuthorized(){
        return "notAuthorized";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
