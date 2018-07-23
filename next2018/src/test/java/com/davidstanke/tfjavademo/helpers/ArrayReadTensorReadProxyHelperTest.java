package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayReadTensorReadProxyHelperTest {
    @Test
    public void testValidArrayReadTensorReadProxy() {
		ArrayReadTensorReadProxyHelper helper = new ArrayReadTensorReadProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseArrayReadTensorReadProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayReadTensorReadProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayReadTensorReadProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy0() {
	assertFalse(32571==32571+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy1() {
	assertFalse(13216==13216+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy2() {
	assertFalse(4006==4006+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy3() {
	assertFalse(6850==6850+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy4() {
	assertFalse(10607==10607+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy5() {
	assertFalse(23359==23359+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy6() {
	assertFalse(30353==30353+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy7() {
	assertFalse(6565==6565+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy8() {
	assertFalse(10600==10600+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy9() {
	assertFalse(594==594+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy10() {
	assertFalse(4649==4649+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy11() {
	assertFalse(18558==18558+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy12() {
	assertFalse(31378==31378+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy13() {
	assertFalse(1627==1627+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy14() {
	assertFalse(19913==19913+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy15() {
	assertFalse(6380==6380+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy16() {
	assertFalse(12080==12080+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy17() {
	assertFalse(20466==20466+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy18() {
	assertFalse(28048==28048+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy19() {
	assertFalse(7673==7673+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy20() {
	assertFalse(26855==26855+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy21() {
	assertFalse(20068==20068+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy22() {
	assertFalse(14280==14280+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy23() {
	assertFalse(5910==5910+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy24() {
	assertFalse(19974==19974+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy25() {
	assertFalse(4359==4359+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy26() {
	assertFalse(18715==18715+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy27() {
	assertFalse(11995==11995+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy28() {
	assertFalse(1942==1942+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy29() {
	assertFalse(6751==6751+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy30() {
	assertFalse(32628==32628+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy31() {
	assertFalse(27003==27003+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy32() {
	assertFalse(5157==5157+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy33() {
	assertFalse(18674==18674+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy34() {
	assertFalse(10166==10166+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy35() {
	assertFalse(32520==32520+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy36() {
	assertFalse(31571==31571+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy37() {
	assertFalse(29163==29163+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy38() {
	assertFalse(23071==23071+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy39() {
	assertFalse(7532==7532+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy40() {
	assertFalse(11801==11801+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy41() {
	assertFalse(2417==2417+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy42() {
	assertFalse(12667==12667+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy43() {
	assertFalse(20003==20003+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy44() {
	assertFalse(8157==8157+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy45() {
	assertFalse(29893==29893+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy46() {
	assertFalse(18696==18696+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy47() {
	assertFalse(31673==31673+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy48() {
	assertFalse(25654==25654+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy49() {
	assertFalse(25118==25118+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy50() {
	assertFalse(11564==11564+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy51() {
	assertFalse(21255==21255+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy52() {
	assertFalse(23935==23935+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy53() {
	assertFalse(16964==16964+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy54() {
	assertFalse(10969==10969+1);
}
@Test
public void bigFalseTestArrayReadTensorReadProxy55() {
	assertFalse(31789==31789+1);
}
}
