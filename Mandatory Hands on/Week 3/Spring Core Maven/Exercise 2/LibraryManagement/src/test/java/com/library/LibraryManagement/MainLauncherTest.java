package com.library.LibraryManagement;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainLauncherTest extends TestCase {

    public MainLauncherTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(MainLauncherTest.class);
    }

    public void testExecution() {
        assertTrue(true);
    }
}
