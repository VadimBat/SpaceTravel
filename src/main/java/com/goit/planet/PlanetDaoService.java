package com.goit.planet;


import java.util.List;

public interface PlanetDaoService {
    Planet create(Planet planet);

    Planet getById(String id);

    Planet update(Planet planet);

    void deleteById(String id);

    List<Planet> getAll();
}
