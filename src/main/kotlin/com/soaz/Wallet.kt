package com.soaz

import java.math.BigDecimal

class Wallet(private val money: Money) {

    fun isEmpty(): Boolean {
        return money.amount.equals(BigDecimal.ZERO)
    }
}