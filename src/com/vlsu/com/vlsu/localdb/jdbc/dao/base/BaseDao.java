package com.vlsu.com.vlsu.localdb.jdbc.dao.base;

import com.vlsu.com.vlsu.localdb.jdbc.entity.base.EntityWithId;

import java.util.List;

public interface BaseDao<Entity extends EntityWithId> {

    Entity getById(int id);

    List<Entity> getAll();

    boolean update(Entity entity);

    boolean delete(Entity entity);

    boolean insert(Entity entity);
}
