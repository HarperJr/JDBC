package com.vlsu.com.vlsu.localdb.repository;

import com.vlsu.com.vlsu.localdb.jdbc.entity.EnchantEntity;
import com.vlsu.com.vlsu.localdb.model.Enchant;
import com.vlsu.com.vlsu.localdb.repository.base.BaseRepository;

import java.sql.Time;
import java.util.List;

public interface EnchantRepository extends BaseRepository<Enchant, EnchantEntity> {

    Enchant getMatchesName(String name);

    List<Enchant> getByDurationLessThen(Time duration);
}
