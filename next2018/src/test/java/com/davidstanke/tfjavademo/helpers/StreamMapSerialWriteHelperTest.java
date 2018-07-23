package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamMapSerialWriteHelperTest {
    @Test
    public void testValidStreamMapSerialWrite() {
		StreamMapSerialWriteHelper helper = new StreamMapSerialWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStreamMapSerialWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStreamMapSerialWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStreamMapSerialWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamMapSerialWrite0() {
	assertFalse(19368==19368+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite1() {
	assertFalse(14288==14288+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite2() {
	assertFalse(11471==11471+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite3() {
	assertFalse(27398==27398+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite4() {
	assertFalse(28188==28188+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite5() {
	assertFalse(25007==25007+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite6() {
	assertFalse(29283==29283+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite7() {
	assertFalse(15665==15665+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite8() {
	assertFalse(23997==23997+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite9() {
	assertFalse(12003==12003+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite10() {
	assertFalse(17394==17394+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite11() {
	assertFalse(25753==25753+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite12() {
	assertFalse(28632==28632+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite13() {
	assertFalse(22616==22616+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite14() {
	assertFalse(32265==32265+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite15() {
	assertFalse(10927==10927+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite16() {
	assertFalse(10484==10484+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite17() {
	assertFalse(26603==26603+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite18() {
	assertFalse(20023==20023+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite19() {
	assertFalse(24352==24352+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite20() {
	assertFalse(21711==21711+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite21() {
	assertFalse(14005==14005+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite22() {
	assertFalse(8556==8556+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite23() {
	assertFalse(23811==23811+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite24() {
	assertFalse(8732==8732+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite25() {
	assertFalse(1048==1048+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite26() {
	assertFalse(7180==7180+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite27() {
	assertFalse(14023==14023+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite28() {
	assertFalse(15871==15871+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite29() {
	assertFalse(29067==29067+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite30() {
	assertFalse(30678==30678+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite31() {
	assertFalse(13535==13535+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite32() {
	assertFalse(11076==11076+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite33() {
	assertFalse(28453==28453+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite34() {
	assertFalse(25464==25464+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite35() {
	assertFalse(4906==4906+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite36() {
	assertFalse(20835==20835+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite37() {
	assertFalse(25835==25835+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite38() {
	assertFalse(16366==16366+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite39() {
	assertFalse(10532==10532+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite40() {
	assertFalse(32564==32564+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite41() {
	assertFalse(9433==9433+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite42() {
	assertFalse(22430==22430+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite43() {
	assertFalse(26831==26831+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite44() {
	assertFalse(23922==23922+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite45() {
	assertFalse(29106==29106+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite46() {
	assertFalse(27445==27445+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite47() {
	assertFalse(24671==24671+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite48() {
	assertFalse(3313==3313+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite49() {
	assertFalse(9863==9863+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite50() {
	assertFalse(12351==12351+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite51() {
	assertFalse(10920==10920+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite52() {
	assertFalse(27807==27807+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite53() {
	assertFalse(19209==19209+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite54() {
	assertFalse(7561==7561+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite55() {
	assertFalse(31304==31304+1);
}
}
