package com.dailycodework.universalpetcare.model;

import com.dailycodework.universalpetcare.enums.AppointmentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"patient","veterinarian"})
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reason;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointmentDate;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime appointmentTime;
    private String appointmentNo;
    @CreationTimestamp
    private LocalDate createdAt;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @JoinColumn(name = "sender")
    @ManyToOne(fetch = FetchType.LAZY)
    private User patient;

    @JoinColumn(name = "recipient")
    @ManyToOne(fetch = FetchType.LAZY)
    private User veterinarian;

    @OneToMany(mappedBy = "appointment",cascade = CascadeType.ALL)
    List<Pet> pets = new ArrayList<>();








    public void addPatient(User sender) {
        this.setPatient(sender);
        if (sender.getAppointments() == null) {
            sender.setAppointments(new ArrayList<>());
        }
        sender.getAppointments().add(this);
    }

    public void addVeterinarian(User recipient) {
        this.setVeterinarian(recipient);
        if (recipient.getAppointments() == null) {
            recipient.setAppointments(new ArrayList<>());
        }
        recipient.getAppointments().add(this);
    }

    public void setAppointmentNo() {
        this.appointmentNo = String.valueOf(new Random().nextLong()).substring(1,11);
    }

}
