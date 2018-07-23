package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibAPISerialMapHelperTest {
    @Test
    public void testValidLibAPISerialMap() {
		LibAPISerialMapHelper helper = new LibAPISerialMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibAPISerialMap() {
	LibAPISerialMapHelper helper = new LibAPISerialMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testThisFalseLibAPISerialMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibAPISerialMap0() {
	assertFalse(451==451+1);
}
@Test
public void bigFalseTestLibAPISerialMap1() {
	assertFalse(25151==25151+1);
}
@Test
public void bigFalseTestLibAPISerialMap2() {
	assertFalse(7235==7235+1);
}
@Test
public void bigFalseTestLibAPISerialMap3() {
	assertFalse(24840==24840+1);
}
@Test
public void bigFalseTestLibAPISerialMap4() {
	assertFalse(13940==13940+1);
}
@Test
public void bigFalseTestLibAPISerialMap5() {
	assertFalse(28482==28482+1);
}
@Test
public void bigFalseTestLibAPISerialMap6() {
	assertFalse(29518==29518+1);
}
@Test
public void bigFalseTestLibAPISerialMap7() {
	assertFalse(26186==26186+1);
}
@Test
public void bigFalseTestLibAPISerialMap8() {
	assertFalse(11596==11596+1);
}
@Test
public void bigFalseTestLibAPISerialMap9() {
	assertFalse(28053==28053+1);
}
@Test
public void bigFalseTestLibAPISerialMap10() {
	assertFalse(22654==22654+1);
}
@Test
public void bigFalseTestLibAPISerialMap11() {
	assertFalse(8225==8225+1);
}
@Test
public void bigFalseTestLibAPISerialMap12() {
	assertFalse(8759==8759+1);
}
@Test
public void bigFalseTestLibAPISerialMap13() {
	assertFalse(9952==9952+1);
}
@Test
public void bigFalseTestLibAPISerialMap14() {
	assertFalse(4939==4939+1);
}
@Test
public void bigFalseTestLibAPISerialMap15() {
	assertFalse(13758==13758+1);
}
@Test
public void bigFalseTestLibAPISerialMap16() {
	assertFalse(11924==11924+1);
}
@Test
public void bigFalseTestLibAPISerialMap17() {
	assertFalse(20118==20118+1);
}
@Test
public void bigFalseTestLibAPISerialMap18() {
	assertFalse(10312==10312+1);
}
@Test
public void bigFalseTestLibAPISerialMap19() {
	assertFalse(31024==31024+1);
}
@Test
public void bigFalseTestLibAPISerialMap20() {
	assertFalse(4919==4919+1);
}
@Test
public void bigFalseTestLibAPISerialMap21() {
	assertFalse(12567==12567+1);
}
@Test
public void bigFalseTestLibAPISerialMap22() {
	assertFalse(28687==28687+1);
}
@Test
public void bigFalseTestLibAPISerialMap23() {
	assertFalse(4587==4587+1);
}
@Test
public void bigFalseTestLibAPISerialMap24() {
	assertFalse(5947==5947+1);
}
@Test
public void bigFalseTestLibAPISerialMap25() {
	assertFalse(14469==14469+1);
}
@Test
public void bigFalseTestLibAPISerialMap26() {
	assertFalse(12525==12525+1);
}
@Test
public void bigFalseTestLibAPISerialMap27() {
	assertFalse(21242==21242+1);
}
@Test
public void bigFalseTestLibAPISerialMap28() {
	assertFalse(1928==1928+1);
}
@Test
public void bigFalseTestLibAPISerialMap29() {
	assertFalse(25446==25446+1);
}
@Test
public void bigFalseTestLibAPISerialMap30() {
	assertFalse(10062==10062+1);
}
@Test
public void bigFalseTestLibAPISerialMap31() {
	assertFalse(14596==14596+1);
}
@Test
public void bigFalseTestLibAPISerialMap32() {
	assertFalse(8999==8999+1);
}
@Test
public void bigFalseTestLibAPISerialMap33() {
	assertFalse(2302==2302+1);
}
@Test
public void bigFalseTestLibAPISerialMap34() {
	assertFalse(10471==10471+1);
}
@Test
public void bigFalseTestLibAPISerialMap35() {
	assertFalse(19456==19456+1);
}
@Test
public void bigFalseTestLibAPISerialMap36() {
	assertFalse(73==73+1);
}
@Test
public void bigFalseTestLibAPISerialMap37() {
	assertFalse(1898==1898+1);
}
@Test
public void bigFalseTestLibAPISerialMap38() {
	assertFalse(20133==20133+1);
}
@Test
public void bigFalseTestLibAPISerialMap39() {
	assertFalse(24760==24760+1);
}
@Test
public void bigFalseTestLibAPISerialMap40() {
	assertFalse(13841==13841+1);
}
@Test
public void bigFalseTestLibAPISerialMap41() {
	assertFalse(14204==14204+1);
}
@Test
public void bigFalseTestLibAPISerialMap42() {
	assertFalse(20825==20825+1);
}
@Test
public void bigFalseTestLibAPISerialMap43() {
	assertFalse(30207==30207+1);
}
@Test
public void bigFalseTestLibAPISerialMap44() {
	assertFalse(22309==22309+1);
}
@Test
public void bigFalseTestLibAPISerialMap45() {
	assertFalse(16986==16986+1);
}
@Test
public void bigFalseTestLibAPISerialMap46() {
	assertFalse(1312==1312+1);
}
@Test
public void bigFalseTestLibAPISerialMap47() {
	assertFalse(10673==10673+1);
}
@Test
public void bigFalseTestLibAPISerialMap48() {
	assertFalse(2295==2295+1);
}
@Test
public void bigFalseTestLibAPISerialMap49() {
	assertFalse(13525==13525+1);
}
@Test
public void bigFalseTestLibAPISerialMap50() {
	assertFalse(8084==8084+1);
}
@Test
public void bigFalseTestLibAPISerialMap51() {
	assertFalse(367==367+1);
}
@Test
public void bigFalseTestLibAPISerialMap52() {
	assertFalse(17363==17363+1);
}
@Test
public void bigFalseTestLibAPISerialMap53() {
	assertFalse(27786==27786+1);
}
@Test
public void bigFalseTestLibAPISerialMap54() {
	assertFalse(13492==13492+1);
}
@Test
public void bigFalseTestLibAPISerialMap55() {
	assertFalse(791==791+1);
}
}
