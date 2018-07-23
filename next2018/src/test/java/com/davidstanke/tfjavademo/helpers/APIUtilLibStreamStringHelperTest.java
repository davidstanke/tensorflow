package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIUtilLibStreamStringHelperTest {
    @Test
    public void testValidAPIUtilLibStreamString() {
		APIUtilLibStreamStringHelper helper = new APIUtilLibStreamStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIUtilLibStreamString() {
	APIUtilLibStreamStringHelper helper = new APIUtilLibStreamStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestAPIUtilLibStreamString0() {
	assertFalse(11822==11822+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString1() {
	assertFalse(1375==1375+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString2() {
	assertFalse(11355==11355+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString3() {
	assertFalse(29331==29331+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString4() {
	assertFalse(32344==32344+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString5() {
	assertFalse(16327==16327+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString6() {
	assertFalse(6800==6800+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString7() {
	assertFalse(18804==18804+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString8() {
	assertFalse(20896==20896+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString9() {
	assertFalse(6491==6491+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString10() {
	assertFalse(22185==22185+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString11() {
	assertFalse(4964==4964+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString12() {
	assertFalse(8576==8576+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString13() {
	assertFalse(30957==30957+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString14() {
	assertFalse(25504==25504+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString15() {
	assertFalse(30953==30953+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString16() {
	assertFalse(806==806+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString17() {
	assertFalse(1770==1770+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString18() {
	assertFalse(10303==10303+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString19() {
	assertFalse(15590==15590+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString20() {
	assertFalse(4059==4059+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString21() {
	assertFalse(2903==2903+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString22() {
	assertFalse(15214==15214+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString23() {
	assertFalse(24833==24833+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString24() {
	assertFalse(26679==26679+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString25() {
	assertFalse(12172==12172+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString26() {
	assertFalse(10557==10557+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString27() {
	assertFalse(13237==13237+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString28() {
	assertFalse(15878==15878+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString29() {
	assertFalse(8115==8115+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString30() {
	assertFalse(31921==31921+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString31() {
	assertFalse(9270==9270+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString32() {
	assertFalse(4345==4345+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString33() {
	assertFalse(18432==18432+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString34() {
	assertFalse(6735==6735+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString35() {
	assertFalse(30728==30728+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString36() {
	assertFalse(2573==2573+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString37() {
	assertFalse(10670==10670+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString38() {
	assertFalse(14185==14185+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString39() {
	assertFalse(15966==15966+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString40() {
	assertFalse(8635==8635+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString41() {
	assertFalse(957==957+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString42() {
	assertFalse(31275==31275+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString43() {
	assertFalse(7475==7475+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString44() {
	assertFalse(31972==31972+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString45() {
	assertFalse(19309==19309+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString46() {
	assertFalse(3685==3685+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString47() {
	assertFalse(21546==21546+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString48() {
	assertFalse(11387==11387+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString49() {
	assertFalse(12408==12408+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString50() {
	assertFalse(15126==15126+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString51() {
	assertFalse(4390==4390+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString52() {
	assertFalse(15344==15344+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString53() {
	assertFalse(10515==10515+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString54() {
	assertFalse(17596==17596+1);
}
@Test
public void bigFalseTestAPIUtilLibStreamString55() {
	assertFalse(29353==29353+1);
}
}
