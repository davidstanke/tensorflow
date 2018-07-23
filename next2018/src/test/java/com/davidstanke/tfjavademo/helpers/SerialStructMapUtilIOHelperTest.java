package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialStructMapUtilIOHelperTest {
    @Test
    public void testValidSerialStructMapUtilIO() {
		SerialStructMapUtilIOHelper helper = new SerialStructMapUtilIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseSerialStructMapUtilIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseSerialStructMapUtilIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialStructMapUtilIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialStructMapUtilIO0() {
	assertFalse(15562==15562+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO1() {
	assertFalse(28923==28923+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO2() {
	assertFalse(11265==11265+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO3() {
	assertFalse(12230==12230+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO4() {
	assertFalse(2205==2205+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO5() {
	assertFalse(13131==13131+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO6() {
	assertFalse(12408==12408+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO7() {
	assertFalse(14182==14182+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO8() {
	assertFalse(711==711+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO9() {
	assertFalse(11384==11384+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO10() {
	assertFalse(8361==8361+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO11() {
	assertFalse(21829==21829+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO12() {
	assertFalse(19787==19787+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO13() {
	assertFalse(23074==23074+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO14() {
	assertFalse(6397==6397+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO15() {
	assertFalse(5595==5595+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO16() {
	assertFalse(3663==3663+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO17() {
	assertFalse(24995==24995+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO18() {
	assertFalse(27143==27143+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO19() {
	assertFalse(29670==29670+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO20() {
	assertFalse(28312==28312+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO21() {
	assertFalse(13015==13015+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO22() {
	assertFalse(4445==4445+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO23() {
	assertFalse(22038==22038+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO24() {
	assertFalse(967==967+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO25() {
	assertFalse(2991==2991+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO26() {
	assertFalse(25658==25658+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO27() {
	assertFalse(15226==15226+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO28() {
	assertFalse(8789==8789+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO29() {
	assertFalse(10357==10357+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO30() {
	assertFalse(18389==18389+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO31() {
	assertFalse(17069==17069+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO32() {
	assertFalse(21327==21327+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO33() {
	assertFalse(11484==11484+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO34() {
	assertFalse(4991==4991+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO35() {
	assertFalse(30655==30655+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO36() {
	assertFalse(27090==27090+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO37() {
	assertFalse(4559==4559+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO38() {
	assertFalse(30847==30847+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO39() {
	assertFalse(5349==5349+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO40() {
	assertFalse(29766==29766+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO41() {
	assertFalse(9206==9206+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO42() {
	assertFalse(2990==2990+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO43() {
	assertFalse(8673==8673+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO44() {
	assertFalse(1370==1370+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO45() {
	assertFalse(24328==24328+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO46() {
	assertFalse(19665==19665+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO47() {
	assertFalse(7727==7727+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO48() {
	assertFalse(4291==4291+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO49() {
	assertFalse(12756==12756+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO50() {
	assertFalse(18361==18361+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO51() {
	assertFalse(8693==8693+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO52() {
	assertFalse(22452==22452+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO53() {
	assertFalse(30477==30477+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO54() {
	assertFalse(11036==11036+1);
}
@Test
public void bigFalseTestSerialStructMapUtilIO55() {
	assertFalse(8616==8616+1);
}
}
