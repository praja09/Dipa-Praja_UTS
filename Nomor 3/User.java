class User extends UserProfile {
    public User(int userId, String password, String name, int age, String email, String doc) {
        super(userId, password, name, age, email, doc);
    }

    public boolean logIn(int userId, String password) {
        return this.userId == userId && this.password.equals(password);
    }

    public void logOut() {
        System.out.println(name + " has logged out.");
    }

    public void recoverPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password has been reset.");
    }
}
