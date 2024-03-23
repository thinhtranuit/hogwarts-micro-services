package com.thinhtranuit.hogwarts.wizard.repositories;

import com.thinhtranuit.hogwarts.wizard.entities.WizardJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WizardRepository extends PagingAndSortingRepository<WizardJPA, Integer> {

//    @Query("""
//            Select * from wizard where id in :ids
//            """)
//    List<WizardJPA> findByIds(@Param("ids") List<Integer> id);

    List<WizardJPA> findByIdIn(List<Integer> id);
}
