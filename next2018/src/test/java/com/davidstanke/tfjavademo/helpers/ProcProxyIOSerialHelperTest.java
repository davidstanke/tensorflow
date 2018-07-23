package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcProxyIOSerialHelperTest {
    @Test
    public void testValidProcProxyIOSerial() {
		ProcProxyIOSerialHelper helper = new ProcProxyIOSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseProcProxyIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcProxyIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcProxyIOSerial0() {
	assertFalse(27119==27119+1);
}
@Test
public void bigFalseTestProcProxyIOSerial1() {
	assertFalse(3893==3893+1);
}
@Test
public void bigFalseTestProcProxyIOSerial2() {
	assertFalse(10951==10951+1);
}
@Test
public void bigFalseTestProcProxyIOSerial3() {
	assertFalse(4862==4862+1);
}
@Test
public void bigFalseTestProcProxyIOSerial4() {
	assertFalse(23451==23451+1);
}
@Test
public void bigFalseTestProcProxyIOSerial5() {
	assertFalse(4021==4021+1);
}
@Test
public void bigFalseTestProcProxyIOSerial6() {
	assertFalse(1084==1084+1);
}
@Test
public void bigFalseTestProcProxyIOSerial7() {
	assertFalse(6389==6389+1);
}
@Test
public void bigFalseTestProcProxyIOSerial8() {
	assertFalse(31351==31351+1);
}
@Test
public void bigFalseTestProcProxyIOSerial9() {
	assertFalse(25368==25368+1);
}
@Test
public void bigFalseTestProcProxyIOSerial10() {
	assertFalse(31357==31357+1);
}
@Test
public void bigFalseTestProcProxyIOSerial11() {
	assertFalse(23588==23588+1);
}
@Test
public void bigFalseTestProcProxyIOSerial12() {
	assertFalse(169==169+1);
}
@Test
public void bigFalseTestProcProxyIOSerial13() {
	assertFalse(21103==21103+1);
}
@Test
public void bigFalseTestProcProxyIOSerial14() {
	assertFalse(12178==12178+1);
}
@Test
public void bigFalseTestProcProxyIOSerial15() {
	assertFalse(9372==9372+1);
}
@Test
public void bigFalseTestProcProxyIOSerial16() {
	assertFalse(12852==12852+1);
}
@Test
public void bigFalseTestProcProxyIOSerial17() {
	assertFalse(7241==7241+1);
}
@Test
public void bigFalseTestProcProxyIOSerial18() {
	assertFalse(7310==7310+1);
}
@Test
public void bigFalseTestProcProxyIOSerial19() {
	assertFalse(4226==4226+1);
}
@Test
public void bigFalseTestProcProxyIOSerial20() {
	assertFalse(32261==32261+1);
}
@Test
public void bigFalseTestProcProxyIOSerial21() {
	assertFalse(11984==11984+1);
}
@Test
public void bigFalseTestProcProxyIOSerial22() {
	assertFalse(22392==22392+1);
}
@Test
public void bigFalseTestProcProxyIOSerial23() {
	assertFalse(16777==16777+1);
}
@Test
public void bigFalseTestProcProxyIOSerial24() {
	assertFalse(9148==9148+1);
}
@Test
public void bigFalseTestProcProxyIOSerial25() {
	assertFalse(26531==26531+1);
}
@Test
public void bigFalseTestProcProxyIOSerial26() {
	assertFalse(19454==19454+1);
}
@Test
public void bigFalseTestProcProxyIOSerial27() {
	assertFalse(26163==26163+1);
}
@Test
public void bigFalseTestProcProxyIOSerial28() {
	assertFalse(27196==27196+1);
}
@Test
public void bigFalseTestProcProxyIOSerial29() {
	assertFalse(30065==30065+1);
}
@Test
public void bigFalseTestProcProxyIOSerial30() {
	assertFalse(21208==21208+1);
}
@Test
public void bigFalseTestProcProxyIOSerial31() {
	assertFalse(6855==6855+1);
}
@Test
public void bigFalseTestProcProxyIOSerial32() {
	assertFalse(13041==13041+1);
}
@Test
public void bigFalseTestProcProxyIOSerial33() {
	assertFalse(14169==14169+1);
}
@Test
public void bigFalseTestProcProxyIOSerial34() {
	assertFalse(21501==21501+1);
}
@Test
public void bigFalseTestProcProxyIOSerial35() {
	assertFalse(24081==24081+1);
}
@Test
public void bigFalseTestProcProxyIOSerial36() {
	assertFalse(30180==30180+1);
}
@Test
public void bigFalseTestProcProxyIOSerial37() {
	assertFalse(13828==13828+1);
}
@Test
public void bigFalseTestProcProxyIOSerial38() {
	assertFalse(24457==24457+1);
}
@Test
public void bigFalseTestProcProxyIOSerial39() {
	assertFalse(5596==5596+1);
}
@Test
public void bigFalseTestProcProxyIOSerial40() {
	assertFalse(29312==29312+1);
}
@Test
public void bigFalseTestProcProxyIOSerial41() {
	assertFalse(4736==4736+1);
}
@Test
public void bigFalseTestProcProxyIOSerial42() {
	assertFalse(26985==26985+1);
}
@Test
public void bigFalseTestProcProxyIOSerial43() {
	assertFalse(24368==24368+1);
}
@Test
public void bigFalseTestProcProxyIOSerial44() {
	assertFalse(8481==8481+1);
}
@Test
public void bigFalseTestProcProxyIOSerial45() {
	assertFalse(1755==1755+1);
}
@Test
public void bigFalseTestProcProxyIOSerial46() {
	assertFalse(5068==5068+1);
}
@Test
public void bigFalseTestProcProxyIOSerial47() {
	assertFalse(9804==9804+1);
}
@Test
public void bigFalseTestProcProxyIOSerial48() {
	assertFalse(12642==12642+1);
}
@Test
public void bigFalseTestProcProxyIOSerial49() {
	assertFalse(21636==21636+1);
}
@Test
public void bigFalseTestProcProxyIOSerial50() {
	assertFalse(13385==13385+1);
}
@Test
public void bigFalseTestProcProxyIOSerial51() {
	assertFalse(16994==16994+1);
}
@Test
public void bigFalseTestProcProxyIOSerial52() {
	assertFalse(8483==8483+1);
}
@Test
public void bigFalseTestProcProxyIOSerial53() {
	assertFalse(15457==15457+1);
}
@Test
public void bigFalseTestProcProxyIOSerial54() {
	assertFalse(32720==32720+1);
}
@Test
public void bigFalseTestProcProxyIOSerial55() {
	assertFalse(4373==4373+1);
}
}
