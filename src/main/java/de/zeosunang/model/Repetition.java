package de.zeosunang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by Zeosunang on 10.03.2017.
 */
@Entity
public class Repetition {

@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long repetitionId;

    private int reps;

    //@OneToMany
    //private Unit unit;


}
