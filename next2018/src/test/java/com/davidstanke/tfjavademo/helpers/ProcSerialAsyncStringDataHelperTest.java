package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcSerialAsyncStringDataHelperTest {
    @Test
    public void testValidProcSerialAsyncStringData() {
		ProcSerialAsyncStringDataHelper helper = new ProcSerialAsyncStringDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseProcSerialAsyncStringData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProcSerialAsyncStringData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcSerialAsyncStringData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcSerialAsyncStringData0() {
	assertFalse(27199==27199+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData1() {
	assertFalse(4697==4697+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData2() {
	assertFalse(25180==25180+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData3() {
	assertFalse(5019==5019+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData4() {
	assertFalse(17695==17695+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData5() {
	assertFalse(30837==30837+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData6() {
	assertFalse(6943==6943+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData7() {
	assertFalse(1579==1579+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData8() {
	assertFalse(8974==8974+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData9() {
	assertFalse(18274==18274+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData10() {
	assertFalse(22178==22178+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData11() {
	assertFalse(2323==2323+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData12() {
	assertFalse(10860==10860+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData13() {
	assertFalse(31493==31493+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData14() {
	assertFalse(10595==10595+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData15() {
	assertFalse(29194==29194+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData16() {
	assertFalse(1930==1930+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData17() {
	assertFalse(3618==3618+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData18() {
	assertFalse(8178==8178+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData19() {
	assertFalse(20585==20585+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData20() {
	assertFalse(14613==14613+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData21() {
	assertFalse(27727==27727+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData22() {
	assertFalse(3896==3896+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData23() {
	assertFalse(17800==17800+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData24() {
	assertFalse(14154==14154+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData25() {
	assertFalse(1979==1979+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData26() {
	assertFalse(7562==7562+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData27() {
	assertFalse(1752==1752+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData28() {
	assertFalse(25048==25048+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData29() {
	assertFalse(3745==3745+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData30() {
	assertFalse(20594==20594+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData31() {
	assertFalse(26048==26048+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData32() {
	assertFalse(24724==24724+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData33() {
	assertFalse(31881==31881+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData34() {
	assertFalse(11063==11063+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData35() {
	assertFalse(31032==31032+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData36() {
	assertFalse(25311==25311+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData37() {
	assertFalse(837==837+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData38() {
	assertFalse(10802==10802+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData39() {
	assertFalse(17704==17704+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData40() {
	assertFalse(27095==27095+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData41() {
	assertFalse(1959==1959+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData42() {
	assertFalse(9936==9936+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData43() {
	assertFalse(31614==31614+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData44() {
	assertFalse(2368==2368+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData45() {
	assertFalse(11779==11779+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData46() {
	assertFalse(28774==28774+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData47() {
	assertFalse(13073==13073+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData48() {
	assertFalse(19249==19249+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData49() {
	assertFalse(12904==12904+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData50() {
	assertFalse(9656==9656+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData51() {
	assertFalse(12345==12345+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData52() {
	assertFalse(8830==8830+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData53() {
	assertFalse(2205==2205+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData54() {
	assertFalse(6983==6983+1);
}
@Test
public void bigFalseTestProcSerialAsyncStringData55() {
	assertFalse(6955==6955+1);
}
}
