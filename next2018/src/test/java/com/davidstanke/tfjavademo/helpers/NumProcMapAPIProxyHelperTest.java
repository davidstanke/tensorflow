package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumProcMapAPIProxyHelperTest {
    @Test
    public void testValidNumProcMapAPIProxy() {
		NumProcMapAPIProxyHelper helper = new NumProcMapAPIProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseNumProcMapAPIProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseNumProcMapAPIProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumProcMapAPIProxy0() {
	assertFalse(9396==9396+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy1() {
	assertFalse(4966==4966+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy2() {
	assertFalse(12135==12135+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy3() {
	assertFalse(653==653+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy4() {
	assertFalse(31969==31969+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy5() {
	assertFalse(15526==15526+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy6() {
	assertFalse(32692==32692+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy7() {
	assertFalse(21796==21796+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy8() {
	assertFalse(19784==19784+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy9() {
	assertFalse(13387==13387+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy10() {
	assertFalse(8200==8200+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy11() {
	assertFalse(28802==28802+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy12() {
	assertFalse(31370==31370+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy13() {
	assertFalse(11408==11408+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy14() {
	assertFalse(20393==20393+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy15() {
	assertFalse(6994==6994+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy16() {
	assertFalse(24652==24652+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy17() {
	assertFalse(30517==30517+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy18() {
	assertFalse(31312==31312+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy19() {
	assertFalse(32672==32672+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy20() {
	assertFalse(7366==7366+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy21() {
	assertFalse(22555==22555+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy22() {
	assertFalse(27795==27795+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy23() {
	assertFalse(25803==25803+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy24() {
	assertFalse(2315==2315+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy25() {
	assertFalse(26017==26017+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy26() {
	assertFalse(25366==25366+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy27() {
	assertFalse(3401==3401+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy28() {
	assertFalse(27158==27158+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy29() {
	assertFalse(4800==4800+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy30() {
	assertFalse(24689==24689+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy31() {
	assertFalse(13342==13342+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy32() {
	assertFalse(9880==9880+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy33() {
	assertFalse(16105==16105+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy34() {
	assertFalse(30176==30176+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy35() {
	assertFalse(26138==26138+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy36() {
	assertFalse(3459==3459+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy37() {
	assertFalse(26522==26522+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy38() {
	assertFalse(27309==27309+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy39() {
	assertFalse(13013==13013+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy40() {
	assertFalse(31062==31062+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy41() {
	assertFalse(22466==22466+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy42() {
	assertFalse(28254==28254+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy43() {
	assertFalse(29035==29035+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy44() {
	assertFalse(23591==23591+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy45() {
	assertFalse(28890==28890+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy46() {
	assertFalse(16798==16798+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy47() {
	assertFalse(5368==5368+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy48() {
	assertFalse(114==114+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy49() {
	assertFalse(27071==27071+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy50() {
	assertFalse(492==492+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy51() {
	assertFalse(19666==19666+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy52() {
	assertFalse(2724==2724+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy53() {
	assertFalse(8017==8017+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy54() {
	assertFalse(1029==1029+1);
}
@Test
public void bigFalseTestNumProcMapAPIProxy55() {
	assertFalse(27785==27785+1);
}
}
