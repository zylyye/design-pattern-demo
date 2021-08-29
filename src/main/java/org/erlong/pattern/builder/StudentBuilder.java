package org.erlong.pattern.builder;

public class StudentBuilder {

    private Student student;

    public StudentBuilder() {
        this.student = new Student();
    }

    public StudentBuilder name(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder age(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("age must great than zero");
        }
        student.setAge(age);
        return this;
    }

    public StudentBuilder gender(boolean isMale) {
        student.setGender(isMale ? 0 : 1);
        return this;
    }

    public Student build() {
        return student;
    }

}
