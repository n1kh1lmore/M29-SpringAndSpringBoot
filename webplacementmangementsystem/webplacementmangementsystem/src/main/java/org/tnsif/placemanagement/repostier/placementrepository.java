package org.tnsif.placemanagement.repostier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placemanagement.entities.placement;


public interface placementrepository extends JpaRepository<placement,Integer> {

}
