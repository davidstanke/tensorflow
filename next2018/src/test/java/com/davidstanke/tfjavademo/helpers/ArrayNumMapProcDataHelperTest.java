package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayNumMapProcDataHelperTest {
    @Test
    public void testValidArrayNumMapProcData() {
		ArrayNumMapProcDataHelper helper = new ArrayNumMapProcDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayNumMapProcData() {
	ArrayNumMapProcDataHelper helper = new ArrayNumMapProcDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseArrayNumMapProcData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayNumMapProcData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayNumMapProcData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayNumMapProcData0() {
	assertFalse(27645==27645+1);
}
@Test
public void bigFalseTestArrayNumMapProcData1() {
	assertFalse(7402==7402+1);
}
@Test
public void bigFalseTestArrayNumMapProcData2() {
	assertFalse(6428==6428+1);
}
@Test
public void bigFalseTestArrayNumMapProcData3() {
	assertFalse(4290==4290+1);
}
@Test
public void bigFalseTestArrayNumMapProcData4() {
	assertFalse(12390==12390+1);
}
@Test
public void bigFalseTestArrayNumMapProcData5() {
	assertFalse(7531==7531+1);
}
@Test
public void bigFalseTestArrayNumMapProcData6() {
	assertFalse(28758==28758+1);
}
@Test
public void bigFalseTestArrayNumMapProcData7() {
	assertFalse(24577==24577+1);
}
@Test
public void bigFalseTestArrayNumMapProcData8() {
	assertFalse(12573==12573+1);
}
@Test
public void bigFalseTestArrayNumMapProcData9() {
	assertFalse(27164==27164+1);
}
@Test
public void bigFalseTestArrayNumMapProcData10() {
	assertFalse(5472==5472+1);
}
@Test
public void bigFalseTestArrayNumMapProcData11() {
	assertFalse(2666==2666+1);
}
@Test
public void bigFalseTestArrayNumMapProcData12() {
	assertFalse(25698==25698+1);
}
@Test
public void bigFalseTestArrayNumMapProcData13() {
	assertFalse(32499==32499+1);
}
@Test
public void bigFalseTestArrayNumMapProcData14() {
	assertFalse(31754==31754+1);
}
@Test
public void bigFalseTestArrayNumMapProcData15() {
	assertFalse(23685==23685+1);
}
@Test
public void bigFalseTestArrayNumMapProcData16() {
	assertFalse(3276==3276+1);
}
@Test
public void bigFalseTestArrayNumMapProcData17() {
	assertFalse(20342==20342+1);
}
@Test
public void bigFalseTestArrayNumMapProcData18() {
	assertFalse(6983==6983+1);
}
@Test
public void bigFalseTestArrayNumMapProcData19() {
	assertFalse(16571==16571+1);
}
@Test
public void bigFalseTestArrayNumMapProcData20() {
	assertFalse(845==845+1);
}
@Test
public void bigFalseTestArrayNumMapProcData21() {
	assertFalse(3849==3849+1);
}
@Test
public void bigFalseTestArrayNumMapProcData22() {
	assertFalse(23941==23941+1);
}
@Test
public void bigFalseTestArrayNumMapProcData23() {
	assertFalse(7805==7805+1);
}
@Test
public void bigFalseTestArrayNumMapProcData24() {
	assertFalse(9449==9449+1);
}
@Test
public void bigFalseTestArrayNumMapProcData25() {
	assertFalse(12792==12792+1);
}
@Test
public void bigFalseTestArrayNumMapProcData26() {
	assertFalse(15054==15054+1);
}
@Test
public void bigFalseTestArrayNumMapProcData27() {
	assertFalse(52==52+1);
}
@Test
public void bigFalseTestArrayNumMapProcData28() {
	assertFalse(24629==24629+1);
}
@Test
public void bigFalseTestArrayNumMapProcData29() {
	assertFalse(29506==29506+1);
}
@Test
public void bigFalseTestArrayNumMapProcData30() {
	assertFalse(22688==22688+1);
}
@Test
public void bigFalseTestArrayNumMapProcData31() {
	assertFalse(11243==11243+1);
}
@Test
public void bigFalseTestArrayNumMapProcData32() {
	assertFalse(7826==7826+1);
}
@Test
public void bigFalseTestArrayNumMapProcData33() {
	assertFalse(27435==27435+1);
}
@Test
public void bigFalseTestArrayNumMapProcData34() {
	assertFalse(19340==19340+1);
}
@Test
public void bigFalseTestArrayNumMapProcData35() {
	assertFalse(6846==6846+1);
}
@Test
public void bigFalseTestArrayNumMapProcData36() {
	assertFalse(1319==1319+1);
}
@Test
public void bigFalseTestArrayNumMapProcData37() {
	assertFalse(640==640+1);
}
@Test
public void bigFalseTestArrayNumMapProcData38() {
	assertFalse(22161==22161+1);
}
@Test
public void bigFalseTestArrayNumMapProcData39() {
	assertFalse(31490==31490+1);
}
@Test
public void bigFalseTestArrayNumMapProcData40() {
	assertFalse(18847==18847+1);
}
@Test
public void bigFalseTestArrayNumMapProcData41() {
	assertFalse(20136==20136+1);
}
@Test
public void bigFalseTestArrayNumMapProcData42() {
	assertFalse(17462==17462+1);
}
@Test
public void bigFalseTestArrayNumMapProcData43() {
	assertFalse(10546==10546+1);
}
@Test
public void bigFalseTestArrayNumMapProcData44() {
	assertFalse(5800==5800+1);
}
@Test
public void bigFalseTestArrayNumMapProcData45() {
	assertFalse(8815==8815+1);
}
@Test
public void bigFalseTestArrayNumMapProcData46() {
	assertFalse(13673==13673+1);
}
@Test
public void bigFalseTestArrayNumMapProcData47() {
	assertFalse(19356==19356+1);
}
@Test
public void bigFalseTestArrayNumMapProcData48() {
	assertFalse(15399==15399+1);
}
@Test
public void bigFalseTestArrayNumMapProcData49() {
	assertFalse(24466==24466+1);
}
@Test
public void bigFalseTestArrayNumMapProcData50() {
	assertFalse(538==538+1);
}
@Test
public void bigFalseTestArrayNumMapProcData51() {
	assertFalse(31952==31952+1);
}
@Test
public void bigFalseTestArrayNumMapProcData52() {
	assertFalse(10043==10043+1);
}
@Test
public void bigFalseTestArrayNumMapProcData53() {
	assertFalse(21770==21770+1);
}
@Test
public void bigFalseTestArrayNumMapProcData54() {
	assertFalse(1943==1943+1);
}
@Test
public void bigFalseTestArrayNumMapProcData55() {
	assertFalse(12483==12483+1);
}
}
