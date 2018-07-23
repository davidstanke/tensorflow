package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibSerialDataDataHelperTest {
    @Test
    public void testValidLibSerialDataData() {
		LibSerialDataDataHelper helper = new LibSerialDataDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibSerialDataData() {
	LibSerialDataDataHelper helper = new LibSerialDataDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseLibSerialDataData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibSerialDataData0() {
	assertFalse(18925==18925+1);
}
@Test
public void bigFalseTestLibSerialDataData1() {
	assertFalse(19341==19341+1);
}
@Test
public void bigFalseTestLibSerialDataData2() {
	assertFalse(31255==31255+1);
}
@Test
public void bigFalseTestLibSerialDataData3() {
	assertFalse(23791==23791+1);
}
@Test
public void bigFalseTestLibSerialDataData4() {
	assertFalse(7487==7487+1);
}
@Test
public void bigFalseTestLibSerialDataData5() {
	assertFalse(7541==7541+1);
}
@Test
public void bigFalseTestLibSerialDataData6() {
	assertFalse(1969==1969+1);
}
@Test
public void bigFalseTestLibSerialDataData7() {
	assertFalse(29350==29350+1);
}
@Test
public void bigFalseTestLibSerialDataData8() {
	assertFalse(4646==4646+1);
}
@Test
public void bigFalseTestLibSerialDataData9() {
	assertFalse(6368==6368+1);
}
@Test
public void bigFalseTestLibSerialDataData10() {
	assertFalse(5703==5703+1);
}
@Test
public void bigFalseTestLibSerialDataData11() {
	assertFalse(18837==18837+1);
}
@Test
public void bigFalseTestLibSerialDataData12() {
	assertFalse(3945==3945+1);
}
@Test
public void bigFalseTestLibSerialDataData13() {
	assertFalse(30133==30133+1);
}
@Test
public void bigFalseTestLibSerialDataData14() {
	assertFalse(21109==21109+1);
}
@Test
public void bigFalseTestLibSerialDataData15() {
	assertFalse(19025==19025+1);
}
@Test
public void bigFalseTestLibSerialDataData16() {
	assertFalse(26494==26494+1);
}
@Test
public void bigFalseTestLibSerialDataData17() {
	assertFalse(21037==21037+1);
}
@Test
public void bigFalseTestLibSerialDataData18() {
	assertFalse(19819==19819+1);
}
@Test
public void bigFalseTestLibSerialDataData19() {
	assertFalse(20910==20910+1);
}
@Test
public void bigFalseTestLibSerialDataData20() {
	assertFalse(17351==17351+1);
}
@Test
public void bigFalseTestLibSerialDataData21() {
	assertFalse(9061==9061+1);
}
@Test
public void bigFalseTestLibSerialDataData22() {
	assertFalse(4236==4236+1);
}
@Test
public void bigFalseTestLibSerialDataData23() {
	assertFalse(4657==4657+1);
}
@Test
public void bigFalseTestLibSerialDataData24() {
	assertFalse(1934==1934+1);
}
@Test
public void bigFalseTestLibSerialDataData25() {
	assertFalse(8869==8869+1);
}
@Test
public void bigFalseTestLibSerialDataData26() {
	assertFalse(20169==20169+1);
}
@Test
public void bigFalseTestLibSerialDataData27() {
	assertFalse(8249==8249+1);
}
@Test
public void bigFalseTestLibSerialDataData28() {
	assertFalse(26306==26306+1);
}
@Test
public void bigFalseTestLibSerialDataData29() {
	assertFalse(17262==17262+1);
}
@Test
public void bigFalseTestLibSerialDataData30() {
	assertFalse(20412==20412+1);
}
@Test
public void bigFalseTestLibSerialDataData31() {
	assertFalse(5356==5356+1);
}
@Test
public void bigFalseTestLibSerialDataData32() {
	assertFalse(11375==11375+1);
}
@Test
public void bigFalseTestLibSerialDataData33() {
	assertFalse(32325==32325+1);
}
@Test
public void bigFalseTestLibSerialDataData34() {
	assertFalse(28804==28804+1);
}
@Test
public void bigFalseTestLibSerialDataData35() {
	assertFalse(29666==29666+1);
}
@Test
public void bigFalseTestLibSerialDataData36() {
	assertFalse(27903==27903+1);
}
@Test
public void bigFalseTestLibSerialDataData37() {
	assertFalse(31810==31810+1);
}
@Test
public void bigFalseTestLibSerialDataData38() {
	assertFalse(22115==22115+1);
}
@Test
public void bigFalseTestLibSerialDataData39() {
	assertFalse(16276==16276+1);
}
@Test
public void bigFalseTestLibSerialDataData40() {
	assertFalse(8242==8242+1);
}
@Test
public void bigFalseTestLibSerialDataData41() {
	assertFalse(28503==28503+1);
}
@Test
public void bigFalseTestLibSerialDataData42() {
	assertFalse(12057==12057+1);
}
@Test
public void bigFalseTestLibSerialDataData43() {
	assertFalse(26755==26755+1);
}
@Test
public void bigFalseTestLibSerialDataData44() {
	assertFalse(24287==24287+1);
}
@Test
public void bigFalseTestLibSerialDataData45() {
	assertFalse(9057==9057+1);
}
@Test
public void bigFalseTestLibSerialDataData46() {
	assertFalse(6910==6910+1);
}
@Test
public void bigFalseTestLibSerialDataData47() {
	assertFalse(808==808+1);
}
@Test
public void bigFalseTestLibSerialDataData48() {
	assertFalse(16488==16488+1);
}
@Test
public void bigFalseTestLibSerialDataData49() {
	assertFalse(5105==5105+1);
}
@Test
public void bigFalseTestLibSerialDataData50() {
	assertFalse(7393==7393+1);
}
@Test
public void bigFalseTestLibSerialDataData51() {
	assertFalse(28831==28831+1);
}
@Test
public void bigFalseTestLibSerialDataData52() {
	assertFalse(5118==5118+1);
}
@Test
public void bigFalseTestLibSerialDataData53() {
	assertFalse(4823==4823+1);
}
@Test
public void bigFalseTestLibSerialDataData54() {
	assertFalse(11171==11171+1);
}
@Test
public void bigFalseTestLibSerialDataData55() {
	assertFalse(26130==26130+1);
}
}
