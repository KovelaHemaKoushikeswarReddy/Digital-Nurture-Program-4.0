package com.spring_maven.LibraryManagement;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StarterAppTest extends TestCase {

    public StarterAppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(StarterAppTest.class);
    }

    public void testAppExecution() {
        assertTrue(true);
    }
}