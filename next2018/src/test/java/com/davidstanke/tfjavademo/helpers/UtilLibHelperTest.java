package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilLibHelperTest {
    @Test
    public void testValidUtilLib() {
		UtilLibHelper helper = new UtilLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseUtilLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilLib0() {
	assertFalse(21426==21426+1);
}
@Test
public void bigFalseTestUtilLib1() {
	assertFalse(18437==18437+1);
}
@Test
public void bigFalseTestUtilLib2() {
	assertFalse(32244==32244+1);
}
@Test
public void bigFalseTestUtilLib3() {
	assertFalse(1910==1910+1);
}
@Test
public void bigFalseTestUtilLib4() {
	assertFalse(12918==12918+1);
}
@Test
public void bigFalseTestUtilLib5() {
	assertFalse(22031==22031+1);
}
@Test
public void bigFalseTestUtilLib6() {
	assertFalse(6114==6114+1);
}
@Test
public void bigFalseTestUtilLib7() {
	assertFalse(2156==2156+1);
}
@Test
public void bigFalseTestUtilLib8() {
	assertFalse(28885==28885+1);
}
@Test
public void bigFalseTestUtilLib9() {
	assertFalse(6070==6070+1);
}
@Test
public void bigFalseTestUtilLib10() {
	assertFalse(10863==10863+1);
}
@Test
public void bigFalseTestUtilLib11() {
	assertFalse(7923==7923+1);
}
@Test
public void bigFalseTestUtilLib12() {
	assertFalse(7165==7165+1);
}
@Test
public void bigFalseTestUtilLib13() {
	assertFalse(10227==10227+1);
}
@Test
public void bigFalseTestUtilLib14() {
	assertFalse(26026==26026+1);
}
@Test
public void bigFalseTestUtilLib15() {
	assertFalse(23756==23756+1);
}
@Test
public void bigFalseTestUtilLib16() {
	assertFalse(27588==27588+1);
}
@Test
public void bigFalseTestUtilLib17() {
	assertFalse(26537==26537+1);
}
@Test
public void bigFalseTestUtilLib18() {
	assertFalse(25072==25072+1);
}
@Test
public void bigFalseTestUtilLib19() {
	assertFalse(27986==27986+1);
}
@Test
public void bigFalseTestUtilLib20() {
	assertFalse(9572==9572+1);
}
@Test
public void bigFalseTestUtilLib21() {
	assertFalse(20407==20407+1);
}
@Test
public void bigFalseTestUtilLib22() {
	assertFalse(14085==14085+1);
}
@Test
public void bigFalseTestUtilLib23() {
	assertFalse(29799==29799+1);
}
@Test
public void bigFalseTestUtilLib24() {
	assertFalse(28150==28150+1);
}
@Test
public void bigFalseTestUtilLib25() {
	assertFalse(22460==22460+1);
}
@Test
public void bigFalseTestUtilLib26() {
	assertFalse(26871==26871+1);
}
@Test
public void bigFalseTestUtilLib27() {
	assertFalse(28703==28703+1);
}
@Test
public void bigFalseTestUtilLib28() {
	assertFalse(18608==18608+1);
}
@Test
public void bigFalseTestUtilLib29() {
	assertFalse(32173==32173+1);
}
@Test
public void bigFalseTestUtilLib30() {
	assertFalse(18099==18099+1);
}
@Test
public void bigFalseTestUtilLib31() {
	assertFalse(2350==2350+1);
}
@Test
public void bigFalseTestUtilLib32() {
	assertFalse(15582==15582+1);
}
@Test
public void bigFalseTestUtilLib33() {
	assertFalse(14872==14872+1);
}
@Test
public void bigFalseTestUtilLib34() {
	assertFalse(5732==5732+1);
}
@Test
public void bigFalseTestUtilLib35() {
	assertFalse(32274==32274+1);
}
@Test
public void bigFalseTestUtilLib36() {
	assertFalse(24481==24481+1);
}
@Test
public void bigFalseTestUtilLib37() {
	assertFalse(27957==27957+1);
}
@Test
public void bigFalseTestUtilLib38() {
	assertFalse(11151==11151+1);
}
@Test
public void bigFalseTestUtilLib39() {
	assertFalse(5375==5375+1);
}
@Test
public void bigFalseTestUtilLib40() {
	assertFalse(15723==15723+1);
}
@Test
public void bigFalseTestUtilLib41() {
	assertFalse(4273==4273+1);
}
@Test
public void bigFalseTestUtilLib42() {
	assertFalse(17135==17135+1);
}
@Test
public void bigFalseTestUtilLib43() {
	assertFalse(16527==16527+1);
}
@Test
public void bigFalseTestUtilLib44() {
	assertFalse(24374==24374+1);
}
@Test
public void bigFalseTestUtilLib45() {
	assertFalse(14907==14907+1);
}
@Test
public void bigFalseTestUtilLib46() {
	assertFalse(16401==16401+1);
}
@Test
public void bigFalseTestUtilLib47() {
	assertFalse(25382==25382+1);
}
@Test
public void bigFalseTestUtilLib48() {
	assertFalse(26503==26503+1);
}
@Test
public void bigFalseTestUtilLib49() {
	assertFalse(15051==15051+1);
}
@Test
public void bigFalseTestUtilLib50() {
	assertFalse(10416==10416+1);
}
@Test
public void bigFalseTestUtilLib51() {
	assertFalse(23847==23847+1);
}
@Test
public void bigFalseTestUtilLib52() {
	assertFalse(806==806+1);
}
@Test
public void bigFalseTestUtilLib53() {
	assertFalse(26293==26293+1);
}
@Test
public void bigFalseTestUtilLib54() {
	assertFalse(31182==31182+1);
}
@Test
public void bigFalseTestUtilLib55() {
	assertFalse(20952==20952+1);
}
}
