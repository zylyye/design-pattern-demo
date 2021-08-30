package org.erlong.pattern.adapter;

public class ThirdDatabaseAdapter extends Database{

    private ThirdDatabase db;

    public ThirdDatabaseAdapter(ThirdDatabase db) {
        this.db = db;
    }

    @Override
    public void select() {
        db.query();
    }

    @Override
    public void insert() {
        db.add();
    }
}
