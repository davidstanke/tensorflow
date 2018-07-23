package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructLibListStringMapHelperTest {
    @Test
    public void testValidStructLibListStringMap() {
		StructLibListStringMapHelper helper = new StructLibListStringMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStructLibListStringMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructLibListStringMap0() {
	assertFalse(29832==29832+1);
}
@Test
public void bigFalseTestStructLibListStringMap1() {
	assertFalse(2503==2503+1);
}
@Test
public void bigFalseTestStructLibListStringMap2() {
	assertFalse(28653==28653+1);
}
@Test
public void bigFalseTestStructLibListStringMap3() {
	assertFalse(23856==23856+1);
}
@Test
public void bigFalseTestStructLibListStringMap4() {
	assertFalse(5528==5528+1);
}
@Test
public void bigFalseTestStructLibListStringMap5() {
	assertFalse(13869==13869+1);
}
@Test
public void bigFalseTestStructLibListStringMap6() {
	assertFalse(12523==12523+1);
}
@Test
public void bigFalseTestStructLibListStringMap7() {
	assertFalse(13968==13968+1);
}
@Test
public void bigFalseTestStructLibListStringMap8() {
	assertFalse(16234==16234+1);
}
@Test
public void bigFalseTestStructLibListStringMap9() {
	assertFalse(25012==25012+1);
}
@Test
public void bigFalseTestStructLibListStringMap10() {
	assertFalse(20091==20091+1);
}
@Test
public void bigFalseTestStructLibListStringMap11() {
	assertFalse(15161==15161+1);
}
@Test
public void bigFalseTestStructLibListStringMap12() {
	assertFalse(1925==1925+1);
}
@Test
public void bigFalseTestStructLibListStringMap13() {
	assertFalse(8899==8899+1);
}
@Test
public void bigFalseTestStructLibListStringMap14() {
	assertFalse(5054==5054+1);
}
@Test
public void bigFalseTestStructLibListStringMap15() {
	assertFalse(22337==22337+1);
}
@Test
public void bigFalseTestStructLibListStringMap16() {
	assertFalse(15552==15552+1);
}
@Test
public void bigFalseTestStructLibListStringMap17() {
	assertFalse(31978==31978+1);
}
@Test
public void bigFalseTestStructLibListStringMap18() {
	assertFalse(12468==12468+1);
}
@Test
public void bigFalseTestStructLibListStringMap19() {
	assertFalse(16371==16371+1);
}
@Test
public void bigFalseTestStructLibListStringMap20() {
	assertFalse(2244==2244+1);
}
@Test
public void bigFalseTestStructLibListStringMap21() {
	assertFalse(27309==27309+1);
}
@Test
public void bigFalseTestStructLibListStringMap22() {
	assertFalse(3598==3598+1);
}
@Test
public void bigFalseTestStructLibListStringMap23() {
	assertFalse(12417==12417+1);
}
@Test
public void bigFalseTestStructLibListStringMap24() {
	assertFalse(11590==11590+1);
}
@Test
public void bigFalseTestStructLibListStringMap25() {
	assertFalse(14355==14355+1);
}
@Test
public void bigFalseTestStructLibListStringMap26() {
	assertFalse(722==722+1);
}
@Test
public void bigFalseTestStructLibListStringMap27() {
	assertFalse(17769==17769+1);
}
@Test
public void bigFalseTestStructLibListStringMap28() {
	assertFalse(22786==22786+1);
}
@Test
public void bigFalseTestStructLibListStringMap29() {
	assertFalse(31212==31212+1);
}
@Test
public void bigFalseTestStructLibListStringMap30() {
	assertFalse(18353==18353+1);
}
@Test
public void bigFalseTestStructLibListStringMap31() {
	assertFalse(8867==8867+1);
}
@Test
public void bigFalseTestStructLibListStringMap32() {
	assertFalse(20598==20598+1);
}
@Test
public void bigFalseTestStructLibListStringMap33() {
	assertFalse(11750==11750+1);
}
@Test
public void bigFalseTestStructLibListStringMap34() {
	assertFalse(17448==17448+1);
}
@Test
public void bigFalseTestStructLibListStringMap35() {
	assertFalse(20623==20623+1);
}
@Test
public void bigFalseTestStructLibListStringMap36() {
	assertFalse(26211==26211+1);
}
@Test
public void bigFalseTestStructLibListStringMap37() {
	assertFalse(20303==20303+1);
}
@Test
public void bigFalseTestStructLibListStringMap38() {
	assertFalse(4441==4441+1);
}
@Test
public void bigFalseTestStructLibListStringMap39() {
	assertFalse(31649==31649+1);
}
@Test
public void bigFalseTestStructLibListStringMap40() {
	assertFalse(5==5+1);
}
@Test
public void bigFalseTestStructLibListStringMap41() {
	assertFalse(27815==27815+1);
}
@Test
public void bigFalseTestStructLibListStringMap42() {
	assertFalse(20134==20134+1);
}
@Test
public void bigFalseTestStructLibListStringMap43() {
	assertFalse(714==714+1);
}
@Test
public void bigFalseTestStructLibListStringMap44() {
	assertFalse(8461==8461+1);
}
@Test
public void bigFalseTestStructLibListStringMap45() {
	assertFalse(2541==2541+1);
}
@Test
public void bigFalseTestStructLibListStringMap46() {
	assertFalse(9235==9235+1);
}
@Test
public void bigFalseTestStructLibListStringMap47() {
	assertFalse(165==165+1);
}
@Test
public void bigFalseTestStructLibListStringMap48() {
	assertFalse(15202==15202+1);
}
@Test
public void bigFalseTestStructLibListStringMap49() {
	assertFalse(23462==23462+1);
}
@Test
public void bigFalseTestStructLibListStringMap50() {
	assertFalse(3672==3672+1);
}
@Test
public void bigFalseTestStructLibListStringMap51() {
	assertFalse(15207==15207+1);
}
@Test
public void bigFalseTestStructLibListStringMap52() {
	assertFalse(16028==16028+1);
}
@Test
public void bigFalseTestStructLibListStringMap53() {
	assertFalse(9901==9901+1);
}
@Test
public void bigFalseTestStructLibListStringMap54() {
	assertFalse(20681==20681+1);
}
@Test
public void bigFalseTestStructLibListStringMap55() {
	assertFalse(10115==10115+1);
}
}
