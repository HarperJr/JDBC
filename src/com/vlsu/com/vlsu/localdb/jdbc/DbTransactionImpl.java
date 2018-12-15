package com.vlsu.com.vlsu.localdb.jdbc;

import com.vlsu.com.vlsu.localdb.jdbc.base.BaseDatabase;

import java.util.concurrent.Callable;

public class DbTransactionImpl implements DbTransaction {

    private final BaseDatabase database;

    public DbTransactionImpl(BaseDatabase database) {
        this.database = database;
    }

    @Override
    public void beginTransaction() {
        database.beginTransaction();
    }

    @Override
    public void endTransaction() {
        database.endTransaction();
    }

    @Override
    public void executeInTx(Runnable runnable) {
        database.executeInTransaction(runnable);
    }

    @Override
    public <T> T executeInTx(Callable<T> callable) {
        return database.executeInTransaction(callable);
    }
}
