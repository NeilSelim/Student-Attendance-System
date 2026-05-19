public abstract class User {

    private String userId;
    private String name;
    private String email;


    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name   = name;
        this.email  = email;
    }

    public String getUserId() { return userId; }
    public void   setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void   setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void   setEmail(String email) { this.email = email; }

    public abstract boolean login(String password);

    public void logout() {
        System.out.println(name + " has logged out.");
    }

    @Override
    public String toString() {
        return "User[id=" + userId + ", name=" + name + ", email=" + email + "]";
    }
}
