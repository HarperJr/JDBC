package com.vlsu.com.vlsu.localdb;

import com.vlsu.com.vlsu.localdb.jdbc.Database;
import com.vlsu.com.vlsu.localdb.jdbc.DbTransaction;
import com.vlsu.com.vlsu.localdb.jdbc.mapper.EnchantMapper;
import com.vlsu.com.vlsu.localdb.jdbc.mapper.ToolMapper;
import com.vlsu.com.vlsu.localdb.jdbc.repository.EnchantRepositoryImpl;
import com.vlsu.com.vlsu.localdb.jdbc.repository.ToolRepositoryImpl;
import com.vlsu.com.vlsu.localdb.repository.EnchantRepository;
import com.vlsu.com.vlsu.localdb.repository.ToolRepository;
import org.mapstruct.factory.Mappers;

public class DatabaseProvider implements Provider<Database> {

    private static DatabaseProvider INSTANCE;

    private Database database;
    private EnchantRepository enchantRepository;
    private ToolRepository toolRepository;

    public static DatabaseProvider provider() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseProvider();
        }
        return INSTANCE;
    }

    @Override
    public Database provide() {
        if (database == null) {
            database = new Database(DatabaseProperties.LOCAL_DB_PROPERTIES);
        }
        return database;
    }

    public EnchantRepository provideEnchantRepository() {
        if (enchantRepository == null) {
            final EnchantMapper mapper = Mappers.getMapper(EnchantMapper.class);
            enchantRepository = new EnchantRepositoryImpl(provide(), mapper);
        }
        return enchantRepository;
    }

    public ToolRepository provideToolRepository() {
        if (toolRepository == null) {
            final ToolMapper mapper = Mappers.getMapper(ToolMapper.class);
            toolRepository = new ToolRepositoryImpl(provide(), mapper);
        }
        return toolRepository;
    }

    public DbTransaction provideDbTransaction() {
        return provide().getDbTransaction();
    }
}
