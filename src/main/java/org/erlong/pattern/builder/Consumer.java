package org.erlong.pattern.builder;

public class Consumer {

    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        // 利用生成器生成学生 Alann
        Student alann = builder.name("Alann")
                .age(18)
                .gender(true)
                .build();
    }
}
