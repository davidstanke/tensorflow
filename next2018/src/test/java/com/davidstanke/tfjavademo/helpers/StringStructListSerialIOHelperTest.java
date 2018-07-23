package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringStructListSerialIOHelperTest {
    @Test
    public void testValidStringStructListSerialIO() {
		StringStructListSerialIOHelper helper = new StringStructListSerialIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringStructListSerialIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringStructListSerialIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringStructListSerialIO0() {
	assertFalse(16758==16758+1);
}
@Test
public void bigFalseTestStringStructListSerialIO1() {
	assertFalse(11073==11073+1);
}
@Test
public void bigFalseTestStringStructListSerialIO2() {
	assertFalse(10023==10023+1);
}
@Test
public void bigFalseTestStringStructListSerialIO3() {
	assertFalse(20766==20766+1);
}
@Test
public void bigFalseTestStringStructListSerialIO4() {
	assertFalse(3148==3148+1);
}
@Test
public void bigFalseTestStringStructListSerialIO5() {
	assertFalse(21139==21139+1);
}
@Test
public void bigFalseTestStringStructListSerialIO6() {
	assertFalse(15775==15775+1);
}
@Test
public void bigFalseTestStringStructListSerialIO7() {
	assertFalse(23260==23260+1);
}
@Test
public void bigFalseTestStringStructListSerialIO8() {
	assertFalse(3969==3969+1);
}
@Test
public void bigFalseTestStringStructListSerialIO9() {
	assertFalse(19887==19887+1);
}
@Test
public void bigFalseTestStringStructListSerialIO10() {
	assertFalse(22582==22582+1);
}
@Test
public void bigFalseTestStringStructListSerialIO11() {
	assertFalse(23949==23949+1);
}
@Test
public void bigFalseTestStringStructListSerialIO12() {
	assertFalse(995==995+1);
}
@Test
public void bigFalseTestStringStructListSerialIO13() {
	assertFalse(27381==27381+1);
}
@Test
public void bigFalseTestStringStructListSerialIO14() {
	assertFalse(11814==11814+1);
}
@Test
public void bigFalseTestStringStructListSerialIO15() {
	assertFalse(6589==6589+1);
}
@Test
public void bigFalseTestStringStructListSerialIO16() {
	assertFalse(8105==8105+1);
}
@Test
public void bigFalseTestStringStructListSerialIO17() {
	assertFalse(26039==26039+1);
}
@Test
public void bigFalseTestStringStructListSerialIO18() {
	assertFalse(7921==7921+1);
}
@Test
public void bigFalseTestStringStructListSerialIO19() {
	assertFalse(8563==8563+1);
}
@Test
public void bigFalseTestStringStructListSerialIO20() {
	assertFalse(25187==25187+1);
}
@Test
public void bigFalseTestStringStructListSerialIO21() {
	assertFalse(8632==8632+1);
}
@Test
public void bigFalseTestStringStructListSerialIO22() {
	assertFalse(20014==20014+1);
}
@Test
public void bigFalseTestStringStructListSerialIO23() {
	assertFalse(22028==22028+1);
}
@Test
public void bigFalseTestStringStructListSerialIO24() {
	assertFalse(13217==13217+1);
}
@Test
public void bigFalseTestStringStructListSerialIO25() {
	assertFalse(8806==8806+1);
}
@Test
public void bigFalseTestStringStructListSerialIO26() {
	assertFalse(12308==12308+1);
}
@Test
public void bigFalseTestStringStructListSerialIO27() {
	assertFalse(26584==26584+1);
}
@Test
public void bigFalseTestStringStructListSerialIO28() {
	assertFalse(16486==16486+1);
}
@Test
public void bigFalseTestStringStructListSerialIO29() {
	assertFalse(14807==14807+1);
}
@Test
public void bigFalseTestStringStructListSerialIO30() {
	assertFalse(21192==21192+1);
}
@Test
public void bigFalseTestStringStructListSerialIO31() {
	assertFalse(13169==13169+1);
}
@Test
public void bigFalseTestStringStructListSerialIO32() {
	assertFalse(17227==17227+1);
}
@Test
public void bigFalseTestStringStructListSerialIO33() {
	assertFalse(11141==11141+1);
}
@Test
public void bigFalseTestStringStructListSerialIO34() {
	assertFalse(28774==28774+1);
}
@Test
public void bigFalseTestStringStructListSerialIO35() {
	assertFalse(6367==6367+1);
}
@Test
public void bigFalseTestStringStructListSerialIO36() {
	assertFalse(9075==9075+1);
}
@Test
public void bigFalseTestStringStructListSerialIO37() {
	assertFalse(16074==16074+1);
}
@Test
public void bigFalseTestStringStructListSerialIO38() {
	assertFalse(5585==5585+1);
}
@Test
public void bigFalseTestStringStructListSerialIO39() {
	assertFalse(10349==10349+1);
}
@Test
public void bigFalseTestStringStructListSerialIO40() {
	assertFalse(5682==5682+1);
}
@Test
public void bigFalseTestStringStructListSerialIO41() {
	assertFalse(32026==32026+1);
}
@Test
public void bigFalseTestStringStructListSerialIO42() {
	assertFalse(27195==27195+1);
}
@Test
public void bigFalseTestStringStructListSerialIO43() {
	assertFalse(16713==16713+1);
}
@Test
public void bigFalseTestStringStructListSerialIO44() {
	assertFalse(12156==12156+1);
}
@Test
public void bigFalseTestStringStructListSerialIO45() {
	assertFalse(6146==6146+1);
}
@Test
public void bigFalseTestStringStructListSerialIO46() {
	assertFalse(25459==25459+1);
}
@Test
public void bigFalseTestStringStructListSerialIO47() {
	assertFalse(32223==32223+1);
}
@Test
public void bigFalseTestStringStructListSerialIO48() {
	assertFalse(3343==3343+1);
}
@Test
public void bigFalseTestStringStructListSerialIO49() {
	assertFalse(13028==13028+1);
}
@Test
public void bigFalseTestStringStructListSerialIO50() {
	assertFalse(29426==29426+1);
}
@Test
public void bigFalseTestStringStructListSerialIO51() {
	assertFalse(2546==2546+1);
}
@Test
public void bigFalseTestStringStructListSerialIO52() {
	assertFalse(2144==2144+1);
}
@Test
public void bigFalseTestStringStructListSerialIO53() {
	assertFalse(3183==3183+1);
}
@Test
public void bigFalseTestStringStructListSerialIO54() {
	assertFalse(30627==30627+1);
}
@Test
public void bigFalseTestStringStructListSerialIO55() {
	assertFalse(15999==15999+1);
}
}
