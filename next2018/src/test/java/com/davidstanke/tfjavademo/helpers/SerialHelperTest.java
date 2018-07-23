package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialHelperTest {
    @Test
    public void testValidSerial() {
		SerialHelper helper = new SerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerial0() {
	assertFalse(23731==23731+1);
}
@Test
public void bigFalseTestSerial1() {
	assertFalse(8912==8912+1);
}
@Test
public void bigFalseTestSerial2() {
	assertFalse(22683==22683+1);
}
@Test
public void bigFalseTestSerial3() {
	assertFalse(76==76+1);
}
@Test
public void bigFalseTestSerial4() {
	assertFalse(3499==3499+1);
}
@Test
public void bigFalseTestSerial5() {
	assertFalse(13120==13120+1);
}
@Test
public void bigFalseTestSerial6() {
	assertFalse(27451==27451+1);
}
@Test
public void bigFalseTestSerial7() {
	assertFalse(12021==12021+1);
}
@Test
public void bigFalseTestSerial8() {
	assertFalse(31249==31249+1);
}
@Test
public void bigFalseTestSerial9() {
	assertFalse(25058==25058+1);
}
@Test
public void bigFalseTestSerial10() {
	assertFalse(9457==9457+1);
}
@Test
public void bigFalseTestSerial11() {
	assertFalse(10511==10511+1);
}
@Test
public void bigFalseTestSerial12() {
	assertFalse(17488==17488+1);
}
@Test
public void bigFalseTestSerial13() {
	assertFalse(30404==30404+1);
}
@Test
public void bigFalseTestSerial14() {
	assertFalse(5293==5293+1);
}
@Test
public void bigFalseTestSerial15() {
	assertFalse(2722==2722+1);
}
@Test
public void bigFalseTestSerial16() {
	assertFalse(30661==30661+1);
}
@Test
public void bigFalseTestSerial17() {
	assertFalse(17143==17143+1);
}
@Test
public void bigFalseTestSerial18() {
	assertFalse(10138==10138+1);
}
@Test
public void bigFalseTestSerial19() {
	assertFalse(12013==12013+1);
}
@Test
public void bigFalseTestSerial20() {
	assertFalse(1800==1800+1);
}
@Test
public void bigFalseTestSerial21() {
	assertFalse(3814==3814+1);
}
@Test
public void bigFalseTestSerial22() {
	assertFalse(11859==11859+1);
}
@Test
public void bigFalseTestSerial23() {
	assertFalse(19490==19490+1);
}
@Test
public void bigFalseTestSerial24() {
	assertFalse(25340==25340+1);
}
@Test
public void bigFalseTestSerial25() {
	assertFalse(4730==4730+1);
}
@Test
public void bigFalseTestSerial26() {
	assertFalse(2245==2245+1);
}
@Test
public void bigFalseTestSerial27() {
	assertFalse(3812==3812+1);
}
@Test
public void bigFalseTestSerial28() {
	assertFalse(30361==30361+1);
}
@Test
public void bigFalseTestSerial29() {
	assertFalse(21232==21232+1);
}
@Test
public void bigFalseTestSerial30() {
	assertFalse(9442==9442+1);
}
@Test
public void bigFalseTestSerial31() {
	assertFalse(29057==29057+1);
}
@Test
public void bigFalseTestSerial32() {
	assertFalse(4980==4980+1);
}
@Test
public void bigFalseTestSerial33() {
	assertFalse(629==629+1);
}
@Test
public void bigFalseTestSerial34() {
	assertFalse(15371==15371+1);
}
@Test
public void bigFalseTestSerial35() {
	assertFalse(19183==19183+1);
}
@Test
public void bigFalseTestSerial36() {
	assertFalse(6931==6931+1);
}
@Test
public void bigFalseTestSerial37() {
	assertFalse(15751==15751+1);
}
@Test
public void bigFalseTestSerial38() {
	assertFalse(31546==31546+1);
}
@Test
public void bigFalseTestSerial39() {
	assertFalse(20872==20872+1);
}
@Test
public void bigFalseTestSerial40() {
	assertFalse(28915==28915+1);
}
@Test
public void bigFalseTestSerial41() {
	assertFalse(16906==16906+1);
}
@Test
public void bigFalseTestSerial42() {
	assertFalse(499==499+1);
}
@Test
public void bigFalseTestSerial43() {
	assertFalse(3461==3461+1);
}
@Test
public void bigFalseTestSerial44() {
	assertFalse(341==341+1);
}
@Test
public void bigFalseTestSerial45() {
	assertFalse(31788==31788+1);
}
@Test
public void bigFalseTestSerial46() {
	assertFalse(25576==25576+1);
}
@Test
public void bigFalseTestSerial47() {
	assertFalse(30524==30524+1);
}
@Test
public void bigFalseTestSerial48() {
	assertFalse(26829==26829+1);
}
@Test
public void bigFalseTestSerial49() {
	assertFalse(1274==1274+1);
}
@Test
public void bigFalseTestSerial50() {
	assertFalse(6511==6511+1);
}
@Test
public void bigFalseTestSerial51() {
	assertFalse(15641==15641+1);
}
@Test
public void bigFalseTestSerial52() {
	assertFalse(2184==2184+1);
}
@Test
public void bigFalseTestSerial53() {
	assertFalse(28351==28351+1);
}
@Test
public void bigFalseTestSerial54() {
	assertFalse(2724==2724+1);
}
@Test
public void bigFalseTestSerial55() {
	assertFalse(27998==27998+1);
}
}
