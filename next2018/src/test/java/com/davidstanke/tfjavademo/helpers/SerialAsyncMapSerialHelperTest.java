package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialAsyncMapSerialHelperTest {
    @Test
    public void testValidSerialAsyncMapSerial() {
		SerialAsyncMapSerialHelper helper = new SerialAsyncMapSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialAsyncMapSerial() {
	SerialAsyncMapSerialHelper helper = new SerialAsyncMapSerialHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseSerialAsyncMapSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialAsyncMapSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialAsyncMapSerial0() {
	assertFalse(23760==23760+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial1() {
	assertFalse(15887==15887+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial2() {
	assertFalse(1685==1685+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial3() {
	assertFalse(16204==16204+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial4() {
	assertFalse(21951==21951+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial5() {
	assertFalse(5686==5686+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial6() {
	assertFalse(4104==4104+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial7() {
	assertFalse(9723==9723+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial8() {
	assertFalse(3584==3584+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial9() {
	assertFalse(3722==3722+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial10() {
	assertFalse(18532==18532+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial11() {
	assertFalse(27540==27540+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial12() {
	assertFalse(1616==1616+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial13() {
	assertFalse(4388==4388+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial14() {
	assertFalse(22933==22933+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial15() {
	assertFalse(25648==25648+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial16() {
	assertFalse(29283==29283+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial17() {
	assertFalse(32360==32360+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial18() {
	assertFalse(29955==29955+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial19() {
	assertFalse(11070==11070+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial20() {
	assertFalse(21594==21594+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial21() {
	assertFalse(10444==10444+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial22() {
	assertFalse(12650==12650+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial23() {
	assertFalse(8750==8750+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial24() {
	assertFalse(21508==21508+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial25() {
	assertFalse(16743==16743+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial26() {
	assertFalse(27257==27257+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial27() {
	assertFalse(11746==11746+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial28() {
	assertFalse(19928==19928+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial29() {
	assertFalse(318==318+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial30() {
	assertFalse(32300==32300+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial31() {
	assertFalse(24277==24277+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial32() {
	assertFalse(21935==21935+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial33() {
	assertFalse(6989==6989+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial34() {
	assertFalse(1001==1001+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial35() {
	assertFalse(28681==28681+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial36() {
	assertFalse(10561==10561+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial37() {
	assertFalse(17239==17239+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial38() {
	assertFalse(22877==22877+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial39() {
	assertFalse(18610==18610+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial40() {
	assertFalse(20070==20070+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial41() {
	assertFalse(21869==21869+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial42() {
	assertFalse(8468==8468+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial43() {
	assertFalse(27812==27812+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial44() {
	assertFalse(22792==22792+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial45() {
	assertFalse(27201==27201+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial46() {
	assertFalse(3802==3802+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial47() {
	assertFalse(1917==1917+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial48() {
	assertFalse(5355==5355+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial49() {
	assertFalse(25640==25640+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial50() {
	assertFalse(7637==7637+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial51() {
	assertFalse(32402==32402+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial52() {
	assertFalse(3868==3868+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial53() {
	assertFalse(16624==16624+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial54() {
	assertFalse(3167==3167+1);
}
@Test
public void bigFalseTestSerialAsyncMapSerial55() {
	assertFalse(13723==13723+1);
}
}
