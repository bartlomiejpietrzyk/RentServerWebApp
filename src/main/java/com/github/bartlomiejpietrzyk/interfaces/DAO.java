package com.github.bartlomiejpietrzyk.interfaces;

import org.springframework.stereotype.Component;


public interface DAO {
     <T> T create(T t);
     <T> void delete(T t);
     <T, S> T read(S s);
     <T> void edit(T t);
     <T> T loadAll();
     <T, S> T readById(S s);


}
