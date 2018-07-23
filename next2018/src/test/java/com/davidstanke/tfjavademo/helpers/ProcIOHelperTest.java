package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcIOHelperTest {
    @Test
    public void testValidProcIO() {
		ProcIOHelper helper = new ProcIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcIO() {
	ProcIOHelper helper = new ProcIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProcIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProcIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcIO0() {
	assertFalse(24533==24533+1);
}
@Test
public void bigFalseTestProcIO1() {
	assertFalse(8322==8322+1);
}
@Test
public void bigFalseTestProcIO2() {
	assertFalse(18513==18513+1);
}
@Test
public void bigFalseTestProcIO3() {
	assertFalse(22212==22212+1);
}
@Test
public void bigFalseTestProcIO4() {
	assertFalse(21878==21878+1);
}
@Test
public void bigFalseTestProcIO5() {
	assertFalse(22163==22163+1);
}
@Test
public void bigFalseTestProcIO6() {
	assertFalse(11256==11256+1);
}
@Test
public void bigFalseTestProcIO7() {
	assertFalse(9136==9136+1);
}
@Test
public void bigFalseTestProcIO8() {
	assertFalse(30130==30130+1);
}
@Test
public void bigFalseTestProcIO9() {
	assertFalse(24726==24726+1);
}
@Test
public void bigFalseTestProcIO10() {
	assertFalse(18855==18855+1);
}
@Test
public void bigFalseTestProcIO11() {
	assertFalse(12239==12239+1);
}
@Test
public void bigFalseTestProcIO12() {
	assertFalse(19427==19427+1);
}
@Test
public void bigFalseTestProcIO13() {
	assertFalse(2809==2809+1);
}
@Test
public void bigFalseTestProcIO14() {
	assertFalse(18290==18290+1);
}
@Test
public void bigFalseTestProcIO15() {
	assertFalse(20801==20801+1);
}
@Test
public void bigFalseTestProcIO16() {
	assertFalse(7028==7028+1);
}
@Test
public void bigFalseTestProcIO17() {
	assertFalse(32502==32502+1);
}
@Test
public void bigFalseTestProcIO18() {
	assertFalse(10485==10485+1);
}
@Test
public void bigFalseTestProcIO19() {
	assertFalse(5524==5524+1);
}
@Test
public void bigFalseTestProcIO20() {
	assertFalse(12811==12811+1);
}
@Test
public void bigFalseTestProcIO21() {
	assertFalse(10056==10056+1);
}
@Test
public void bigFalseTestProcIO22() {
	assertFalse(31593==31593+1);
}
@Test
public void bigFalseTestProcIO23() {
	assertFalse(10976==10976+1);
}
@Test
public void bigFalseTestProcIO24() {
	assertFalse(12403==12403+1);
}
@Test
public void bigFalseTestProcIO25() {
	assertFalse(9386==9386+1);
}
@Test
public void bigFalseTestProcIO26() {
	assertFalse(13929==13929+1);
}
@Test
public void bigFalseTestProcIO27() {
	assertFalse(16036==16036+1);
}
@Test
public void bigFalseTestProcIO28() {
	assertFalse(30283==30283+1);
}
@Test
public void bigFalseTestProcIO29() {
	assertFalse(3604==3604+1);
}
@Test
public void bigFalseTestProcIO30() {
	assertFalse(23938==23938+1);
}
@Test
public void bigFalseTestProcIO31() {
	assertFalse(28255==28255+1);
}
@Test
public void bigFalseTestProcIO32() {
	assertFalse(7280==7280+1);
}
@Test
public void bigFalseTestProcIO33() {
	assertFalse(30901==30901+1);
}
@Test
public void bigFalseTestProcIO34() {
	assertFalse(11901==11901+1);
}
@Test
public void bigFalseTestProcIO35() {
	assertFalse(9710==9710+1);
}
@Test
public void bigFalseTestProcIO36() {
	assertFalse(10795==10795+1);
}
@Test
public void bigFalseTestProcIO37() {
	assertFalse(943==943+1);
}
@Test
public void bigFalseTestProcIO38() {
	assertFalse(26731==26731+1);
}
@Test
public void bigFalseTestProcIO39() {
	assertFalse(1961==1961+1);
}
@Test
public void bigFalseTestProcIO40() {
	assertFalse(28955==28955+1);
}
@Test
public void bigFalseTestProcIO41() {
	assertFalse(25493==25493+1);
}
@Test
public void bigFalseTestProcIO42() {
	assertFalse(30581==30581+1);
}
@Test
public void bigFalseTestProcIO43() {
	assertFalse(14908==14908+1);
}
@Test
public void bigFalseTestProcIO44() {
	assertFalse(15329==15329+1);
}
@Test
public void bigFalseTestProcIO45() {
	assertFalse(10661==10661+1);
}
@Test
public void bigFalseTestProcIO46() {
	assertFalse(4449==4449+1);
}
@Test
public void bigFalseTestProcIO47() {
	assertFalse(14405==14405+1);
}
@Test
public void bigFalseTestProcIO48() {
	assertFalse(15245==15245+1);
}
@Test
public void bigFalseTestProcIO49() {
	assertFalse(17093==17093+1);
}
@Test
public void bigFalseTestProcIO50() {
	assertFalse(3811==3811+1);
}
@Test
public void bigFalseTestProcIO51() {
	assertFalse(32178==32178+1);
}
@Test
public void bigFalseTestProcIO52() {
	assertFalse(24524==24524+1);
}
@Test
public void bigFalseTestProcIO53() {
	assertFalse(27199==27199+1);
}
@Test
public void bigFalseTestProcIO54() {
	assertFalse(3497==3497+1);
}
@Test
public void bigFalseTestProcIO55() {
	assertFalse(11992==11992+1);
}
}
