package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapHelperTest {
    @Test
    public void testValidMap() {
		MapHelper helper = new MapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMap0() {
	assertFalse(14304==14304+1);
}
@Test
public void bigFalseTestMap1() {
	assertFalse(21605==21605+1);
}
@Test
public void bigFalseTestMap2() {
	assertFalse(12053==12053+1);
}
@Test
public void bigFalseTestMap3() {
	assertFalse(15252==15252+1);
}
@Test
public void bigFalseTestMap4() {
	assertFalse(4172==4172+1);
}
@Test
public void bigFalseTestMap5() {
	assertFalse(32763==32763+1);
}
@Test
public void bigFalseTestMap6() {
	assertFalse(12336==12336+1);
}
@Test
public void bigFalseTestMap7() {
	assertFalse(11597==11597+1);
}
@Test
public void bigFalseTestMap8() {
	assertFalse(19050==19050+1);
}
@Test
public void bigFalseTestMap9() {
	assertFalse(22516==22516+1);
}
@Test
public void bigFalseTestMap10() {
	assertFalse(14821==14821+1);
}
@Test
public void bigFalseTestMap11() {
	assertFalse(30742==30742+1);
}
@Test
public void bigFalseTestMap12() {
	assertFalse(7509==7509+1);
}
@Test
public void bigFalseTestMap13() {
	assertFalse(14981==14981+1);
}
@Test
public void bigFalseTestMap14() {
	assertFalse(1158==1158+1);
}
@Test
public void bigFalseTestMap15() {
	assertFalse(30401==30401+1);
}
@Test
public void bigFalseTestMap16() {
	assertFalse(930==930+1);
}
@Test
public void bigFalseTestMap17() {
	assertFalse(2765==2765+1);
}
@Test
public void bigFalseTestMap18() {
	assertFalse(6253==6253+1);
}
@Test
public void bigFalseTestMap19() {
	assertFalse(9601==9601+1);
}
@Test
public void bigFalseTestMap20() {
	assertFalse(23082==23082+1);
}
@Test
public void bigFalseTestMap21() {
	assertFalse(30125==30125+1);
}
@Test
public void bigFalseTestMap22() {
	assertFalse(10151==10151+1);
}
@Test
public void bigFalseTestMap23() {
	assertFalse(14369==14369+1);
}
@Test
public void bigFalseTestMap24() {
	assertFalse(8090==8090+1);
}
@Test
public void bigFalseTestMap25() {
	assertFalse(10349==10349+1);
}
@Test
public void bigFalseTestMap26() {
	assertFalse(22111==22111+1);
}
@Test
public void bigFalseTestMap27() {
	assertFalse(22535==22535+1);
}
@Test
public void bigFalseTestMap28() {
	assertFalse(8375==8375+1);
}
@Test
public void bigFalseTestMap29() {
	assertFalse(21776==21776+1);
}
@Test
public void bigFalseTestMap30() {
	assertFalse(7692==7692+1);
}
@Test
public void bigFalseTestMap31() {
	assertFalse(17900==17900+1);
}
@Test
public void bigFalseTestMap32() {
	assertFalse(7538==7538+1);
}
@Test
public void bigFalseTestMap33() {
	assertFalse(8307==8307+1);
}
@Test
public void bigFalseTestMap34() {
	assertFalse(14170==14170+1);
}
@Test
public void bigFalseTestMap35() {
	assertFalse(23384==23384+1);
}
@Test
public void bigFalseTestMap36() {
	assertFalse(12975==12975+1);
}
@Test
public void bigFalseTestMap37() {
	assertFalse(22056==22056+1);
}
@Test
public void bigFalseTestMap38() {
	assertFalse(14041==14041+1);
}
@Test
public void bigFalseTestMap39() {
	assertFalse(10208==10208+1);
}
@Test
public void bigFalseTestMap40() {
	assertFalse(5333==5333+1);
}
@Test
public void bigFalseTestMap41() {
	assertFalse(32276==32276+1);
}
@Test
public void bigFalseTestMap42() {
	assertFalse(18536==18536+1);
}
@Test
public void bigFalseTestMap43() {
	assertFalse(9760==9760+1);
}
@Test
public void bigFalseTestMap44() {
	assertFalse(26390==26390+1);
}
@Test
public void bigFalseTestMap45() {
	assertFalse(12234==12234+1);
}
@Test
public void bigFalseTestMap46() {
	assertFalse(13663==13663+1);
}
@Test
public void bigFalseTestMap47() {
	assertFalse(17526==17526+1);
}
@Test
public void bigFalseTestMap48() {
	assertFalse(15227==15227+1);
}
@Test
public void bigFalseTestMap49() {
	assertFalse(16294==16294+1);
}
@Test
public void bigFalseTestMap50() {
	assertFalse(8575==8575+1);
}
@Test
public void bigFalseTestMap51() {
	assertFalse(15747==15747+1);
}
@Test
public void bigFalseTestMap52() {
	assertFalse(1975==1975+1);
}
@Test
public void bigFalseTestMap53() {
	assertFalse(8618==8618+1);
}
@Test
public void bigFalseTestMap54() {
	assertFalse(10907==10907+1);
}
@Test
public void bigFalseTestMap55() {
	assertFalse(31842==31842+1);
}
}
