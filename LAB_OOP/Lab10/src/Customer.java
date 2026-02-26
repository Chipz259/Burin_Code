import java.util.ArrayList;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;
    public Account getAccount(int index) {
        return acct.get(index);
    }
    public void addAccount(Account acct) {
        this.acct.add(acct);
        numOfAccount += 1;
    }
    public int getNumOfAccount() {
        return acct.size();
    }
    public Customer() {
        this("", "");
        acct = new ArrayList<>();
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList<>();
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
    public String toString() {
        if (acct != null) {
            return firstName + " " + lastName + " has " + numOfAccount + " accounts.";
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
