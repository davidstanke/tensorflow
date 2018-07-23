package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncMapStructProxyStringHelperTest {
    @Test
    public void testValidAsyncMapStructProxyString() {
		AsyncMapStructProxyStringHelper helper = new AsyncMapStructProxyStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncMapStructProxyString() {
	AsyncMapStructProxyStringHelper helper = new AsyncMapStructProxyStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseAsyncMapStructProxyString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAsyncMapStructProxyString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncMapStructProxyString0() {
	assertFalse(4898==4898+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString1() {
	assertFalse(1841==1841+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString2() {
	assertFalse(30932==30932+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString3() {
	assertFalse(14380==14380+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString4() {
	assertFalse(14369==14369+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString5() {
	assertFalse(28960==28960+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString6() {
	assertFalse(17892==17892+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString7() {
	assertFalse(7727==7727+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString8() {
	assertFalse(31451==31451+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString9() {
	assertFalse(14286==14286+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString10() {
	assertFalse(13466==13466+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString11() {
	assertFalse(22742==22742+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString12() {
	assertFalse(20052==20052+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString13() {
	assertFalse(884==884+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString14() {
	assertFalse(3369==3369+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString15() {
	assertFalse(29253==29253+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString16() {
	assertFalse(3710==3710+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString17() {
	assertFalse(11963==11963+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString18() {
	assertFalse(22411==22411+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString19() {
	assertFalse(18333==18333+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString20() {
	assertFalse(1055==1055+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString21() {
	assertFalse(23103==23103+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString22() {
	assertFalse(28494==28494+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString23() {
	assertFalse(7889==7889+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString24() {
	assertFalse(15232==15232+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString25() {
	assertFalse(15302==15302+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString26() {
	assertFalse(2081==2081+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString27() {
	assertFalse(15944==15944+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString28() {
	assertFalse(6619==6619+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString29() {
	assertFalse(9533==9533+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString30() {
	assertFalse(28450==28450+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString31() {
	assertFalse(25143==25143+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString32() {
	assertFalse(23938==23938+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString33() {
	assertFalse(32630==32630+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString34() {
	assertFalse(5349==5349+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString35() {
	assertFalse(11196==11196+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString36() {
	assertFalse(29903==29903+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString37() {
	assertFalse(13475==13475+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString38() {
	assertFalse(11332==11332+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString39() {
	assertFalse(26043==26043+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString40() {
	assertFalse(22479==22479+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString41() {
	assertFalse(18066==18066+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString42() {
	assertFalse(27113==27113+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString43() {
	assertFalse(15225==15225+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString44() {
	assertFalse(20653==20653+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString45() {
	assertFalse(3238==3238+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString46() {
	assertFalse(12444==12444+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString47() {
	assertFalse(15610==15610+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString48() {
	assertFalse(24288==24288+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString49() {
	assertFalse(21913==21913+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString50() {
	assertFalse(13901==13901+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString51() {
	assertFalse(19739==19739+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString52() {
	assertFalse(8468==8468+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString53() {
	assertFalse(26867==26867+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString54() {
	assertFalse(28129==28129+1);
}
@Test
public void bigFalseTestAsyncMapStructProxyString55() {
	assertFalse(21870==21870+1);
}
}
