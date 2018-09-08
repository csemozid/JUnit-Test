package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;
class OperatorTestUnitTest {
    OperatorTestClass oT = new OperatorTestClass();
    		
	@Test
	public void OperatorTestUnitTest() {
    	
    	assertEquals(5,oT.addition(2,3),"");
        assertEquals(2,oT.subtraction(5,3),"");
        assertEquals(3,oT.division(6,2),"");
    	assertEquals(6,oT.multiplication(2,3),"");
    	assertEquals(1,oT.modulus(7,3),"");
    	
    /*
    	assertEquals(-3,oT.bitNot(2),"");
    	assertEquals(34,oT.operatorTest.bitAnd(12, 14),"");
    	assertEquals(23,oT.bitOr(12, 14),"");OperatorTestClass 
    	assertEquals(56,oT.bitExOr(12, 14),"");
    	assertEquals(6,oT.bitShiftRight(12),"");
    	assertEquals(6,oT.bitShiftRightZero(12, 14),"");
    	assertEquals(6,oT.bitShiftLeft(12, 14),"");
    	assertEquals(6,oT.bitShiftLeftZero(12, 14),"");
    	
    	assertEquals(true,oT.equalTo(12, 12),"");
    	assertEquals(true,oT.notEqualTo(12, 12),"");
    	assertEquals(true,oT.greaterThan(12, 12),"");
    	assertEquals(true,oT.greaterThanOrEqual(12, 12),"");
    	assertEquals(true,oT.lessThan(12, 12),"");
    	assertEquals(true,oT.lessThanOrEqual(12, 12),"");
    	OperatorTestClass 
    	assertEquals(false,oT.logicalNot(true),"");
    	assertEquals(false,oT.logicalAnd(true, true),"");
    	assertEquals(false,oT.logicalOr(true, false),"");
    	assertEquals(false,oT.logicalExOr(true),"");
    	assertEquals(false,oT.logicalshortCircuitAnd(true, false),"");
    	assertEquals(false,oT.logicalshortCircuitOr(true, false),"");
    	
		//fail("Not yet implemented");
    	*/
	}
}