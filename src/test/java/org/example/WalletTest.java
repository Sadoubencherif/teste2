package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void text_wallet_created(){
        Wallet wallet = Wallet();
        double actual = wallet.getSolde();
        assertEquals( (50000.0,actual));
    }
}
