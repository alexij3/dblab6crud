package com.buzilov.lab6crud.dao.cinema;

import com.buzilov.lab6crud.model.Cinema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public interface CinemaDAO extends CrudRepository<Cinema, Integer> {

}