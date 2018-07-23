package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIIOStringNumNumHelperTest {
    @Test
    public void testValidAPIIOStringNumNum() {
		APIIOStringNumNumHelper helper = new APIIOStringNumNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIIOStringNumNum() {
	APIIOStringNumNumHelper helper = new APIIOStringNumNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPIIOStringNumNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAPIIOStringNumNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIIOStringNumNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPIIOStringNumNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIIOStringNumNum0() {
	assertFalse(32510==32510+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum1() {
	assertFalse(23062==23062+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum2() {
	assertFalse(20335==20335+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum3() {
	assertFalse(23091==23091+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum4() {
	assertFalse(26325==26325+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum5() {
	assertFalse(31173==31173+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum6() {
	assertFalse(32147==32147+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum7() {
	assertFalse(7523==7523+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum8() {
	assertFalse(5545==5545+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum9() {
	assertFalse(32183==32183+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum10() {
	assertFalse(1279==1279+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum11() {
	assertFalse(1821==1821+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum12() {
	assertFalse(23655==23655+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum13() {
	assertFalse(26784==26784+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum14() {
	assertFalse(16127==16127+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum15() {
	assertFalse(31218==31218+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum16() {
	assertFalse(9018==9018+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum17() {
	assertFalse(29437==29437+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum18() {
	assertFalse(12980==12980+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum19() {
	assertFalse(24602==24602+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum20() {
	assertFalse(32679==32679+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum21() {
	assertFalse(32005==32005+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum22() {
	assertFalse(32400==32400+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum23() {
	assertFalse(23872==23872+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum24() {
	assertFalse(4201==4201+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum25() {
	assertFalse(13134==13134+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum26() {
	assertFalse(23949==23949+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum27() {
	assertFalse(20755==20755+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum28() {
	assertFalse(15118==15118+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum29() {
	assertFalse(21056==21056+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum30() {
	assertFalse(17456==17456+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum31() {
	assertFalse(30349==30349+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum32() {
	assertFalse(10062==10062+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum33() {
	assertFalse(13370==13370+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum34() {
	assertFalse(20801==20801+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum35() {
	assertFalse(11265==11265+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum36() {
	assertFalse(5166==5166+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum37() {
	assertFalse(5766==5766+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum38() {
	assertFalse(3655==3655+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum39() {
	assertFalse(12263==12263+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum40() {
	assertFalse(25305==25305+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum41() {
	assertFalse(16637==16637+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum42() {
	assertFalse(15301==15301+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum43() {
	assertFalse(24168==24168+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum44() {
	assertFalse(29497==29497+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum45() {
	assertFalse(31865==31865+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum46() {
	assertFalse(9527==9527+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum47() {
	assertFalse(15272==15272+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum48() {
	assertFalse(11864==11864+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum49() {
	assertFalse(1023==1023+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum50() {
	assertFalse(14539==14539+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum51() {
	assertFalse(22229==22229+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum52() {
	assertFalse(23162==23162+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum53() {
	assertFalse(23721==23721+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum54() {
	assertFalse(24288==24288+1);
}
@Test
public void bigFalseTestAPIIOStringNumNum55() {
	assertFalse(20980==20980+1);
}
}
