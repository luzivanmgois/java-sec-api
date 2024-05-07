package com.advocacia.api.domain.archive;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "archive")
public class Archive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArchive")
    private Long id;
    private String name;
    private String linkArchive;
}
