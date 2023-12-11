package decoratorPattern;

public class GSave implements BankAccountDecorator {
    private BankAccount account;

    // Constructor, getters, setters, and other methods
    public GSave(BankAccount account) {
        this.account = account;
    }
    
    @Override
    public String showBenefits() {
        return account.showBenefits() + ", GSave Transfer";
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
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
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

