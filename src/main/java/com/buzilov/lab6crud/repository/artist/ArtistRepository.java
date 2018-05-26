package com.buzilov.lab6crud.repository.artist;

import com.buzilov.lab6crud.model.Artist;
import com.buzilov.lab6crud.model.Genre;
import com.buzilov.lab6crud.model.Impresario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    List<Artist> findAllByGenreSetContaining(@Param("genre") Genre genre);
    List<Artist> findArtistByImpresariosContaining(@Param("impresario") Impresario impresario);
}
