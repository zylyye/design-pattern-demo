package org.erlong.pattern.adapter;

public class Consumer {

    public static void main(String[] args) {
        ThirdDatabase tdb = new ThirdDatabase();
        // 利用适配器做转换
        ThirdDatabaseAdapter dbAdapter = new ThirdDatabaseAdapter(tdb);
        saveToDatabase(dbAdapter);
    }

    // 向数据库中写入数据
    private static void saveToDatabase(Database db) {
        db.insert();
    }
}
