package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcAPIIOHelperTest {
    @Test
    public void testValidProcAPIIO() {
		ProcAPIIOHelper helper = new ProcAPIIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcAPIIO() {
	ProcAPIIOHelper helper = new ProcAPIIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProcAPIIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProcAPIIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcAPIIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcAPIIO0() {
	assertFalse(6422==6422+1);
}
@Test
public void bigFalseTestProcAPIIO1() {
	assertFalse(11669==11669+1);
}
@Test
public void bigFalseTestProcAPIIO2() {
	assertFalse(16296==16296+1);
}
@Test
public void bigFalseTestProcAPIIO3() {
	assertFalse(13114==13114+1);
}
@Test
public void bigFalseTestProcAPIIO4() {
	assertFalse(15205==15205+1);
}
@Test
public void bigFalseTestProcAPIIO5() {
	assertFalse(17479==17479+1);
}
@Test
public void bigFalseTestProcAPIIO6() {
	assertFalse(11972==11972+1);
}
@Test
public void bigFalseTestProcAPIIO7() {
	assertFalse(8849==8849+1);
}
@Test
public void bigFalseTestProcAPIIO8() {
	assertFalse(7024==7024+1);
}
@Test
public void bigFalseTestProcAPIIO9() {
	assertFalse(29139==29139+1);
}
@Test
public void bigFalseTestProcAPIIO10() {
	assertFalse(6446==6446+1);
}
@Test
public void bigFalseTestProcAPIIO11() {
	assertFalse(10265==10265+1);
}
@Test
public void bigFalseTestProcAPIIO12() {
	assertFalse(31040==31040+1);
}
@Test
public void bigFalseTestProcAPIIO13() {
	assertFalse(7158==7158+1);
}
@Test
public void bigFalseTestProcAPIIO14() {
	assertFalse(14728==14728+1);
}
@Test
public void bigFalseTestProcAPIIO15() {
	assertFalse(32596==32596+1);
}
@Test
public void bigFalseTestProcAPIIO16() {
	assertFalse(10583==10583+1);
}
@Test
public void bigFalseTestProcAPIIO17() {
	assertFalse(3453==3453+1);
}
@Test
public void bigFalseTestProcAPIIO18() {
	assertFalse(7853==7853+1);
}
@Test
public void bigFalseTestProcAPIIO19() {
	assertFalse(20663==20663+1);
}
@Test
public void bigFalseTestProcAPIIO20() {
	assertFalse(17753==17753+1);
}
@Test
public void bigFalseTestProcAPIIO21() {
	assertFalse(6015==6015+1);
}
@Test
public void bigFalseTestProcAPIIO22() {
	assertFalse(6709==6709+1);
}
@Test
public void bigFalseTestProcAPIIO23() {
	assertFalse(27467==27467+1);
}
@Test
public void bigFalseTestProcAPIIO24() {
	assertFalse(15223==15223+1);
}
@Test
public void bigFalseTestProcAPIIO25() {
	assertFalse(2653==2653+1);
}
@Test
public void bigFalseTestProcAPIIO26() {
	assertFalse(3015==3015+1);
}
@Test
public void bigFalseTestProcAPIIO27() {
	assertFalse(31752==31752+1);
}
@Test
public void bigFalseTestProcAPIIO28() {
	assertFalse(26783==26783+1);
}
@Test
public void bigFalseTestProcAPIIO29() {
	assertFalse(17019==17019+1);
}
@Test
public void bigFalseTestProcAPIIO30() {
	assertFalse(5409==5409+1);
}
@Test
public void bigFalseTestProcAPIIO31() {
	assertFalse(24300==24300+1);
}
@Test
public void bigFalseTestProcAPIIO32() {
	assertFalse(10597==10597+1);
}
@Test
public void bigFalseTestProcAPIIO33() {
	assertFalse(17595==17595+1);
}
@Test
public void bigFalseTestProcAPIIO34() {
	assertFalse(744==744+1);
}
@Test
public void bigFalseTestProcAPIIO35() {
	assertFalse(26079==26079+1);
}
@Test
public void bigFalseTestProcAPIIO36() {
	assertFalse(3503==3503+1);
}
@Test
public void bigFalseTestProcAPIIO37() {
	assertFalse(9918==9918+1);
}
@Test
public void bigFalseTestProcAPIIO38() {
	assertFalse(30257==30257+1);
}
@Test
public void bigFalseTestProcAPIIO39() {
	assertFalse(12614==12614+1);
}
@Test
public void bigFalseTestProcAPIIO40() {
	assertFalse(6947==6947+1);
}
@Test
public void bigFalseTestProcAPIIO41() {
	assertFalse(16089==16089+1);
}
@Test
public void bigFalseTestProcAPIIO42() {
	assertFalse(6859==6859+1);
}
@Test
public void bigFalseTestProcAPIIO43() {
	assertFalse(30313==30313+1);
}
@Test
public void bigFalseTestProcAPIIO44() {
	assertFalse(19026==19026+1);
}
@Test
public void bigFalseTestProcAPIIO45() {
	assertFalse(22489==22489+1);
}
@Test
public void bigFalseTestProcAPIIO46() {
	assertFalse(30291==30291+1);
}
@Test
public void bigFalseTestProcAPIIO47() {
	assertFalse(20357==20357+1);
}
@Test
public void bigFalseTestProcAPIIO48() {
	assertFalse(10913==10913+1);
}
@Test
public void bigFalseTestProcAPIIO49() {
	assertFalse(25719==25719+1);
}
@Test
public void bigFalseTestProcAPIIO50() {
	assertFalse(7157==7157+1);
}
@Test
public void bigFalseTestProcAPIIO51() {
	assertFalse(29104==29104+1);
}
@Test
public void bigFalseTestProcAPIIO52() {
	assertFalse(22779==22779+1);
}
@Test
public void bigFalseTestProcAPIIO53() {
	assertFalse(28314==28314+1);
}
@Test
public void bigFalseTestProcAPIIO54() {
	assertFalse(20738==20738+1);
}
@Test
public void bigFalseTestProcAPIIO55() {
	assertFalse(25713==25713+1);
}
}
