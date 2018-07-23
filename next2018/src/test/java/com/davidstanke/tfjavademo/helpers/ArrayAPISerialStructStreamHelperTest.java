package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayAPISerialStructStreamHelperTest {
    @Test
    public void testValidArrayAPISerialStructStream() {
		ArrayAPISerialStructStreamHelper helper = new ArrayAPISerialStructStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayAPISerialStructStream() {
	ArrayAPISerialStructStreamHelper helper = new ArrayAPISerialStructStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestArrayAPISerialStructStream0() {
	assertFalse(12476==12476+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream1() {
	assertFalse(7131==7131+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream2() {
	assertFalse(11502==11502+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream3() {
	assertFalse(13241==13241+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream4() {
	assertFalse(24635==24635+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream5() {
	assertFalse(3286==3286+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream6() {
	assertFalse(4973==4973+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream7() {
	assertFalse(30498==30498+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream8() {
	assertFalse(27958==27958+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream9() {
	assertFalse(3630==3630+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream10() {
	assertFalse(13147==13147+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream11() {
	assertFalse(13296==13296+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream12() {
	assertFalse(24391==24391+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream13() {
	assertFalse(14009==14009+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream14() {
	assertFalse(29750==29750+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream15() {
	assertFalse(8219==8219+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream16() {
	assertFalse(31734==31734+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream17() {
	assertFalse(14966==14966+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream18() {
	assertFalse(17388==17388+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream19() {
	assertFalse(20583==20583+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream20() {
	assertFalse(5862==5862+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream21() {
	assertFalse(30023==30023+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream22() {
	assertFalse(28897==28897+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream23() {
	assertFalse(14210==14210+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream24() {
	assertFalse(14530==14530+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream25() {
	assertFalse(25964==25964+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream26() {
	assertFalse(6334==6334+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream27() {
	assertFalse(31455==31455+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream28() {
	assertFalse(18661==18661+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream29() {
	assertFalse(20931==20931+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream30() {
	assertFalse(14335==14335+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream31() {
	assertFalse(14677==14677+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream32() {
	assertFalse(9675==9675+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream33() {
	assertFalse(6082==6082+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream34() {
	assertFalse(9787==9787+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream35() {
	assertFalse(8054==8054+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream36() {
	assertFalse(22588==22588+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream37() {
	assertFalse(23856==23856+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream38() {
	assertFalse(2866==2866+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream39() {
	assertFalse(26032==26032+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream40() {
	assertFalse(19762==19762+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream41() {
	assertFalse(8614==8614+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream42() {
	assertFalse(6297==6297+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream43() {
	assertFalse(5158==5158+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream44() {
	assertFalse(17039==17039+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream45() {
	assertFalse(27593==27593+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream46() {
	assertFalse(5284==5284+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream47() {
	assertFalse(10316==10316+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream48() {
	assertFalse(21120==21120+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream49() {
	assertFalse(3652==3652+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream50() {
	assertFalse(343==343+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream51() {
	assertFalse(30789==30789+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream52() {
	assertFalse(18862==18862+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream53() {
	assertFalse(16520==16520+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream54() {
	assertFalse(27789==27789+1);
}
@Test
public void bigFalseTestArrayAPISerialStructStream55() {
	assertFalse(28668==28668+1);
}
}
