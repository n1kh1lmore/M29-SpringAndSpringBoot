package org.tnsif.placemanagement.repostier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placemanagement.entities.college;
/*
 * jpa repository is an interface which contains all jpa crud opeartion which is required for springboot
 */
public interface collegeRepository extends JpaRepository<college,Integer> {
	

}
