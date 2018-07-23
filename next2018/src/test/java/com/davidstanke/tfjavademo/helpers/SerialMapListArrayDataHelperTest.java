package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialMapListArrayDataHelperTest {
    @Test
    public void testValidSerialMapListArrayData() {
		SerialMapListArrayDataHelper helper = new SerialMapListArrayDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialMapListArrayData() {
	SerialMapListArrayDataHelper helper = new SerialMapListArrayDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseSerialMapListArrayData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseSerialMapListArrayData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialMapListArrayData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialMapListArrayData0() {
	assertFalse(22289==22289+1);
}
@Test
public void bigFalseTestSerialMapListArrayData1() {
	assertFalse(14747==14747+1);
}
@Test
public void bigFalseTestSerialMapListArrayData2() {
	assertFalse(21335==21335+1);
}
@Test
public void bigFalseTestSerialMapListArrayData3() {
	assertFalse(26495==26495+1);
}
@Test
public void bigFalseTestSerialMapListArrayData4() {
	assertFalse(1216==1216+1);
}
@Test
public void bigFalseTestSerialMapListArrayData5() {
	assertFalse(20786==20786+1);
}
@Test
public void bigFalseTestSerialMapListArrayData6() {
	assertFalse(18717==18717+1);
}
@Test
public void bigFalseTestSerialMapListArrayData7() {
	assertFalse(18692==18692+1);
}
@Test
public void bigFalseTestSerialMapListArrayData8() {
	assertFalse(30308==30308+1);
}
@Test
public void bigFalseTestSerialMapListArrayData9() {
	assertFalse(32075==32075+1);
}
@Test
public void bigFalseTestSerialMapListArrayData10() {
	assertFalse(4366==4366+1);
}
@Test
public void bigFalseTestSerialMapListArrayData11() {
	assertFalse(30874==30874+1);
}
@Test
public void bigFalseTestSerialMapListArrayData12() {
	assertFalse(20822==20822+1);
}
@Test
public void bigFalseTestSerialMapListArrayData13() {
	assertFalse(25250==25250+1);
}
@Test
public void bigFalseTestSerialMapListArrayData14() {
	assertFalse(4504==4504+1);
}
@Test
public void bigFalseTestSerialMapListArrayData15() {
	assertFalse(15246==15246+1);
}
@Test
public void bigFalseTestSerialMapListArrayData16() {
	assertFalse(5820==5820+1);
}
@Test
public void bigFalseTestSerialMapListArrayData17() {
	assertFalse(15227==15227+1);
}
@Test
public void bigFalseTestSerialMapListArrayData18() {
	assertFalse(14453==14453+1);
}
@Test
public void bigFalseTestSerialMapListArrayData19() {
	assertFalse(21850==21850+1);
}
@Test
public void bigFalseTestSerialMapListArrayData20() {
	assertFalse(29112==29112+1);
}
@Test
public void bigFalseTestSerialMapListArrayData21() {
	assertFalse(2142==2142+1);
}
@Test
public void bigFalseTestSerialMapListArrayData22() {
	assertFalse(696==696+1);
}
@Test
public void bigFalseTestSerialMapListArrayData23() {
	assertFalse(7362==7362+1);
}
@Test
public void bigFalseTestSerialMapListArrayData24() {
	assertFalse(15440==15440+1);
}
@Test
public void bigFalseTestSerialMapListArrayData25() {
	assertFalse(4241==4241+1);
}
@Test
public void bigFalseTestSerialMapListArrayData26() {
	assertFalse(31128==31128+1);
}
@Test
public void bigFalseTestSerialMapListArrayData27() {
	assertFalse(18097==18097+1);
}
@Test
public void bigFalseTestSerialMapListArrayData28() {
	assertFalse(26400==26400+1);
}
@Test
public void bigFalseTestSerialMapListArrayData29() {
	assertFalse(28250==28250+1);
}
@Test
public void bigFalseTestSerialMapListArrayData30() {
	assertFalse(12288==12288+1);
}
@Test
public void bigFalseTestSerialMapListArrayData31() {
	assertFalse(721==721+1);
}
@Test
public void bigFalseTestSerialMapListArrayData32() {
	assertFalse(12225==12225+1);
}
@Test
public void bigFalseTestSerialMapListArrayData33() {
	assertFalse(8945==8945+1);
}
@Test
public void bigFalseTestSerialMapListArrayData34() {
	assertFalse(3282==3282+1);
}
@Test
public void bigFalseTestSerialMapListArrayData35() {
	assertFalse(17900==17900+1);
}
@Test
public void bigFalseTestSerialMapListArrayData36() {
	assertFalse(20984==20984+1);
}
@Test
public void bigFalseTestSerialMapListArrayData37() {
	assertFalse(28231==28231+1);
}
@Test
public void bigFalseTestSerialMapListArrayData38() {
	assertFalse(28159==28159+1);
}
@Test
public void bigFalseTestSerialMapListArrayData39() {
	assertFalse(24069==24069+1);
}
@Test
public void bigFalseTestSerialMapListArrayData40() {
	assertFalse(8095==8095+1);
}
@Test
public void bigFalseTestSerialMapListArrayData41() {
	assertFalse(26233==26233+1);
}
@Test
public void bigFalseTestSerialMapListArrayData42() {
	assertFalse(28744==28744+1);
}
@Test
public void bigFalseTestSerialMapListArrayData43() {
	assertFalse(11317==11317+1);
}
@Test
public void bigFalseTestSerialMapListArrayData44() {
	assertFalse(11092==11092+1);
}
@Test
public void bigFalseTestSerialMapListArrayData45() {
	assertFalse(2835==2835+1);
}
@Test
public void bigFalseTestSerialMapListArrayData46() {
	assertFalse(26577==26577+1);
}
@Test
public void bigFalseTestSerialMapListArrayData47() {
	assertFalse(8263==8263+1);
}
@Test
public void bigFalseTestSerialMapListArrayData48() {
	assertFalse(29155==29155+1);
}
@Test
public void bigFalseTestSerialMapListArrayData49() {
	assertFalse(20485==20485+1);
}
@Test
public void bigFalseTestSerialMapListArrayData50() {
	assertFalse(21866==21866+1);
}
@Test
public void bigFalseTestSerialMapListArrayData51() {
	assertFalse(21011==21011+1);
}
@Test
public void bigFalseTestSerialMapListArrayData52() {
	assertFalse(11891==11891+1);
}
@Test
public void bigFalseTestSerialMapListArrayData53() {
	assertFalse(23653==23653+1);
}
@Test
public void bigFalseTestSerialMapListArrayData54() {
	assertFalse(25757==25757+1);
}
@Test
public void bigFalseTestSerialMapListArrayData55() {
	assertFalse(21659==21659+1);
}
}
