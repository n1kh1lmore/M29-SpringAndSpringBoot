package org.tnsif.placemanagement.repostier;

import org.springframework.data.jpa.repository.JpaRepository;

import org.tnsif.placemanagement.entities.student;

public interface studentrepository extends  JpaRepository<student,Integer> {

}
