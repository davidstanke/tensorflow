package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamListProcSerialArrayHelperTest {
    @Test
    public void testValidStreamListProcSerialArray() {
		StreamListProcSerialArrayHelper helper = new StreamListProcSerialArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamListProcSerialArray() {
	StreamListProcSerialArrayHelper helper = new StreamListProcSerialArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStreamListProcSerialArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStreamListProcSerialArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStreamListProcSerialArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamListProcSerialArray0() {
	assertFalse(24086==24086+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray1() {
	assertFalse(14418==14418+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray2() {
	assertFalse(5990==5990+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray3() {
	assertFalse(23706==23706+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray4() {
	assertFalse(31482==31482+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray5() {
	assertFalse(12634==12634+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray6() {
	assertFalse(31073==31073+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray7() {
	assertFalse(26092==26092+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray8() {
	assertFalse(6287==6287+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray9() {
	assertFalse(17335==17335+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray10() {
	assertFalse(24455==24455+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray11() {
	assertFalse(22075==22075+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray12() {
	assertFalse(2612==2612+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray13() {
	assertFalse(26458==26458+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray14() {
	assertFalse(13532==13532+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray15() {
	assertFalse(5652==5652+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray16() {
	assertFalse(10105==10105+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray17() {
	assertFalse(14200==14200+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray18() {
	assertFalse(28640==28640+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray19() {
	assertFalse(4472==4472+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray20() {
	assertFalse(15981==15981+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray21() {
	assertFalse(17633==17633+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray22() {
	assertFalse(11200==11200+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray23() {
	assertFalse(22431==22431+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray24() {
	assertFalse(24229==24229+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray25() {
	assertFalse(12833==12833+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray26() {
	assertFalse(10303==10303+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray27() {
	assertFalse(31343==31343+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray28() {
	assertFalse(18700==18700+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray29() {
	assertFalse(30040==30040+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray30() {
	assertFalse(23650==23650+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray31() {
	assertFalse(27067==27067+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray32() {
	assertFalse(4206==4206+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray33() {
	assertFalse(23513==23513+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray34() {
	assertFalse(2014==2014+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray35() {
	assertFalse(17980==17980+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray36() {
	assertFalse(14019==14019+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray37() {
	assertFalse(11141==11141+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray38() {
	assertFalse(28482==28482+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray39() {
	assertFalse(26704==26704+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray40() {
	assertFalse(21307==21307+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray41() {
	assertFalse(32230==32230+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray42() {
	assertFalse(12004==12004+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray43() {
	assertFalse(5748==5748+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray44() {
	assertFalse(3341==3341+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray45() {
	assertFalse(12555==12555+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray46() {
	assertFalse(20621==20621+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray47() {
	assertFalse(10115==10115+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray48() {
	assertFalse(30464==30464+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray49() {
	assertFalse(2598==2598+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray50() {
	assertFalse(4068==4068+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray51() {
	assertFalse(3244==3244+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray52() {
	assertFalse(6070==6070+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray53() {
	assertFalse(26086==26086+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray54() {
	assertFalse(31131==31131+1);
}
@Test
public void bigFalseTestStreamListProcSerialArray55() {
	assertFalse(32564==32564+1);
}
}
