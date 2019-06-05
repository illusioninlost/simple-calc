package com.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * {@link CalcTest} test CalcTest class.
 * 
 * To execute do this:
 * > mvn test
 *
 * Or
 * > mvn -Dtest=CalcTest test
 * 
 * Or
 * > mvn -Dtest=CalcTest#test test
 * 
 * USE : -Dmaven.test.failure.ignore=true  // to ignore test fail and continue with build
 * 
 * mvn test -Dtest=CalcTest -Dmaven.test.failure.ignore=true
 * 
 * Note that is ClassName#methodName test!
 * 
 * @author victor.q
 * @see Test
 */
public class CalcTest {
	@BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
	@Tag("CALC-UNIT-TEST")
	@Test
	public void test() {
		System.out.println("Running calculator test");
		new Operations().sum(1, 1);
		Assertions.assertEquals(1, 1);
	}
	
	@AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
