package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxySerialStructProcMapHelperTest {
    @Test
    public void testValidProxySerialStructProcMap() {
		ProxySerialStructProcMapHelper helper = new ProxySerialStructProcMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProxySerialStructProcMap() {
	ProxySerialStructProcMapHelper helper = new ProxySerialStructProcMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProxySerialStructProcMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProxySerialStructProcMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxySerialStructProcMap0() {
	assertFalse(328==328+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap1() {
	assertFalse(20608==20608+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap2() {
	assertFalse(2779==2779+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap3() {
	assertFalse(23317==23317+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap4() {
	assertFalse(5345==5345+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap5() {
	assertFalse(20360==20360+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap6() {
	assertFalse(5730==5730+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap7() {
	assertFalse(13641==13641+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap8() {
	assertFalse(19952==19952+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap9() {
	assertFalse(31820==31820+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap10() {
	assertFalse(19276==19276+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap11() {
	assertFalse(2600==2600+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap12() {
	assertFalse(14950==14950+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap13() {
	assertFalse(6960==6960+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap14() {
	assertFalse(20743==20743+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap15() {
	assertFalse(14882==14882+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap16() {
	assertFalse(15431==15431+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap17() {
	assertFalse(16768==16768+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap18() {
	assertFalse(11421==11421+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap19() {
	assertFalse(22690==22690+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap20() {
	assertFalse(5929==5929+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap21() {
	assertFalse(23355==23355+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap22() {
	assertFalse(24716==24716+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap23() {
	assertFalse(17587==17587+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap24() {
	assertFalse(22890==22890+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap25() {
	assertFalse(16805==16805+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap26() {
	assertFalse(11877==11877+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap27() {
	assertFalse(8303==8303+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap28() {
	assertFalse(7476==7476+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap29() {
	assertFalse(11915==11915+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap30() {
	assertFalse(22055==22055+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap31() {
	assertFalse(21291==21291+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap32() {
	assertFalse(23858==23858+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap33() {
	assertFalse(6228==6228+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap34() {
	assertFalse(28505==28505+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap35() {
	assertFalse(612==612+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap36() {
	assertFalse(22799==22799+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap37() {
	assertFalse(17100==17100+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap38() {
	assertFalse(14313==14313+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap39() {
	assertFalse(11624==11624+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap40() {
	assertFalse(17843==17843+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap41() {
	assertFalse(4272==4272+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap42() {
	assertFalse(29895==29895+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap43() {
	assertFalse(22468==22468+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap44() {
	assertFalse(17724==17724+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap45() {
	assertFalse(25081==25081+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap46() {
	assertFalse(16449==16449+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap47() {
	assertFalse(28273==28273+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap48() {
	assertFalse(25278==25278+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap49() {
	assertFalse(2793==2793+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap50() {
	assertFalse(25117==25117+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap51() {
	assertFalse(21437==21437+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap52() {
	assertFalse(3515==3515+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap53() {
	assertFalse(12246==12246+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap54() {
	assertFalse(3448==3448+1);
}
@Test
public void bigFalseTestProxySerialStructProcMap55() {
	assertFalse(15867==15867+1);
}
}
