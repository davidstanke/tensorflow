package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOUtilStringDataSerialHelperTest {
    @Test
    public void testValidIOUtilStringDataSerial() {
		IOUtilStringDataSerialHelper helper = new IOUtilStringDataSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOUtilStringDataSerial() {
	IOUtilStringDataSerialHelper helper = new IOUtilStringDataSerialHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseIOUtilStringDataSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOUtilStringDataSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOUtilStringDataSerial0() {
	assertFalse(26479==26479+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial1() {
	assertFalse(14054==14054+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial2() {
	assertFalse(13834==13834+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial3() {
	assertFalse(4745==4745+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial4() {
	assertFalse(18468==18468+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial5() {
	assertFalse(20518==20518+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial6() {
	assertFalse(19394==19394+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial7() {
	assertFalse(3551==3551+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial8() {
	assertFalse(7376==7376+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial9() {
	assertFalse(18674==18674+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial10() {
	assertFalse(17218==17218+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial11() {
	assertFalse(32628==32628+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial12() {
	assertFalse(5848==5848+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial13() {
	assertFalse(30154==30154+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial14() {
	assertFalse(13317==13317+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial15() {
	assertFalse(12818==12818+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial16() {
	assertFalse(17972==17972+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial17() {
	assertFalse(2382==2382+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial18() {
	assertFalse(4704==4704+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial19() {
	assertFalse(23002==23002+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial20() {
	assertFalse(20918==20918+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial21() {
	assertFalse(13471==13471+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial22() {
	assertFalse(32439==32439+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial23() {
	assertFalse(12801==12801+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial24() {
	assertFalse(26651==26651+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial25() {
	assertFalse(29045==29045+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial26() {
	assertFalse(23394==23394+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial27() {
	assertFalse(14922==14922+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial28() {
	assertFalse(13779==13779+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial29() {
	assertFalse(20992==20992+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial30() {
	assertFalse(21853==21853+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial31() {
	assertFalse(20551==20551+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial32() {
	assertFalse(27536==27536+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial33() {
	assertFalse(29312==29312+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial34() {
	assertFalse(19377==19377+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial35() {
	assertFalse(8271==8271+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial36() {
	assertFalse(8592==8592+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial37() {
	assertFalse(26787==26787+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial38() {
	assertFalse(16806==16806+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial39() {
	assertFalse(10814==10814+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial40() {
	assertFalse(9131==9131+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial41() {
	assertFalse(19618==19618+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial42() {
	assertFalse(18341==18341+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial43() {
	assertFalse(22000==22000+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial44() {
	assertFalse(29212==29212+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial45() {
	assertFalse(14362==14362+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial46() {
	assertFalse(1775==1775+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial47() {
	assertFalse(21371==21371+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial48() {
	assertFalse(783==783+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial49() {
	assertFalse(22187==22187+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial50() {
	assertFalse(23552==23552+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial51() {
	assertFalse(17198==17198+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial52() {
	assertFalse(4334==4334+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial53() {
	assertFalse(25682==25682+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial54() {
	assertFalse(11201==11201+1);
}
@Test
public void bigFalseTestIOUtilStringDataSerial55() {
	assertFalse(24909==24909+1);
}
}
