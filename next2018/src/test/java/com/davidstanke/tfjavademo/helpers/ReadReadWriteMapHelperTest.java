package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadReadWriteMapHelperTest {
    @Test
    public void testValidReadReadWriteMap() {
		ReadReadWriteMapHelper helper = new ReadReadWriteMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidReadReadWriteMap() {
	ReadReadWriteMapHelper helper = new ReadReadWriteMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseReadReadWriteMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseReadReadWriteMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseReadReadWriteMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadReadWriteMap0() {
	assertFalse(24586==24586+1);
}
@Test
public void bigFalseTestReadReadWriteMap1() {
	assertFalse(13777==13777+1);
}
@Test
public void bigFalseTestReadReadWriteMap2() {
	assertFalse(10505==10505+1);
}
@Test
public void bigFalseTestReadReadWriteMap3() {
	assertFalse(469==469+1);
}
@Test
public void bigFalseTestReadReadWriteMap4() {
	assertFalse(6983==6983+1);
}
@Test
public void bigFalseTestReadReadWriteMap5() {
	assertFalse(4719==4719+1);
}
@Test
public void bigFalseTestReadReadWriteMap6() {
	assertFalse(17251==17251+1);
}
@Test
public void bigFalseTestReadReadWriteMap7() {
	assertFalse(28741==28741+1);
}
@Test
public void bigFalseTestReadReadWriteMap8() {
	assertFalse(23789==23789+1);
}
@Test
public void bigFalseTestReadReadWriteMap9() {
	assertFalse(11889==11889+1);
}
@Test
public void bigFalseTestReadReadWriteMap10() {
	assertFalse(26938==26938+1);
}
@Test
public void bigFalseTestReadReadWriteMap11() {
	assertFalse(3538==3538+1);
}
@Test
public void bigFalseTestReadReadWriteMap12() {
	assertFalse(30175==30175+1);
}
@Test
public void bigFalseTestReadReadWriteMap13() {
	assertFalse(4802==4802+1);
}
@Test
public void bigFalseTestReadReadWriteMap14() {
	assertFalse(31489==31489+1);
}
@Test
public void bigFalseTestReadReadWriteMap15() {
	assertFalse(32015==32015+1);
}
@Test
public void bigFalseTestReadReadWriteMap16() {
	assertFalse(16511==16511+1);
}
@Test
public void bigFalseTestReadReadWriteMap17() {
	assertFalse(29125==29125+1);
}
@Test
public void bigFalseTestReadReadWriteMap18() {
	assertFalse(32164==32164+1);
}
@Test
public void bigFalseTestReadReadWriteMap19() {
	assertFalse(27693==27693+1);
}
@Test
public void bigFalseTestReadReadWriteMap20() {
	assertFalse(6617==6617+1);
}
@Test
public void bigFalseTestReadReadWriteMap21() {
	assertFalse(10000==10000+1);
}
@Test
public void bigFalseTestReadReadWriteMap22() {
	assertFalse(17817==17817+1);
}
@Test
public void bigFalseTestReadReadWriteMap23() {
	assertFalse(4376==4376+1);
}
@Test
public void bigFalseTestReadReadWriteMap24() {
	assertFalse(16784==16784+1);
}
@Test
public void bigFalseTestReadReadWriteMap25() {
	assertFalse(30443==30443+1);
}
@Test
public void bigFalseTestReadReadWriteMap26() {
	assertFalse(18091==18091+1);
}
@Test
public void bigFalseTestReadReadWriteMap27() {
	assertFalse(19281==19281+1);
}
@Test
public void bigFalseTestReadReadWriteMap28() {
	assertFalse(19593==19593+1);
}
@Test
public void bigFalseTestReadReadWriteMap29() {
	assertFalse(18823==18823+1);
}
@Test
public void bigFalseTestReadReadWriteMap30() {
	assertFalse(5253==5253+1);
}
@Test
public void bigFalseTestReadReadWriteMap31() {
	assertFalse(1930==1930+1);
}
@Test
public void bigFalseTestReadReadWriteMap32() {
	assertFalse(5721==5721+1);
}
@Test
public void bigFalseTestReadReadWriteMap33() {
	assertFalse(24062==24062+1);
}
@Test
public void bigFalseTestReadReadWriteMap34() {
	assertFalse(24577==24577+1);
}
@Test
public void bigFalseTestReadReadWriteMap35() {
	assertFalse(16643==16643+1);
}
@Test
public void bigFalseTestReadReadWriteMap36() {
	assertFalse(23919==23919+1);
}
@Test
public void bigFalseTestReadReadWriteMap37() {
	assertFalse(12558==12558+1);
}
@Test
public void bigFalseTestReadReadWriteMap38() {
	assertFalse(32046==32046+1);
}
@Test
public void bigFalseTestReadReadWriteMap39() {
	assertFalse(15527==15527+1);
}
@Test
public void bigFalseTestReadReadWriteMap40() {
	assertFalse(30209==30209+1);
}
@Test
public void bigFalseTestReadReadWriteMap41() {
	assertFalse(5013==5013+1);
}
@Test
public void bigFalseTestReadReadWriteMap42() {
	assertFalse(15907==15907+1);
}
@Test
public void bigFalseTestReadReadWriteMap43() {
	assertFalse(23013==23013+1);
}
@Test
public void bigFalseTestReadReadWriteMap44() {
	assertFalse(16311==16311+1);
}
@Test
public void bigFalseTestReadReadWriteMap45() {
	assertFalse(11468==11468+1);
}
@Test
public void bigFalseTestReadReadWriteMap46() {
	assertFalse(11911==11911+1);
}
@Test
public void bigFalseTestReadReadWriteMap47() {
	assertFalse(5455==5455+1);
}
@Test
public void bigFalseTestReadReadWriteMap48() {
	assertFalse(18970==18970+1);
}
@Test
public void bigFalseTestReadReadWriteMap49() {
	assertFalse(25667==25667+1);
}
@Test
public void bigFalseTestReadReadWriteMap50() {
	assertFalse(31708==31708+1);
}
@Test
public void bigFalseTestReadReadWriteMap51() {
	assertFalse(6389==6389+1);
}
@Test
public void bigFalseTestReadReadWriteMap52() {
	assertFalse(21435==21435+1);
}
@Test
public void bigFalseTestReadReadWriteMap53() {
	assertFalse(28576==28576+1);
}
@Test
public void bigFalseTestReadReadWriteMap54() {
	assertFalse(5774==5774+1);
}
@Test
public void bigFalseTestReadReadWriteMap55() {
	assertFalse(30335==30335+1);
}
}
