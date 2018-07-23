package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcSerialIOFetchWriteHelperTest {
    @Test
    public void testValidProcSerialIOFetchWrite() {
		ProcSerialIOFetchWriteHelper helper = new ProcSerialIOFetchWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcSerialIOFetchWrite() {
	ProcSerialIOFetchWriteHelper helper = new ProcSerialIOFetchWriteHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestProcSerialIOFetchWrite0() {
	assertFalse(10901==10901+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite1() {
	assertFalse(11984==11984+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite2() {
	assertFalse(4106==4106+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite3() {
	assertFalse(24747==24747+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite4() {
	assertFalse(22858==22858+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite5() {
	assertFalse(18386==18386+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite6() {
	assertFalse(11582==11582+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite7() {
	assertFalse(12682==12682+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite8() {
	assertFalse(25260==25260+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite9() {
	assertFalse(27391==27391+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite10() {
	assertFalse(6809==6809+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite11() {
	assertFalse(6542==6542+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite12() {
	assertFalse(19344==19344+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite13() {
	assertFalse(1897==1897+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite14() {
	assertFalse(4519==4519+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite15() {
	assertFalse(26507==26507+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite16() {
	assertFalse(5857==5857+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite17() {
	assertFalse(30911==30911+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite18() {
	assertFalse(19765==19765+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite19() {
	assertFalse(16927==16927+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite20() {
	assertFalse(28514==28514+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite21() {
	assertFalse(5209==5209+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite22() {
	assertFalse(16231==16231+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite23() {
	assertFalse(14751==14751+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite24() {
	assertFalse(12579==12579+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite25() {
	assertFalse(31493==31493+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite26() {
	assertFalse(3480==3480+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite27() {
	assertFalse(3266==3266+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite28() {
	assertFalse(3776==3776+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite29() {
	assertFalse(15247==15247+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite30() {
	assertFalse(28148==28148+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite31() {
	assertFalse(3088==3088+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite32() {
	assertFalse(20061==20061+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite33() {
	assertFalse(4626==4626+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite34() {
	assertFalse(17111==17111+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite35() {
	assertFalse(18440==18440+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite36() {
	assertFalse(23137==23137+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite37() {
	assertFalse(20481==20481+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite38() {
	assertFalse(4068==4068+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite39() {
	assertFalse(30228==30228+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite40() {
	assertFalse(8693==8693+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite41() {
	assertFalse(14580==14580+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite42() {
	assertFalse(9445==9445+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite43() {
	assertFalse(14381==14381+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite44() {
	assertFalse(1339==1339+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite45() {
	assertFalse(24628==24628+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite46() {
	assertFalse(6758==6758+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite47() {
	assertFalse(13134==13134+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite48() {
	assertFalse(18767==18767+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite49() {
	assertFalse(21253==21253+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite50() {
	assertFalse(31760==31760+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite51() {
	assertFalse(8346==8346+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite52() {
	assertFalse(20478==20478+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite53() {
	assertFalse(7094==7094+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite54() {
	assertFalse(15558==15558+1);
}
@Test
public void bigFalseTestProcSerialIOFetchWrite55() {
	assertFalse(17740==17740+1);
}
}
