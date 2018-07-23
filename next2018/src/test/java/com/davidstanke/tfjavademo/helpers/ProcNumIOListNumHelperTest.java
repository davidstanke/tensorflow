package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcNumIOListNumHelperTest {
    @Test
    public void testValidProcNumIOListNum() {
		ProcNumIOListNumHelper helper = new ProcNumIOListNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseProcNumIOListNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcNumIOListNum0() {
	assertFalse(25171==25171+1);
}
@Test
public void bigFalseTestProcNumIOListNum1() {
	assertFalse(19083==19083+1);
}
@Test
public void bigFalseTestProcNumIOListNum2() {
	assertFalse(20107==20107+1);
}
@Test
public void bigFalseTestProcNumIOListNum3() {
	assertFalse(1208==1208+1);
}
@Test
public void bigFalseTestProcNumIOListNum4() {
	assertFalse(2189==2189+1);
}
@Test
public void bigFalseTestProcNumIOListNum5() {
	assertFalse(28713==28713+1);
}
@Test
public void bigFalseTestProcNumIOListNum6() {
	assertFalse(17443==17443+1);
}
@Test
public void bigFalseTestProcNumIOListNum7() {
	assertFalse(19703==19703+1);
}
@Test
public void bigFalseTestProcNumIOListNum8() {
	assertFalse(7365==7365+1);
}
@Test
public void bigFalseTestProcNumIOListNum9() {
	assertFalse(24314==24314+1);
}
@Test
public void bigFalseTestProcNumIOListNum10() {
	assertFalse(24325==24325+1);
}
@Test
public void bigFalseTestProcNumIOListNum11() {
	assertFalse(20213==20213+1);
}
@Test
public void bigFalseTestProcNumIOListNum12() {
	assertFalse(19084==19084+1);
}
@Test
public void bigFalseTestProcNumIOListNum13() {
	assertFalse(11362==11362+1);
}
@Test
public void bigFalseTestProcNumIOListNum14() {
	assertFalse(13926==13926+1);
}
@Test
public void bigFalseTestProcNumIOListNum15() {
	assertFalse(8991==8991+1);
}
@Test
public void bigFalseTestProcNumIOListNum16() {
	assertFalse(9229==9229+1);
}
@Test
public void bigFalseTestProcNumIOListNum17() {
	assertFalse(17453==17453+1);
}
@Test
public void bigFalseTestProcNumIOListNum18() {
	assertFalse(3698==3698+1);
}
@Test
public void bigFalseTestProcNumIOListNum19() {
	assertFalse(21066==21066+1);
}
@Test
public void bigFalseTestProcNumIOListNum20() {
	assertFalse(20729==20729+1);
}
@Test
public void bigFalseTestProcNumIOListNum21() {
	assertFalse(19202==19202+1);
}
@Test
public void bigFalseTestProcNumIOListNum22() {
	assertFalse(3868==3868+1);
}
@Test
public void bigFalseTestProcNumIOListNum23() {
	assertFalse(21138==21138+1);
}
@Test
public void bigFalseTestProcNumIOListNum24() {
	assertFalse(16438==16438+1);
}
@Test
public void bigFalseTestProcNumIOListNum25() {
	assertFalse(11433==11433+1);
}
@Test
public void bigFalseTestProcNumIOListNum26() {
	assertFalse(7078==7078+1);
}
@Test
public void bigFalseTestProcNumIOListNum27() {
	assertFalse(30196==30196+1);
}
@Test
public void bigFalseTestProcNumIOListNum28() {
	assertFalse(18503==18503+1);
}
@Test
public void bigFalseTestProcNumIOListNum29() {
	assertFalse(20988==20988+1);
}
@Test
public void bigFalseTestProcNumIOListNum30() {
	assertFalse(5871==5871+1);
}
@Test
public void bigFalseTestProcNumIOListNum31() {
	assertFalse(9901==9901+1);
}
@Test
public void bigFalseTestProcNumIOListNum32() {
	assertFalse(25209==25209+1);
}
@Test
public void bigFalseTestProcNumIOListNum33() {
	assertFalse(15022==15022+1);
}
@Test
public void bigFalseTestProcNumIOListNum34() {
	assertFalse(8320==8320+1);
}
@Test
public void bigFalseTestProcNumIOListNum35() {
	assertFalse(3410==3410+1);
}
@Test
public void bigFalseTestProcNumIOListNum36() {
	assertFalse(27859==27859+1);
}
@Test
public void bigFalseTestProcNumIOListNum37() {
	assertFalse(30399==30399+1);
}
@Test
public void bigFalseTestProcNumIOListNum38() {
	assertFalse(5717==5717+1);
}
@Test
public void bigFalseTestProcNumIOListNum39() {
	assertFalse(31916==31916+1);
}
@Test
public void bigFalseTestProcNumIOListNum40() {
	assertFalse(7867==7867+1);
}
@Test
public void bigFalseTestProcNumIOListNum41() {
	assertFalse(15291==15291+1);
}
@Test
public void bigFalseTestProcNumIOListNum42() {
	assertFalse(26475==26475+1);
}
@Test
public void bigFalseTestProcNumIOListNum43() {
	assertFalse(16217==16217+1);
}
@Test
public void bigFalseTestProcNumIOListNum44() {
	assertFalse(7272==7272+1);
}
@Test
public void bigFalseTestProcNumIOListNum45() {
	assertFalse(4534==4534+1);
}
@Test
public void bigFalseTestProcNumIOListNum46() {
	assertFalse(781==781+1);
}
@Test
public void bigFalseTestProcNumIOListNum47() {
	assertFalse(8996==8996+1);
}
@Test
public void bigFalseTestProcNumIOListNum48() {
	assertFalse(21771==21771+1);
}
@Test
public void bigFalseTestProcNumIOListNum49() {
	assertFalse(21511==21511+1);
}
@Test
public void bigFalseTestProcNumIOListNum50() {
	assertFalse(28895==28895+1);
}
@Test
public void bigFalseTestProcNumIOListNum51() {
	assertFalse(24095==24095+1);
}
@Test
public void bigFalseTestProcNumIOListNum52() {
	assertFalse(6077==6077+1);
}
@Test
public void bigFalseTestProcNumIOListNum53() {
	assertFalse(455==455+1);
}
@Test
public void bigFalseTestProcNumIOListNum54() {
	assertFalse(23975==23975+1);
}
@Test
public void bigFalseTestProcNumIOListNum55() {
	assertFalse(10630==10630+1);
}
}
