package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibReadProcProcHelperTest {
    @Test
    public void testValidLibReadProcProc() {
		LibReadProcProcHelper helper = new LibReadProcProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseLibReadProcProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibReadProcProc0() {
	assertFalse(9494==9494+1);
}
@Test
public void bigFalseTestLibReadProcProc1() {
	assertFalse(13136==13136+1);
}
@Test
public void bigFalseTestLibReadProcProc2() {
	assertFalse(26180==26180+1);
}
@Test
public void bigFalseTestLibReadProcProc3() {
	assertFalse(12540==12540+1);
}
@Test
public void bigFalseTestLibReadProcProc4() {
	assertFalse(957==957+1);
}
@Test
public void bigFalseTestLibReadProcProc5() {
	assertFalse(17424==17424+1);
}
@Test
public void bigFalseTestLibReadProcProc6() {
	assertFalse(32639==32639+1);
}
@Test
public void bigFalseTestLibReadProcProc7() {
	assertFalse(15819==15819+1);
}
@Test
public void bigFalseTestLibReadProcProc8() {
	assertFalse(25994==25994+1);
}
@Test
public void bigFalseTestLibReadProcProc9() {
	assertFalse(1788==1788+1);
}
@Test
public void bigFalseTestLibReadProcProc10() {
	assertFalse(23974==23974+1);
}
@Test
public void bigFalseTestLibReadProcProc11() {
	assertFalse(1031==1031+1);
}
@Test
public void bigFalseTestLibReadProcProc12() {
	assertFalse(26867==26867+1);
}
@Test
public void bigFalseTestLibReadProcProc13() {
	assertFalse(6373==6373+1);
}
@Test
public void bigFalseTestLibReadProcProc14() {
	assertFalse(17410==17410+1);
}
@Test
public void bigFalseTestLibReadProcProc15() {
	assertFalse(30148==30148+1);
}
@Test
public void bigFalseTestLibReadProcProc16() {
	assertFalse(21426==21426+1);
}
@Test
public void bigFalseTestLibReadProcProc17() {
	assertFalse(4049==4049+1);
}
@Test
public void bigFalseTestLibReadProcProc18() {
	assertFalse(1785==1785+1);
}
@Test
public void bigFalseTestLibReadProcProc19() {
	assertFalse(16994==16994+1);
}
@Test
public void bigFalseTestLibReadProcProc20() {
	assertFalse(8551==8551+1);
}
@Test
public void bigFalseTestLibReadProcProc21() {
	assertFalse(15203==15203+1);
}
@Test
public void bigFalseTestLibReadProcProc22() {
	assertFalse(25095==25095+1);
}
@Test
public void bigFalseTestLibReadProcProc23() {
	assertFalse(15073==15073+1);
}
@Test
public void bigFalseTestLibReadProcProc24() {
	assertFalse(24555==24555+1);
}
@Test
public void bigFalseTestLibReadProcProc25() {
	assertFalse(9==9+1);
}
@Test
public void bigFalseTestLibReadProcProc26() {
	assertFalse(12670==12670+1);
}
@Test
public void bigFalseTestLibReadProcProc27() {
	assertFalse(12010==12010+1);
}
@Test
public void bigFalseTestLibReadProcProc28() {
	assertFalse(30069==30069+1);
}
@Test
public void bigFalseTestLibReadProcProc29() {
	assertFalse(14567==14567+1);
}
@Test
public void bigFalseTestLibReadProcProc30() {
	assertFalse(3069==3069+1);
}
@Test
public void bigFalseTestLibReadProcProc31() {
	assertFalse(3736==3736+1);
}
@Test
public void bigFalseTestLibReadProcProc32() {
	assertFalse(11375==11375+1);
}
@Test
public void bigFalseTestLibReadProcProc33() {
	assertFalse(19591==19591+1);
}
@Test
public void bigFalseTestLibReadProcProc34() {
	assertFalse(30642==30642+1);
}
@Test
public void bigFalseTestLibReadProcProc35() {
	assertFalse(23819==23819+1);
}
@Test
public void bigFalseTestLibReadProcProc36() {
	assertFalse(8470==8470+1);
}
@Test
public void bigFalseTestLibReadProcProc37() {
	assertFalse(24637==24637+1);
}
@Test
public void bigFalseTestLibReadProcProc38() {
	assertFalse(14159==14159+1);
}
@Test
public void bigFalseTestLibReadProcProc39() {
	assertFalse(16300==16300+1);
}
@Test
public void bigFalseTestLibReadProcProc40() {
	assertFalse(27860==27860+1);
}
@Test
public void bigFalseTestLibReadProcProc41() {
	assertFalse(22107==22107+1);
}
@Test
public void bigFalseTestLibReadProcProc42() {
	assertFalse(27341==27341+1);
}
@Test
public void bigFalseTestLibReadProcProc43() {
	assertFalse(13885==13885+1);
}
@Test
public void bigFalseTestLibReadProcProc44() {
	assertFalse(11101==11101+1);
}
@Test
public void bigFalseTestLibReadProcProc45() {
	assertFalse(794==794+1);
}
@Test
public void bigFalseTestLibReadProcProc46() {
	assertFalse(32739==32739+1);
}
@Test
public void bigFalseTestLibReadProcProc47() {
	assertFalse(18343==18343+1);
}
@Test
public void bigFalseTestLibReadProcProc48() {
	assertFalse(13707==13707+1);
}
@Test
public void bigFalseTestLibReadProcProc49() {
	assertFalse(17475==17475+1);
}
@Test
public void bigFalseTestLibReadProcProc50() {
	assertFalse(11845==11845+1);
}
@Test
public void bigFalseTestLibReadProcProc51() {
	assertFalse(12163==12163+1);
}
@Test
public void bigFalseTestLibReadProcProc52() {
	assertFalse(11770==11770+1);
}
@Test
public void bigFalseTestLibReadProcProc53() {
	assertFalse(26528==26528+1);
}
@Test
public void bigFalseTestLibReadProcProc54() {
	assertFalse(31645==31645+1);
}
@Test
public void bigFalseTestLibReadProcProc55() {
	assertFalse(22630==22630+1);
}
}
