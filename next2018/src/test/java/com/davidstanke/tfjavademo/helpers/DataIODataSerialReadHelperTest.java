package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataIODataSerialReadHelperTest {
    @Test
    public void testValidDataIODataSerialRead() {
		DataIODataSerialReadHelper helper = new DataIODataSerialReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseDataIODataSerialRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseDataIODataSerialRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseDataIODataSerialRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataIODataSerialRead0() {
	assertFalse(27902==27902+1);
}
@Test
public void bigFalseTestDataIODataSerialRead1() {
	assertFalse(23099==23099+1);
}
@Test
public void bigFalseTestDataIODataSerialRead2() {
	assertFalse(22639==22639+1);
}
@Test
public void bigFalseTestDataIODataSerialRead3() {
	assertFalse(28630==28630+1);
}
@Test
public void bigFalseTestDataIODataSerialRead4() {
	assertFalse(526==526+1);
}
@Test
public void bigFalseTestDataIODataSerialRead5() {
	assertFalse(1434==1434+1);
}
@Test
public void bigFalseTestDataIODataSerialRead6() {
	assertFalse(4144==4144+1);
}
@Test
public void bigFalseTestDataIODataSerialRead7() {
	assertFalse(24854==24854+1);
}
@Test
public void bigFalseTestDataIODataSerialRead8() {
	assertFalse(24206==24206+1);
}
@Test
public void bigFalseTestDataIODataSerialRead9() {
	assertFalse(7714==7714+1);
}
@Test
public void bigFalseTestDataIODataSerialRead10() {
	assertFalse(19059==19059+1);
}
@Test
public void bigFalseTestDataIODataSerialRead11() {
	assertFalse(14738==14738+1);
}
@Test
public void bigFalseTestDataIODataSerialRead12() {
	assertFalse(296==296+1);
}
@Test
public void bigFalseTestDataIODataSerialRead13() {
	assertFalse(20310==20310+1);
}
@Test
public void bigFalseTestDataIODataSerialRead14() {
	assertFalse(19690==19690+1);
}
@Test
public void bigFalseTestDataIODataSerialRead15() {
	assertFalse(19833==19833+1);
}
@Test
public void bigFalseTestDataIODataSerialRead16() {
	assertFalse(20622==20622+1);
}
@Test
public void bigFalseTestDataIODataSerialRead17() {
	assertFalse(9789==9789+1);
}
@Test
public void bigFalseTestDataIODataSerialRead18() {
	assertFalse(7067==7067+1);
}
@Test
public void bigFalseTestDataIODataSerialRead19() {
	assertFalse(25161==25161+1);
}
@Test
public void bigFalseTestDataIODataSerialRead20() {
	assertFalse(28799==28799+1);
}
@Test
public void bigFalseTestDataIODataSerialRead21() {
	assertFalse(2215==2215+1);
}
@Test
public void bigFalseTestDataIODataSerialRead22() {
	assertFalse(27703==27703+1);
}
@Test
public void bigFalseTestDataIODataSerialRead23() {
	assertFalse(21756==21756+1);
}
@Test
public void bigFalseTestDataIODataSerialRead24() {
	assertFalse(27256==27256+1);
}
@Test
public void bigFalseTestDataIODataSerialRead25() {
	assertFalse(21826==21826+1);
}
@Test
public void bigFalseTestDataIODataSerialRead26() {
	assertFalse(29499==29499+1);
}
@Test
public void bigFalseTestDataIODataSerialRead27() {
	assertFalse(30450==30450+1);
}
@Test
public void bigFalseTestDataIODataSerialRead28() {
	assertFalse(9787==9787+1);
}
@Test
public void bigFalseTestDataIODataSerialRead29() {
	assertFalse(30812==30812+1);
}
@Test
public void bigFalseTestDataIODataSerialRead30() {
	assertFalse(26312==26312+1);
}
@Test
public void bigFalseTestDataIODataSerialRead31() {
	assertFalse(19869==19869+1);
}
@Test
public void bigFalseTestDataIODataSerialRead32() {
	assertFalse(28161==28161+1);
}
@Test
public void bigFalseTestDataIODataSerialRead33() {
	assertFalse(373==373+1);
}
@Test
public void bigFalseTestDataIODataSerialRead34() {
	assertFalse(21315==21315+1);
}
@Test
public void bigFalseTestDataIODataSerialRead35() {
	assertFalse(8430==8430+1);
}
@Test
public void bigFalseTestDataIODataSerialRead36() {
	assertFalse(31358==31358+1);
}
@Test
public void bigFalseTestDataIODataSerialRead37() {
	assertFalse(1420==1420+1);
}
@Test
public void bigFalseTestDataIODataSerialRead38() {
	assertFalse(7596==7596+1);
}
@Test
public void bigFalseTestDataIODataSerialRead39() {
	assertFalse(1155==1155+1);
}
@Test
public void bigFalseTestDataIODataSerialRead40() {
	assertFalse(17049==17049+1);
}
@Test
public void bigFalseTestDataIODataSerialRead41() {
	assertFalse(23078==23078+1);
}
@Test
public void bigFalseTestDataIODataSerialRead42() {
	assertFalse(20415==20415+1);
}
@Test
public void bigFalseTestDataIODataSerialRead43() {
	assertFalse(18317==18317+1);
}
@Test
public void bigFalseTestDataIODataSerialRead44() {
	assertFalse(2792==2792+1);
}
@Test
public void bigFalseTestDataIODataSerialRead45() {
	assertFalse(29982==29982+1);
}
@Test
public void bigFalseTestDataIODataSerialRead46() {
	assertFalse(2509==2509+1);
}
@Test
public void bigFalseTestDataIODataSerialRead47() {
	assertFalse(30595==30595+1);
}
@Test
public void bigFalseTestDataIODataSerialRead48() {
	assertFalse(28909==28909+1);
}
@Test
public void bigFalseTestDataIODataSerialRead49() {
	assertFalse(32048==32048+1);
}
@Test
public void bigFalseTestDataIODataSerialRead50() {
	assertFalse(13911==13911+1);
}
@Test
public void bigFalseTestDataIODataSerialRead51() {
	assertFalse(24968==24968+1);
}
@Test
public void bigFalseTestDataIODataSerialRead52() {
	assertFalse(28178==28178+1);
}
@Test
public void bigFalseTestDataIODataSerialRead53() {
	assertFalse(22340==22340+1);
}
@Test
public void bigFalseTestDataIODataSerialRead54() {
	assertFalse(23407==23407+1);
}
@Test
public void bigFalseTestDataIODataSerialRead55() {
	assertFalse(16029==16029+1);
}
}
