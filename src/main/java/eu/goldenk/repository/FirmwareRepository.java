package eu.goldenk.repository;

import eu.goldenk.entities.Firmware;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by goldenk on 21/02/17.
 */

@RepositoryRestResource(collectionResourceRel = "firmwares", path = "firmwares")
public interface FirmwareRepository  extends PagingAndSortingRepository<Firmware, Long> {

    List<Firmware> findByName(@Param("name") String name);

}