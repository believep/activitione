package believep.pojo;

public class User {
    private int uid;
    private String username;
    private String password;
    private String job;
    private String password_salt;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public User(int uid, String username, String password, String job, String password_salt) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.job = job;
        this.password_salt = password_salt;
    }

    public User() {
    }

    public User(String username, String password, String job) {
        this.username = username;
        this.password = password;
        this.job = job;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                ", password_salt='" + password_salt + '\'' +
                '}';
    }
}
