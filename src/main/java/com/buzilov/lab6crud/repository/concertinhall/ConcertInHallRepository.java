package com.buzilov.lab6crud.repository.concertinhall;

import com.buzilov.lab6crud.model.ConcertInHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertInHallRepository extends JpaRepository<ConcertInHall, Integer> {

}

