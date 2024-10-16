class Admin extends User {
    public Admin(int userId, String password, String name, int age, String email, String doc) {
        super(userId, password, name, age, email, doc);
    }

    public void verifyUser(Customer customer) {
        customer.applyVerification(customer.doc); // Simulating verification by applying document
        System.out.println("Admin verifies Customer: " + customer.getName());
    }
}