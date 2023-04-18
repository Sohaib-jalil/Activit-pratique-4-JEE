package ma.enset.hospitalapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity // Utilisée pour marquer une classe Java comme une entité persistante
@Data // Utilisée pour générer automatiquement du code boilerplate pour les classes Java
@NoArgsConstructor // Utilisée pour générer automatiquement un constructeu sans arguments
@AllArgsConstructor // Utilisée pour générer automatiquement un constructeu avec arguments
@Builder // Utilisée pour générer automatiquement un constructeur de type builder pour une classe Java
public class Patient {
    @Id // Utilisée pour spécifier que le champ annoté est l'identifiant de l'entité associée
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Utilisée pour spécifier que la valeur d'une clé primaire doit être générée automatiquement
    private Long id;
    @NotEmpty // Utilisée pour vérifier qu'une chaîne de caractères ou une collection n'est pas nulle
    @Size(min = 4, max = 20)
    // Utilisée pour vérifier qu'une chaîne de caractères ou une collection a une taille comprise entre une valeur minimale et une valeur maximale
    private String nom;
    @Temporal(TemporalType.DATE)
    // Utilisée pour spécifier le type de données d'un champ de date ou d'heure dans une entité
    private Date dateNaissance;
    private boolean malade;
    @Min(10) // Utilisée pour vérifier qu'une valeur numérique est supérieure ou égale à une valeur minimale spécifiée
    private int score;
}
