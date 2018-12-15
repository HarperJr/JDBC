package com.vlsu.com.vlsu.localdb.repository.base;

import com.vlsu.com.vlsu.localdb.jdbc.dao.base.BaseDao;
import com.vlsu.com.vlsu.localdb.jdbc.entity.base.EntityWithId;
import com.vlsu.com.vlsu.localdb.model.base.ModelWithId;
import com.vlsu.com.vlsu.localdb.jdbc.mapper.base.BaseMapper;

import java.util.List;

public interface BaseRepository<Model extends ModelWithId, Entity extends EntityWithId> {
    BaseMapper<Model, Entity> getMapper();
    BaseDao<Entity> getDao();

    Model getById(int id);

    List<Model> getAll();

    boolean update(Model model);

    boolean delete(Model model);

    boolean insert(Model model);
}
