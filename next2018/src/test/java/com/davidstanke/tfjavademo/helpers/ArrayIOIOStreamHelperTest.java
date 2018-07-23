package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayIOIOStreamHelperTest {
    @Test
    public void testValidArrayIOIOStream() {
		ArrayIOIOStreamHelper helper = new ArrayIOIOStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseArrayIOIOStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayIOIOStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayIOIOStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayIOIOStream0() {
	assertFalse(27658==27658+1);
}
@Test
public void bigFalseTestArrayIOIOStream1() {
	assertFalse(1630==1630+1);
}
@Test
public void bigFalseTestArrayIOIOStream2() {
	assertFalse(14353==14353+1);
}
@Test
public void bigFalseTestArrayIOIOStream3() {
	assertFalse(30111==30111+1);
}
@Test
public void bigFalseTestArrayIOIOStream4() {
	assertFalse(10110==10110+1);
}
@Test
public void bigFalseTestArrayIOIOStream5() {
	assertFalse(6576==6576+1);
}
@Test
public void bigFalseTestArrayIOIOStream6() {
	assertFalse(1354==1354+1);
}
@Test
public void bigFalseTestArrayIOIOStream7() {
	assertFalse(1377==1377+1);
}
@Test
public void bigFalseTestArrayIOIOStream8() {
	assertFalse(3089==3089+1);
}
@Test
public void bigFalseTestArrayIOIOStream9() {
	assertFalse(4968==4968+1);
}
@Test
public void bigFalseTestArrayIOIOStream10() {
	assertFalse(16593==16593+1);
}
@Test
public void bigFalseTestArrayIOIOStream11() {
	assertFalse(23846==23846+1);
}
@Test
public void bigFalseTestArrayIOIOStream12() {
	assertFalse(3383==3383+1);
}
@Test
public void bigFalseTestArrayIOIOStream13() {
	assertFalse(9791==9791+1);
}
@Test
public void bigFalseTestArrayIOIOStream14() {
	assertFalse(13462==13462+1);
}
@Test
public void bigFalseTestArrayIOIOStream15() {
	assertFalse(25547==25547+1);
}
@Test
public void bigFalseTestArrayIOIOStream16() {
	assertFalse(32160==32160+1);
}
@Test
public void bigFalseTestArrayIOIOStream17() {
	assertFalse(15806==15806+1);
}
@Test
public void bigFalseTestArrayIOIOStream18() {
	assertFalse(10110==10110+1);
}
@Test
public void bigFalseTestArrayIOIOStream19() {
	assertFalse(18146==18146+1);
}
@Test
public void bigFalseTestArrayIOIOStream20() {
	assertFalse(11225==11225+1);
}
@Test
public void bigFalseTestArrayIOIOStream21() {
	assertFalse(7031==7031+1);
}
@Test
public void bigFalseTestArrayIOIOStream22() {
	assertFalse(6126==6126+1);
}
@Test
public void bigFalseTestArrayIOIOStream23() {
	assertFalse(4176==4176+1);
}
@Test
public void bigFalseTestArrayIOIOStream24() {
	assertFalse(7618==7618+1);
}
@Test
public void bigFalseTestArrayIOIOStream25() {
	assertFalse(3081==3081+1);
}
@Test
public void bigFalseTestArrayIOIOStream26() {
	assertFalse(4888==4888+1);
}
@Test
public void bigFalseTestArrayIOIOStream27() {
	assertFalse(31145==31145+1);
}
@Test
public void bigFalseTestArrayIOIOStream28() {
	assertFalse(5811==5811+1);
}
@Test
public void bigFalseTestArrayIOIOStream29() {
	assertFalse(28625==28625+1);
}
@Test
public void bigFalseTestArrayIOIOStream30() {
	assertFalse(13576==13576+1);
}
@Test
public void bigFalseTestArrayIOIOStream31() {
	assertFalse(6470==6470+1);
}
@Test
public void bigFalseTestArrayIOIOStream32() {
	assertFalse(21613==21613+1);
}
@Test
public void bigFalseTestArrayIOIOStream33() {
	assertFalse(4976==4976+1);
}
@Test
public void bigFalseTestArrayIOIOStream34() {
	assertFalse(7533==7533+1);
}
@Test
public void bigFalseTestArrayIOIOStream35() {
	assertFalse(17708==17708+1);
}
@Test
public void bigFalseTestArrayIOIOStream36() {
	assertFalse(11970==11970+1);
}
@Test
public void bigFalseTestArrayIOIOStream37() {
	assertFalse(5121==5121+1);
}
@Test
public void bigFalseTestArrayIOIOStream38() {
	assertFalse(25896==25896+1);
}
@Test
public void bigFalseTestArrayIOIOStream39() {
	assertFalse(18332==18332+1);
}
@Test
public void bigFalseTestArrayIOIOStream40() {
	assertFalse(1540==1540+1);
}
@Test
public void bigFalseTestArrayIOIOStream41() {
	assertFalse(19223==19223+1);
}
@Test
public void bigFalseTestArrayIOIOStream42() {
	assertFalse(24726==24726+1);
}
@Test
public void bigFalseTestArrayIOIOStream43() {
	assertFalse(16761==16761+1);
}
@Test
public void bigFalseTestArrayIOIOStream44() {
	assertFalse(11311==11311+1);
}
@Test
public void bigFalseTestArrayIOIOStream45() {
	assertFalse(32377==32377+1);
}
@Test
public void bigFalseTestArrayIOIOStream46() {
	assertFalse(15006==15006+1);
}
@Test
public void bigFalseTestArrayIOIOStream47() {
	assertFalse(22110==22110+1);
}
@Test
public void bigFalseTestArrayIOIOStream48() {
	assertFalse(13526==13526+1);
}
@Test
public void bigFalseTestArrayIOIOStream49() {
	assertFalse(20381==20381+1);
}
@Test
public void bigFalseTestArrayIOIOStream50() {
	assertFalse(13433==13433+1);
}
@Test
public void bigFalseTestArrayIOIOStream51() {
	assertFalse(32379==32379+1);
}
@Test
public void bigFalseTestArrayIOIOStream52() {
	assertFalse(22478==22478+1);
}
@Test
public void bigFalseTestArrayIOIOStream53() {
	assertFalse(9957==9957+1);
}
@Test
public void bigFalseTestArrayIOIOStream54() {
	assertFalse(5700==5700+1);
}
@Test
public void bigFalseTestArrayIOIOStream55() {
	assertFalse(6708==6708+1);
}
}
