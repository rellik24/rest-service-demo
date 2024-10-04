package com.rellik24.rest_service.dao;

import com.rellik24.rest_service.model.entity.PersonEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends JpaRepository<PersonEntity, Long> {
    // PersonDAO 繼承 JpaRepository， Spring boot 預設有很多的 ORM 功能
    // 如： findById, fFindAll 等映射語法
    // 如果沒有要客製化，這邊不必另外開發

    // 客製化範例 1: 使用 Entity 定義的資料
    @Transactional
    @Modifying
    @Query("DELETE FROM PersonEntity p WHERE p.id = ?1")
    public int deletePerson(Long id);


    // 客製化範例 2: 直接針對 DB Table 表格處理
    // Query 要加上 nativeQuery = true
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM person p WHERE p.id = ?1", nativeQuery = true)
    public int deleteFromDBPerson(Long id);
}
