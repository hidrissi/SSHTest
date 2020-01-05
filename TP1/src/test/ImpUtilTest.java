package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("I'm a Test Class")
public class ImpUtilTest {
	
	ImpUtil iu = new ImpUtil();

	int a =0;
	
	@BeforeAll
	public void classTest() {
		assertEquals("ImpUtil", iu.getClass(), "not equal");
	}
	

	@BeforeEach
	public void TimeOutTest() {
		failsIfExecutionTimeExceeds100Milliseconds();
	}
	
	@Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds() {
		System.out.println(" timeout");
    }
		
	

	@Test
	@DisplayName("here a product")
	public void testProd() {
		assertEquals(24.0, iu.prod(4, 6) , 0.001 );	
		}

	
	@Disabled("Disabled until exceptions are managed")
	@Test
	public void testDiv() {
		iu.div(6,2);
		//fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
        assertEquals(60, iu.addition(15, 45),0.001);					

	}

	@Test
	public void testSoustr() {
		  iu.soustr(19,78);	}

	@Test
	public void testPGCD() {
            assertEquals(15, iu.PGCD(15, 45));
	
	}

	@Test
	public void testFact() {
        assertEquals(120, iu.Fact(5));		
	}
	

	@Test
	public void testBin() {
		assertEquals("1111", iu.bin(15));
	}
	
	@Test
	 @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	public void test_exception() {

        Exception exception = assertThrows(ArithmeticException.class, () -> iu.div(1, 0));

        assertEquals("/ by zero", exception.getMessage());

        assertTrue(exception.getMessage().contains("zero"));

    }
	
	@Order(1)
	@Test
	public void testEstPair(){
		assertTrue(iu.estPair(16));
	       System.out.println(true);	
		}
	
	//@DisplayName("A parametrized Test for Pairs")
	@ParameterizedTest
    @ValueSource(ints = {15, 236, 37})
    public void isPairArray(int arg) {
        assertTrue(iu.estPair(arg), "not Pair");
    }	

}
