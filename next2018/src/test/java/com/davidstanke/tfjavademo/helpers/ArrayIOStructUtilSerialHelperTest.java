package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayIOStructUtilSerialHelperTest {
    @Test
    public void testValidArrayIOStructUtilSerial() {
		ArrayIOStructUtilSerialHelper helper = new ArrayIOStructUtilSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseArrayIOStructUtilSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseArrayIOStructUtilSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayIOStructUtilSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial0() {
	assertFalse(12273==12273+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial1() {
	assertFalse(27248==27248+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial2() {
	assertFalse(1666==1666+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial3() {
	assertFalse(20985==20985+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial4() {
	assertFalse(12492==12492+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial5() {
	assertFalse(24372==24372+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial6() {
	assertFalse(30287==30287+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial7() {
	assertFalse(31170==31170+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial8() {
	assertFalse(23139==23139+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial9() {
	assertFalse(21309==21309+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial10() {
	assertFalse(16196==16196+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial11() {
	assertFalse(2641==2641+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial12() {
	assertFalse(23934==23934+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial13() {
	assertFalse(11334==11334+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial14() {
	assertFalse(31820==31820+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial15() {
	assertFalse(8628==8628+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial16() {
	assertFalse(25931==25931+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial17() {
	assertFalse(28126==28126+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial18() {
	assertFalse(12687==12687+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial19() {
	assertFalse(24806==24806+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial20() {
	assertFalse(14331==14331+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial21() {
	assertFalse(9170==9170+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial22() {
	assertFalse(1132==1132+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial23() {
	assertFalse(2593==2593+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial24() {
	assertFalse(17690==17690+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial25() {
	assertFalse(1883==1883+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial26() {
	assertFalse(30517==30517+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial27() {
	assertFalse(14311==14311+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial28() {
	assertFalse(15791==15791+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial29() {
	assertFalse(19208==19208+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial30() {
	assertFalse(9389==9389+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial31() {
	assertFalse(30927==30927+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial32() {
	assertFalse(4631==4631+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial33() {
	assertFalse(14697==14697+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial34() {
	assertFalse(14146==14146+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial35() {
	assertFalse(23568==23568+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial36() {
	assertFalse(29090==29090+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial37() {
	assertFalse(4737==4737+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial38() {
	assertFalse(6155==6155+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial39() {
	assertFalse(15054==15054+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial40() {
	assertFalse(10218==10218+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial41() {
	assertFalse(21481==21481+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial42() {
	assertFalse(4480==4480+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial43() {
	assertFalse(18984==18984+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial44() {
	assertFalse(29687==29687+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial45() {
	assertFalse(22468==22468+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial46() {
	assertFalse(25083==25083+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial47() {
	assertFalse(16894==16894+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial48() {
	assertFalse(13588==13588+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial49() {
	assertFalse(30310==30310+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial50() {
	assertFalse(31218==31218+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial51() {
	assertFalse(9347==9347+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial52() {
	assertFalse(2415==2415+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial53() {
	assertFalse(5827==5827+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial54() {
	assertFalse(25073==25073+1);
}
@Test
public void bigFalseTestArrayIOStructUtilSerial55() {
	assertFalse(29318==29318+1);
}
}
