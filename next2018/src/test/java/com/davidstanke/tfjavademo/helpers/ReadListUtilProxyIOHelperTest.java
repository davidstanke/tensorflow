package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadListUtilProxyIOHelperTest {
    @Test
    public void testValidReadListUtilProxyIO() {
		ReadListUtilProxyIOHelper helper = new ReadListUtilProxyIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseReadListUtilProxyIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseReadListUtilProxyIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadListUtilProxyIO0() {
	assertFalse(12300==12300+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO1() {
	assertFalse(8230==8230+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO2() {
	assertFalse(4730==4730+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO3() {
	assertFalse(11807==11807+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO4() {
	assertFalse(30642==30642+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO5() {
	assertFalse(27680==27680+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO6() {
	assertFalse(29306==29306+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO7() {
	assertFalse(4415==4415+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO8() {
	assertFalse(2073==2073+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO9() {
	assertFalse(5872==5872+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO10() {
	assertFalse(67==67+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO11() {
	assertFalse(6250==6250+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO12() {
	assertFalse(15170==15170+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO13() {
	assertFalse(24510==24510+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO14() {
	assertFalse(16638==16638+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO15() {
	assertFalse(18688==18688+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO16() {
	assertFalse(1651==1651+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO17() {
	assertFalse(30618==30618+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO18() {
	assertFalse(4024==4024+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO19() {
	assertFalse(13205==13205+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO20() {
	assertFalse(19361==19361+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO21() {
	assertFalse(5249==5249+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO22() {
	assertFalse(31401==31401+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO23() {
	assertFalse(21832==21832+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO24() {
	assertFalse(21916==21916+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO25() {
	assertFalse(14350==14350+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO26() {
	assertFalse(10562==10562+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO27() {
	assertFalse(13028==13028+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO28() {
	assertFalse(27384==27384+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO29() {
	assertFalse(9728==9728+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO30() {
	assertFalse(5880==5880+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO31() {
	assertFalse(2488==2488+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO32() {
	assertFalse(9151==9151+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO33() {
	assertFalse(18031==18031+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO34() {
	assertFalse(11987==11987+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO35() {
	assertFalse(12854==12854+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO36() {
	assertFalse(28120==28120+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO37() {
	assertFalse(28621==28621+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO38() {
	assertFalse(5045==5045+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO39() {
	assertFalse(4174==4174+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO40() {
	assertFalse(27702==27702+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO41() {
	assertFalse(21663==21663+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO42() {
	assertFalse(8555==8555+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO43() {
	assertFalse(11656==11656+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO44() {
	assertFalse(7360==7360+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO45() {
	assertFalse(4345==4345+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO46() {
	assertFalse(29301==29301+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO47() {
	assertFalse(22756==22756+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO48() {
	assertFalse(28931==28931+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO49() {
	assertFalse(5051==5051+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO50() {
	assertFalse(30357==30357+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO51() {
	assertFalse(26737==26737+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO52() {
	assertFalse(17818==17818+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO53() {
	assertFalse(24462==24462+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO54() {
	assertFalse(26138==26138+1);
}
@Test
public void bigFalseTestReadListUtilProxyIO55() {
	assertFalse(30895==30895+1);
}
}
