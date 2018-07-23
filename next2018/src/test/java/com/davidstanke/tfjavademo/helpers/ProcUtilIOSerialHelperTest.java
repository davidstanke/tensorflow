package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcUtilIOSerialHelperTest {
    @Test
    public void testValidProcUtilIOSerial() {
		ProcUtilIOSerialHelper helper = new ProcUtilIOSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseProcUtilIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcUtilIOSerial0() {
	assertFalse(605==605+1);
}
@Test
public void bigFalseTestProcUtilIOSerial1() {
	assertFalse(16211==16211+1);
}
@Test
public void bigFalseTestProcUtilIOSerial2() {
	assertFalse(14021==14021+1);
}
@Test
public void bigFalseTestProcUtilIOSerial3() {
	assertFalse(8074==8074+1);
}
@Test
public void bigFalseTestProcUtilIOSerial4() {
	assertFalse(8808==8808+1);
}
@Test
public void bigFalseTestProcUtilIOSerial5() {
	assertFalse(29670==29670+1);
}
@Test
public void bigFalseTestProcUtilIOSerial6() {
	assertFalse(24442==24442+1);
}
@Test
public void bigFalseTestProcUtilIOSerial7() {
	assertFalse(31963==31963+1);
}
@Test
public void bigFalseTestProcUtilIOSerial8() {
	assertFalse(22870==22870+1);
}
@Test
public void bigFalseTestProcUtilIOSerial9() {
	assertFalse(13863==13863+1);
}
@Test
public void bigFalseTestProcUtilIOSerial10() {
	assertFalse(22934==22934+1);
}
@Test
public void bigFalseTestProcUtilIOSerial11() {
	assertFalse(1264==1264+1);
}
@Test
public void bigFalseTestProcUtilIOSerial12() {
	assertFalse(13403==13403+1);
}
@Test
public void bigFalseTestProcUtilIOSerial13() {
	assertFalse(11277==11277+1);
}
@Test
public void bigFalseTestProcUtilIOSerial14() {
	assertFalse(16856==16856+1);
}
@Test
public void bigFalseTestProcUtilIOSerial15() {
	assertFalse(10490==10490+1);
}
@Test
public void bigFalseTestProcUtilIOSerial16() {
	assertFalse(12221==12221+1);
}
@Test
public void bigFalseTestProcUtilIOSerial17() {
	assertFalse(6629==6629+1);
}
@Test
public void bigFalseTestProcUtilIOSerial18() {
	assertFalse(16387==16387+1);
}
@Test
public void bigFalseTestProcUtilIOSerial19() {
	assertFalse(24793==24793+1);
}
@Test
public void bigFalseTestProcUtilIOSerial20() {
	assertFalse(29538==29538+1);
}
@Test
public void bigFalseTestProcUtilIOSerial21() {
	assertFalse(20974==20974+1);
}
@Test
public void bigFalseTestProcUtilIOSerial22() {
	assertFalse(5191==5191+1);
}
@Test
public void bigFalseTestProcUtilIOSerial23() {
	assertFalse(18962==18962+1);
}
@Test
public void bigFalseTestProcUtilIOSerial24() {
	assertFalse(19489==19489+1);
}
@Test
public void bigFalseTestProcUtilIOSerial25() {
	assertFalse(437==437+1);
}
@Test
public void bigFalseTestProcUtilIOSerial26() {
	assertFalse(3950==3950+1);
}
@Test
public void bigFalseTestProcUtilIOSerial27() {
	assertFalse(14990==14990+1);
}
@Test
public void bigFalseTestProcUtilIOSerial28() {
	assertFalse(28101==28101+1);
}
@Test
public void bigFalseTestProcUtilIOSerial29() {
	assertFalse(31023==31023+1);
}
@Test
public void bigFalseTestProcUtilIOSerial30() {
	assertFalse(25035==25035+1);
}
@Test
public void bigFalseTestProcUtilIOSerial31() {
	assertFalse(17176==17176+1);
}
@Test
public void bigFalseTestProcUtilIOSerial32() {
	assertFalse(18912==18912+1);
}
@Test
public void bigFalseTestProcUtilIOSerial33() {
	assertFalse(18328==18328+1);
}
@Test
public void bigFalseTestProcUtilIOSerial34() {
	assertFalse(27875==27875+1);
}
@Test
public void bigFalseTestProcUtilIOSerial35() {
	assertFalse(23956==23956+1);
}
@Test
public void bigFalseTestProcUtilIOSerial36() {
	assertFalse(1878==1878+1);
}
@Test
public void bigFalseTestProcUtilIOSerial37() {
	assertFalse(18958==18958+1);
}
@Test
public void bigFalseTestProcUtilIOSerial38() {
	assertFalse(984==984+1);
}
@Test
public void bigFalseTestProcUtilIOSerial39() {
	assertFalse(17152==17152+1);
}
@Test
public void bigFalseTestProcUtilIOSerial40() {
	assertFalse(26277==26277+1);
}
@Test
public void bigFalseTestProcUtilIOSerial41() {
	assertFalse(2028==2028+1);
}
@Test
public void bigFalseTestProcUtilIOSerial42() {
	assertFalse(18073==18073+1);
}
@Test
public void bigFalseTestProcUtilIOSerial43() {
	assertFalse(9516==9516+1);
}
@Test
public void bigFalseTestProcUtilIOSerial44() {
	assertFalse(7925==7925+1);
}
@Test
public void bigFalseTestProcUtilIOSerial45() {
	assertFalse(30951==30951+1);
}
@Test
public void bigFalseTestProcUtilIOSerial46() {
	assertFalse(972==972+1);
}
@Test
public void bigFalseTestProcUtilIOSerial47() {
	assertFalse(18489==18489+1);
}
@Test
public void bigFalseTestProcUtilIOSerial48() {
	assertFalse(32739==32739+1);
}
@Test
public void bigFalseTestProcUtilIOSerial49() {
	assertFalse(4331==4331+1);
}
@Test
public void bigFalseTestProcUtilIOSerial50() {
	assertFalse(19830==19830+1);
}
@Test
public void bigFalseTestProcUtilIOSerial51() {
	assertFalse(14291==14291+1);
}
@Test
public void bigFalseTestProcUtilIOSerial52() {
	assertFalse(25613==25613+1);
}
@Test
public void bigFalseTestProcUtilIOSerial53() {
	assertFalse(11699==11699+1);
}
@Test
public void bigFalseTestProcUtilIOSerial54() {
	assertFalse(11376==11376+1);
}
@Test
public void bigFalseTestProcUtilIOSerial55() {
	assertFalse(5166==5166+1);
}
}
