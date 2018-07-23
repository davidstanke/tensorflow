package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayProcAPINumHelperTest {
    @Test
    public void testValidArrayProcAPINum() {
		ArrayProcAPINumHelper helper = new ArrayProcAPINumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayProcAPINum() {
	ArrayProcAPINumHelper helper = new ArrayProcAPINumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseArrayProcAPINum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayProcAPINum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayProcAPINum0() {
	assertFalse(17156==17156+1);
}
@Test
public void bigFalseTestArrayProcAPINum1() {
	assertFalse(25941==25941+1);
}
@Test
public void bigFalseTestArrayProcAPINum2() {
	assertFalse(26838==26838+1);
}
@Test
public void bigFalseTestArrayProcAPINum3() {
	assertFalse(20216==20216+1);
}
@Test
public void bigFalseTestArrayProcAPINum4() {
	assertFalse(15869==15869+1);
}
@Test
public void bigFalseTestArrayProcAPINum5() {
	assertFalse(26472==26472+1);
}
@Test
public void bigFalseTestArrayProcAPINum6() {
	assertFalse(30817==30817+1);
}
@Test
public void bigFalseTestArrayProcAPINum7() {
	assertFalse(31140==31140+1);
}
@Test
public void bigFalseTestArrayProcAPINum8() {
	assertFalse(2879==2879+1);
}
@Test
public void bigFalseTestArrayProcAPINum9() {
	assertFalse(10435==10435+1);
}
@Test
public void bigFalseTestArrayProcAPINum10() {
	assertFalse(24870==24870+1);
}
@Test
public void bigFalseTestArrayProcAPINum11() {
	assertFalse(20497==20497+1);
}
@Test
public void bigFalseTestArrayProcAPINum12() {
	assertFalse(20125==20125+1);
}
@Test
public void bigFalseTestArrayProcAPINum13() {
	assertFalse(7650==7650+1);
}
@Test
public void bigFalseTestArrayProcAPINum14() {
	assertFalse(8426==8426+1);
}
@Test
public void bigFalseTestArrayProcAPINum15() {
	assertFalse(21348==21348+1);
}
@Test
public void bigFalseTestArrayProcAPINum16() {
	assertFalse(17721==17721+1);
}
@Test
public void bigFalseTestArrayProcAPINum17() {
	assertFalse(7457==7457+1);
}
@Test
public void bigFalseTestArrayProcAPINum18() {
	assertFalse(11024==11024+1);
}
@Test
public void bigFalseTestArrayProcAPINum19() {
	assertFalse(30683==30683+1);
}
@Test
public void bigFalseTestArrayProcAPINum20() {
	assertFalse(27090==27090+1);
}
@Test
public void bigFalseTestArrayProcAPINum21() {
	assertFalse(31516==31516+1);
}
@Test
public void bigFalseTestArrayProcAPINum22() {
	assertFalse(965==965+1);
}
@Test
public void bigFalseTestArrayProcAPINum23() {
	assertFalse(7815==7815+1);
}
@Test
public void bigFalseTestArrayProcAPINum24() {
	assertFalse(4560==4560+1);
}
@Test
public void bigFalseTestArrayProcAPINum25() {
	assertFalse(4297==4297+1);
}
@Test
public void bigFalseTestArrayProcAPINum26() {
	assertFalse(25072==25072+1);
}
@Test
public void bigFalseTestArrayProcAPINum27() {
	assertFalse(28359==28359+1);
}
@Test
public void bigFalseTestArrayProcAPINum28() {
	assertFalse(20241==20241+1);
}
@Test
public void bigFalseTestArrayProcAPINum29() {
	assertFalse(1874==1874+1);
}
@Test
public void bigFalseTestArrayProcAPINum30() {
	assertFalse(983==983+1);
}
@Test
public void bigFalseTestArrayProcAPINum31() {
	assertFalse(19336==19336+1);
}
@Test
public void bigFalseTestArrayProcAPINum32() {
	assertFalse(8817==8817+1);
}
@Test
public void bigFalseTestArrayProcAPINum33() {
	assertFalse(1459==1459+1);
}
@Test
public void bigFalseTestArrayProcAPINum34() {
	assertFalse(8849==8849+1);
}
@Test
public void bigFalseTestArrayProcAPINum35() {
	assertFalse(24638==24638+1);
}
@Test
public void bigFalseTestArrayProcAPINum36() {
	assertFalse(19228==19228+1);
}
@Test
public void bigFalseTestArrayProcAPINum37() {
	assertFalse(7192==7192+1);
}
@Test
public void bigFalseTestArrayProcAPINum38() {
	assertFalse(12335==12335+1);
}
@Test
public void bigFalseTestArrayProcAPINum39() {
	assertFalse(417==417+1);
}
@Test
public void bigFalseTestArrayProcAPINum40() {
	assertFalse(16019==16019+1);
}
@Test
public void bigFalseTestArrayProcAPINum41() {
	assertFalse(2292==2292+1);
}
@Test
public void bigFalseTestArrayProcAPINum42() {
	assertFalse(19625==19625+1);
}
@Test
public void bigFalseTestArrayProcAPINum43() {
	assertFalse(24104==24104+1);
}
@Test
public void bigFalseTestArrayProcAPINum44() {
	assertFalse(5503==5503+1);
}
@Test
public void bigFalseTestArrayProcAPINum45() {
	assertFalse(13281==13281+1);
}
@Test
public void bigFalseTestArrayProcAPINum46() {
	assertFalse(7562==7562+1);
}
@Test
public void bigFalseTestArrayProcAPINum47() {
	assertFalse(14918==14918+1);
}
@Test
public void bigFalseTestArrayProcAPINum48() {
	assertFalse(31033==31033+1);
}
@Test
public void bigFalseTestArrayProcAPINum49() {
	assertFalse(31291==31291+1);
}
@Test
public void bigFalseTestArrayProcAPINum50() {
	assertFalse(29787==29787+1);
}
@Test
public void bigFalseTestArrayProcAPINum51() {
	assertFalse(13415==13415+1);
}
@Test
public void bigFalseTestArrayProcAPINum52() {
	assertFalse(24085==24085+1);
}
@Test
public void bigFalseTestArrayProcAPINum53() {
	assertFalse(10618==10618+1);
}
@Test
public void bigFalseTestArrayProcAPINum54() {
	assertFalse(28625==28625+1);
}
@Test
public void bigFalseTestArrayProcAPINum55() {
	assertFalse(19625==19625+1);
}
}
