package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringProxyReadListAsyncHelperTest {
    @Test
    public void testValidStringProxyReadListAsync() {
		StringProxyReadListAsyncHelper helper = new StringProxyReadListAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringProxyReadListAsync() {
	StringProxyReadListAsyncHelper helper = new StringProxyReadListAsyncHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseStringProxyReadListAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringProxyReadListAsync0() {
	assertFalse(5926==5926+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync1() {
	assertFalse(11395==11395+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync2() {
	assertFalse(31378==31378+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync3() {
	assertFalse(15206==15206+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync4() {
	assertFalse(2621==2621+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync5() {
	assertFalse(20000==20000+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync6() {
	assertFalse(29659==29659+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync7() {
	assertFalse(30565==30565+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync8() {
	assertFalse(22234==22234+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync9() {
	assertFalse(22940==22940+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync10() {
	assertFalse(3968==3968+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync11() {
	assertFalse(24576==24576+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync12() {
	assertFalse(2586==2586+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync13() {
	assertFalse(12756==12756+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync14() {
	assertFalse(21491==21491+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync15() {
	assertFalse(20232==20232+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync16() {
	assertFalse(8854==8854+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync17() {
	assertFalse(29030==29030+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync18() {
	assertFalse(10880==10880+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync19() {
	assertFalse(16154==16154+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync20() {
	assertFalse(3407==3407+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync21() {
	assertFalse(820==820+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync22() {
	assertFalse(5143==5143+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync23() {
	assertFalse(28280==28280+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync24() {
	assertFalse(1368==1368+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync25() {
	assertFalse(18071==18071+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync26() {
	assertFalse(24279==24279+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync27() {
	assertFalse(21413==21413+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync28() {
	assertFalse(16961==16961+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync29() {
	assertFalse(15203==15203+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync30() {
	assertFalse(10335==10335+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync31() {
	assertFalse(16322==16322+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync32() {
	assertFalse(8519==8519+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync33() {
	assertFalse(29087==29087+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync34() {
	assertFalse(14547==14547+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync35() {
	assertFalse(19115==19115+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync36() {
	assertFalse(13629==13629+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync37() {
	assertFalse(14593==14593+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync38() {
	assertFalse(688==688+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync39() {
	assertFalse(25808==25808+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync40() {
	assertFalse(26936==26936+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync41() {
	assertFalse(19499==19499+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync42() {
	assertFalse(21328==21328+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync43() {
	assertFalse(10965==10965+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync44() {
	assertFalse(8702==8702+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync45() {
	assertFalse(29608==29608+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync46() {
	assertFalse(60==60+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync47() {
	assertFalse(22249==22249+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync48() {
	assertFalse(2604==2604+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync49() {
	assertFalse(23717==23717+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync50() {
	assertFalse(7477==7477+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync51() {
	assertFalse(27623==27623+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync52() {
	assertFalse(29993==29993+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync53() {
	assertFalse(8047==8047+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync54() {
	assertFalse(1793==1793+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync55() {
	assertFalse(30254==30254+1);
}
}
