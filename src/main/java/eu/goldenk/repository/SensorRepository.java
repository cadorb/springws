package eu.goldenk.repository;

import eu.goldenk.entities.Sensor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by goldenk on 21/02/17.
 */

@RepositoryRestResource(collectionResourceRel = "sensor", path = "sensor")
public interface SensorRepository extends PagingAndSortingRepository<Sensor, Long> {
    Sensor findByName(@Param("name") String name);
}

