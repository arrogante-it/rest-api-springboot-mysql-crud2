package com.arroganteIT.taskManager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_completed")
    private boolean is_completed;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "title")
    private String title;
}
