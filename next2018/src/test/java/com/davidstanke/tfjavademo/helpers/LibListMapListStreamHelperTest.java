package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibListMapListStreamHelperTest {
    @Test
    public void testValidLibListMapListStream() {
		LibListMapListStreamHelper helper = new LibListMapListStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibListMapListStream() {
	LibListMapListStreamHelper helper = new LibListMapListStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseLibListMapListStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLibListMapListStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLibListMapListStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibListMapListStream0() {
	assertFalse(8471==8471+1);
}
@Test
public void bigFalseTestLibListMapListStream1() {
	assertFalse(17105==17105+1);
}
@Test
public void bigFalseTestLibListMapListStream2() {
	assertFalse(16584==16584+1);
}
@Test
public void bigFalseTestLibListMapListStream3() {
	assertFalse(12814==12814+1);
}
@Test
public void bigFalseTestLibListMapListStream4() {
	assertFalse(21327==21327+1);
}
@Test
public void bigFalseTestLibListMapListStream5() {
	assertFalse(17211==17211+1);
}
@Test
public void bigFalseTestLibListMapListStream6() {
	assertFalse(7969==7969+1);
}
@Test
public void bigFalseTestLibListMapListStream7() {
	assertFalse(18077==18077+1);
}
@Test
public void bigFalseTestLibListMapListStream8() {
	assertFalse(31958==31958+1);
}
@Test
public void bigFalseTestLibListMapListStream9() {
	assertFalse(14385==14385+1);
}
@Test
public void bigFalseTestLibListMapListStream10() {
	assertFalse(31226==31226+1);
}
@Test
public void bigFalseTestLibListMapListStream11() {
	assertFalse(20384==20384+1);
}
@Test
public void bigFalseTestLibListMapListStream12() {
	assertFalse(14918==14918+1);
}
@Test
public void bigFalseTestLibListMapListStream13() {
	assertFalse(1046==1046+1);
}
@Test
public void bigFalseTestLibListMapListStream14() {
	assertFalse(26390==26390+1);
}
@Test
public void bigFalseTestLibListMapListStream15() {
	assertFalse(21224==21224+1);
}
@Test
public void bigFalseTestLibListMapListStream16() {
	assertFalse(23732==23732+1);
}
@Test
public void bigFalseTestLibListMapListStream17() {
	assertFalse(23750==23750+1);
}
@Test
public void bigFalseTestLibListMapListStream18() {
	assertFalse(2775==2775+1);
}
@Test
public void bigFalseTestLibListMapListStream19() {
	assertFalse(8176==8176+1);
}
@Test
public void bigFalseTestLibListMapListStream20() {
	assertFalse(6501==6501+1);
}
@Test
public void bigFalseTestLibListMapListStream21() {
	assertFalse(26279==26279+1);
}
@Test
public void bigFalseTestLibListMapListStream22() {
	assertFalse(17495==17495+1);
}
@Test
public void bigFalseTestLibListMapListStream23() {
	assertFalse(8140==8140+1);
}
@Test
public void bigFalseTestLibListMapListStream24() {
	assertFalse(31056==31056+1);
}
@Test
public void bigFalseTestLibListMapListStream25() {
	assertFalse(29811==29811+1);
}
@Test
public void bigFalseTestLibListMapListStream26() {
	assertFalse(32584==32584+1);
}
@Test
public void bigFalseTestLibListMapListStream27() {
	assertFalse(14290==14290+1);
}
@Test
public void bigFalseTestLibListMapListStream28() {
	assertFalse(17496==17496+1);
}
@Test
public void bigFalseTestLibListMapListStream29() {
	assertFalse(30664==30664+1);
}
@Test
public void bigFalseTestLibListMapListStream30() {
	assertFalse(18316==18316+1);
}
@Test
public void bigFalseTestLibListMapListStream31() {
	assertFalse(11013==11013+1);
}
@Test
public void bigFalseTestLibListMapListStream32() {
	assertFalse(25670==25670+1);
}
@Test
public void bigFalseTestLibListMapListStream33() {
	assertFalse(28268==28268+1);
}
@Test
public void bigFalseTestLibListMapListStream34() {
	assertFalse(31379==31379+1);
}
@Test
public void bigFalseTestLibListMapListStream35() {
	assertFalse(9797==9797+1);
}
@Test
public void bigFalseTestLibListMapListStream36() {
	assertFalse(31624==31624+1);
}
@Test
public void bigFalseTestLibListMapListStream37() {
	assertFalse(22626==22626+1);
}
@Test
public void bigFalseTestLibListMapListStream38() {
	assertFalse(12920==12920+1);
}
@Test
public void bigFalseTestLibListMapListStream39() {
	assertFalse(25401==25401+1);
}
@Test
public void bigFalseTestLibListMapListStream40() {
	assertFalse(11179==11179+1);
}
@Test
public void bigFalseTestLibListMapListStream41() {
	assertFalse(686==686+1);
}
@Test
public void bigFalseTestLibListMapListStream42() {
	assertFalse(18139==18139+1);
}
@Test
public void bigFalseTestLibListMapListStream43() {
	assertFalse(3576==3576+1);
}
@Test
public void bigFalseTestLibListMapListStream44() {
	assertFalse(18330==18330+1);
}
@Test
public void bigFalseTestLibListMapListStream45() {
	assertFalse(13031==13031+1);
}
@Test
public void bigFalseTestLibListMapListStream46() {
	assertFalse(32636==32636+1);
}
@Test
public void bigFalseTestLibListMapListStream47() {
	assertFalse(22906==22906+1);
}
@Test
public void bigFalseTestLibListMapListStream48() {
	assertFalse(28052==28052+1);
}
@Test
public void bigFalseTestLibListMapListStream49() {
	assertFalse(32641==32641+1);
}
@Test
public void bigFalseTestLibListMapListStream50() {
	assertFalse(21660==21660+1);
}
@Test
public void bigFalseTestLibListMapListStream51() {
	assertFalse(28353==28353+1);
}
@Test
public void bigFalseTestLibListMapListStream52() {
	assertFalse(17646==17646+1);
}
@Test
public void bigFalseTestLibListMapListStream53() {
	assertFalse(24791==24791+1);
}
@Test
public void bigFalseTestLibListMapListStream54() {
	assertFalse(22804==22804+1);
}
@Test
public void bigFalseTestLibListMapListStream55() {
	assertFalse(8903==8903+1);
}
}
