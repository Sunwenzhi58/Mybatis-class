package class4;

import java.io.Serializable;

public class CUser implements Serializable{
    private int id;
    private String name;
    private int age;

    public CUser(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
