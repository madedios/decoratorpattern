package decoratorPattern;

public class UpSave implements BankAccountDecorator {
    private BankAccount account;

    // Constructor, getters, setters, and other methods
    public UpSave(BankAccount account) {
        this.account = account;
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", With Insurance";
    }

    @Override
    public void setBankAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() * (1 + getInterestRate());
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }
}
