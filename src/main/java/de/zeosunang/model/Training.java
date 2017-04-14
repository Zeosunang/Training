package de.zeosunang.model;

import java.time.ZonedDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Zeosunang on 10.03.2017.
 */
@Entity
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long trainingId;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    //private List<Exercise> exerciseList;


}
