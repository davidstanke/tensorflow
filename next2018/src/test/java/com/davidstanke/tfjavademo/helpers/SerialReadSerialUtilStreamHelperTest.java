package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialReadSerialUtilStreamHelperTest {
    @Test
    public void testValidSerialReadSerialUtilStream() {
		SerialReadSerialUtilStreamHelper helper = new SerialReadSerialUtilStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialReadSerialUtilStream() {
	SerialReadSerialUtilStreamHelper helper = new SerialReadSerialUtilStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseSerialReadSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseSerialReadSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream0() {
	assertFalse(9001==9001+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream1() {
	assertFalse(27067==27067+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream2() {
	assertFalse(28224==28224+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream3() {
	assertFalse(4811==4811+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream4() {
	assertFalse(9024==9024+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream5() {
	assertFalse(27933==27933+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream6() {
	assertFalse(32601==32601+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream7() {
	assertFalse(24915==24915+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream8() {
	assertFalse(18895==18895+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream9() {
	assertFalse(28899==28899+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream10() {
	assertFalse(3649==3649+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream11() {
	assertFalse(3551==3551+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream12() {
	assertFalse(14272==14272+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream13() {
	assertFalse(18799==18799+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream14() {
	assertFalse(4995==4995+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream15() {
	assertFalse(4875==4875+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream16() {
	assertFalse(31180==31180+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream17() {
	assertFalse(32532==32532+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream18() {
	assertFalse(14691==14691+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream19() {
	assertFalse(30295==30295+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream20() {
	assertFalse(21942==21942+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream21() {
	assertFalse(30888==30888+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream22() {
	assertFalse(8565==8565+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream23() {
	assertFalse(29586==29586+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream24() {
	assertFalse(12106==12106+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream25() {
	assertFalse(17102==17102+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream26() {
	assertFalse(26620==26620+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream27() {
	assertFalse(29444==29444+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream28() {
	assertFalse(16665==16665+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream29() {
	assertFalse(0==0+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream30() {
	assertFalse(259==259+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream31() {
	assertFalse(13918==13918+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream32() {
	assertFalse(9457==9457+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream33() {
	assertFalse(19807==19807+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream34() {
	assertFalse(19261==19261+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream35() {
	assertFalse(26722==26722+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream36() {
	assertFalse(26654==26654+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream37() {
	assertFalse(10298==10298+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream38() {
	assertFalse(29854==29854+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream39() {
	assertFalse(31570==31570+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream40() {
	assertFalse(10084==10084+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream41() {
	assertFalse(8288==8288+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream42() {
	assertFalse(3253==3253+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream43() {
	assertFalse(538==538+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream44() {
	assertFalse(28343==28343+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream45() {
	assertFalse(25382==25382+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream46() {
	assertFalse(24784==24784+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream47() {
	assertFalse(28732==28732+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream48() {
	assertFalse(22720==22720+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream49() {
	assertFalse(27447==27447+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream50() {
	assertFalse(32206==32206+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream51() {
	assertFalse(27775==27775+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream52() {
	assertFalse(10769==10769+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream53() {
	assertFalse(24862==24862+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream54() {
	assertFalse(29634==29634+1);
}
@Test
public void bigFalseTestSerialReadSerialUtilStream55() {
	assertFalse(8791==8791+1);
}
}
