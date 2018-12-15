package com.vlsu.com.vlsu.localdb.jdbc.mapper;

import com.vlsu.com.vlsu.localdb.jdbc.entity.ToolEntity;
import com.vlsu.com.vlsu.localdb.jdbc.mapper.base.BaseMapper;
import com.vlsu.com.vlsu.localdb.model.Tool;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = EnchantTypeMapper.class)
public interface ToolMapper extends BaseMapper<Tool, ToolEntity> {

    @Override
    @Mapping(target = "enchant", source = "enchantId")
    Tool entityToModel(ToolEntity entity);

    @Override
    @Mapping(target = "enchantId", source = "enchant")
    ToolEntity modelToEntity(Tool model);
}
