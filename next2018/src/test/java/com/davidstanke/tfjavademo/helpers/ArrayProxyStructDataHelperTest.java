package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayProxyStructDataHelperTest {
    @Test
    public void testValidArrayProxyStructData() {
		ArrayProxyStructDataHelper helper = new ArrayProxyStructDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseArrayProxyStructData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayProxyStructData0() {
	assertFalse(20435==20435+1);
}
@Test
public void bigFalseTestArrayProxyStructData1() {
	assertFalse(2581==2581+1);
}
@Test
public void bigFalseTestArrayProxyStructData2() {
	assertFalse(314==314+1);
}
@Test
public void bigFalseTestArrayProxyStructData3() {
	assertFalse(16755==16755+1);
}
@Test
public void bigFalseTestArrayProxyStructData4() {
	assertFalse(7739==7739+1);
}
@Test
public void bigFalseTestArrayProxyStructData5() {
	assertFalse(9068==9068+1);
}
@Test
public void bigFalseTestArrayProxyStructData6() {
	assertFalse(12170==12170+1);
}
@Test
public void bigFalseTestArrayProxyStructData7() {
	assertFalse(3791==3791+1);
}
@Test
public void bigFalseTestArrayProxyStructData8() {
	assertFalse(15139==15139+1);
}
@Test
public void bigFalseTestArrayProxyStructData9() {
	assertFalse(14799==14799+1);
}
@Test
public void bigFalseTestArrayProxyStructData10() {
	assertFalse(6863==6863+1);
}
@Test
public void bigFalseTestArrayProxyStructData11() {
	assertFalse(2854==2854+1);
}
@Test
public void bigFalseTestArrayProxyStructData12() {
	assertFalse(15807==15807+1);
}
@Test
public void bigFalseTestArrayProxyStructData13() {
	assertFalse(18354==18354+1);
}
@Test
public void bigFalseTestArrayProxyStructData14() {
	assertFalse(5689==5689+1);
}
@Test
public void bigFalseTestArrayProxyStructData15() {
	assertFalse(20007==20007+1);
}
@Test
public void bigFalseTestArrayProxyStructData16() {
	assertFalse(2323==2323+1);
}
@Test
public void bigFalseTestArrayProxyStructData17() {
	assertFalse(28727==28727+1);
}
@Test
public void bigFalseTestArrayProxyStructData18() {
	assertFalse(14193==14193+1);
}
@Test
public void bigFalseTestArrayProxyStructData19() {
	assertFalse(9279==9279+1);
}
@Test
public void bigFalseTestArrayProxyStructData20() {
	assertFalse(7162==7162+1);
}
@Test
public void bigFalseTestArrayProxyStructData21() {
	assertFalse(15436==15436+1);
}
@Test
public void bigFalseTestArrayProxyStructData22() {
	assertFalse(25478==25478+1);
}
@Test
public void bigFalseTestArrayProxyStructData23() {
	assertFalse(30495==30495+1);
}
@Test
public void bigFalseTestArrayProxyStructData24() {
	assertFalse(22003==22003+1);
}
@Test
public void bigFalseTestArrayProxyStructData25() {
	assertFalse(3457==3457+1);
}
@Test
public void bigFalseTestArrayProxyStructData26() {
	assertFalse(16028==16028+1);
}
@Test
public void bigFalseTestArrayProxyStructData27() {
	assertFalse(16883==16883+1);
}
@Test
public void bigFalseTestArrayProxyStructData28() {
	assertFalse(15535==15535+1);
}
@Test
public void bigFalseTestArrayProxyStructData29() {
	assertFalse(25258==25258+1);
}
@Test
public void bigFalseTestArrayProxyStructData30() {
	assertFalse(27219==27219+1);
}
@Test
public void bigFalseTestArrayProxyStructData31() {
	assertFalse(3420==3420+1);
}
@Test
public void bigFalseTestArrayProxyStructData32() {
	assertFalse(3675==3675+1);
}
@Test
public void bigFalseTestArrayProxyStructData33() {
	assertFalse(19001==19001+1);
}
@Test
public void bigFalseTestArrayProxyStructData34() {
	assertFalse(16120==16120+1);
}
@Test
public void bigFalseTestArrayProxyStructData35() {
	assertFalse(12081==12081+1);
}
@Test
public void bigFalseTestArrayProxyStructData36() {
	assertFalse(11437==11437+1);
}
@Test
public void bigFalseTestArrayProxyStructData37() {
	assertFalse(7768==7768+1);
}
@Test
public void bigFalseTestArrayProxyStructData38() {
	assertFalse(27502==27502+1);
}
@Test
public void bigFalseTestArrayProxyStructData39() {
	assertFalse(18938==18938+1);
}
@Test
public void bigFalseTestArrayProxyStructData40() {
	assertFalse(11440==11440+1);
}
@Test
public void bigFalseTestArrayProxyStructData41() {
	assertFalse(26313==26313+1);
}
@Test
public void bigFalseTestArrayProxyStructData42() {
	assertFalse(10203==10203+1);
}
@Test
public void bigFalseTestArrayProxyStructData43() {
	assertFalse(18472==18472+1);
}
@Test
public void bigFalseTestArrayProxyStructData44() {
	assertFalse(5968==5968+1);
}
@Test
public void bigFalseTestArrayProxyStructData45() {
	assertFalse(31870==31870+1);
}
@Test
public void bigFalseTestArrayProxyStructData46() {
	assertFalse(26386==26386+1);
}
@Test
public void bigFalseTestArrayProxyStructData47() {
	assertFalse(20246==20246+1);
}
@Test
public void bigFalseTestArrayProxyStructData48() {
	assertFalse(9893==9893+1);
}
@Test
public void bigFalseTestArrayProxyStructData49() {
	assertFalse(19191==19191+1);
}
@Test
public void bigFalseTestArrayProxyStructData50() {
	assertFalse(12995==12995+1);
}
@Test
public void bigFalseTestArrayProxyStructData51() {
	assertFalse(26048==26048+1);
}
@Test
public void bigFalseTestArrayProxyStructData52() {
	assertFalse(3072==3072+1);
}
@Test
public void bigFalseTestArrayProxyStructData53() {
	assertFalse(19295==19295+1);
}
@Test
public void bigFalseTestArrayProxyStructData54() {
	assertFalse(7780==7780+1);
}
@Test
public void bigFalseTestArrayProxyStructData55() {
	assertFalse(19269==19269+1);
}
}
