package joanat.freelance.com.joanaty.Department;

import java.io.Serializable;

public class Category implements Serializable {
    int Id;
    String Name;

    public Category(int id, String name) {
        Id = id;
        Name = name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }


}
