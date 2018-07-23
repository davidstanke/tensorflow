package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcProcUtilAPIHelperTest {
    @Test
    public void testValidProcProcUtilAPI() {
		ProcProcUtilAPIHelper helper = new ProcProcUtilAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcProcUtilAPI() {
	ProcProcUtilAPIHelper helper = new ProcProcUtilAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseProcProcUtilAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProcProcUtilAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcProcUtilAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcProcUtilAPI0() {
	assertFalse(27828==27828+1);
}
@Test
public void bigFalseTestProcProcUtilAPI1() {
	assertFalse(17829==17829+1);
}
@Test
public void bigFalseTestProcProcUtilAPI2() {
	assertFalse(5952==5952+1);
}
@Test
public void bigFalseTestProcProcUtilAPI3() {
	assertFalse(31580==31580+1);
}
@Test
public void bigFalseTestProcProcUtilAPI4() {
	assertFalse(20313==20313+1);
}
@Test
public void bigFalseTestProcProcUtilAPI5() {
	assertFalse(17577==17577+1);
}
@Test
public void bigFalseTestProcProcUtilAPI6() {
	assertFalse(9185==9185+1);
}
@Test
public void bigFalseTestProcProcUtilAPI7() {
	assertFalse(28608==28608+1);
}
@Test
public void bigFalseTestProcProcUtilAPI8() {
	assertFalse(8959==8959+1);
}
@Test
public void bigFalseTestProcProcUtilAPI9() {
	assertFalse(4338==4338+1);
}
@Test
public void bigFalseTestProcProcUtilAPI10() {
	assertFalse(12653==12653+1);
}
@Test
public void bigFalseTestProcProcUtilAPI11() {
	assertFalse(8436==8436+1);
}
@Test
public void bigFalseTestProcProcUtilAPI12() {
	assertFalse(28184==28184+1);
}
@Test
public void bigFalseTestProcProcUtilAPI13() {
	assertFalse(6124==6124+1);
}
@Test
public void bigFalseTestProcProcUtilAPI14() {
	assertFalse(25881==25881+1);
}
@Test
public void bigFalseTestProcProcUtilAPI15() {
	assertFalse(6341==6341+1);
}
@Test
public void bigFalseTestProcProcUtilAPI16() {
	assertFalse(14772==14772+1);
}
@Test
public void bigFalseTestProcProcUtilAPI17() {
	assertFalse(9795==9795+1);
}
@Test
public void bigFalseTestProcProcUtilAPI18() {
	assertFalse(16865==16865+1);
}
@Test
public void bigFalseTestProcProcUtilAPI19() {
	assertFalse(5843==5843+1);
}
@Test
public void bigFalseTestProcProcUtilAPI20() {
	assertFalse(32394==32394+1);
}
@Test
public void bigFalseTestProcProcUtilAPI21() {
	assertFalse(32253==32253+1);
}
@Test
public void bigFalseTestProcProcUtilAPI22() {
	assertFalse(6779==6779+1);
}
@Test
public void bigFalseTestProcProcUtilAPI23() {
	assertFalse(31247==31247+1);
}
@Test
public void bigFalseTestProcProcUtilAPI24() {
	assertFalse(22214==22214+1);
}
@Test
public void bigFalseTestProcProcUtilAPI25() {
	assertFalse(12884==12884+1);
}
@Test
public void bigFalseTestProcProcUtilAPI26() {
	assertFalse(13823==13823+1);
}
@Test
public void bigFalseTestProcProcUtilAPI27() {
	assertFalse(17908==17908+1);
}
@Test
public void bigFalseTestProcProcUtilAPI28() {
	assertFalse(152==152+1);
}
@Test
public void bigFalseTestProcProcUtilAPI29() {
	assertFalse(25940==25940+1);
}
@Test
public void bigFalseTestProcProcUtilAPI30() {
	assertFalse(4947==4947+1);
}
@Test
public void bigFalseTestProcProcUtilAPI31() {
	assertFalse(16264==16264+1);
}
@Test
public void bigFalseTestProcProcUtilAPI32() {
	assertFalse(32121==32121+1);
}
@Test
public void bigFalseTestProcProcUtilAPI33() {
	assertFalse(17209==17209+1);
}
@Test
public void bigFalseTestProcProcUtilAPI34() {
	assertFalse(30552==30552+1);
}
@Test
public void bigFalseTestProcProcUtilAPI35() {
	assertFalse(24081==24081+1);
}
@Test
public void bigFalseTestProcProcUtilAPI36() {
	assertFalse(23099==23099+1);
}
@Test
public void bigFalseTestProcProcUtilAPI37() {
	assertFalse(22406==22406+1);
}
@Test
public void bigFalseTestProcProcUtilAPI38() {
	assertFalse(12758==12758+1);
}
@Test
public void bigFalseTestProcProcUtilAPI39() {
	assertFalse(2968==2968+1);
}
@Test
public void bigFalseTestProcProcUtilAPI40() {
	assertFalse(27608==27608+1);
}
@Test
public void bigFalseTestProcProcUtilAPI41() {
	assertFalse(6117==6117+1);
}
@Test
public void bigFalseTestProcProcUtilAPI42() {
	assertFalse(17704==17704+1);
}
@Test
public void bigFalseTestProcProcUtilAPI43() {
	assertFalse(28959==28959+1);
}
@Test
public void bigFalseTestProcProcUtilAPI44() {
	assertFalse(3319==3319+1);
}
@Test
public void bigFalseTestProcProcUtilAPI45() {
	assertFalse(16578==16578+1);
}
@Test
public void bigFalseTestProcProcUtilAPI46() {
	assertFalse(23719==23719+1);
}
@Test
public void bigFalseTestProcProcUtilAPI47() {
	assertFalse(19105==19105+1);
}
@Test
public void bigFalseTestProcProcUtilAPI48() {
	assertFalse(10301==10301+1);
}
@Test
public void bigFalseTestProcProcUtilAPI49() {
	assertFalse(24486==24486+1);
}
@Test
public void bigFalseTestProcProcUtilAPI50() {
	assertFalse(15831==15831+1);
}
@Test
public void bigFalseTestProcProcUtilAPI51() {
	assertFalse(32462==32462+1);
}
@Test
public void bigFalseTestProcProcUtilAPI52() {
	assertFalse(7001==7001+1);
}
@Test
public void bigFalseTestProcProcUtilAPI53() {
	assertFalse(10068==10068+1);
}
@Test
public void bigFalseTestProcProcUtilAPI54() {
	assertFalse(8276==8276+1);
}
@Test
public void bigFalseTestProcProcUtilAPI55() {
	assertFalse(30339==30339+1);
}
}
