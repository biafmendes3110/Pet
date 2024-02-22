package com.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pet.entity.Pet;

public interface PetRepository  extends JpaRepository <Pet, Long>{

}
