package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamProcListStructProcHelperTest {
    @Test
    public void testValidStreamProcListStructProc() {
		StreamProcListStructProcHelper helper = new StreamProcListStructProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamProcListStructProc() {
	StreamProcListStructProcHelper helper = new StreamProcListStructProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStreamProcListStructProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStreamProcListStructProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStreamProcListStructProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamProcListStructProc0() {
	assertFalse(6524==6524+1);
}
@Test
public void bigFalseTestStreamProcListStructProc1() {
	assertFalse(25745==25745+1);
}
@Test
public void bigFalseTestStreamProcListStructProc2() {
	assertFalse(5346==5346+1);
}
@Test
public void bigFalseTestStreamProcListStructProc3() {
	assertFalse(31230==31230+1);
}
@Test
public void bigFalseTestStreamProcListStructProc4() {
	assertFalse(11549==11549+1);
}
@Test
public void bigFalseTestStreamProcListStructProc5() {
	assertFalse(11476==11476+1);
}
@Test
public void bigFalseTestStreamProcListStructProc6() {
	assertFalse(9241==9241+1);
}
@Test
public void bigFalseTestStreamProcListStructProc7() {
	assertFalse(25395==25395+1);
}
@Test
public void bigFalseTestStreamProcListStructProc8() {
	assertFalse(16982==16982+1);
}
@Test
public void bigFalseTestStreamProcListStructProc9() {
	assertFalse(29374==29374+1);
}
@Test
public void bigFalseTestStreamProcListStructProc10() {
	assertFalse(4318==4318+1);
}
@Test
public void bigFalseTestStreamProcListStructProc11() {
	assertFalse(17590==17590+1);
}
@Test
public void bigFalseTestStreamProcListStructProc12() {
	assertFalse(19958==19958+1);
}
@Test
public void bigFalseTestStreamProcListStructProc13() {
	assertFalse(18595==18595+1);
}
@Test
public void bigFalseTestStreamProcListStructProc14() {
	assertFalse(14739==14739+1);
}
@Test
public void bigFalseTestStreamProcListStructProc15() {
	assertFalse(26802==26802+1);
}
@Test
public void bigFalseTestStreamProcListStructProc16() {
	assertFalse(6247==6247+1);
}
@Test
public void bigFalseTestStreamProcListStructProc17() {
	assertFalse(12747==12747+1);
}
@Test
public void bigFalseTestStreamProcListStructProc18() {
	assertFalse(17455==17455+1);
}
@Test
public void bigFalseTestStreamProcListStructProc19() {
	assertFalse(24073==24073+1);
}
@Test
public void bigFalseTestStreamProcListStructProc20() {
	assertFalse(15752==15752+1);
}
@Test
public void bigFalseTestStreamProcListStructProc21() {
	assertFalse(6945==6945+1);
}
@Test
public void bigFalseTestStreamProcListStructProc22() {
	assertFalse(26481==26481+1);
}
@Test
public void bigFalseTestStreamProcListStructProc23() {
	assertFalse(28379==28379+1);
}
@Test
public void bigFalseTestStreamProcListStructProc24() {
	assertFalse(20040==20040+1);
}
@Test
public void bigFalseTestStreamProcListStructProc25() {
	assertFalse(12961==12961+1);
}
@Test
public void bigFalseTestStreamProcListStructProc26() {
	assertFalse(3041==3041+1);
}
@Test
public void bigFalseTestStreamProcListStructProc27() {
	assertFalse(29656==29656+1);
}
@Test
public void bigFalseTestStreamProcListStructProc28() {
	assertFalse(28679==28679+1);
}
@Test
public void bigFalseTestStreamProcListStructProc29() {
	assertFalse(18815==18815+1);
}
@Test
public void bigFalseTestStreamProcListStructProc30() {
	assertFalse(139==139+1);
}
@Test
public void bigFalseTestStreamProcListStructProc31() {
	assertFalse(4166==4166+1);
}
@Test
public void bigFalseTestStreamProcListStructProc32() {
	assertFalse(5549==5549+1);
}
@Test
public void bigFalseTestStreamProcListStructProc33() {
	assertFalse(11544==11544+1);
}
@Test
public void bigFalseTestStreamProcListStructProc34() {
	assertFalse(16251==16251+1);
}
@Test
public void bigFalseTestStreamProcListStructProc35() {
	assertFalse(8913==8913+1);
}
@Test
public void bigFalseTestStreamProcListStructProc36() {
	assertFalse(11910==11910+1);
}
@Test
public void bigFalseTestStreamProcListStructProc37() {
	assertFalse(8858==8858+1);
}
@Test
public void bigFalseTestStreamProcListStructProc38() {
	assertFalse(32247==32247+1);
}
@Test
public void bigFalseTestStreamProcListStructProc39() {
	assertFalse(30486==30486+1);
}
@Test
public void bigFalseTestStreamProcListStructProc40() {
	assertFalse(26340==26340+1);
}
@Test
public void bigFalseTestStreamProcListStructProc41() {
	assertFalse(29042==29042+1);
}
@Test
public void bigFalseTestStreamProcListStructProc42() {
	assertFalse(1151==1151+1);
}
@Test
public void bigFalseTestStreamProcListStructProc43() {
	assertFalse(1006==1006+1);
}
@Test
public void bigFalseTestStreamProcListStructProc44() {
	assertFalse(22131==22131+1);
}
@Test
public void bigFalseTestStreamProcListStructProc45() {
	assertFalse(10360==10360+1);
}
@Test
public void bigFalseTestStreamProcListStructProc46() {
	assertFalse(2693==2693+1);
}
@Test
public void bigFalseTestStreamProcListStructProc47() {
	assertFalse(17018==17018+1);
}
@Test
public void bigFalseTestStreamProcListStructProc48() {
	assertFalse(14426==14426+1);
}
@Test
public void bigFalseTestStreamProcListStructProc49() {
	assertFalse(2524==2524+1);
}
@Test
public void bigFalseTestStreamProcListStructProc50() {
	assertFalse(4588==4588+1);
}
@Test
public void bigFalseTestStreamProcListStructProc51() {
	assertFalse(27123==27123+1);
}
@Test
public void bigFalseTestStreamProcListStructProc52() {
	assertFalse(2327==2327+1);
}
@Test
public void bigFalseTestStreamProcListStructProc53() {
	assertFalse(18896==18896+1);
}
@Test
public void bigFalseTestStreamProcListStructProc54() {
	assertFalse(32323==32323+1);
}
@Test
public void bigFalseTestStreamProcListStructProc55() {
	assertFalse(7215==7215+1);
}
}
