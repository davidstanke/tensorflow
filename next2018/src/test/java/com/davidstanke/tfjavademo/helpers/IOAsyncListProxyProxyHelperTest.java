package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOAsyncListProxyProxyHelperTest {
    @Test
    public void testValidIOAsyncListProxyProxy() {
		IOAsyncListProxyProxyHelper helper = new IOAsyncListProxyProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOAsyncListProxyProxy() {
	IOAsyncListProxyProxyHelper helper = new IOAsyncListProxyProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseIOAsyncListProxyProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOAsyncListProxyProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIOAsyncListProxyProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy0() {
	assertFalse(28362==28362+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy1() {
	assertFalse(3049==3049+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy2() {
	assertFalse(15234==15234+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy3() {
	assertFalse(18030==18030+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy4() {
	assertFalse(20653==20653+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy5() {
	assertFalse(14855==14855+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy6() {
	assertFalse(11367==11367+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy7() {
	assertFalse(11520==11520+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy8() {
	assertFalse(17493==17493+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy9() {
	assertFalse(27707==27707+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy10() {
	assertFalse(14319==14319+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy11() {
	assertFalse(17182==17182+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy12() {
	assertFalse(10150==10150+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy13() {
	assertFalse(12690==12690+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy14() {
	assertFalse(10984==10984+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy15() {
	assertFalse(11378==11378+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy16() {
	assertFalse(26855==26855+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy17() {
	assertFalse(23352==23352+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy18() {
	assertFalse(22456==22456+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy19() {
	assertFalse(10948==10948+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy20() {
	assertFalse(2843==2843+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy21() {
	assertFalse(24482==24482+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy22() {
	assertFalse(14358==14358+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy23() {
	assertFalse(17156==17156+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy24() {
	assertFalse(5151==5151+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy25() {
	assertFalse(17533==17533+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy26() {
	assertFalse(28299==28299+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy27() {
	assertFalse(10007==10007+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy28() {
	assertFalse(16517==16517+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy29() {
	assertFalse(15193==15193+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy30() {
	assertFalse(25516==25516+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy31() {
	assertFalse(28770==28770+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy32() {
	assertFalse(6450==6450+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy33() {
	assertFalse(23829==23829+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy34() {
	assertFalse(31508==31508+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy35() {
	assertFalse(30487==30487+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy36() {
	assertFalse(18105==18105+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy37() {
	assertFalse(12297==12297+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy38() {
	assertFalse(7204==7204+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy39() {
	assertFalse(21058==21058+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy40() {
	assertFalse(15990==15990+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy41() {
	assertFalse(25846==25846+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy42() {
	assertFalse(2682==2682+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy43() {
	assertFalse(19602==19602+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy44() {
	assertFalse(9579==9579+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy45() {
	assertFalse(30382==30382+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy46() {
	assertFalse(18994==18994+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy47() {
	assertFalse(23016==23016+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy48() {
	assertFalse(1242==1242+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy49() {
	assertFalse(6275==6275+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy50() {
	assertFalse(3039==3039+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy51() {
	assertFalse(22945==22945+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy52() {
	assertFalse(11430==11430+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy53() {
	assertFalse(8049==8049+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy54() {
	assertFalse(23623==23623+1);
}
@Test
public void bigFalseTestIOAsyncListProxyProxy55() {
	assertFalse(12708==12708+1);
}
}
