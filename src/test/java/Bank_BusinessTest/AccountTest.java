package Bank_BusinessTest;

import Bank_Business.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;

    @BeforeEach
    private void setup() {
        Account account = new Account(10000);
    }

    // 계좌 생성 테스트케이스
    @Test
    public void testAccount() throws Exception {
        setup();
    }

    // 잔고 조회 테스트 케이스
    @Test
    public void testGetBalance() throws Exception {
        setup();
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }



    // 입금하기
    @Test
    public void testDeposit() throws Exception {
        setup();
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    // 출금하기
    @Test
    public void testWithdraw() throws Exception {
        setup();
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }
}
