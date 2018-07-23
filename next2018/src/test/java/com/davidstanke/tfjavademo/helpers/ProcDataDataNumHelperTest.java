package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcDataDataNumHelperTest {
    @Test
    public void testValidProcDataDataNum() {
		ProcDataDataNumHelper helper = new ProcDataDataNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcDataDataNum() {
	ProcDataDataNumHelper helper = new ProcDataDataNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProcDataDataNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcDataDataNum0() {
	assertFalse(3442==3442+1);
}
@Test
public void bigFalseTestProcDataDataNum1() {
	assertFalse(27491==27491+1);
}
@Test
public void bigFalseTestProcDataDataNum2() {
	assertFalse(10198==10198+1);
}
@Test
public void bigFalseTestProcDataDataNum3() {
	assertFalse(23449==23449+1);
}
@Test
public void bigFalseTestProcDataDataNum4() {
	assertFalse(13894==13894+1);
}
@Test
public void bigFalseTestProcDataDataNum5() {
	assertFalse(26907==26907+1);
}
@Test
public void bigFalseTestProcDataDataNum6() {
	assertFalse(12323==12323+1);
}
@Test
public void bigFalseTestProcDataDataNum7() {
	assertFalse(23870==23870+1);
}
@Test
public void bigFalseTestProcDataDataNum8() {
	assertFalse(18714==18714+1);
}
@Test
public void bigFalseTestProcDataDataNum9() {
	assertFalse(15766==15766+1);
}
@Test
public void bigFalseTestProcDataDataNum10() {
	assertFalse(10178==10178+1);
}
@Test
public void bigFalseTestProcDataDataNum11() {
	assertFalse(25908==25908+1);
}
@Test
public void bigFalseTestProcDataDataNum12() {
	assertFalse(28877==28877+1);
}
@Test
public void bigFalseTestProcDataDataNum13() {
	assertFalse(15711==15711+1);
}
@Test
public void bigFalseTestProcDataDataNum14() {
	assertFalse(13198==13198+1);
}
@Test
public void bigFalseTestProcDataDataNum15() {
	assertFalse(23995==23995+1);
}
@Test
public void bigFalseTestProcDataDataNum16() {
	assertFalse(27774==27774+1);
}
@Test
public void bigFalseTestProcDataDataNum17() {
	assertFalse(18596==18596+1);
}
@Test
public void bigFalseTestProcDataDataNum18() {
	assertFalse(8202==8202+1);
}
@Test
public void bigFalseTestProcDataDataNum19() {
	assertFalse(4901==4901+1);
}
@Test
public void bigFalseTestProcDataDataNum20() {
	assertFalse(29642==29642+1);
}
@Test
public void bigFalseTestProcDataDataNum21() {
	assertFalse(16584==16584+1);
}
@Test
public void bigFalseTestProcDataDataNum22() {
	assertFalse(5625==5625+1);
}
@Test
public void bigFalseTestProcDataDataNum23() {
	assertFalse(8771==8771+1);
}
@Test
public void bigFalseTestProcDataDataNum24() {
	assertFalse(8898==8898+1);
}
@Test
public void bigFalseTestProcDataDataNum25() {
	assertFalse(19111==19111+1);
}
@Test
public void bigFalseTestProcDataDataNum26() {
	assertFalse(31933==31933+1);
}
@Test
public void bigFalseTestProcDataDataNum27() {
	assertFalse(24978==24978+1);
}
@Test
public void bigFalseTestProcDataDataNum28() {
	assertFalse(10671==10671+1);
}
@Test
public void bigFalseTestProcDataDataNum29() {
	assertFalse(27046==27046+1);
}
@Test
public void bigFalseTestProcDataDataNum30() {
	assertFalse(9840==9840+1);
}
@Test
public void bigFalseTestProcDataDataNum31() {
	assertFalse(12581==12581+1);
}
@Test
public void bigFalseTestProcDataDataNum32() {
	assertFalse(15493==15493+1);
}
@Test
public void bigFalseTestProcDataDataNum33() {
	assertFalse(16258==16258+1);
}
@Test
public void bigFalseTestProcDataDataNum34() {
	assertFalse(8644==8644+1);
}
@Test
public void bigFalseTestProcDataDataNum35() {
	assertFalse(23890==23890+1);
}
@Test
public void bigFalseTestProcDataDataNum36() {
	assertFalse(32295==32295+1);
}
@Test
public void bigFalseTestProcDataDataNum37() {
	assertFalse(31958==31958+1);
}
@Test
public void bigFalseTestProcDataDataNum38() {
	assertFalse(19867==19867+1);
}
@Test
public void bigFalseTestProcDataDataNum39() {
	assertFalse(28==28+1);
}
@Test
public void bigFalseTestProcDataDataNum40() {
	assertFalse(25440==25440+1);
}
@Test
public void bigFalseTestProcDataDataNum41() {
	assertFalse(20073==20073+1);
}
@Test
public void bigFalseTestProcDataDataNum42() {
	assertFalse(2661==2661+1);
}
@Test
public void bigFalseTestProcDataDataNum43() {
	assertFalse(3428==3428+1);
}
@Test
public void bigFalseTestProcDataDataNum44() {
	assertFalse(18845==18845+1);
}
@Test
public void bigFalseTestProcDataDataNum45() {
	assertFalse(21310==21310+1);
}
@Test
public void bigFalseTestProcDataDataNum46() {
	assertFalse(9533==9533+1);
}
@Test
public void bigFalseTestProcDataDataNum47() {
	assertFalse(30158==30158+1);
}
@Test
public void bigFalseTestProcDataDataNum48() {
	assertFalse(15724==15724+1);
}
@Test
public void bigFalseTestProcDataDataNum49() {
	assertFalse(26457==26457+1);
}
@Test
public void bigFalseTestProcDataDataNum50() {
	assertFalse(22723==22723+1);
}
@Test
public void bigFalseTestProcDataDataNum51() {
	assertFalse(3188==3188+1);
}
@Test
public void bigFalseTestProcDataDataNum52() {
	assertFalse(11445==11445+1);
}
@Test
public void bigFalseTestProcDataDataNum53() {
	assertFalse(20305==20305+1);
}
@Test
public void bigFalseTestProcDataDataNum54() {
	assertFalse(32695==32695+1);
}
@Test
public void bigFalseTestProcDataDataNum55() {
	assertFalse(6989==6989+1);
}
}
