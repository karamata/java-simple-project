package com.edinnova.core;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void testSayHello_expectedMessgeHelloWorld() {
        final Application application = new Application();
        final String message = application.sayHello();

        Assert.assertEquals("Hello World", message);
    }
}