import java.util.Scanner;

class UserProfile {
    protected int userId;
    protected String password;
    protected String name;
    protected int age;
    protected String email;
    protected String doc; // Assuming doc is a path to the document file

    public UserProfile(int userId, String password, String name, int age, String email, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
        this.doc = doc;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void editProfile(String name, int age, String email, String doc) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.doc = doc;
    }

    public void showDocuments() {
        System.out.println("Document: " + doc);
    }
}