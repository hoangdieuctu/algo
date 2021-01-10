package com.hoangdieuctu.line;

import org.junit.Assert;
import org.junit.Test;

public class Ex1Test {

    @Test
    public void test1() {
        String result = Ex1.revert("RemoteIo is awesome");
        Assert.assertEquals("oIetomeR si emosewa", result);
    }

}
