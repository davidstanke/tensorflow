package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcUtilStringProxyProcHelperTest {
    @Test
    public void testValidProcUtilStringProxyProc() {
		ProcUtilStringProxyProcHelper helper = new ProcUtilStringProxyProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcUtilStringProxyProc() {
	ProcUtilStringProxyProcHelper helper = new ProcUtilStringProxyProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseProcUtilStringProxyProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcUtilStringProxyProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcUtilStringProxyProc0() {
	assertFalse(29085==29085+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc1() {
	assertFalse(29163==29163+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc2() {
	assertFalse(14214==14214+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc3() {
	assertFalse(12827==12827+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc4() {
	assertFalse(21460==21460+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc5() {
	assertFalse(32529==32529+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc6() {
	assertFalse(27351==27351+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc7() {
	assertFalse(28491==28491+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc8() {
	assertFalse(21213==21213+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc9() {
	assertFalse(3168==3168+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc10() {
	assertFalse(32090==32090+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc11() {
	assertFalse(17793==17793+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc12() {
	assertFalse(27484==27484+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc13() {
	assertFalse(32344==32344+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc14() {
	assertFalse(13582==13582+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc15() {
	assertFalse(5014==5014+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc16() {
	assertFalse(32447==32447+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc17() {
	assertFalse(27207==27207+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc18() {
	assertFalse(9884==9884+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc19() {
	assertFalse(8385==8385+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc20() {
	assertFalse(13610==13610+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc21() {
	assertFalse(12240==12240+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc22() {
	assertFalse(22304==22304+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc23() {
	assertFalse(10348==10348+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc24() {
	assertFalse(4646==4646+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc25() {
	assertFalse(11805==11805+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc26() {
	assertFalse(11959==11959+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc27() {
	assertFalse(18388==18388+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc28() {
	assertFalse(10250==10250+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc29() {
	assertFalse(4324==4324+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc30() {
	assertFalse(1997==1997+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc31() {
	assertFalse(10595==10595+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc32() {
	assertFalse(5669==5669+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc33() {
	assertFalse(28955==28955+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc34() {
	assertFalse(26403==26403+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc35() {
	assertFalse(2509==2509+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc36() {
	assertFalse(15793==15793+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc37() {
	assertFalse(17786==17786+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc38() {
	assertFalse(10403==10403+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc39() {
	assertFalse(29420==29420+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc40() {
	assertFalse(22903==22903+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc41() {
	assertFalse(24245==24245+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc42() {
	assertFalse(11492==11492+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc43() {
	assertFalse(18524==18524+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc44() {
	assertFalse(25665==25665+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc45() {
	assertFalse(27510==27510+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc46() {
	assertFalse(21371==21371+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc47() {
	assertFalse(470==470+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc48() {
	assertFalse(31236==31236+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc49() {
	assertFalse(16412==16412+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc50() {
	assertFalse(19975==19975+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc51() {
	assertFalse(12109==12109+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc52() {
	assertFalse(8138==8138+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc53() {
	assertFalse(24118==24118+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc54() {
	assertFalse(6139==6139+1);
}
@Test
public void bigFalseTestProcUtilStringProxyProc55() {
	assertFalse(8907==8907+1);
}
}
