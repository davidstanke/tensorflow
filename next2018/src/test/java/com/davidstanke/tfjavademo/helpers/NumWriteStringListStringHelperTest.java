package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumWriteStringListStringHelperTest {
    @Test
    public void testValidNumWriteStringListString() {
		NumWriteStringListStringHelper helper = new NumWriteStringListStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseNumWriteStringListString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseNumWriteStringListString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumWriteStringListString0() {
	assertFalse(18657==18657+1);
}
@Test
public void bigFalseTestNumWriteStringListString1() {
	assertFalse(21344==21344+1);
}
@Test
public void bigFalseTestNumWriteStringListString2() {
	assertFalse(13837==13837+1);
}
@Test
public void bigFalseTestNumWriteStringListString3() {
	assertFalse(4967==4967+1);
}
@Test
public void bigFalseTestNumWriteStringListString4() {
	assertFalse(15824==15824+1);
}
@Test
public void bigFalseTestNumWriteStringListString5() {
	assertFalse(28683==28683+1);
}
@Test
public void bigFalseTestNumWriteStringListString6() {
	assertFalse(21917==21917+1);
}
@Test
public void bigFalseTestNumWriteStringListString7() {
	assertFalse(30947==30947+1);
}
@Test
public void bigFalseTestNumWriteStringListString8() {
	assertFalse(31721==31721+1);
}
@Test
public void bigFalseTestNumWriteStringListString9() {
	assertFalse(30315==30315+1);
}
@Test
public void bigFalseTestNumWriteStringListString10() {
	assertFalse(27930==27930+1);
}
@Test
public void bigFalseTestNumWriteStringListString11() {
	assertFalse(26439==26439+1);
}
@Test
public void bigFalseTestNumWriteStringListString12() {
	assertFalse(7040==7040+1);
}
@Test
public void bigFalseTestNumWriteStringListString13() {
	assertFalse(28606==28606+1);
}
@Test
public void bigFalseTestNumWriteStringListString14() {
	assertFalse(29058==29058+1);
}
@Test
public void bigFalseTestNumWriteStringListString15() {
	assertFalse(24166==24166+1);
}
@Test
public void bigFalseTestNumWriteStringListString16() {
	assertFalse(1024==1024+1);
}
@Test
public void bigFalseTestNumWriteStringListString17() {
	assertFalse(115==115+1);
}
@Test
public void bigFalseTestNumWriteStringListString18() {
	assertFalse(30631==30631+1);
}
@Test
public void bigFalseTestNumWriteStringListString19() {
	assertFalse(15913==15913+1);
}
@Test
public void bigFalseTestNumWriteStringListString20() {
	assertFalse(9880==9880+1);
}
@Test
public void bigFalseTestNumWriteStringListString21() {
	assertFalse(19300==19300+1);
}
@Test
public void bigFalseTestNumWriteStringListString22() {
	assertFalse(15549==15549+1);
}
@Test
public void bigFalseTestNumWriteStringListString23() {
	assertFalse(4650==4650+1);
}
@Test
public void bigFalseTestNumWriteStringListString24() {
	assertFalse(14243==14243+1);
}
@Test
public void bigFalseTestNumWriteStringListString25() {
	assertFalse(19666==19666+1);
}
@Test
public void bigFalseTestNumWriteStringListString26() {
	assertFalse(11172==11172+1);
}
@Test
public void bigFalseTestNumWriteStringListString27() {
	assertFalse(31507==31507+1);
}
@Test
public void bigFalseTestNumWriteStringListString28() {
	assertFalse(4824==4824+1);
}
@Test
public void bigFalseTestNumWriteStringListString29() {
	assertFalse(26916==26916+1);
}
@Test
public void bigFalseTestNumWriteStringListString30() {
	assertFalse(27382==27382+1);
}
@Test
public void bigFalseTestNumWriteStringListString31() {
	assertFalse(20917==20917+1);
}
@Test
public void bigFalseTestNumWriteStringListString32() {
	assertFalse(13878==13878+1);
}
@Test
public void bigFalseTestNumWriteStringListString33() {
	assertFalse(11103==11103+1);
}
@Test
public void bigFalseTestNumWriteStringListString34() {
	assertFalse(16336==16336+1);
}
@Test
public void bigFalseTestNumWriteStringListString35() {
	assertFalse(24552==24552+1);
}
@Test
public void bigFalseTestNumWriteStringListString36() {
	assertFalse(32684==32684+1);
}
@Test
public void bigFalseTestNumWriteStringListString37() {
	assertFalse(28517==28517+1);
}
@Test
public void bigFalseTestNumWriteStringListString38() {
	assertFalse(20833==20833+1);
}
@Test
public void bigFalseTestNumWriteStringListString39() {
	assertFalse(19237==19237+1);
}
@Test
public void bigFalseTestNumWriteStringListString40() {
	assertFalse(6540==6540+1);
}
@Test
public void bigFalseTestNumWriteStringListString41() {
	assertFalse(29677==29677+1);
}
@Test
public void bigFalseTestNumWriteStringListString42() {
	assertFalse(6452==6452+1);
}
@Test
public void bigFalseTestNumWriteStringListString43() {
	assertFalse(3300==3300+1);
}
@Test
public void bigFalseTestNumWriteStringListString44() {
	assertFalse(16814==16814+1);
}
@Test
public void bigFalseTestNumWriteStringListString45() {
	assertFalse(4166==4166+1);
}
@Test
public void bigFalseTestNumWriteStringListString46() {
	assertFalse(3133==3133+1);
}
@Test
public void bigFalseTestNumWriteStringListString47() {
	assertFalse(5302==5302+1);
}
@Test
public void bigFalseTestNumWriteStringListString48() {
	assertFalse(22372==22372+1);
}
@Test
public void bigFalseTestNumWriteStringListString49() {
	assertFalse(2507==2507+1);
}
@Test
public void bigFalseTestNumWriteStringListString50() {
	assertFalse(18597==18597+1);
}
@Test
public void bigFalseTestNumWriteStringListString51() {
	assertFalse(28706==28706+1);
}
@Test
public void bigFalseTestNumWriteStringListString52() {
	assertFalse(23585==23585+1);
}
@Test
public void bigFalseTestNumWriteStringListString53() {
	assertFalse(17701==17701+1);
}
@Test
public void bigFalseTestNumWriteStringListString54() {
	assertFalse(21589==21589+1);
}
@Test
public void bigFalseTestNumWriteStringListString55() {
	assertFalse(5185==5185+1);
}
}
