package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadAPISerialDataProxyHelperTest {
    @Test
    public void testValidReadAPISerialDataProxy() {
		ReadAPISerialDataProxyHelper helper = new ReadAPISerialDataProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidReadAPISerialDataProxy() {
	ReadAPISerialDataProxyHelper helper = new ReadAPISerialDataProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseReadAPISerialDataProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseReadAPISerialDataProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadAPISerialDataProxy0() {
	assertFalse(16884==16884+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy1() {
	assertFalse(747==747+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy2() {
	assertFalse(15381==15381+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy3() {
	assertFalse(23046==23046+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy4() {
	assertFalse(30096==30096+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy5() {
	assertFalse(2507==2507+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy6() {
	assertFalse(16368==16368+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy7() {
	assertFalse(6314==6314+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy8() {
	assertFalse(3871==3871+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy9() {
	assertFalse(14532==14532+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy10() {
	assertFalse(26372==26372+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy11() {
	assertFalse(7945==7945+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy12() {
	assertFalse(14523==14523+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy13() {
	assertFalse(18033==18033+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy14() {
	assertFalse(345==345+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy15() {
	assertFalse(18516==18516+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy16() {
	assertFalse(11202==11202+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy17() {
	assertFalse(18296==18296+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy18() {
	assertFalse(19687==19687+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy19() {
	assertFalse(11897==11897+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy20() {
	assertFalse(15768==15768+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy21() {
	assertFalse(25240==25240+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy22() {
	assertFalse(18092==18092+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy23() {
	assertFalse(15115==15115+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy24() {
	assertFalse(31778==31778+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy25() {
	assertFalse(14708==14708+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy26() {
	assertFalse(29072==29072+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy27() {
	assertFalse(23283==23283+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy28() {
	assertFalse(5629==5629+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy29() {
	assertFalse(4641==4641+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy30() {
	assertFalse(12024==12024+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy31() {
	assertFalse(16596==16596+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy32() {
	assertFalse(2690==2690+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy33() {
	assertFalse(3441==3441+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy34() {
	assertFalse(1324==1324+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy35() {
	assertFalse(25151==25151+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy36() {
	assertFalse(23931==23931+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy37() {
	assertFalse(30205==30205+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy38() {
	assertFalse(28521==28521+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy39() {
	assertFalse(7068==7068+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy40() {
	assertFalse(19106==19106+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy41() {
	assertFalse(29684==29684+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy42() {
	assertFalse(5061==5061+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy43() {
	assertFalse(9939==9939+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy44() {
	assertFalse(13533==13533+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy45() {
	assertFalse(12711==12711+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy46() {
	assertFalse(31431==31431+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy47() {
	assertFalse(20669==20669+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy48() {
	assertFalse(19771==19771+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy49() {
	assertFalse(15568==15568+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy50() {
	assertFalse(9410==9410+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy51() {
	assertFalse(6478==6478+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy52() {
	assertFalse(11694==11694+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy53() {
	assertFalse(12453==12453+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy54() {
	assertFalse(6390==6390+1);
}
@Test
public void bigFalseTestReadAPISerialDataProxy55() {
	assertFalse(10879==10879+1);
}
}
