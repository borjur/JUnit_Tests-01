package com.boris.test02;

import com.boris.test01.Bank;
import com.boris.test01.Money;

public class BankTransferAction {
    private String sourceAccountId;
    private String targetAccountId;
    private Money amount;
    
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public void execute() {
        execute(Bank.getInstance());
    }
    
    public void execute(Bank bank) {
        bank.transfer(sourceAccountId, targetAccountId, amount);
    }
}