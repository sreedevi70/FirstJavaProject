package methodOverriding;

public class TestMethodOverriding {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getInterest();

        Bank bank1 = new CitiBank();
        bank1.getInterest();

        Bank bank2 = new HdfcBank();
        bank2.getInterest();
    }
}
