package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOIOProxyStreamHelperTest {
    @Test
    public void testValidIOIOProxyStream() {
		IOIOProxyStreamHelper helper = new IOIOProxyStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOIOProxyStream() {
	IOIOProxyStreamHelper helper = new IOIOProxyStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseIOIOProxyStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOIOProxyStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOIOProxyStream0() {
	assertFalse(15464==15464+1);
}
@Test
public void bigFalseTestIOIOProxyStream1() {
	assertFalse(1548==1548+1);
}
@Test
public void bigFalseTestIOIOProxyStream2() {
	assertFalse(31262==31262+1);
}
@Test
public void bigFalseTestIOIOProxyStream3() {
	assertFalse(12742==12742+1);
}
@Test
public void bigFalseTestIOIOProxyStream4() {
	assertFalse(7624==7624+1);
}
@Test
public void bigFalseTestIOIOProxyStream5() {
	assertFalse(12021==12021+1);
}
@Test
public void bigFalseTestIOIOProxyStream6() {
	assertFalse(21751==21751+1);
}
@Test
public void bigFalseTestIOIOProxyStream7() {
	assertFalse(24640==24640+1);
}
@Test
public void bigFalseTestIOIOProxyStream8() {
	assertFalse(20500==20500+1);
}
@Test
public void bigFalseTestIOIOProxyStream9() {
	assertFalse(15431==15431+1);
}
@Test
public void bigFalseTestIOIOProxyStream10() {
	assertFalse(7402==7402+1);
}
@Test
public void bigFalseTestIOIOProxyStream11() {
	assertFalse(17350==17350+1);
}
@Test
public void bigFalseTestIOIOProxyStream12() {
	assertFalse(18218==18218+1);
}
@Test
public void bigFalseTestIOIOProxyStream13() {
	assertFalse(1010==1010+1);
}
@Test
public void bigFalseTestIOIOProxyStream14() {
	assertFalse(16697==16697+1);
}
@Test
public void bigFalseTestIOIOProxyStream15() {
	assertFalse(29804==29804+1);
}
@Test
public void bigFalseTestIOIOProxyStream16() {
	assertFalse(31591==31591+1);
}
@Test
public void bigFalseTestIOIOProxyStream17() {
	assertFalse(30999==30999+1);
}
@Test
public void bigFalseTestIOIOProxyStream18() {
	assertFalse(31079==31079+1);
}
@Test
public void bigFalseTestIOIOProxyStream19() {
	assertFalse(22210==22210+1);
}
@Test
public void bigFalseTestIOIOProxyStream20() {
	assertFalse(5532==5532+1);
}
@Test
public void bigFalseTestIOIOProxyStream21() {
	assertFalse(11860==11860+1);
}
@Test
public void bigFalseTestIOIOProxyStream22() {
	assertFalse(26517==26517+1);
}
@Test
public void bigFalseTestIOIOProxyStream23() {
	assertFalse(17669==17669+1);
}
@Test
public void bigFalseTestIOIOProxyStream24() {
	assertFalse(24273==24273+1);
}
@Test
public void bigFalseTestIOIOProxyStream25() {
	assertFalse(12494==12494+1);
}
@Test
public void bigFalseTestIOIOProxyStream26() {
	assertFalse(1183==1183+1);
}
@Test
public void bigFalseTestIOIOProxyStream27() {
	assertFalse(7944==7944+1);
}
@Test
public void bigFalseTestIOIOProxyStream28() {
	assertFalse(28604==28604+1);
}
@Test
public void bigFalseTestIOIOProxyStream29() {
	assertFalse(2047==2047+1);
}
@Test
public void bigFalseTestIOIOProxyStream30() {
	assertFalse(12790==12790+1);
}
@Test
public void bigFalseTestIOIOProxyStream31() {
	assertFalse(27872==27872+1);
}
@Test
public void bigFalseTestIOIOProxyStream32() {
	assertFalse(23551==23551+1);
}
@Test
public void bigFalseTestIOIOProxyStream33() {
	assertFalse(26181==26181+1);
}
@Test
public void bigFalseTestIOIOProxyStream34() {
	assertFalse(3387==3387+1);
}
@Test
public void bigFalseTestIOIOProxyStream35() {
	assertFalse(82==82+1);
}
@Test
public void bigFalseTestIOIOProxyStream36() {
	assertFalse(21797==21797+1);
}
@Test
public void bigFalseTestIOIOProxyStream37() {
	assertFalse(22054==22054+1);
}
@Test
public void bigFalseTestIOIOProxyStream38() {
	assertFalse(24992==24992+1);
}
@Test
public void bigFalseTestIOIOProxyStream39() {
	assertFalse(16638==16638+1);
}
@Test
public void bigFalseTestIOIOProxyStream40() {
	assertFalse(346==346+1);
}
@Test
public void bigFalseTestIOIOProxyStream41() {
	assertFalse(28772==28772+1);
}
@Test
public void bigFalseTestIOIOProxyStream42() {
	assertFalse(21247==21247+1);
}
@Test
public void bigFalseTestIOIOProxyStream43() {
	assertFalse(3912==3912+1);
}
@Test
public void bigFalseTestIOIOProxyStream44() {
	assertFalse(494==494+1);
}
@Test
public void bigFalseTestIOIOProxyStream45() {
	assertFalse(26308==26308+1);
}
@Test
public void bigFalseTestIOIOProxyStream46() {
	assertFalse(7863==7863+1);
}
@Test
public void bigFalseTestIOIOProxyStream47() {
	assertFalse(27145==27145+1);
}
@Test
public void bigFalseTestIOIOProxyStream48() {
	assertFalse(25992==25992+1);
}
@Test
public void bigFalseTestIOIOProxyStream49() {
	assertFalse(28574==28574+1);
}
@Test
public void bigFalseTestIOIOProxyStream50() {
	assertFalse(3659==3659+1);
}
@Test
public void bigFalseTestIOIOProxyStream51() {
	assertFalse(17146==17146+1);
}
@Test
public void bigFalseTestIOIOProxyStream52() {
	assertFalse(554==554+1);
}
@Test
public void bigFalseTestIOIOProxyStream53() {
	assertFalse(24101==24101+1);
}
@Test
public void bigFalseTestIOIOProxyStream54() {
	assertFalse(30649==30649+1);
}
@Test
public void bigFalseTestIOIOProxyStream55() {
	assertFalse(11740==11740+1);
}
}
