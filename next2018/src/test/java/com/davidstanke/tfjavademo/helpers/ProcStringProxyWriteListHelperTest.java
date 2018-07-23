package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcStringProxyWriteListHelperTest {
    @Test
    public void testValidProcStringProxyWriteList() {
		ProcStringProxyWriteListHelper helper = new ProcStringProxyWriteListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseProcStringProxyWriteList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProcStringProxyWriteList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProcStringProxyWriteList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcStringProxyWriteList0() {
	assertFalse(13204==13204+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList1() {
	assertFalse(6806==6806+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList2() {
	assertFalse(12688==12688+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList3() {
	assertFalse(664==664+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList4() {
	assertFalse(28686==28686+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList5() {
	assertFalse(18101==18101+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList6() {
	assertFalse(16008==16008+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList7() {
	assertFalse(4950==4950+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList8() {
	assertFalse(3567==3567+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList9() {
	assertFalse(28247==28247+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList10() {
	assertFalse(13596==13596+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList11() {
	assertFalse(2486==2486+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList12() {
	assertFalse(16957==16957+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList13() {
	assertFalse(20691==20691+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList14() {
	assertFalse(1754==1754+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList15() {
	assertFalse(27126==27126+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList16() {
	assertFalse(461==461+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList17() {
	assertFalse(2206==2206+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList18() {
	assertFalse(5686==5686+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList19() {
	assertFalse(11722==11722+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList20() {
	assertFalse(4188==4188+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList21() {
	assertFalse(562==562+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList22() {
	assertFalse(16638==16638+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList23() {
	assertFalse(812==812+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList24() {
	assertFalse(25968==25968+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList25() {
	assertFalse(30138==30138+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList26() {
	assertFalse(5794==5794+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList27() {
	assertFalse(11239==11239+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList28() {
	assertFalse(748==748+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList29() {
	assertFalse(20354==20354+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList30() {
	assertFalse(13862==13862+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList31() {
	assertFalse(18913==18913+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList32() {
	assertFalse(6518==6518+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList33() {
	assertFalse(13089==13089+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList34() {
	assertFalse(4067==4067+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList35() {
	assertFalse(9259==9259+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList36() {
	assertFalse(5769==5769+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList37() {
	assertFalse(1379==1379+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList38() {
	assertFalse(1793==1793+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList39() {
	assertFalse(12490==12490+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList40() {
	assertFalse(30809==30809+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList41() {
	assertFalse(10489==10489+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList42() {
	assertFalse(11956==11956+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList43() {
	assertFalse(28483==28483+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList44() {
	assertFalse(874==874+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList45() {
	assertFalse(23008==23008+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList46() {
	assertFalse(7993==7993+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList47() {
	assertFalse(24552==24552+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList48() {
	assertFalse(13807==13807+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList49() {
	assertFalse(21393==21393+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList50() {
	assertFalse(7823==7823+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList51() {
	assertFalse(9189==9189+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList52() {
	assertFalse(5347==5347+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList53() {
	assertFalse(11757==11757+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList54() {
	assertFalse(6390==6390+1);
}
@Test
public void bigFalseTestProcStringProxyWriteList55() {
	assertFalse(4617==4617+1);
}
}
