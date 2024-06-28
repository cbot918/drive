package org.sheep.drive.drive.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Setter
public class DriveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="filename", unique=true, nullable = false)
    private String fileName;


}
