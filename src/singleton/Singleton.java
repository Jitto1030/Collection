package singleton;

public class Singleton {

    private String username = "Jitto1011";
    private String password = "Jitto#123";

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
