package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapProxyIOReadIOHelperTest {
    @Test
    public void testValidMapProxyIOReadIO() {
		MapProxyIOReadIOHelper helper = new MapProxyIOReadIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseMapProxyIOReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapProxyIOReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseMapProxyIOReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapProxyIOReadIO0() {
	assertFalse(22386==22386+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO1() {
	assertFalse(12707==12707+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO2() {
	assertFalse(837==837+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO3() {
	assertFalse(9252==9252+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO4() {
	assertFalse(20251==20251+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO5() {
	assertFalse(11342==11342+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO6() {
	assertFalse(6313==6313+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO7() {
	assertFalse(26605==26605+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO8() {
	assertFalse(1462==1462+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO9() {
	assertFalse(3484==3484+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO10() {
	assertFalse(15000==15000+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO11() {
	assertFalse(25619==25619+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO12() {
	assertFalse(3611==3611+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO13() {
	assertFalse(11621==11621+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO14() {
	assertFalse(24474==24474+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO15() {
	assertFalse(14481==14481+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO16() {
	assertFalse(20149==20149+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO17() {
	assertFalse(12155==12155+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO18() {
	assertFalse(3304==3304+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO19() {
	assertFalse(8481==8481+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO20() {
	assertFalse(2029==2029+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO21() {
	assertFalse(10153==10153+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO22() {
	assertFalse(28854==28854+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO23() {
	assertFalse(20381==20381+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO24() {
	assertFalse(21848==21848+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO25() {
	assertFalse(366==366+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO26() {
	assertFalse(21826==21826+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO27() {
	assertFalse(4120==4120+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO28() {
	assertFalse(5535==5535+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO29() {
	assertFalse(10105==10105+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO30() {
	assertFalse(14497==14497+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO31() {
	assertFalse(4795==4795+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO32() {
	assertFalse(25906==25906+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO33() {
	assertFalse(9956==9956+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO34() {
	assertFalse(5444==5444+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO35() {
	assertFalse(30561==30561+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO36() {
	assertFalse(6060==6060+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO37() {
	assertFalse(18993==18993+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO38() {
	assertFalse(10061==10061+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO39() {
	assertFalse(30450==30450+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO40() {
	assertFalse(23557==23557+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO41() {
	assertFalse(26629==26629+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO42() {
	assertFalse(14996==14996+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO43() {
	assertFalse(18048==18048+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO44() {
	assertFalse(30586==30586+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO45() {
	assertFalse(24998==24998+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO46() {
	assertFalse(19831==19831+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO47() {
	assertFalse(4131==4131+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO48() {
	assertFalse(17212==17212+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO49() {
	assertFalse(3382==3382+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO50() {
	assertFalse(5221==5221+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO51() {
	assertFalse(7573==7573+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO52() {
	assertFalse(22746==22746+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO53() {
	assertFalse(1965==1965+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO54() {
	assertFalse(10794==10794+1);
}
@Test
public void bigFalseTestMapProxyIOReadIO55() {
	assertFalse(4236==4236+1);
}
}
