public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer() {
        this("", "", null);
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = null;
    }
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    public CheckingAccount getAcct() {
        return acct;
    }
    public String toString() {
        if (acct != null) {
            return "The " + firstName + " account has " + this.acct.getBalance() + " baht and " + this.acct.getCredit() + " credits.";
        } else {
            return firstName + " " + lastName + " doesn’t have account.";
        }
    }
    public boolean equals(Customer c) {
        if ((c.getFirstName().equals(this.getFirstName())) && (c.getLastName().equals(this.getLastName()))) {
            return true;
        } else {
            return false;
        }
    }
}
