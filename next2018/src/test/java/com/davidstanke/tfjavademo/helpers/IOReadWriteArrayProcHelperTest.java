package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOReadWriteArrayProcHelperTest {
    @Test
    public void testValidIOReadWriteArrayProc() {
		IOReadWriteArrayProcHelper helper = new IOReadWriteArrayProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOReadWriteArrayProc() {
	IOReadWriteArrayProcHelper helper = new IOReadWriteArrayProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testThisFalseIOReadWriteArrayProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOReadWriteArrayProc0() {
	assertFalse(15397==15397+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc1() {
	assertFalse(25762==25762+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc2() {
	assertFalse(15582==15582+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc3() {
	assertFalse(17368==17368+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc4() {
	assertFalse(10211==10211+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc5() {
	assertFalse(19852==19852+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc6() {
	assertFalse(1173==1173+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc7() {
	assertFalse(17226==17226+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc8() {
	assertFalse(136==136+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc9() {
	assertFalse(23464==23464+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc10() {
	assertFalse(23782==23782+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc11() {
	assertFalse(31153==31153+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc12() {
	assertFalse(2245==2245+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc13() {
	assertFalse(22549==22549+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc14() {
	assertFalse(28544==28544+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc15() {
	assertFalse(32077==32077+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc16() {
	assertFalse(21491==21491+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc17() {
	assertFalse(7352==7352+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc18() {
	assertFalse(6446==6446+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc19() {
	assertFalse(21859==21859+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc20() {
	assertFalse(1779==1779+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc21() {
	assertFalse(14828==14828+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc22() {
	assertFalse(23580==23580+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc23() {
	assertFalse(26058==26058+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc24() {
	assertFalse(19142==19142+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc25() {
	assertFalse(19174==19174+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc26() {
	assertFalse(14793==14793+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc27() {
	assertFalse(1846==1846+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc28() {
	assertFalse(19691==19691+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc29() {
	assertFalse(9450==9450+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc30() {
	assertFalse(12491==12491+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc31() {
	assertFalse(22595==22595+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc32() {
	assertFalse(27004==27004+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc33() {
	assertFalse(19759==19759+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc34() {
	assertFalse(23110==23110+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc35() {
	assertFalse(4929==4929+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc36() {
	assertFalse(23303==23303+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc37() {
	assertFalse(24979==24979+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc38() {
	assertFalse(25386==25386+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc39() {
	assertFalse(29890==29890+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc40() {
	assertFalse(3117==3117+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc41() {
	assertFalse(24575==24575+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc42() {
	assertFalse(23856==23856+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc43() {
	assertFalse(32484==32484+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc44() {
	assertFalse(26365==26365+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc45() {
	assertFalse(30872==30872+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc46() {
	assertFalse(9106==9106+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc47() {
	assertFalse(9567==9567+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc48() {
	assertFalse(15886==15886+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc49() {
	assertFalse(22186==22186+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc50() {
	assertFalse(20365==20365+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc51() {
	assertFalse(11853==11853+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc52() {
	assertFalse(11102==11102+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc53() {
	assertFalse(3157==3157+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc54() {
	assertFalse(30871==30871+1);
}
@Test
public void bigFalseTestIOReadWriteArrayProc55() {
	assertFalse(21437==21437+1);
}
}
