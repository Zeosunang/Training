package de.zeosunang.model;

import de.zeosunang.model.repository.BaseRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Zeosunang on 10.03.2017.
 */
public interface EquipmentRepository extends BaseRepository<Equipment, Long> {

    @Query(value = "SELECT t FROM Equipment t WHERE t.normalizedName = :normalizedName")
    Optional<Equipment> findByNormalizedName(@Param("normalizedName") String normalizedName);




}
