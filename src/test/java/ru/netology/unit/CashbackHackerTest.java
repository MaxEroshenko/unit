package ru.netology.unit;

import static org.junit.Assert.*;

public class CashbackHackerTest {

    @org.junit.Test
    public void shouldReturn1000WhenAmountIsZer() {
        CashbackHacker service = new CashbackHacker();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemain() {
        CashbackHacker service = new CashbackHacker();
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsLessBoundary() {
        CashbackHacker service = new CashbackHacker();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsBoundary() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsMoreBoundary() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    }