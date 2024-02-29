package lombokexperiments.dto;

public class UserWith {

    String name;
    String password;

    public UserWith() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public UserWith withName(String name) {
        this.name = name;
        return this;
    }

    public UserWith withPassword(String password) {
        this.password = password;
        return this;
    }
}
