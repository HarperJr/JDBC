package com.vlsu.com.vlsu.localdb.repository;

import com.vlsu.com.vlsu.localdb.jdbc.entity.ToolEntity;
import com.vlsu.com.vlsu.localdb.model.Tool;
import com.vlsu.com.vlsu.localdb.repository.base.BaseRepository;

public interface ToolRepository extends BaseRepository<Tool, ToolEntity> {
    Tool getByEnchantId(int enchantId);
}
