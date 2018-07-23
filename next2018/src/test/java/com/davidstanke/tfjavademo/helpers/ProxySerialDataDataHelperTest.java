package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxySerialDataDataHelperTest {
    @Test
    public void testValidProxySerialDataData() {
		ProxySerialDataDataHelper helper = new ProxySerialDataDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProxySerialDataData() {
	ProxySerialDataDataHelper helper = new ProxySerialDataDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProxySerialDataData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProxySerialDataData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxySerialDataData0() {
	assertFalse(12373==12373+1);
}
@Test
public void bigFalseTestProxySerialDataData1() {
	assertFalse(20730==20730+1);
}
@Test
public void bigFalseTestProxySerialDataData2() {
	assertFalse(24967==24967+1);
}
@Test
public void bigFalseTestProxySerialDataData3() {
	assertFalse(24886==24886+1);
}
@Test
public void bigFalseTestProxySerialDataData4() {
	assertFalse(12165==12165+1);
}
@Test
public void bigFalseTestProxySerialDataData5() {
	assertFalse(17944==17944+1);
}
@Test
public void bigFalseTestProxySerialDataData6() {
	assertFalse(18169==18169+1);
}
@Test
public void bigFalseTestProxySerialDataData7() {
	assertFalse(24733==24733+1);
}
@Test
public void bigFalseTestProxySerialDataData8() {
	assertFalse(2046==2046+1);
}
@Test
public void bigFalseTestProxySerialDataData9() {
	assertFalse(19431==19431+1);
}
@Test
public void bigFalseTestProxySerialDataData10() {
	assertFalse(32038==32038+1);
}
@Test
public void bigFalseTestProxySerialDataData11() {
	assertFalse(12756==12756+1);
}
@Test
public void bigFalseTestProxySerialDataData12() {
	assertFalse(10868==10868+1);
}
@Test
public void bigFalseTestProxySerialDataData13() {
	assertFalse(7186==7186+1);
}
@Test
public void bigFalseTestProxySerialDataData14() {
	assertFalse(7425==7425+1);
}
@Test
public void bigFalseTestProxySerialDataData15() {
	assertFalse(26617==26617+1);
}
@Test
public void bigFalseTestProxySerialDataData16() {
	assertFalse(24266==24266+1);
}
@Test
public void bigFalseTestProxySerialDataData17() {
	assertFalse(1885==1885+1);
}
@Test
public void bigFalseTestProxySerialDataData18() {
	assertFalse(2764==2764+1);
}
@Test
public void bigFalseTestProxySerialDataData19() {
	assertFalse(16905==16905+1);
}
@Test
public void bigFalseTestProxySerialDataData20() {
	assertFalse(25731==25731+1);
}
@Test
public void bigFalseTestProxySerialDataData21() {
	assertFalse(11174==11174+1);
}
@Test
public void bigFalseTestProxySerialDataData22() {
	assertFalse(14950==14950+1);
}
@Test
public void bigFalseTestProxySerialDataData23() {
	assertFalse(26431==26431+1);
}
@Test
public void bigFalseTestProxySerialDataData24() {
	assertFalse(11759==11759+1);
}
@Test
public void bigFalseTestProxySerialDataData25() {
	assertFalse(3485==3485+1);
}
@Test
public void bigFalseTestProxySerialDataData26() {
	assertFalse(27736==27736+1);
}
@Test
public void bigFalseTestProxySerialDataData27() {
	assertFalse(3377==3377+1);
}
@Test
public void bigFalseTestProxySerialDataData28() {
	assertFalse(8721==8721+1);
}
@Test
public void bigFalseTestProxySerialDataData29() {
	assertFalse(4674==4674+1);
}
@Test
public void bigFalseTestProxySerialDataData30() {
	assertFalse(12190==12190+1);
}
@Test
public void bigFalseTestProxySerialDataData31() {
	assertFalse(25512==25512+1);
}
@Test
public void bigFalseTestProxySerialDataData32() {
	assertFalse(4435==4435+1);
}
@Test
public void bigFalseTestProxySerialDataData33() {
	assertFalse(5155==5155+1);
}
@Test
public void bigFalseTestProxySerialDataData34() {
	assertFalse(13365==13365+1);
}
@Test
public void bigFalseTestProxySerialDataData35() {
	assertFalse(25154==25154+1);
}
@Test
public void bigFalseTestProxySerialDataData36() {
	assertFalse(18665==18665+1);
}
@Test
public void bigFalseTestProxySerialDataData37() {
	assertFalse(4179==4179+1);
}
@Test
public void bigFalseTestProxySerialDataData38() {
	assertFalse(14952==14952+1);
}
@Test
public void bigFalseTestProxySerialDataData39() {
	assertFalse(21449==21449+1);
}
@Test
public void bigFalseTestProxySerialDataData40() {
	assertFalse(28933==28933+1);
}
@Test
public void bigFalseTestProxySerialDataData41() {
	assertFalse(10025==10025+1);
}
@Test
public void bigFalseTestProxySerialDataData42() {
	assertFalse(10971==10971+1);
}
@Test
public void bigFalseTestProxySerialDataData43() {
	assertFalse(15186==15186+1);
}
@Test
public void bigFalseTestProxySerialDataData44() {
	assertFalse(8639==8639+1);
}
@Test
public void bigFalseTestProxySerialDataData45() {
	assertFalse(27838==27838+1);
}
@Test
public void bigFalseTestProxySerialDataData46() {
	assertFalse(9044==9044+1);
}
@Test
public void bigFalseTestProxySerialDataData47() {
	assertFalse(28438==28438+1);
}
@Test
public void bigFalseTestProxySerialDataData48() {
	assertFalse(23234==23234+1);
}
@Test
public void bigFalseTestProxySerialDataData49() {
	assertFalse(17700==17700+1);
}
@Test
public void bigFalseTestProxySerialDataData50() {
	assertFalse(1101==1101+1);
}
@Test
public void bigFalseTestProxySerialDataData51() {
	assertFalse(1296==1296+1);
}
@Test
public void bigFalseTestProxySerialDataData52() {
	assertFalse(18872==18872+1);
}
@Test
public void bigFalseTestProxySerialDataData53() {
	assertFalse(18535==18535+1);
}
@Test
public void bigFalseTestProxySerialDataData54() {
	assertFalse(19258==19258+1);
}
@Test
public void bigFalseTestProxySerialDataData55() {
	assertFalse(27994==27994+1);
}
}
