package org.tnsif.placemanagement.repostier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placemanagement.entities.college;
import org.tnsif.placemanagement.entities.user;

public interface userrepository  extends JpaRepository<user,Integer> {

}
