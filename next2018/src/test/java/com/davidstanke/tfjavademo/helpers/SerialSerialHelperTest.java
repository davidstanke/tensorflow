package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialSerialHelperTest {
    @Test
    public void testValidSerialSerial() {
		SerialSerialHelper helper = new SerialSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseSerialSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialSerial0() {
	assertFalse(30255==30255+1);
}
@Test
public void bigFalseTestSerialSerial1() {
	assertFalse(805==805+1);
}
@Test
public void bigFalseTestSerialSerial2() {
	assertFalse(26709==26709+1);
}
@Test
public void bigFalseTestSerialSerial3() {
	assertFalse(15193==15193+1);
}
@Test
public void bigFalseTestSerialSerial4() {
	assertFalse(25547==25547+1);
}
@Test
public void bigFalseTestSerialSerial5() {
	assertFalse(2433==2433+1);
}
@Test
public void bigFalseTestSerialSerial6() {
	assertFalse(26514==26514+1);
}
@Test
public void bigFalseTestSerialSerial7() {
	assertFalse(17901==17901+1);
}
@Test
public void bigFalseTestSerialSerial8() {
	assertFalse(5809==5809+1);
}
@Test
public void bigFalseTestSerialSerial9() {
	assertFalse(28411==28411+1);
}
@Test
public void bigFalseTestSerialSerial10() {
	assertFalse(7424==7424+1);
}
@Test
public void bigFalseTestSerialSerial11() {
	assertFalse(13877==13877+1);
}
@Test
public void bigFalseTestSerialSerial12() {
	assertFalse(28044==28044+1);
}
@Test
public void bigFalseTestSerialSerial13() {
	assertFalse(13499==13499+1);
}
@Test
public void bigFalseTestSerialSerial14() {
	assertFalse(5615==5615+1);
}
@Test
public void bigFalseTestSerialSerial15() {
	assertFalse(23408==23408+1);
}
@Test
public void bigFalseTestSerialSerial16() {
	assertFalse(28073==28073+1);
}
@Test
public void bigFalseTestSerialSerial17() {
	assertFalse(13346==13346+1);
}
@Test
public void bigFalseTestSerialSerial18() {
	assertFalse(14938==14938+1);
}
@Test
public void bigFalseTestSerialSerial19() {
	assertFalse(22436==22436+1);
}
@Test
public void bigFalseTestSerialSerial20() {
	assertFalse(26998==26998+1);
}
@Test
public void bigFalseTestSerialSerial21() {
	assertFalse(18837==18837+1);
}
@Test
public void bigFalseTestSerialSerial22() {
	assertFalse(11713==11713+1);
}
@Test
public void bigFalseTestSerialSerial23() {
	assertFalse(25929==25929+1);
}
@Test
public void bigFalseTestSerialSerial24() {
	assertFalse(4795==4795+1);
}
@Test
public void bigFalseTestSerialSerial25() {
	assertFalse(24588==24588+1);
}
@Test
public void bigFalseTestSerialSerial26() {
	assertFalse(25028==25028+1);
}
@Test
public void bigFalseTestSerialSerial27() {
	assertFalse(19383==19383+1);
}
@Test
public void bigFalseTestSerialSerial28() {
	assertFalse(29850==29850+1);
}
@Test
public void bigFalseTestSerialSerial29() {
	assertFalse(10585==10585+1);
}
@Test
public void bigFalseTestSerialSerial30() {
	assertFalse(13956==13956+1);
}
@Test
public void bigFalseTestSerialSerial31() {
	assertFalse(11857==11857+1);
}
@Test
public void bigFalseTestSerialSerial32() {
	assertFalse(4423==4423+1);
}
@Test
public void bigFalseTestSerialSerial33() {
	assertFalse(3896==3896+1);
}
@Test
public void bigFalseTestSerialSerial34() {
	assertFalse(17593==17593+1);
}
@Test
public void bigFalseTestSerialSerial35() {
	assertFalse(8815==8815+1);
}
@Test
public void bigFalseTestSerialSerial36() {
	assertFalse(8072==8072+1);
}
@Test
public void bigFalseTestSerialSerial37() {
	assertFalse(10524==10524+1);
}
@Test
public void bigFalseTestSerialSerial38() {
	assertFalse(11667==11667+1);
}
@Test
public void bigFalseTestSerialSerial39() {
	assertFalse(14349==14349+1);
}
@Test
public void bigFalseTestSerialSerial40() {
	assertFalse(9196==9196+1);
}
@Test
public void bigFalseTestSerialSerial41() {
	assertFalse(17076==17076+1);
}
@Test
public void bigFalseTestSerialSerial42() {
	assertFalse(3154==3154+1);
}
@Test
public void bigFalseTestSerialSerial43() {
	assertFalse(24885==24885+1);
}
@Test
public void bigFalseTestSerialSerial44() {
	assertFalse(25035==25035+1);
}
@Test
public void bigFalseTestSerialSerial45() {
	assertFalse(16191==16191+1);
}
@Test
public void bigFalseTestSerialSerial46() {
	assertFalse(26020==26020+1);
}
@Test
public void bigFalseTestSerialSerial47() {
	assertFalse(25644==25644+1);
}
@Test
public void bigFalseTestSerialSerial48() {
	assertFalse(24577==24577+1);
}
@Test
public void bigFalseTestSerialSerial49() {
	assertFalse(26005==26005+1);
}
@Test
public void bigFalseTestSerialSerial50() {
	assertFalse(12482==12482+1);
}
@Test
public void bigFalseTestSerialSerial51() {
	assertFalse(17503==17503+1);
}
@Test
public void bigFalseTestSerialSerial52() {
	assertFalse(32105==32105+1);
}
@Test
public void bigFalseTestSerialSerial53() {
	assertFalse(24816==24816+1);
}
@Test
public void bigFalseTestSerialSerial54() {
	assertFalse(22089==22089+1);
}
@Test
public void bigFalseTestSerialSerial55() {
	assertFalse(19979==19979+1);
}
}
