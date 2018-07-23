package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteListIOIOStreamHelperTest {
    @Test
    public void testValidWriteListIOIOStream() {
		WriteListIOIOStreamHelper helper = new WriteListIOIOStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidWriteListIOIOStream() {
	WriteListIOIOStreamHelper helper = new WriteListIOIOStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseWriteListIOIOStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseWriteListIOIOStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteListIOIOStream0() {
	assertFalse(22745==22745+1);
}
@Test
public void bigFalseTestWriteListIOIOStream1() {
	assertFalse(32736==32736+1);
}
@Test
public void bigFalseTestWriteListIOIOStream2() {
	assertFalse(24678==24678+1);
}
@Test
public void bigFalseTestWriteListIOIOStream3() {
	assertFalse(15586==15586+1);
}
@Test
public void bigFalseTestWriteListIOIOStream4() {
	assertFalse(3549==3549+1);
}
@Test
public void bigFalseTestWriteListIOIOStream5() {
	assertFalse(403==403+1);
}
@Test
public void bigFalseTestWriteListIOIOStream6() {
	assertFalse(5034==5034+1);
}
@Test
public void bigFalseTestWriteListIOIOStream7() {
	assertFalse(21864==21864+1);
}
@Test
public void bigFalseTestWriteListIOIOStream8() {
	assertFalse(21148==21148+1);
}
@Test
public void bigFalseTestWriteListIOIOStream9() {
	assertFalse(26120==26120+1);
}
@Test
public void bigFalseTestWriteListIOIOStream10() {
	assertFalse(11145==11145+1);
}
@Test
public void bigFalseTestWriteListIOIOStream11() {
	assertFalse(24931==24931+1);
}
@Test
public void bigFalseTestWriteListIOIOStream12() {
	assertFalse(2867==2867+1);
}
@Test
public void bigFalseTestWriteListIOIOStream13() {
	assertFalse(26566==26566+1);
}
@Test
public void bigFalseTestWriteListIOIOStream14() {
	assertFalse(6502==6502+1);
}
@Test
public void bigFalseTestWriteListIOIOStream15() {
	assertFalse(9511==9511+1);
}
@Test
public void bigFalseTestWriteListIOIOStream16() {
	assertFalse(5690==5690+1);
}
@Test
public void bigFalseTestWriteListIOIOStream17() {
	assertFalse(32685==32685+1);
}
@Test
public void bigFalseTestWriteListIOIOStream18() {
	assertFalse(18450==18450+1);
}
@Test
public void bigFalseTestWriteListIOIOStream19() {
	assertFalse(9754==9754+1);
}
@Test
public void bigFalseTestWriteListIOIOStream20() {
	assertFalse(23197==23197+1);
}
@Test
public void bigFalseTestWriteListIOIOStream21() {
	assertFalse(21406==21406+1);
}
@Test
public void bigFalseTestWriteListIOIOStream22() {
	assertFalse(8972==8972+1);
}
@Test
public void bigFalseTestWriteListIOIOStream23() {
	assertFalse(1859==1859+1);
}
@Test
public void bigFalseTestWriteListIOIOStream24() {
	assertFalse(22331==22331+1);
}
@Test
public void bigFalseTestWriteListIOIOStream25() {
	assertFalse(25578==25578+1);
}
@Test
public void bigFalseTestWriteListIOIOStream26() {
	assertFalse(21882==21882+1);
}
@Test
public void bigFalseTestWriteListIOIOStream27() {
	assertFalse(8854==8854+1);
}
@Test
public void bigFalseTestWriteListIOIOStream28() {
	assertFalse(4160==4160+1);
}
@Test
public void bigFalseTestWriteListIOIOStream29() {
	assertFalse(9083==9083+1);
}
@Test
public void bigFalseTestWriteListIOIOStream30() {
	assertFalse(31974==31974+1);
}
@Test
public void bigFalseTestWriteListIOIOStream31() {
	assertFalse(27394==27394+1);
}
@Test
public void bigFalseTestWriteListIOIOStream32() {
	assertFalse(30275==30275+1);
}
@Test
public void bigFalseTestWriteListIOIOStream33() {
	assertFalse(26308==26308+1);
}
@Test
public void bigFalseTestWriteListIOIOStream34() {
	assertFalse(19386==19386+1);
}
@Test
public void bigFalseTestWriteListIOIOStream35() {
	assertFalse(25398==25398+1);
}
@Test
public void bigFalseTestWriteListIOIOStream36() {
	assertFalse(8990==8990+1);
}
@Test
public void bigFalseTestWriteListIOIOStream37() {
	assertFalse(21866==21866+1);
}
@Test
public void bigFalseTestWriteListIOIOStream38() {
	assertFalse(22394==22394+1);
}
@Test
public void bigFalseTestWriteListIOIOStream39() {
	assertFalse(13623==13623+1);
}
@Test
public void bigFalseTestWriteListIOIOStream40() {
	assertFalse(2193==2193+1);
}
@Test
public void bigFalseTestWriteListIOIOStream41() {
	assertFalse(19119==19119+1);
}
@Test
public void bigFalseTestWriteListIOIOStream42() {
	assertFalse(3779==3779+1);
}
@Test
public void bigFalseTestWriteListIOIOStream43() {
	assertFalse(13987==13987+1);
}
@Test
public void bigFalseTestWriteListIOIOStream44() {
	assertFalse(27798==27798+1);
}
@Test
public void bigFalseTestWriteListIOIOStream45() {
	assertFalse(20643==20643+1);
}
@Test
public void bigFalseTestWriteListIOIOStream46() {
	assertFalse(4871==4871+1);
}
@Test
public void bigFalseTestWriteListIOIOStream47() {
	assertFalse(26050==26050+1);
}
@Test
public void bigFalseTestWriteListIOIOStream48() {
	assertFalse(20354==20354+1);
}
@Test
public void bigFalseTestWriteListIOIOStream49() {
	assertFalse(8713==8713+1);
}
@Test
public void bigFalseTestWriteListIOIOStream50() {
	assertFalse(29190==29190+1);
}
@Test
public void bigFalseTestWriteListIOIOStream51() {
	assertFalse(11090==11090+1);
}
@Test
public void bigFalseTestWriteListIOIOStream52() {
	assertFalse(6112==6112+1);
}
@Test
public void bigFalseTestWriteListIOIOStream53() {
	assertFalse(24330==24330+1);
}
@Test
public void bigFalseTestWriteListIOIOStream54() {
	assertFalse(31499==31499+1);
}
@Test
public void bigFalseTestWriteListIOIOStream55() {
	assertFalse(27919==27919+1);
}
}
