package com.soaz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.util.*

class WalletTest {
    private val noMoney: Money = Money(BigDecimal.ZERO, Currency.getInstance("USD"))

    @Test
    fun `Given no money in wallet should return empty`() {
        val wallet = Wallet(noMoney)

        val actual: Boolean = wallet.isEmpty()

        assertEquals(true, actual)
    }

    @Test
    fun `Given money in wallet should return empty`() {
        val wallet = Wallet(noMoney)

        val actual: Boolean = wallet.isEmpty()

        assertEquals(false, actual)
    }
}
