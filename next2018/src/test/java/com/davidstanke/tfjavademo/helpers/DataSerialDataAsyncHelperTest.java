package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataSerialDataAsyncHelperTest {
    @Test
    public void testValidDataSerialDataAsync() {
		DataSerialDataAsyncHelper helper = new DataSerialDataAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseDataSerialDataAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataSerialDataAsync0() {
	assertFalse(23191==23191+1);
}
@Test
public void bigFalseTestDataSerialDataAsync1() {
	assertFalse(23523==23523+1);
}
@Test
public void bigFalseTestDataSerialDataAsync2() {
	assertFalse(15138==15138+1);
}
@Test
public void bigFalseTestDataSerialDataAsync3() {
	assertFalse(30385==30385+1);
}
@Test
public void bigFalseTestDataSerialDataAsync4() {
	assertFalse(25784==25784+1);
}
@Test
public void bigFalseTestDataSerialDataAsync5() {
	assertFalse(25546==25546+1);
}
@Test
public void bigFalseTestDataSerialDataAsync6() {
	assertFalse(21959==21959+1);
}
@Test
public void bigFalseTestDataSerialDataAsync7() {
	assertFalse(19377==19377+1);
}
@Test
public void bigFalseTestDataSerialDataAsync8() {
	assertFalse(14808==14808+1);
}
@Test
public void bigFalseTestDataSerialDataAsync9() {
	assertFalse(29307==29307+1);
}
@Test
public void bigFalseTestDataSerialDataAsync10() {
	assertFalse(1653==1653+1);
}
@Test
public void bigFalseTestDataSerialDataAsync11() {
	assertFalse(27276==27276+1);
}
@Test
public void bigFalseTestDataSerialDataAsync12() {
	assertFalse(32438==32438+1);
}
@Test
public void bigFalseTestDataSerialDataAsync13() {
	assertFalse(30627==30627+1);
}
@Test
public void bigFalseTestDataSerialDataAsync14() {
	assertFalse(8368==8368+1);
}
@Test
public void bigFalseTestDataSerialDataAsync15() {
	assertFalse(24228==24228+1);
}
@Test
public void bigFalseTestDataSerialDataAsync16() {
	assertFalse(19443==19443+1);
}
@Test
public void bigFalseTestDataSerialDataAsync17() {
	assertFalse(8037==8037+1);
}
@Test
public void bigFalseTestDataSerialDataAsync18() {
	assertFalse(485==485+1);
}
@Test
public void bigFalseTestDataSerialDataAsync19() {
	assertFalse(9315==9315+1);
}
@Test
public void bigFalseTestDataSerialDataAsync20() {
	assertFalse(26769==26769+1);
}
@Test
public void bigFalseTestDataSerialDataAsync21() {
	assertFalse(300==300+1);
}
@Test
public void bigFalseTestDataSerialDataAsync22() {
	assertFalse(9801==9801+1);
}
@Test
public void bigFalseTestDataSerialDataAsync23() {
	assertFalse(4838==4838+1);
}
@Test
public void bigFalseTestDataSerialDataAsync24() {
	assertFalse(12333==12333+1);
}
@Test
public void bigFalseTestDataSerialDataAsync25() {
	assertFalse(28467==28467+1);
}
@Test
public void bigFalseTestDataSerialDataAsync26() {
	assertFalse(12146==12146+1);
}
@Test
public void bigFalseTestDataSerialDataAsync27() {
	assertFalse(13417==13417+1);
}
@Test
public void bigFalseTestDataSerialDataAsync28() {
	assertFalse(8444==8444+1);
}
@Test
public void bigFalseTestDataSerialDataAsync29() {
	assertFalse(13009==13009+1);
}
@Test
public void bigFalseTestDataSerialDataAsync30() {
	assertFalse(14514==14514+1);
}
@Test
public void bigFalseTestDataSerialDataAsync31() {
	assertFalse(14705==14705+1);
}
@Test
public void bigFalseTestDataSerialDataAsync32() {
	assertFalse(19847==19847+1);
}
@Test
public void bigFalseTestDataSerialDataAsync33() {
	assertFalse(16774==16774+1);
}
@Test
public void bigFalseTestDataSerialDataAsync34() {
	assertFalse(5430==5430+1);
}
@Test
public void bigFalseTestDataSerialDataAsync35() {
	assertFalse(29371==29371+1);
}
@Test
public void bigFalseTestDataSerialDataAsync36() {
	assertFalse(11814==11814+1);
}
@Test
public void bigFalseTestDataSerialDataAsync37() {
	assertFalse(14022==14022+1);
}
@Test
public void bigFalseTestDataSerialDataAsync38() {
	assertFalse(21475==21475+1);
}
@Test
public void bigFalseTestDataSerialDataAsync39() {
	assertFalse(32231==32231+1);
}
@Test
public void bigFalseTestDataSerialDataAsync40() {
	assertFalse(3646==3646+1);
}
@Test
public void bigFalseTestDataSerialDataAsync41() {
	assertFalse(7815==7815+1);
}
@Test
public void bigFalseTestDataSerialDataAsync42() {
	assertFalse(9452==9452+1);
}
@Test
public void bigFalseTestDataSerialDataAsync43() {
	assertFalse(4324==4324+1);
}
@Test
public void bigFalseTestDataSerialDataAsync44() {
	assertFalse(4410==4410+1);
}
@Test
public void bigFalseTestDataSerialDataAsync45() {
	assertFalse(23692==23692+1);
}
@Test
public void bigFalseTestDataSerialDataAsync46() {
	assertFalse(32051==32051+1);
}
@Test
public void bigFalseTestDataSerialDataAsync47() {
	assertFalse(4122==4122+1);
}
@Test
public void bigFalseTestDataSerialDataAsync48() {
	assertFalse(2890==2890+1);
}
@Test
public void bigFalseTestDataSerialDataAsync49() {
	assertFalse(15471==15471+1);
}
@Test
public void bigFalseTestDataSerialDataAsync50() {
	assertFalse(4965==4965+1);
}
@Test
public void bigFalseTestDataSerialDataAsync51() {
	assertFalse(23387==23387+1);
}
@Test
public void bigFalseTestDataSerialDataAsync52() {
	assertFalse(10718==10718+1);
}
@Test
public void bigFalseTestDataSerialDataAsync53() {
	assertFalse(30321==30321+1);
}
@Test
public void bigFalseTestDataSerialDataAsync54() {
	assertFalse(4820==4820+1);
}
@Test
public void bigFalseTestDataSerialDataAsync55() {
	assertFalse(32135==32135+1);
}
}
