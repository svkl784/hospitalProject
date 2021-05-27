package org.example.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private int id_patient;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "health_complaints")
    private String healthsComplaints;

    @OneToOne(mappedBy = "id_patient",
            cascade = {CascadeType.REFRESH, CascadeType.PERSIST,
                    CascadeType.MERGE, CascadeType.DETACH})
    private Therapy therapy;

    @ManyToMany (cascade = {CascadeType.REFRESH,CascadeType.PERSIST,
            CascadeType.MERGE,CascadeType.DETACH})
    @JoinTable (name = "therapy",
    joinColumns =@JoinColumn(name = ""))
    private List <Employee> employees;

    public Patient() {
    }

    public Patient(String firstName, String secondName,
                   String dateOfBirth, String healthsComplaints) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.healthsComplaints = healthsComplaints;
    }
    private void addEmployeeToPatient (Employee employee) {
        if (employees == null){
            employees = new ArrayList<>();
        }
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id_patient +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", healthsComplaints='" + healthsComplaints + '\'' +
                '}';
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHealthsComplaints() {
        return healthsComplaints;
    }

    public void setHealthsComplaints(String healthsComplaints) {
        this.healthsComplaints = healthsComplaints;
    }
}