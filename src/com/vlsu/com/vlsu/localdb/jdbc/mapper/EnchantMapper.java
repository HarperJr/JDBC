package com.vlsu.com.vlsu.localdb.jdbc.mapper;

import com.vlsu.com.vlsu.localdb.jdbc.entity.EnchantEntity;
import com.vlsu.com.vlsu.localdb.model.Enchant;
import com.vlsu.com.vlsu.localdb.jdbc.mapper.base.BaseMapper;
import org.mapstruct.Mapper;

@Mapper
public interface EnchantMapper extends BaseMapper<Enchant, EnchantEntity> {
}
