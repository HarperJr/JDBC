package com.vlsu.com.vlsu.localdb.jdbc.repository;

import com.vlsu.com.vlsu.localdb.jdbc.Database;
import com.vlsu.com.vlsu.localdb.jdbc.dao.EnchantDao;
import com.vlsu.com.vlsu.localdb.jdbc.entity.EnchantEntity;
import com.vlsu.com.vlsu.localdb.model.Enchant;
import com.vlsu.com.vlsu.localdb.jdbc.mapper.base.BaseMapper;
import com.vlsu.com.vlsu.localdb.repository.EnchantRepository;
import java.sql.Time;
import java.util.List;

public class EnchantRepositoryImpl implements EnchantRepository {

    private final Database database;
    private final BaseMapper mapper;

    public EnchantRepositoryImpl(Database database, BaseMapper mapper) {
        this.database = database;
        this.mapper = mapper;
    }

    @Override
    public BaseMapper<Enchant, EnchantEntity> getMapper() {
        return mapper;
    }

    @Override
    public EnchantDao getDao() {
        return database.getEnchantDAO();
    }

    @Override
    public Enchant getById(int id) {
        return getMapper().entityToModel(getDao().getById(id));
    }

    @Override
    public List<Enchant> getAll() {
        return getMapper().entityListToModelList(getDao().getAll());
    }

    @Override
    public boolean update(Enchant enchant) {
        return getDao().update(getMapper().modelToEntity(enchant));
    }

    @Override
    public boolean delete(Enchant enchant) {
        return getDao().delete(getMapper().modelToEntity(enchant));
    }

    @Override
    public boolean insert(Enchant enchant) {
        return getDao().insert(getMapper().modelToEntity(enchant));
    }

    @Override
    public Enchant getMatchesName(String name) {
        return getMapper().entityToModel(getDao().getMatchesName(name));
    }

    @Override
    public List<Enchant> getByDurationLessThen(Time duration) {
        return getMapper().entityListToModelList(getDao().getByDurationLessThen(duration));
    }
}
