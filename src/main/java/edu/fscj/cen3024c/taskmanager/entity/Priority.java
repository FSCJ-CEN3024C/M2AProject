package edu.fscj.cen3024c.taskmanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "priority")
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String level;

    @Column(nullable = false)
    private String description;

    @OneToOne(mappedBy = "priority")
    private Task task;

    // Getters and Setters
}
