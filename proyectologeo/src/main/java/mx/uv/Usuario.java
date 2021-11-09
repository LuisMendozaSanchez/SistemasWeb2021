package mx.uv;

public class Usuario {
    private String email;
    public Usuario(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    private String password;
    private String id;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
