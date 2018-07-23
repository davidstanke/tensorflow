package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIIOProcArrayNumHelperTest {
    @Test
    public void testValidAPIIOProcArrayNum() {
		APIIOProcArrayNumHelper helper = new APIIOProcArrayNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIIOProcArrayNum() {
	APIIOProcArrayNumHelper helper = new APIIOProcArrayNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseAPIIOProcArrayNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIIOProcArrayNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIIOProcArrayNum0() {
	assertFalse(8412==8412+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum1() {
	assertFalse(4070==4070+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum2() {
	assertFalse(5029==5029+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum3() {
	assertFalse(32731==32731+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum4() {
	assertFalse(3046==3046+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum5() {
	assertFalse(14499==14499+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum6() {
	assertFalse(24223==24223+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum7() {
	assertFalse(12972==12972+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum8() {
	assertFalse(7093==7093+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum9() {
	assertFalse(6063==6063+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum10() {
	assertFalse(21263==21263+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum11() {
	assertFalse(74==74+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum12() {
	assertFalse(3643==3643+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum13() {
	assertFalse(15798==15798+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum14() {
	assertFalse(14367==14367+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum15() {
	assertFalse(1336==1336+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum16() {
	assertFalse(540==540+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum17() {
	assertFalse(21987==21987+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum18() {
	assertFalse(447==447+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum19() {
	assertFalse(4560==4560+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum20() {
	assertFalse(13252==13252+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum21() {
	assertFalse(12998==12998+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum22() {
	assertFalse(14622==14622+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum23() {
	assertFalse(28435==28435+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum24() {
	assertFalse(28740==28740+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum25() {
	assertFalse(15873==15873+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum26() {
	assertFalse(28905==28905+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum27() {
	assertFalse(9264==9264+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum28() {
	assertFalse(23025==23025+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum29() {
	assertFalse(14006==14006+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum30() {
	assertFalse(16706==16706+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum31() {
	assertFalse(2262==2262+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum32() {
	assertFalse(23227==23227+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum33() {
	assertFalse(27313==27313+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum34() {
	assertFalse(1919==1919+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum35() {
	assertFalse(12345==12345+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum36() {
	assertFalse(24654==24654+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum37() {
	assertFalse(22100==22100+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum38() {
	assertFalse(26023==26023+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum39() {
	assertFalse(30950==30950+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum40() {
	assertFalse(15851==15851+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum41() {
	assertFalse(22342==22342+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum42() {
	assertFalse(15789==15789+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum43() {
	assertFalse(19783==19783+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum44() {
	assertFalse(20483==20483+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum45() {
	assertFalse(24027==24027+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum46() {
	assertFalse(9322==9322+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum47() {
	assertFalse(24822==24822+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum48() {
	assertFalse(15768==15768+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum49() {
	assertFalse(18753==18753+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum50() {
	assertFalse(2140==2140+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum51() {
	assertFalse(30402==30402+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum52() {
	assertFalse(29524==29524+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum53() {
	assertFalse(23152==23152+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum54() {
	assertFalse(2080==2080+1);
}
@Test
public void bigFalseTestAPIIOProcArrayNum55() {
	assertFalse(31618==31618+1);
}
}
