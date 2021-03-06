package com.buzilov.lab6crud.service.theatreperformance;

import com.buzilov.lab6crud.model.TheatrePerformance;

import java.sql.SQLException;
import java.util.List;

public interface TheatrePerformanceService {
    TheatrePerformance insert(TheatrePerformance theatrePerformance)  throws SQLException;
    TheatrePerformance get(int id) throws SQLException;
    TheatrePerformance update(TheatrePerformance theatrePerformance) throws SQLException;
    void delete(int id) throws SQLException;
    List<TheatrePerformance> getAll() throws SQLException;
}
