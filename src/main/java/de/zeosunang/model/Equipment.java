package de.zeosunang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Zeosunang on 09.03.2017.
 */
@Entity
@Table(name = "Equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long equipmentId;

    
    private String name;

    private String normalizedname;

    private String description;

    private String image;


}
