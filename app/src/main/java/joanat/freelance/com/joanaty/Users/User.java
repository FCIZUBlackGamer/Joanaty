package joanat.freelance.com.joanaty.Users;

public class User {
    int Id, type;
    String name, password, image, lastLoginTime;

    public User(int id, int type, String name, String password, String image, String lastLoginTime) {
        Id = id;
        this.type = type;
        this.name = name;
        this.password = password;
        this.image = image;
        this.lastLoginTime = lastLoginTime;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public int getType() {
        return type;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public String getPassword() {
        return password;
    }
}
