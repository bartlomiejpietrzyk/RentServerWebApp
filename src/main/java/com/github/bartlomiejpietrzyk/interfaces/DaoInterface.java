package com.github.bartlomiejpietrzyk.interfaces;

import org.springframework.ui.Model;

import java.util.List;

public interface DaoInterface {
    List<Model> loadAll();

    Model loadById(int id);

    void save(Model object);

    void delete(Model object);
}
