package com.kaloyan.tailorshop.model.entity;


import com.kaloyan.tailorshop.model.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String date;

    @Column
    private String startTime;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Service service;

    @Enumerated(EnumType.STRING)
    @Column
    private AppointmentStatus status;
}
