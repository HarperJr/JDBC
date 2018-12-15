package com.vlsu.com.vlsu.localdb.jdbc.mapper.base;

import com.vlsu.com.vlsu.localdb.jdbc.entity.base.EntityWithId;
import com.vlsu.com.vlsu.localdb.model.base.ModelWithId;

import java.util.List;

public interface BaseMapper<Model extends ModelWithId, Entity extends EntityWithId> {

    Entity modelToEntity(Model model);

    Model entityToModel(Entity entity);

    List<Entity> modelListToEntityList(List<Model> models);

    List<Model> entityListToModelList(List<Entity> entities);
}
