package com.github.bartlomiejpietrzyk.component;

import com.github.bartlomiejpietrzyk.interfaces.DAO;

public class UserDao implements DAO {
    @Override
    public <T> T create(T t) {

    }

    @Override
    public <T> void delete(T t) {

    }

    @Override
    public <T, S> T read(S s) {
        return null;
    }

    @Override
    public <T> void edit(T t) {

    }

    @Override
    public <T> T loadAll() {
        return null;
    }

    @Override
    public <T> T viewAll() {
        return null;
    }

    @Override
    public <T, S> T readById(S s) {
        return null;
    }
}
