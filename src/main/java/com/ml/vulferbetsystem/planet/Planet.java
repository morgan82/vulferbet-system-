package com.ml.vulferbetsystem.planet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "PLANET")
public class Planet {

    @Id
    @SequenceGenerator(name = "planet_generator", sequenceName = "vulferbet.PLANET_SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "planet_generator")
    private Long id;

    private String name;

    private int sunDistance;

    private int angularVelocity;

    private int initialPosition;

    @OneToMany(mappedBy = "planet",cascade = CascadeType.ALL )
    private List<PlanetMovement> movements;

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSunDistance() {
        return sunDistance;
    }

    public void setSunDistance(int sunDistance) {
        this.sunDistance = sunDistance;
    }

    public int getAngularVelocity() {
        return angularVelocity;
    }

    public void setAngularVelocity(int angularVelocity) {
        this.angularVelocity = angularVelocity;
    }

    public int getInitialPosition() {
        return initialPosition;
    }

    public void setInitialPosition(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public List<PlanetMovement> getMovements() {
        return movements;
    }

    public void setMovements(List<PlanetMovement> movements) {
        this.movements = movements;
    }
}