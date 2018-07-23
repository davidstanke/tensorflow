package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncReadProcProxyHelperTest {
    @Test
    public void testValidAsyncReadProcProxy() {
		AsyncReadProcProxyHelper helper = new AsyncReadProcProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncReadProcProxy() {
	AsyncReadProcProxyHelper helper = new AsyncReadProcProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testThisFalseAsyncReadProcProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncReadProcProxy0() {
	assertFalse(28833==28833+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy1() {
	assertFalse(31593==31593+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy2() {
	assertFalse(26112==26112+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy3() {
	assertFalse(15561==15561+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy4() {
	assertFalse(24408==24408+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy5() {
	assertFalse(28601==28601+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy6() {
	assertFalse(15626==15626+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy7() {
	assertFalse(17089==17089+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy8() {
	assertFalse(11201==11201+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy9() {
	assertFalse(20433==20433+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy10() {
	assertFalse(13175==13175+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy11() {
	assertFalse(21072==21072+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy12() {
	assertFalse(16376==16376+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy13() {
	assertFalse(1007==1007+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy14() {
	assertFalse(20001==20001+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy15() {
	assertFalse(5915==5915+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy16() {
	assertFalse(10196==10196+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy17() {
	assertFalse(32166==32166+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy18() {
	assertFalse(21844==21844+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy19() {
	assertFalse(2046==2046+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy20() {
	assertFalse(21898==21898+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy21() {
	assertFalse(23824==23824+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy22() {
	assertFalse(30558==30558+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy23() {
	assertFalse(17572==17572+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy24() {
	assertFalse(1315==1315+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy25() {
	assertFalse(11730==11730+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy26() {
	assertFalse(2009==2009+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy27() {
	assertFalse(12520==12520+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy28() {
	assertFalse(27295==27295+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy29() {
	assertFalse(30676==30676+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy30() {
	assertFalse(26551==26551+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy31() {
	assertFalse(27119==27119+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy32() {
	assertFalse(5863==5863+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy33() {
	assertFalse(8125==8125+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy34() {
	assertFalse(25106==25106+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy35() {
	assertFalse(28930==28930+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy36() {
	assertFalse(16244==16244+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy37() {
	assertFalse(21297==21297+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy38() {
	assertFalse(2481==2481+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy39() {
	assertFalse(10284==10284+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy40() {
	assertFalse(21696==21696+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy41() {
	assertFalse(31946==31946+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy42() {
	assertFalse(25433==25433+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy43() {
	assertFalse(31895==31895+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy44() {
	assertFalse(4975==4975+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy45() {
	assertFalse(31703==31703+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy46() {
	assertFalse(26842==26842+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy47() {
	assertFalse(23207==23207+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy48() {
	assertFalse(31805==31805+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy49() {
	assertFalse(7127==7127+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy50() {
	assertFalse(12501==12501+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy51() {
	assertFalse(18387==18387+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy52() {
	assertFalse(24231==24231+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy53() {
	assertFalse(1972==1972+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy54() {
	assertFalse(18254==18254+1);
}
@Test
public void bigFalseTestAsyncReadProcProxy55() {
	assertFalse(15944==15944+1);
}
}
