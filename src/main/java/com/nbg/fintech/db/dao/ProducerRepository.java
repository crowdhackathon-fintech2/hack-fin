package com.nbg.fintech.db.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nbg.fintech.db.entities.Producer;

public interface ProducerRepository extends JpaRepository<Producer,Long>{
    Producer findProducerByUsername(String username);
}