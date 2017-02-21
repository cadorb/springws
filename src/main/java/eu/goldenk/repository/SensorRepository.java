package eu.goldenk.repository;

import eu.goldenk.entities.Sensor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by goldenk on 21/02/17.
 */

public class SensorRepository {

    @RepositoryRestResource(collectionResourceRel = "sensors", path = "sensors")
    public interface PersonRepository extends PagingAndSortingRepository<Sensor, Long> {

        List<Sensor> findByLastName(@Param("name") String name);

    }
}
