package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructSerialProxyAPIHelperTest {
    @Test
    public void testValidStructSerialProxyAPI() {
		StructSerialProxyAPIHelper helper = new StructSerialProxyAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialProxyAPI() {
	StructSerialProxyAPIHelper helper = new StructSerialProxyAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStructSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialProxyAPI0() {
	assertFalse(21571==21571+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI1() {
	assertFalse(29703==29703+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI2() {
	assertFalse(4679==4679+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI3() {
	assertFalse(11697==11697+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI4() {
	assertFalse(27179==27179+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI5() {
	assertFalse(3191==3191+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI6() {
	assertFalse(3107==3107+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI7() {
	assertFalse(32472==32472+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI8() {
	assertFalse(23671==23671+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI9() {
	assertFalse(26446==26446+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI10() {
	assertFalse(25181==25181+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI11() {
	assertFalse(4196==4196+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI12() {
	assertFalse(22845==22845+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI13() {
	assertFalse(7192==7192+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI14() {
	assertFalse(10105==10105+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI15() {
	assertFalse(20402==20402+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI16() {
	assertFalse(12188==12188+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI17() {
	assertFalse(19467==19467+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI18() {
	assertFalse(22649==22649+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI19() {
	assertFalse(28423==28423+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI20() {
	assertFalse(13980==13980+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI21() {
	assertFalse(30124==30124+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI22() {
	assertFalse(25886==25886+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI23() {
	assertFalse(12054==12054+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI24() {
	assertFalse(17858==17858+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI25() {
	assertFalse(22337==22337+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI26() {
	assertFalse(32734==32734+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI27() {
	assertFalse(13651==13651+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI28() {
	assertFalse(7030==7030+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI29() {
	assertFalse(3066==3066+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI30() {
	assertFalse(29092==29092+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI31() {
	assertFalse(31478==31478+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI32() {
	assertFalse(19734==19734+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI33() {
	assertFalse(20446==20446+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI34() {
	assertFalse(27978==27978+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI35() {
	assertFalse(8398==8398+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI36() {
	assertFalse(7382==7382+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI37() {
	assertFalse(5750==5750+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI38() {
	assertFalse(7895==7895+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI39() {
	assertFalse(13258==13258+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI40() {
	assertFalse(20830==20830+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI41() {
	assertFalse(24636==24636+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI42() {
	assertFalse(29304==29304+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI43() {
	assertFalse(11848==11848+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI44() {
	assertFalse(27425==27425+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI45() {
	assertFalse(31426==31426+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI46() {
	assertFalse(20288==20288+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI47() {
	assertFalse(16925==16925+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI48() {
	assertFalse(21374==21374+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI49() {
	assertFalse(6051==6051+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI50() {
	assertFalse(16799==16799+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI51() {
	assertFalse(14177==14177+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI52() {
	assertFalse(24985==24985+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI53() {
	assertFalse(26154==26154+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI54() {
	assertFalse(20900==20900+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI55() {
	assertFalse(27647==27647+1);
}
}
