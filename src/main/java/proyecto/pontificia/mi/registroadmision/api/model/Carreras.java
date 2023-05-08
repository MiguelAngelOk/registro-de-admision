package proyecto.pontificia.mi.registroadmision.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCarrera")
    private Integer id;

    private String nombreCarrera;

    @ManyToOne
    @JoinColumn(name = "idTipoEducacion")
    private TipoEducacion idTipoEducacion;
}
