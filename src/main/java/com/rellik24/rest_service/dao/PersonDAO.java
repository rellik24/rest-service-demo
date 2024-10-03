package com.rellik24.rest_service.dao;

import com.rellik24.rest_service.model.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends JpaRepository<PersonEntity, Long> {
}
