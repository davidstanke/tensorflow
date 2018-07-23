package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapSerialProcFetchSerialHelperTest {
    @Test
    public void testValidMapSerialProcFetchSerial() {
		MapSerialProcFetchSerialHelper helper = new MapSerialProcFetchSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidMapSerialProcFetchSerial() {
	MapSerialProcFetchSerialHelper helper = new MapSerialProcFetchSerialHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseMapSerialProcFetchSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseMapSerialProcFetchSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapSerialProcFetchSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial0() {
	assertFalse(10849==10849+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial1() {
	assertFalse(12005==12005+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial2() {
	assertFalse(3643==3643+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial3() {
	assertFalse(16878==16878+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial4() {
	assertFalse(7929==7929+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial5() {
	assertFalse(6931==6931+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial6() {
	assertFalse(3751==3751+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial7() {
	assertFalse(6998==6998+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial8() {
	assertFalse(26552==26552+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial9() {
	assertFalse(1819==1819+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial10() {
	assertFalse(21563==21563+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial11() {
	assertFalse(18026==18026+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial12() {
	assertFalse(32188==32188+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial13() {
	assertFalse(1610==1610+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial14() {
	assertFalse(32674==32674+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial15() {
	assertFalse(27696==27696+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial16() {
	assertFalse(21927==21927+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial17() {
	assertFalse(8506==8506+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial18() {
	assertFalse(1463==1463+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial19() {
	assertFalse(32169==32169+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial20() {
	assertFalse(28770==28770+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial21() {
	assertFalse(15838==15838+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial22() {
	assertFalse(9375==9375+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial23() {
	assertFalse(6333==6333+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial24() {
	assertFalse(15252==15252+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial25() {
	assertFalse(31821==31821+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial26() {
	assertFalse(3747==3747+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial27() {
	assertFalse(20455==20455+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial28() {
	assertFalse(32225==32225+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial29() {
	assertFalse(5201==5201+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial30() {
	assertFalse(26318==26318+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial31() {
	assertFalse(16545==16545+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial32() {
	assertFalse(19171==19171+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial33() {
	assertFalse(32687==32687+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial34() {
	assertFalse(27466==27466+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial35() {
	assertFalse(9357==9357+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial36() {
	assertFalse(15081==15081+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial37() {
	assertFalse(32052==32052+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial38() {
	assertFalse(27003==27003+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial39() {
	assertFalse(18792==18792+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial40() {
	assertFalse(25202==25202+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial41() {
	assertFalse(14468==14468+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial42() {
	assertFalse(22489==22489+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial43() {
	assertFalse(7086==7086+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial44() {
	assertFalse(17767==17767+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial45() {
	assertFalse(8866==8866+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial46() {
	assertFalse(12686==12686+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial47() {
	assertFalse(12301==12301+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial48() {
	assertFalse(16924==16924+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial49() {
	assertFalse(18238==18238+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial50() {
	assertFalse(28627==28627+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial51() {
	assertFalse(30604==30604+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial52() {
	assertFalse(12293==12293+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial53() {
	assertFalse(10946==10946+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial54() {
	assertFalse(15626==15626+1);
}
@Test
public void bigFalseTestMapSerialProcFetchSerial55() {
	assertFalse(2680==2680+1);
}
}
