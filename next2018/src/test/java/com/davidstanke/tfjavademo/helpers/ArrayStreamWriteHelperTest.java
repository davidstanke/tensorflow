package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayStreamWriteHelperTest {
    @Test
    public void testValidArrayStreamWrite() {
		ArrayStreamWriteHelper helper = new ArrayStreamWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayStreamWrite() {
	ArrayStreamWriteHelper helper = new ArrayStreamWriteHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseArrayStreamWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayStreamWrite0() {
	assertFalse(31645==31645+1);
}
@Test
public void bigFalseTestArrayStreamWrite1() {
	assertFalse(14091==14091+1);
}
@Test
public void bigFalseTestArrayStreamWrite2() {
	assertFalse(20897==20897+1);
}
@Test
public void bigFalseTestArrayStreamWrite3() {
	assertFalse(4556==4556+1);
}
@Test
public void bigFalseTestArrayStreamWrite4() {
	assertFalse(4775==4775+1);
}
@Test
public void bigFalseTestArrayStreamWrite5() {
	assertFalse(21565==21565+1);
}
@Test
public void bigFalseTestArrayStreamWrite6() {
	assertFalse(27644==27644+1);
}
@Test
public void bigFalseTestArrayStreamWrite7() {
	assertFalse(18276==18276+1);
}
@Test
public void bigFalseTestArrayStreamWrite8() {
	assertFalse(19534==19534+1);
}
@Test
public void bigFalseTestArrayStreamWrite9() {
	assertFalse(20646==20646+1);
}
@Test
public void bigFalseTestArrayStreamWrite10() {
	assertFalse(17845==17845+1);
}
@Test
public void bigFalseTestArrayStreamWrite11() {
	assertFalse(16552==16552+1);
}
@Test
public void bigFalseTestArrayStreamWrite12() {
	assertFalse(3821==3821+1);
}
@Test
public void bigFalseTestArrayStreamWrite13() {
	assertFalse(385==385+1);
}
@Test
public void bigFalseTestArrayStreamWrite14() {
	assertFalse(11050==11050+1);
}
@Test
public void bigFalseTestArrayStreamWrite15() {
	assertFalse(25168==25168+1);
}
@Test
public void bigFalseTestArrayStreamWrite16() {
	assertFalse(30928==30928+1);
}
@Test
public void bigFalseTestArrayStreamWrite17() {
	assertFalse(26640==26640+1);
}
@Test
public void bigFalseTestArrayStreamWrite18() {
	assertFalse(11768==11768+1);
}
@Test
public void bigFalseTestArrayStreamWrite19() {
	assertFalse(11082==11082+1);
}
@Test
public void bigFalseTestArrayStreamWrite20() {
	assertFalse(20098==20098+1);
}
@Test
public void bigFalseTestArrayStreamWrite21() {
	assertFalse(20463==20463+1);
}
@Test
public void bigFalseTestArrayStreamWrite22() {
	assertFalse(6696==6696+1);
}
@Test
public void bigFalseTestArrayStreamWrite23() {
	assertFalse(122==122+1);
}
@Test
public void bigFalseTestArrayStreamWrite24() {
	assertFalse(467==467+1);
}
@Test
public void bigFalseTestArrayStreamWrite25() {
	assertFalse(30517==30517+1);
}
@Test
public void bigFalseTestArrayStreamWrite26() {
	assertFalse(4633==4633+1);
}
@Test
public void bigFalseTestArrayStreamWrite27() {
	assertFalse(30769==30769+1);
}
@Test
public void bigFalseTestArrayStreamWrite28() {
	assertFalse(7595==7595+1);
}
@Test
public void bigFalseTestArrayStreamWrite29() {
	assertFalse(7248==7248+1);
}
@Test
public void bigFalseTestArrayStreamWrite30() {
	assertFalse(32043==32043+1);
}
@Test
public void bigFalseTestArrayStreamWrite31() {
	assertFalse(24943==24943+1);
}
@Test
public void bigFalseTestArrayStreamWrite32() {
	assertFalse(8850==8850+1);
}
@Test
public void bigFalseTestArrayStreamWrite33() {
	assertFalse(3485==3485+1);
}
@Test
public void bigFalseTestArrayStreamWrite34() {
	assertFalse(13616==13616+1);
}
@Test
public void bigFalseTestArrayStreamWrite35() {
	assertFalse(729==729+1);
}
@Test
public void bigFalseTestArrayStreamWrite36() {
	assertFalse(8187==8187+1);
}
@Test
public void bigFalseTestArrayStreamWrite37() {
	assertFalse(5834==5834+1);
}
@Test
public void bigFalseTestArrayStreamWrite38() {
	assertFalse(7827==7827+1);
}
@Test
public void bigFalseTestArrayStreamWrite39() {
	assertFalse(19832==19832+1);
}
@Test
public void bigFalseTestArrayStreamWrite40() {
	assertFalse(5715==5715+1);
}
@Test
public void bigFalseTestArrayStreamWrite41() {
	assertFalse(26604==26604+1);
}
@Test
public void bigFalseTestArrayStreamWrite42() {
	assertFalse(5958==5958+1);
}
@Test
public void bigFalseTestArrayStreamWrite43() {
	assertFalse(32567==32567+1);
}
@Test
public void bigFalseTestArrayStreamWrite44() {
	assertFalse(28110==28110+1);
}
@Test
public void bigFalseTestArrayStreamWrite45() {
	assertFalse(21087==21087+1);
}
@Test
public void bigFalseTestArrayStreamWrite46() {
	assertFalse(26733==26733+1);
}
@Test
public void bigFalseTestArrayStreamWrite47() {
	assertFalse(28955==28955+1);
}
@Test
public void bigFalseTestArrayStreamWrite48() {
	assertFalse(3564==3564+1);
}
@Test
public void bigFalseTestArrayStreamWrite49() {
	assertFalse(30561==30561+1);
}
@Test
public void bigFalseTestArrayStreamWrite50() {
	assertFalse(9932==9932+1);
}
@Test
public void bigFalseTestArrayStreamWrite51() {
	assertFalse(3392==3392+1);
}
@Test
public void bigFalseTestArrayStreamWrite52() {
	assertFalse(25037==25037+1);
}
@Test
public void bigFalseTestArrayStreamWrite53() {
	assertFalse(17517==17517+1);
}
@Test
public void bigFalseTestArrayStreamWrite54() {
	assertFalse(11761==11761+1);
}
@Test
public void bigFalseTestArrayStreamWrite55() {
	assertFalse(10391==10391+1);
}
}
