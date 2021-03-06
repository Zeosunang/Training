package de.zeosunang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Zeosunang on 11.03.2017.
 */
@Entity
public class Unit {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long unitId;

    private String name;

    private String normalizedName;


}
