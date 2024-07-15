import java.io.Serializable;

public class Bean_User implements Serializable {
    private String name;
    private int age;

    // Must have No Args Constructor
    public Bean_User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
