package org.example.model.entity;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="therapy")
public class Therapy implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_therapy")
    private int id_therapy;
    @Column (name = "id_category_therapy")
    private int id_category_therapy;
    @Column (name = "name_therapy")
    private String name_therapy;

    @OneToOne (cascade = {CascadeType.REFRESH,CascadeType.PERSIST,
            CascadeType.MERGE,CascadeType.DETACH})
    @JoinColumn (name = "id_patient")
    private Patient id_patient;

    @Column (name = "id_employee")
    private int id_employee;



    public Therapy() {
    }

    public Therapy(int id_category_therapy, String name_therapy) {
        this.id_category_therapy = id_category_therapy;
        this.name_therapy = name_therapy;
    }


    @Override
    public String toString() {
        return "Therapy{" +
                "id_therapy=" + id_therapy +
                ", id_category_therapy=" + id_category_therapy +
                ", name_therapy='" + name_therapy + '\'' +
                ", id_patient=" + id_patient +
                '}';
    }


    public Patient getId_patient() {
        return id_patient;
    }

    public void setId_patient(Patient id_patient) {
        this.id_patient = id_patient;
    }

    public int getId_therapy() {
        return id_therapy;
    }

    public void setId_therapy(int id_therapy) {
        this.id_therapy = id_therapy;
    }

    public int getId_category_therapy() {
        return id_category_therapy;
    }

    public void setId_category_therapy(int id_category_therapy) {
        this.id_category_therapy = id_category_therapy;
    }

    public String getName_therapy() {
        return name_therapy;
    }

    public void setName_therapy(String name_therapy) {
        this.name_therapy = name_therapy;
    }
}
