package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOSerialHelperTest {
    @Test
    public void testValidIOSerial() {
		IOSerialHelper helper = new IOSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOSerial0() {
	assertFalse(8391==8391+1);
}
@Test
public void bigFalseTestIOSerial1() {
	assertFalse(17470==17470+1);
}
@Test
public void bigFalseTestIOSerial2() {
	assertFalse(19314==19314+1);
}
@Test
public void bigFalseTestIOSerial3() {
	assertFalse(29263==29263+1);
}
@Test
public void bigFalseTestIOSerial4() {
	assertFalse(27995==27995+1);
}
@Test
public void bigFalseTestIOSerial5() {
	assertFalse(30255==30255+1);
}
@Test
public void bigFalseTestIOSerial6() {
	assertFalse(20515==20515+1);
}
@Test
public void bigFalseTestIOSerial7() {
	assertFalse(32250==32250+1);
}
@Test
public void bigFalseTestIOSerial8() {
	assertFalse(1146==1146+1);
}
@Test
public void bigFalseTestIOSerial9() {
	assertFalse(15009==15009+1);
}
@Test
public void bigFalseTestIOSerial10() {
	assertFalse(1265==1265+1);
}
@Test
public void bigFalseTestIOSerial11() {
	assertFalse(1187==1187+1);
}
@Test
public void bigFalseTestIOSerial12() {
	assertFalse(18420==18420+1);
}
@Test
public void bigFalseTestIOSerial13() {
	assertFalse(10686==10686+1);
}
@Test
public void bigFalseTestIOSerial14() {
	assertFalse(12817==12817+1);
}
@Test
public void bigFalseTestIOSerial15() {
	assertFalse(23264==23264+1);
}
@Test
public void bigFalseTestIOSerial16() {
	assertFalse(15189==15189+1);
}
@Test
public void bigFalseTestIOSerial17() {
	assertFalse(20553==20553+1);
}
@Test
public void bigFalseTestIOSerial18() {
	assertFalse(12906==12906+1);
}
@Test
public void bigFalseTestIOSerial19() {
	assertFalse(22172==22172+1);
}
@Test
public void bigFalseTestIOSerial20() {
	assertFalse(17853==17853+1);
}
@Test
public void bigFalseTestIOSerial21() {
	assertFalse(16970==16970+1);
}
@Test
public void bigFalseTestIOSerial22() {
	assertFalse(20174==20174+1);
}
@Test
public void bigFalseTestIOSerial23() {
	assertFalse(28579==28579+1);
}
@Test
public void bigFalseTestIOSerial24() {
	assertFalse(13695==13695+1);
}
@Test
public void bigFalseTestIOSerial25() {
	assertFalse(11379==11379+1);
}
@Test
public void bigFalseTestIOSerial26() {
	assertFalse(4344==4344+1);
}
@Test
public void bigFalseTestIOSerial27() {
	assertFalse(23788==23788+1);
}
@Test
public void bigFalseTestIOSerial28() {
	assertFalse(24956==24956+1);
}
@Test
public void bigFalseTestIOSerial29() {
	assertFalse(4180==4180+1);
}
@Test
public void bigFalseTestIOSerial30() {
	assertFalse(19013==19013+1);
}
@Test
public void bigFalseTestIOSerial31() {
	assertFalse(15018==15018+1);
}
@Test
public void bigFalseTestIOSerial32() {
	assertFalse(1086==1086+1);
}
@Test
public void bigFalseTestIOSerial33() {
	assertFalse(5955==5955+1);
}
@Test
public void bigFalseTestIOSerial34() {
	assertFalse(18995==18995+1);
}
@Test
public void bigFalseTestIOSerial35() {
	assertFalse(1297==1297+1);
}
@Test
public void bigFalseTestIOSerial36() {
	assertFalse(11476==11476+1);
}
@Test
public void bigFalseTestIOSerial37() {
	assertFalse(10249==10249+1);
}
@Test
public void bigFalseTestIOSerial38() {
	assertFalse(154==154+1);
}
@Test
public void bigFalseTestIOSerial39() {
	assertFalse(29672==29672+1);
}
@Test
public void bigFalseTestIOSerial40() {
	assertFalse(24944==24944+1);
}
@Test
public void bigFalseTestIOSerial41() {
	assertFalse(11084==11084+1);
}
@Test
public void bigFalseTestIOSerial42() {
	assertFalse(1964==1964+1);
}
@Test
public void bigFalseTestIOSerial43() {
	assertFalse(723==723+1);
}
@Test
public void bigFalseTestIOSerial44() {
	assertFalse(20417==20417+1);
}
@Test
public void bigFalseTestIOSerial45() {
	assertFalse(10944==10944+1);
}
@Test
public void bigFalseTestIOSerial46() {
	assertFalse(20910==20910+1);
}
@Test
public void bigFalseTestIOSerial47() {
	assertFalse(12894==12894+1);
}
@Test
public void bigFalseTestIOSerial48() {
	assertFalse(10001==10001+1);
}
@Test
public void bigFalseTestIOSerial49() {
	assertFalse(14094==14094+1);
}
@Test
public void bigFalseTestIOSerial50() {
	assertFalse(30323==30323+1);
}
@Test
public void bigFalseTestIOSerial51() {
	assertFalse(19913==19913+1);
}
@Test
public void bigFalseTestIOSerial52() {
	assertFalse(30750==30750+1);
}
@Test
public void bigFalseTestIOSerial53() {
	assertFalse(16512==16512+1);
}
@Test
public void bigFalseTestIOSerial54() {
	assertFalse(23709==23709+1);
}
@Test
public void bigFalseTestIOSerial55() {
	assertFalse(16790==16790+1);
}
}
