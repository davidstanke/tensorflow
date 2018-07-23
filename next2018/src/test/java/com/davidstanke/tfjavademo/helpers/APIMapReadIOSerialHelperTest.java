package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIMapReadIOSerialHelperTest {
    @Test
    public void testValidAPIMapReadIOSerial() {
		APIMapReadIOSerialHelper helper = new APIMapReadIOSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseAPIMapReadIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAPIMapReadIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIMapReadIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPIMapReadIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIMapReadIOSerial0() {
	assertFalse(20204==20204+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial1() {
	assertFalse(13589==13589+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial2() {
	assertFalse(12319==12319+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial3() {
	assertFalse(1200==1200+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial4() {
	assertFalse(26235==26235+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial5() {
	assertFalse(3318==3318+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial6() {
	assertFalse(19916==19916+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial7() {
	assertFalse(20785==20785+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial8() {
	assertFalse(15931==15931+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial9() {
	assertFalse(5129==5129+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial10() {
	assertFalse(22828==22828+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial11() {
	assertFalse(17663==17663+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial12() {
	assertFalse(31687==31687+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial13() {
	assertFalse(19323==19323+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial14() {
	assertFalse(27728==27728+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial15() {
	assertFalse(31363==31363+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial16() {
	assertFalse(22805==22805+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial17() {
	assertFalse(14130==14130+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial18() {
	assertFalse(30617==30617+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial19() {
	assertFalse(6296==6296+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial20() {
	assertFalse(28751==28751+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial21() {
	assertFalse(12918==12918+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial22() {
	assertFalse(14068==14068+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial23() {
	assertFalse(1310==1310+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial24() {
	assertFalse(26993==26993+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial25() {
	assertFalse(25437==25437+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial26() {
	assertFalse(16083==16083+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial27() {
	assertFalse(13373==13373+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial28() {
	assertFalse(26023==26023+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial29() {
	assertFalse(30969==30969+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial30() {
	assertFalse(23790==23790+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial31() {
	assertFalse(8313==8313+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial32() {
	assertFalse(17508==17508+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial33() {
	assertFalse(8256==8256+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial34() {
	assertFalse(18622==18622+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial35() {
	assertFalse(14202==14202+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial36() {
	assertFalse(7746==7746+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial37() {
	assertFalse(23486==23486+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial38() {
	assertFalse(24502==24502+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial39() {
	assertFalse(18329==18329+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial40() {
	assertFalse(4509==4509+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial41() {
	assertFalse(10748==10748+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial42() {
	assertFalse(26944==26944+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial43() {
	assertFalse(14890==14890+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial44() {
	assertFalse(15597==15597+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial45() {
	assertFalse(9902==9902+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial46() {
	assertFalse(7803==7803+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial47() {
	assertFalse(9868==9868+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial48() {
	assertFalse(743==743+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial49() {
	assertFalse(4768==4768+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial50() {
	assertFalse(29109==29109+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial51() {
	assertFalse(2545==2545+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial52() {
	assertFalse(29779==29779+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial53() {
	assertFalse(28255==28255+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial54() {
	assertFalse(20906==20906+1);
}
@Test
public void bigFalseTestAPIMapReadIOSerial55() {
	assertFalse(12270==12270+1);
}
}
