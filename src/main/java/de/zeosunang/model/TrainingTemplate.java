package de.zeosunang.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Zeosunang on 11.03.2017.
 */
@Entity
public class TrainingTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long trainingTemplateId;


    // private List<Exercise> exerciseList;

    private String name;

    private String normalizedName;

    @Column(length = 2048)
    private String description;




}
