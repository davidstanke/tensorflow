package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOIOArrayStringWriteHelperTest {
    @Test
    public void testValidIOIOArrayStringWrite() {
		IOIOArrayStringWriteHelper helper = new IOIOArrayStringWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIOIOArrayStringWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseIOIOArrayStringWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIOIOArrayStringWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOIOArrayStringWrite0() {
	assertFalse(10862==10862+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite1() {
	assertFalse(20894==20894+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite2() {
	assertFalse(4142==4142+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite3() {
	assertFalse(13528==13528+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite4() {
	assertFalse(4567==4567+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite5() {
	assertFalse(19671==19671+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite6() {
	assertFalse(27805==27805+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite7() {
	assertFalse(637==637+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite8() {
	assertFalse(23343==23343+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite9() {
	assertFalse(26748==26748+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite10() {
	assertFalse(7858==7858+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite11() {
	assertFalse(30743==30743+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite12() {
	assertFalse(16908==16908+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite13() {
	assertFalse(31194==31194+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite14() {
	assertFalse(25590==25590+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite15() {
	assertFalse(14673==14673+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite16() {
	assertFalse(5371==5371+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite17() {
	assertFalse(13480==13480+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite18() {
	assertFalse(25980==25980+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite19() {
	assertFalse(16565==16565+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite20() {
	assertFalse(19533==19533+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite21() {
	assertFalse(2016==2016+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite22() {
	assertFalse(18824==18824+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite23() {
	assertFalse(19943==19943+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite24() {
	assertFalse(16806==16806+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite25() {
	assertFalse(27746==27746+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite26() {
	assertFalse(13310==13310+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite27() {
	assertFalse(31653==31653+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite28() {
	assertFalse(21571==21571+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite29() {
	assertFalse(328==328+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite30() {
	assertFalse(24972==24972+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite31() {
	assertFalse(14719==14719+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite32() {
	assertFalse(1550==1550+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite33() {
	assertFalse(4615==4615+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite34() {
	assertFalse(18839==18839+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite35() {
	assertFalse(9557==9557+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite36() {
	assertFalse(23907==23907+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite37() {
	assertFalse(25162==25162+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite38() {
	assertFalse(29414==29414+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite39() {
	assertFalse(149==149+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite40() {
	assertFalse(6048==6048+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite41() {
	assertFalse(23438==23438+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite42() {
	assertFalse(26385==26385+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite43() {
	assertFalse(15666==15666+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite44() {
	assertFalse(30831==30831+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite45() {
	assertFalse(30846==30846+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite46() {
	assertFalse(28839==28839+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite47() {
	assertFalse(24163==24163+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite48() {
	assertFalse(16851==16851+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite49() {
	assertFalse(2572==2572+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite50() {
	assertFalse(4130==4130+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite51() {
	assertFalse(10528==10528+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite52() {
	assertFalse(8435==8435+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite53() {
	assertFalse(12883==12883+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite54() {
	assertFalse(21387==21387+1);
}
@Test
public void bigFalseTestIOIOArrayStringWrite55() {
	assertFalse(24669==24669+1);
}
}
