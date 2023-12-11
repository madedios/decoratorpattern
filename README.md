# Decorator Pattern

CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".


Develop a decorator pattern approach that will implement the given UML diagram



The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :

Description of the following methods

showAccountType() - Either returns "Savings Account", "GSave" or "UpSave"

getInterestRate() - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave

getBalance() - Returns the balance of the account set.

showBenefits()
    Either returns "Standard Savings Account" for Savings Account;
	  benefits offered by savings account + "GSave Transfer";
    benefits offered by savings account + "With Insurance";
    
computeBalanceWithInterest() - returns new balance by computing the balance plus the interest depending on the interest rate.

showInfo() - Returns details of account number, account name, and balance.

# UML
![image](https://github.com/NorielAchero/decoratorPattern/assets/142378544/7a7817e3-075c-49bb-949f-bcab20b972b7)
