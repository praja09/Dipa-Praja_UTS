class Customer extends User {
    private boolean verificationStatus;

    public Customer(int userId, String password, String name, int age, String email, String doc) {
        super(userId, password, name, age, email, doc);
        this.verificationStatus = false;
    }

    public void applyVerification(String doc) {
        this.doc = doc;
        this.verificationStatus = true; // Simulating successful verification
        System.out.println("Verification applied with document: " + doc);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }
}