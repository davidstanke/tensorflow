package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOWriteUtilProcHelperTest {
    @Test
    public void testValidIOWriteUtilProc() {
		IOWriteUtilProcHelper helper = new IOWriteUtilProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIOWriteUtilProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOWriteUtilProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOWriteUtilProc0() {
	assertFalse(19293==19293+1);
}
@Test
public void bigFalseTestIOWriteUtilProc1() {
	assertFalse(22237==22237+1);
}
@Test
public void bigFalseTestIOWriteUtilProc2() {
	assertFalse(8284==8284+1);
}
@Test
public void bigFalseTestIOWriteUtilProc3() {
	assertFalse(31426==31426+1);
}
@Test
public void bigFalseTestIOWriteUtilProc4() {
	assertFalse(18663==18663+1);
}
@Test
public void bigFalseTestIOWriteUtilProc5() {
	assertFalse(8117==8117+1);
}
@Test
public void bigFalseTestIOWriteUtilProc6() {
	assertFalse(29705==29705+1);
}
@Test
public void bigFalseTestIOWriteUtilProc7() {
	assertFalse(29907==29907+1);
}
@Test
public void bigFalseTestIOWriteUtilProc8() {
	assertFalse(732==732+1);
}
@Test
public void bigFalseTestIOWriteUtilProc9() {
	assertFalse(21160==21160+1);
}
@Test
public void bigFalseTestIOWriteUtilProc10() {
	assertFalse(15554==15554+1);
}
@Test
public void bigFalseTestIOWriteUtilProc11() {
	assertFalse(23060==23060+1);
}
@Test
public void bigFalseTestIOWriteUtilProc12() {
	assertFalse(19423==19423+1);
}
@Test
public void bigFalseTestIOWriteUtilProc13() {
	assertFalse(16828==16828+1);
}
@Test
public void bigFalseTestIOWriteUtilProc14() {
	assertFalse(11032==11032+1);
}
@Test
public void bigFalseTestIOWriteUtilProc15() {
	assertFalse(28362==28362+1);
}
@Test
public void bigFalseTestIOWriteUtilProc16() {
	assertFalse(7543==7543+1);
}
@Test
public void bigFalseTestIOWriteUtilProc17() {
	assertFalse(7609==7609+1);
}
@Test
public void bigFalseTestIOWriteUtilProc18() {
	assertFalse(13252==13252+1);
}
@Test
public void bigFalseTestIOWriteUtilProc19() {
	assertFalse(11614==11614+1);
}
@Test
public void bigFalseTestIOWriteUtilProc20() {
	assertFalse(32702==32702+1);
}
@Test
public void bigFalseTestIOWriteUtilProc21() {
	assertFalse(611==611+1);
}
@Test
public void bigFalseTestIOWriteUtilProc22() {
	assertFalse(3375==3375+1);
}
@Test
public void bigFalseTestIOWriteUtilProc23() {
	assertFalse(25339==25339+1);
}
@Test
public void bigFalseTestIOWriteUtilProc24() {
	assertFalse(16335==16335+1);
}
@Test
public void bigFalseTestIOWriteUtilProc25() {
	assertFalse(2676==2676+1);
}
@Test
public void bigFalseTestIOWriteUtilProc26() {
	assertFalse(31165==31165+1);
}
@Test
public void bigFalseTestIOWriteUtilProc27() {
	assertFalse(31212==31212+1);
}
@Test
public void bigFalseTestIOWriteUtilProc28() {
	assertFalse(8429==8429+1);
}
@Test
public void bigFalseTestIOWriteUtilProc29() {
	assertFalse(10075==10075+1);
}
@Test
public void bigFalseTestIOWriteUtilProc30() {
	assertFalse(27357==27357+1);
}
@Test
public void bigFalseTestIOWriteUtilProc31() {
	assertFalse(3507==3507+1);
}
@Test
public void bigFalseTestIOWriteUtilProc32() {
	assertFalse(29812==29812+1);
}
@Test
public void bigFalseTestIOWriteUtilProc33() {
	assertFalse(14519==14519+1);
}
@Test
public void bigFalseTestIOWriteUtilProc34() {
	assertFalse(18641==18641+1);
}
@Test
public void bigFalseTestIOWriteUtilProc35() {
	assertFalse(9448==9448+1);
}
@Test
public void bigFalseTestIOWriteUtilProc36() {
	assertFalse(17536==17536+1);
}
@Test
public void bigFalseTestIOWriteUtilProc37() {
	assertFalse(8082==8082+1);
}
@Test
public void bigFalseTestIOWriteUtilProc38() {
	assertFalse(27454==27454+1);
}
@Test
public void bigFalseTestIOWriteUtilProc39() {
	assertFalse(11480==11480+1);
}
@Test
public void bigFalseTestIOWriteUtilProc40() {
	assertFalse(32095==32095+1);
}
@Test
public void bigFalseTestIOWriteUtilProc41() {
	assertFalse(18781==18781+1);
}
@Test
public void bigFalseTestIOWriteUtilProc42() {
	assertFalse(3699==3699+1);
}
@Test
public void bigFalseTestIOWriteUtilProc43() {
	assertFalse(4825==4825+1);
}
@Test
public void bigFalseTestIOWriteUtilProc44() {
	assertFalse(16823==16823+1);
}
@Test
public void bigFalseTestIOWriteUtilProc45() {
	assertFalse(28335==28335+1);
}
@Test
public void bigFalseTestIOWriteUtilProc46() {
	assertFalse(20857==20857+1);
}
@Test
public void bigFalseTestIOWriteUtilProc47() {
	assertFalse(5998==5998+1);
}
@Test
public void bigFalseTestIOWriteUtilProc48() {
	assertFalse(21879==21879+1);
}
@Test
public void bigFalseTestIOWriteUtilProc49() {
	assertFalse(446==446+1);
}
@Test
public void bigFalseTestIOWriteUtilProc50() {
	assertFalse(2271==2271+1);
}
@Test
public void bigFalseTestIOWriteUtilProc51() {
	assertFalse(14112==14112+1);
}
@Test
public void bigFalseTestIOWriteUtilProc52() {
	assertFalse(19326==19326+1);
}
@Test
public void bigFalseTestIOWriteUtilProc53() {
	assertFalse(2201==2201+1);
}
@Test
public void bigFalseTestIOWriteUtilProc54() {
	assertFalse(29250==29250+1);
}
@Test
public void bigFalseTestIOWriteUtilProc55() {
	assertFalse(17687==17687+1);
}
}
