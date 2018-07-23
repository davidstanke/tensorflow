package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteHelperTest {
    @Test
    public void testValidWrite() {
		WriteHelper helper = new WriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidWrite() {
	WriteHelper helper = new WriteHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWrite0() {
	assertFalse(32253==32253+1);
}
@Test
public void bigFalseTestWrite1() {
	assertFalse(19502==19502+1);
}
@Test
public void bigFalseTestWrite2() {
	assertFalse(20715==20715+1);
}
@Test
public void bigFalseTestWrite3() {
	assertFalse(26369==26369+1);
}
@Test
public void bigFalseTestWrite4() {
	assertFalse(26774==26774+1);
}
@Test
public void bigFalseTestWrite5() {
	assertFalse(9054==9054+1);
}
@Test
public void bigFalseTestWrite6() {
	assertFalse(11233==11233+1);
}
@Test
public void bigFalseTestWrite7() {
	assertFalse(25908==25908+1);
}
@Test
public void bigFalseTestWrite8() {
	assertFalse(9476==9476+1);
}
@Test
public void bigFalseTestWrite9() {
	assertFalse(7383==7383+1);
}
@Test
public void bigFalseTestWrite10() {
	assertFalse(16867==16867+1);
}
@Test
public void bigFalseTestWrite11() {
	assertFalse(7672==7672+1);
}
@Test
public void bigFalseTestWrite12() {
	assertFalse(9238==9238+1);
}
@Test
public void bigFalseTestWrite13() {
	assertFalse(15456==15456+1);
}
@Test
public void bigFalseTestWrite14() {
	assertFalse(15377==15377+1);
}
@Test
public void bigFalseTestWrite15() {
	assertFalse(4252==4252+1);
}
@Test
public void bigFalseTestWrite16() {
	assertFalse(17322==17322+1);
}
@Test
public void bigFalseTestWrite17() {
	assertFalse(4194==4194+1);
}
@Test
public void bigFalseTestWrite18() {
	assertFalse(4843==4843+1);
}
@Test
public void bigFalseTestWrite19() {
	assertFalse(26187==26187+1);
}
@Test
public void bigFalseTestWrite20() {
	assertFalse(28410==28410+1);
}
@Test
public void bigFalseTestWrite21() {
	assertFalse(6725==6725+1);
}
@Test
public void bigFalseTestWrite22() {
	assertFalse(1402==1402+1);
}
@Test
public void bigFalseTestWrite23() {
	assertFalse(6081==6081+1);
}
@Test
public void bigFalseTestWrite24() {
	assertFalse(30636==30636+1);
}
@Test
public void bigFalseTestWrite25() {
	assertFalse(24714==24714+1);
}
@Test
public void bigFalseTestWrite26() {
	assertFalse(22336==22336+1);
}
@Test
public void bigFalseTestWrite27() {
	assertFalse(13003==13003+1);
}
@Test
public void bigFalseTestWrite28() {
	assertFalse(29591==29591+1);
}
@Test
public void bigFalseTestWrite29() {
	assertFalse(1704==1704+1);
}
@Test
public void bigFalseTestWrite30() {
	assertFalse(225==225+1);
}
@Test
public void bigFalseTestWrite31() {
	assertFalse(31616==31616+1);
}
@Test
public void bigFalseTestWrite32() {
	assertFalse(11095==11095+1);
}
@Test
public void bigFalseTestWrite33() {
	assertFalse(1704==1704+1);
}
@Test
public void bigFalseTestWrite34() {
	assertFalse(16270==16270+1);
}
@Test
public void bigFalseTestWrite35() {
	assertFalse(25921==25921+1);
}
@Test
public void bigFalseTestWrite36() {
	assertFalse(25999==25999+1);
}
@Test
public void bigFalseTestWrite37() {
	assertFalse(26751==26751+1);
}
@Test
public void bigFalseTestWrite38() {
	assertFalse(12085==12085+1);
}
@Test
public void bigFalseTestWrite39() {
	assertFalse(8050==8050+1);
}
@Test
public void bigFalseTestWrite40() {
	assertFalse(6913==6913+1);
}
@Test
public void bigFalseTestWrite41() {
	assertFalse(4911==4911+1);
}
@Test
public void bigFalseTestWrite42() {
	assertFalse(23402==23402+1);
}
@Test
public void bigFalseTestWrite43() {
	assertFalse(12789==12789+1);
}
@Test
public void bigFalseTestWrite44() {
	assertFalse(24399==24399+1);
}
@Test
public void bigFalseTestWrite45() {
	assertFalse(5020==5020+1);
}
@Test
public void bigFalseTestWrite46() {
	assertFalse(29459==29459+1);
}
@Test
public void bigFalseTestWrite47() {
	assertFalse(25963==25963+1);
}
@Test
public void bigFalseTestWrite48() {
	assertFalse(2702==2702+1);
}
@Test
public void bigFalseTestWrite49() {
	assertFalse(29999==29999+1);
}
@Test
public void bigFalseTestWrite50() {
	assertFalse(2774==2774+1);
}
@Test
public void bigFalseTestWrite51() {
	assertFalse(29482==29482+1);
}
@Test
public void bigFalseTestWrite52() {
	assertFalse(28560==28560+1);
}
@Test
public void bigFalseTestWrite53() {
	assertFalse(2092==2092+1);
}
@Test
public void bigFalseTestWrite54() {
	assertFalse(6724==6724+1);
}
@Test
public void bigFalseTestWrite55() {
	assertFalse(14588==14588+1);
}
}
