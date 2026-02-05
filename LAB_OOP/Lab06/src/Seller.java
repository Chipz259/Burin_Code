public class Seller extends Employee{
    public Food sell(Employee e) {
        Food f = new Food();
        double price = f.getPrice();
        double buyerMoney = e.getWallet().getBalance();
        if (buyerMoney >= price) {
            double myMoney = this.getWallet().getBalance();
            this.getWallet().setBalance(myMoney + price);
            e.getWallet().setBalance(buyerMoney - price);
            return f;
        } else {
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
