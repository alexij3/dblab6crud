package com.buzilov.lab6crud.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Impresario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ElementCollection(targetClass = Genre.class)
    @CollectionTable(name = "impresario_and_genre", joinColumns = @JoinColumn (name = "id_impresario", nullable = false))
    @Enumerated(EnumType.STRING)
    @Column(name = "genre", nullable = false)
    private Set<Genre> genreSet;

    public Impresario() {
    }

    public Impresario(String name) {
        this.name = name;
    }


    public Impresario(String name, Set<Genre> genreSet) {
        this.name = name;
        this.genreSet = genreSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Genre> getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(Set<Genre> genreSet) {
        this.genreSet = genreSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Impresario that = (Impresario) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Impresario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
