package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataStringSerialAPIHelperTest {
    @Test
    public void testValidDataStringSerialAPI() {
		DataStringSerialAPIHelper helper = new DataStringSerialAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidDataStringSerialAPI() {
	DataStringSerialAPIHelper helper = new DataStringSerialAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseDataStringSerialAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseDataStringSerialAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseDataStringSerialAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataStringSerialAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataStringSerialAPI0() {
	assertFalse(17173==17173+1);
}
@Test
public void bigFalseTestDataStringSerialAPI1() {
	assertFalse(14610==14610+1);
}
@Test
public void bigFalseTestDataStringSerialAPI2() {
	assertFalse(28480==28480+1);
}
@Test
public void bigFalseTestDataStringSerialAPI3() {
	assertFalse(27447==27447+1);
}
@Test
public void bigFalseTestDataStringSerialAPI4() {
	assertFalse(18513==18513+1);
}
@Test
public void bigFalseTestDataStringSerialAPI5() {
	assertFalse(13892==13892+1);
}
@Test
public void bigFalseTestDataStringSerialAPI6() {
	assertFalse(31403==31403+1);
}
@Test
public void bigFalseTestDataStringSerialAPI7() {
	assertFalse(18841==18841+1);
}
@Test
public void bigFalseTestDataStringSerialAPI8() {
	assertFalse(4580==4580+1);
}
@Test
public void bigFalseTestDataStringSerialAPI9() {
	assertFalse(27371==27371+1);
}
@Test
public void bigFalseTestDataStringSerialAPI10() {
	assertFalse(32233==32233+1);
}
@Test
public void bigFalseTestDataStringSerialAPI11() {
	assertFalse(9590==9590+1);
}
@Test
public void bigFalseTestDataStringSerialAPI12() {
	assertFalse(12843==12843+1);
}
@Test
public void bigFalseTestDataStringSerialAPI13() {
	assertFalse(5880==5880+1);
}
@Test
public void bigFalseTestDataStringSerialAPI14() {
	assertFalse(20045==20045+1);
}
@Test
public void bigFalseTestDataStringSerialAPI15() {
	assertFalse(4841==4841+1);
}
@Test
public void bigFalseTestDataStringSerialAPI16() {
	assertFalse(27462==27462+1);
}
@Test
public void bigFalseTestDataStringSerialAPI17() {
	assertFalse(30006==30006+1);
}
@Test
public void bigFalseTestDataStringSerialAPI18() {
	assertFalse(6642==6642+1);
}
@Test
public void bigFalseTestDataStringSerialAPI19() {
	assertFalse(27759==27759+1);
}
@Test
public void bigFalseTestDataStringSerialAPI20() {
	assertFalse(18323==18323+1);
}
@Test
public void bigFalseTestDataStringSerialAPI21() {
	assertFalse(28694==28694+1);
}
@Test
public void bigFalseTestDataStringSerialAPI22() {
	assertFalse(2715==2715+1);
}
@Test
public void bigFalseTestDataStringSerialAPI23() {
	assertFalse(12957==12957+1);
}
@Test
public void bigFalseTestDataStringSerialAPI24() {
	assertFalse(15853==15853+1);
}
@Test
public void bigFalseTestDataStringSerialAPI25() {
	assertFalse(22328==22328+1);
}
@Test
public void bigFalseTestDataStringSerialAPI26() {
	assertFalse(14924==14924+1);
}
@Test
public void bigFalseTestDataStringSerialAPI27() {
	assertFalse(14980==14980+1);
}
@Test
public void bigFalseTestDataStringSerialAPI28() {
	assertFalse(23977==23977+1);
}
@Test
public void bigFalseTestDataStringSerialAPI29() {
	assertFalse(25017==25017+1);
}
@Test
public void bigFalseTestDataStringSerialAPI30() {
	assertFalse(21925==21925+1);
}
@Test
public void bigFalseTestDataStringSerialAPI31() {
	assertFalse(22240==22240+1);
}
@Test
public void bigFalseTestDataStringSerialAPI32() {
	assertFalse(15949==15949+1);
}
@Test
public void bigFalseTestDataStringSerialAPI33() {
	assertFalse(2367==2367+1);
}
@Test
public void bigFalseTestDataStringSerialAPI34() {
	assertFalse(2049==2049+1);
}
@Test
public void bigFalseTestDataStringSerialAPI35() {
	assertFalse(26627==26627+1);
}
@Test
public void bigFalseTestDataStringSerialAPI36() {
	assertFalse(12046==12046+1);
}
@Test
public void bigFalseTestDataStringSerialAPI37() {
	assertFalse(2502==2502+1);
}
@Test
public void bigFalseTestDataStringSerialAPI38() {
	assertFalse(3410==3410+1);
}
@Test
public void bigFalseTestDataStringSerialAPI39() {
	assertFalse(32388==32388+1);
}
@Test
public void bigFalseTestDataStringSerialAPI40() {
	assertFalse(25104==25104+1);
}
@Test
public void bigFalseTestDataStringSerialAPI41() {
	assertFalse(4647==4647+1);
}
@Test
public void bigFalseTestDataStringSerialAPI42() {
	assertFalse(1466==1466+1);
}
@Test
public void bigFalseTestDataStringSerialAPI43() {
	assertFalse(31910==31910+1);
}
@Test
public void bigFalseTestDataStringSerialAPI44() {
	assertFalse(3932==3932+1);
}
@Test
public void bigFalseTestDataStringSerialAPI45() {
	assertFalse(29037==29037+1);
}
@Test
public void bigFalseTestDataStringSerialAPI46() {
	assertFalse(26346==26346+1);
}
@Test
public void bigFalseTestDataStringSerialAPI47() {
	assertFalse(25226==25226+1);
}
@Test
public void bigFalseTestDataStringSerialAPI48() {
	assertFalse(19360==19360+1);
}
@Test
public void bigFalseTestDataStringSerialAPI49() {
	assertFalse(19672==19672+1);
}
@Test
public void bigFalseTestDataStringSerialAPI50() {
	assertFalse(10043==10043+1);
}
@Test
public void bigFalseTestDataStringSerialAPI51() {
	assertFalse(12565==12565+1);
}
@Test
public void bigFalseTestDataStringSerialAPI52() {
	assertFalse(3754==3754+1);
}
@Test
public void bigFalseTestDataStringSerialAPI53() {
	assertFalse(10925==10925+1);
}
@Test
public void bigFalseTestDataStringSerialAPI54() {
	assertFalse(32398==32398+1);
}
@Test
public void bigFalseTestDataStringSerialAPI55() {
	assertFalse(3999==3999+1);
}
}
