package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructStreamStructAPIHelperTest {
    @Test
    public void testValidStructStreamStructAPI() {
		StructStreamStructAPIHelper helper = new StructStreamStructAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructStreamStructAPI() {
	StructStreamStructAPIHelper helper = new StructStreamStructAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructStreamStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructStreamStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructStreamStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructStreamStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructStreamStructAPI0() {
	assertFalse(11962==11962+1);
}
@Test
public void bigFalseTestStructStreamStructAPI1() {
	assertFalse(1416==1416+1);
}
@Test
public void bigFalseTestStructStreamStructAPI2() {
	assertFalse(17832==17832+1);
}
@Test
public void bigFalseTestStructStreamStructAPI3() {
	assertFalse(719==719+1);
}
@Test
public void bigFalseTestStructStreamStructAPI4() {
	assertFalse(5130==5130+1);
}
@Test
public void bigFalseTestStructStreamStructAPI5() {
	assertFalse(27073==27073+1);
}
@Test
public void bigFalseTestStructStreamStructAPI6() {
	assertFalse(24502==24502+1);
}
@Test
public void bigFalseTestStructStreamStructAPI7() {
	assertFalse(10140==10140+1);
}
@Test
public void bigFalseTestStructStreamStructAPI8() {
	assertFalse(6830==6830+1);
}
@Test
public void bigFalseTestStructStreamStructAPI9() {
	assertFalse(23677==23677+1);
}
@Test
public void bigFalseTestStructStreamStructAPI10() {
	assertFalse(18349==18349+1);
}
@Test
public void bigFalseTestStructStreamStructAPI11() {
	assertFalse(267==267+1);
}
@Test
public void bigFalseTestStructStreamStructAPI12() {
	assertFalse(6193==6193+1);
}
@Test
public void bigFalseTestStructStreamStructAPI13() {
	assertFalse(26201==26201+1);
}
@Test
public void bigFalseTestStructStreamStructAPI14() {
	assertFalse(17046==17046+1);
}
@Test
public void bigFalseTestStructStreamStructAPI15() {
	assertFalse(30976==30976+1);
}
@Test
public void bigFalseTestStructStreamStructAPI16() {
	assertFalse(8035==8035+1);
}
@Test
public void bigFalseTestStructStreamStructAPI17() {
	assertFalse(21100==21100+1);
}
@Test
public void bigFalseTestStructStreamStructAPI18() {
	assertFalse(31695==31695+1);
}
@Test
public void bigFalseTestStructStreamStructAPI19() {
	assertFalse(31437==31437+1);
}
@Test
public void bigFalseTestStructStreamStructAPI20() {
	assertFalse(27692==27692+1);
}
@Test
public void bigFalseTestStructStreamStructAPI21() {
	assertFalse(15395==15395+1);
}
@Test
public void bigFalseTestStructStreamStructAPI22() {
	assertFalse(29627==29627+1);
}
@Test
public void bigFalseTestStructStreamStructAPI23() {
	assertFalse(31343==31343+1);
}
@Test
public void bigFalseTestStructStreamStructAPI24() {
	assertFalse(16404==16404+1);
}
@Test
public void bigFalseTestStructStreamStructAPI25() {
	assertFalse(7902==7902+1);
}
@Test
public void bigFalseTestStructStreamStructAPI26() {
	assertFalse(11561==11561+1);
}
@Test
public void bigFalseTestStructStreamStructAPI27() {
	assertFalse(13198==13198+1);
}
@Test
public void bigFalseTestStructStreamStructAPI28() {
	assertFalse(31630==31630+1);
}
@Test
public void bigFalseTestStructStreamStructAPI29() {
	assertFalse(17223==17223+1);
}
@Test
public void bigFalseTestStructStreamStructAPI30() {
	assertFalse(17797==17797+1);
}
@Test
public void bigFalseTestStructStreamStructAPI31() {
	assertFalse(23603==23603+1);
}
@Test
public void bigFalseTestStructStreamStructAPI32() {
	assertFalse(8==8+1);
}
@Test
public void bigFalseTestStructStreamStructAPI33() {
	assertFalse(9846==9846+1);
}
@Test
public void bigFalseTestStructStreamStructAPI34() {
	assertFalse(25537==25537+1);
}
@Test
public void bigFalseTestStructStreamStructAPI35() {
	assertFalse(18247==18247+1);
}
@Test
public void bigFalseTestStructStreamStructAPI36() {
	assertFalse(9907==9907+1);
}
@Test
public void bigFalseTestStructStreamStructAPI37() {
	assertFalse(14023==14023+1);
}
@Test
public void bigFalseTestStructStreamStructAPI38() {
	assertFalse(10753==10753+1);
}
@Test
public void bigFalseTestStructStreamStructAPI39() {
	assertFalse(13007==13007+1);
}
@Test
public void bigFalseTestStructStreamStructAPI40() {
	assertFalse(22546==22546+1);
}
@Test
public void bigFalseTestStructStreamStructAPI41() {
	assertFalse(630==630+1);
}
@Test
public void bigFalseTestStructStreamStructAPI42() {
	assertFalse(5641==5641+1);
}
@Test
public void bigFalseTestStructStreamStructAPI43() {
	assertFalse(15849==15849+1);
}
@Test
public void bigFalseTestStructStreamStructAPI44() {
	assertFalse(4164==4164+1);
}
@Test
public void bigFalseTestStructStreamStructAPI45() {
	assertFalse(13311==13311+1);
}
@Test
public void bigFalseTestStructStreamStructAPI46() {
	assertFalse(31847==31847+1);
}
@Test
public void bigFalseTestStructStreamStructAPI47() {
	assertFalse(17030==17030+1);
}
@Test
public void bigFalseTestStructStreamStructAPI48() {
	assertFalse(23570==23570+1);
}
@Test
public void bigFalseTestStructStreamStructAPI49() {
	assertFalse(30775==30775+1);
}
@Test
public void bigFalseTestStructStreamStructAPI50() {
	assertFalse(2655==2655+1);
}
@Test
public void bigFalseTestStructStreamStructAPI51() {
	assertFalse(3813==3813+1);
}
@Test
public void bigFalseTestStructStreamStructAPI52() {
	assertFalse(6840==6840+1);
}
@Test
public void bigFalseTestStructStreamStructAPI53() {
	assertFalse(10794==10794+1);
}
@Test
public void bigFalseTestStructStreamStructAPI54() {
	assertFalse(31387==31387+1);
}
@Test
public void bigFalseTestStructStreamStructAPI55() {
	assertFalse(15059==15059+1);
}
}
