package org.bitcoinj.core;

import org.bitcoinj.testing.FooWalletExtension;
import org.bitcoinj.testing.TestWithWallet;
import org.junit.Before;
import org.junit.Test;

public class WalletExtensionsTest extends TestWithWallet {

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test(expected = java.lang.IllegalStateException.class)
    public void duplicateWalletExtensionTest() {
        wallet.addExtension(new FooWalletExtension("com.whatever.required", true));
        wallet.addExtension(new FooWalletExtension("com.whatever.required", true));
    }


}
