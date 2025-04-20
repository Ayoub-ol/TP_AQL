package TP00;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private BankAccount recipient;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0, 0.05); // solde de 100€, taux 5%
        recipient = new BankAccount(50.0, 0.03); // autre compte
    }

    @Test
    void testDepositPositiveAmount() {
        account.deposit(50);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    void testDepositNegativeAmount_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-20));
    }

    @Test
    void testWithdrawValidAmount() {
        account.withdraw(40);
        assertEquals(60.0, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawAmountExceedingBalance_ShouldThrowException() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(200));
    }

    @Test
    void testWithdrawNegativeAmount_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10));
    }

    @Test
    void testTransferValidAmount() {
        account.transfer(30, recipient);
        assertEquals(70.0, account.getBalance(), 0.001);
        assertEquals(80.0, recipient.getBalance(), 0.001);
    }

    @Test
    void testTransferNullAccount_ShouldThrowException() {
        assertThrows(NullPointerException.class, () -> account.transfer(20, null));
    }

    @Test
    void testAddInterest() {
        account.addInterest(); // 100 * 1.05 = 105
        assertEquals(105.0, account.getBalance(), 0.001);
    }

    @Test
    void testGetBalance() {
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}
