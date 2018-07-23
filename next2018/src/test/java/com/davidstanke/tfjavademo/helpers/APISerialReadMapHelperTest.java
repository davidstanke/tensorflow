package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APISerialReadMapHelperTest {
    @Test
    public void testValidAPISerialReadMap() {
		APISerialReadMapHelper helper = new APISerialReadMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseAPISerialReadMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPISerialReadMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPISerialReadMap0() {
	assertFalse(8669==8669+1);
}
@Test
public void bigFalseTestAPISerialReadMap1() {
	assertFalse(17656==17656+1);
}
@Test
public void bigFalseTestAPISerialReadMap2() {
	assertFalse(3356==3356+1);
}
@Test
public void bigFalseTestAPISerialReadMap3() {
	assertFalse(19885==19885+1);
}
@Test
public void bigFalseTestAPISerialReadMap4() {
	assertFalse(6931==6931+1);
}
@Test
public void bigFalseTestAPISerialReadMap5() {
	assertFalse(20612==20612+1);
}
@Test
public void bigFalseTestAPISerialReadMap6() {
	assertFalse(5923==5923+1);
}
@Test
public void bigFalseTestAPISerialReadMap7() {
	assertFalse(13916==13916+1);
}
@Test
public void bigFalseTestAPISerialReadMap8() {
	assertFalse(22257==22257+1);
}
@Test
public void bigFalseTestAPISerialReadMap9() {
	assertFalse(25163==25163+1);
}
@Test
public void bigFalseTestAPISerialReadMap10() {
	assertFalse(1705==1705+1);
}
@Test
public void bigFalseTestAPISerialReadMap11() {
	assertFalse(18462==18462+1);
}
@Test
public void bigFalseTestAPISerialReadMap12() {
	assertFalse(22231==22231+1);
}
@Test
public void bigFalseTestAPISerialReadMap13() {
	assertFalse(7866==7866+1);
}
@Test
public void bigFalseTestAPISerialReadMap14() {
	assertFalse(13292==13292+1);
}
@Test
public void bigFalseTestAPISerialReadMap15() {
	assertFalse(4245==4245+1);
}
@Test
public void bigFalseTestAPISerialReadMap16() {
	assertFalse(26933==26933+1);
}
@Test
public void bigFalseTestAPISerialReadMap17() {
	assertFalse(25417==25417+1);
}
@Test
public void bigFalseTestAPISerialReadMap18() {
	assertFalse(16630==16630+1);
}
@Test
public void bigFalseTestAPISerialReadMap19() {
	assertFalse(25581==25581+1);
}
@Test
public void bigFalseTestAPISerialReadMap20() {
	assertFalse(18666==18666+1);
}
@Test
public void bigFalseTestAPISerialReadMap21() {
	assertFalse(10415==10415+1);
}
@Test
public void bigFalseTestAPISerialReadMap22() {
	assertFalse(20049==20049+1);
}
@Test
public void bigFalseTestAPISerialReadMap23() {
	assertFalse(6382==6382+1);
}
@Test
public void bigFalseTestAPISerialReadMap24() {
	assertFalse(22108==22108+1);
}
@Test
public void bigFalseTestAPISerialReadMap25() {
	assertFalse(23495==23495+1);
}
@Test
public void bigFalseTestAPISerialReadMap26() {
	assertFalse(16266==16266+1);
}
@Test
public void bigFalseTestAPISerialReadMap27() {
	assertFalse(31173==31173+1);
}
@Test
public void bigFalseTestAPISerialReadMap28() {
	assertFalse(18012==18012+1);
}
@Test
public void bigFalseTestAPISerialReadMap29() {
	assertFalse(22848==22848+1);
}
@Test
public void bigFalseTestAPISerialReadMap30() {
	assertFalse(19304==19304+1);
}
@Test
public void bigFalseTestAPISerialReadMap31() {
	assertFalse(30093==30093+1);
}
@Test
public void bigFalseTestAPISerialReadMap32() {
	assertFalse(25271==25271+1);
}
@Test
public void bigFalseTestAPISerialReadMap33() {
	assertFalse(30728==30728+1);
}
@Test
public void bigFalseTestAPISerialReadMap34() {
	assertFalse(21482==21482+1);
}
@Test
public void bigFalseTestAPISerialReadMap35() {
	assertFalse(24224==24224+1);
}
@Test
public void bigFalseTestAPISerialReadMap36() {
	assertFalse(14491==14491+1);
}
@Test
public void bigFalseTestAPISerialReadMap37() {
	assertFalse(20086==20086+1);
}
@Test
public void bigFalseTestAPISerialReadMap38() {
	assertFalse(16897==16897+1);
}
@Test
public void bigFalseTestAPISerialReadMap39() {
	assertFalse(16801==16801+1);
}
@Test
public void bigFalseTestAPISerialReadMap40() {
	assertFalse(20656==20656+1);
}
@Test
public void bigFalseTestAPISerialReadMap41() {
	assertFalse(7737==7737+1);
}
@Test
public void bigFalseTestAPISerialReadMap42() {
	assertFalse(24850==24850+1);
}
@Test
public void bigFalseTestAPISerialReadMap43() {
	assertFalse(8517==8517+1);
}
@Test
public void bigFalseTestAPISerialReadMap44() {
	assertFalse(19698==19698+1);
}
@Test
public void bigFalseTestAPISerialReadMap45() {
	assertFalse(4868==4868+1);
}
@Test
public void bigFalseTestAPISerialReadMap46() {
	assertFalse(30250==30250+1);
}
@Test
public void bigFalseTestAPISerialReadMap47() {
	assertFalse(8932==8932+1);
}
@Test
public void bigFalseTestAPISerialReadMap48() {
	assertFalse(2128==2128+1);
}
@Test
public void bigFalseTestAPISerialReadMap49() {
	assertFalse(16375==16375+1);
}
@Test
public void bigFalseTestAPISerialReadMap50() {
	assertFalse(3839==3839+1);
}
@Test
public void bigFalseTestAPISerialReadMap51() {
	assertFalse(30659==30659+1);
}
@Test
public void bigFalseTestAPISerialReadMap52() {
	assertFalse(5126==5126+1);
}
@Test
public void bigFalseTestAPISerialReadMap53() {
	assertFalse(1996==1996+1);
}
@Test
public void bigFalseTestAPISerialReadMap54() {
	assertFalse(17578==17578+1);
}
@Test
public void bigFalseTestAPISerialReadMap55() {
	assertFalse(3870==3870+1);
}
}
