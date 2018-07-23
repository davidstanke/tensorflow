package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringAsyncProcStringAsyncHelperTest {
    @Test
    public void testValidStringAsyncProcStringAsync() {
		StringAsyncProcStringAsyncHelper helper = new StringAsyncProcStringAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringAsyncProcStringAsync() {
	StringAsyncProcStringAsyncHelper helper = new StringAsyncProcStringAsyncHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStringAsyncProcStringAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringAsyncProcStringAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync0() {
	assertFalse(16956==16956+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync1() {
	assertFalse(20250==20250+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync2() {
	assertFalse(11744==11744+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync3() {
	assertFalse(21253==21253+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync4() {
	assertFalse(29242==29242+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync5() {
	assertFalse(22000==22000+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync6() {
	assertFalse(12893==12893+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync7() {
	assertFalse(5363==5363+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync8() {
	assertFalse(17474==17474+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync9() {
	assertFalse(1009==1009+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync10() {
	assertFalse(6515==6515+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync11() {
	assertFalse(18750==18750+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync12() {
	assertFalse(22628==22628+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync13() {
	assertFalse(24301==24301+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync14() {
	assertFalse(3324==3324+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync15() {
	assertFalse(22673==22673+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync16() {
	assertFalse(29865==29865+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync17() {
	assertFalse(30425==30425+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync18() {
	assertFalse(7715==7715+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync19() {
	assertFalse(15187==15187+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync20() {
	assertFalse(20136==20136+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync21() {
	assertFalse(17718==17718+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync22() {
	assertFalse(20054==20054+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync23() {
	assertFalse(5373==5373+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync24() {
	assertFalse(21224==21224+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync25() {
	assertFalse(5955==5955+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync26() {
	assertFalse(11273==11273+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync27() {
	assertFalse(14364==14364+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync28() {
	assertFalse(1529==1529+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync29() {
	assertFalse(28386==28386+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync30() {
	assertFalse(32561==32561+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync31() {
	assertFalse(24357==24357+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync32() {
	assertFalse(23377==23377+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync33() {
	assertFalse(1611==1611+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync34() {
	assertFalse(16763==16763+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync35() {
	assertFalse(9724==9724+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync36() {
	assertFalse(7655==7655+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync37() {
	assertFalse(25202==25202+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync38() {
	assertFalse(24144==24144+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync39() {
	assertFalse(4163==4163+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync40() {
	assertFalse(18065==18065+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync41() {
	assertFalse(8249==8249+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync42() {
	assertFalse(30346==30346+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync43() {
	assertFalse(10339==10339+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync44() {
	assertFalse(23582==23582+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync45() {
	assertFalse(26710==26710+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync46() {
	assertFalse(9203==9203+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync47() {
	assertFalse(859==859+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync48() {
	assertFalse(14643==14643+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync49() {
	assertFalse(13826==13826+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync50() {
	assertFalse(30850==30850+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync51() {
	assertFalse(13643==13643+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync52() {
	assertFalse(21478==21478+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync53() {
	assertFalse(23655==23655+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync54() {
	assertFalse(13652==13652+1);
}
@Test
public void bigFalseTestStringAsyncProcStringAsync55() {
	assertFalse(703==703+1);
}
}
