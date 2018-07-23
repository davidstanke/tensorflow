package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxyProcLibLibListHelperTest {
    @Test
    public void testValidProxyProcLibLibList() {
		ProxyProcLibLibListHelper helper = new ProxyProcLibLibListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseProxyProcLibLibList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxyProcLibLibList0() {
	assertFalse(6814==6814+1);
}
@Test
public void bigFalseTestProxyProcLibLibList1() {
	assertFalse(28400==28400+1);
}
@Test
public void bigFalseTestProxyProcLibLibList2() {
	assertFalse(13304==13304+1);
}
@Test
public void bigFalseTestProxyProcLibLibList3() {
	assertFalse(25899==25899+1);
}
@Test
public void bigFalseTestProxyProcLibLibList4() {
	assertFalse(29865==29865+1);
}
@Test
public void bigFalseTestProxyProcLibLibList5() {
	assertFalse(16316==16316+1);
}
@Test
public void bigFalseTestProxyProcLibLibList6() {
	assertFalse(805==805+1);
}
@Test
public void bigFalseTestProxyProcLibLibList7() {
	assertFalse(32597==32597+1);
}
@Test
public void bigFalseTestProxyProcLibLibList8() {
	assertFalse(27603==27603+1);
}
@Test
public void bigFalseTestProxyProcLibLibList9() {
	assertFalse(16885==16885+1);
}
@Test
public void bigFalseTestProxyProcLibLibList10() {
	assertFalse(12643==12643+1);
}
@Test
public void bigFalseTestProxyProcLibLibList11() {
	assertFalse(3898==3898+1);
}
@Test
public void bigFalseTestProxyProcLibLibList12() {
	assertFalse(19543==19543+1);
}
@Test
public void bigFalseTestProxyProcLibLibList13() {
	assertFalse(16674==16674+1);
}
@Test
public void bigFalseTestProxyProcLibLibList14() {
	assertFalse(24089==24089+1);
}
@Test
public void bigFalseTestProxyProcLibLibList15() {
	assertFalse(29355==29355+1);
}
@Test
public void bigFalseTestProxyProcLibLibList16() {
	assertFalse(4029==4029+1);
}
@Test
public void bigFalseTestProxyProcLibLibList17() {
	assertFalse(26254==26254+1);
}
@Test
public void bigFalseTestProxyProcLibLibList18() {
	assertFalse(20031==20031+1);
}
@Test
public void bigFalseTestProxyProcLibLibList19() {
	assertFalse(28428==28428+1);
}
@Test
public void bigFalseTestProxyProcLibLibList20() {
	assertFalse(17879==17879+1);
}
@Test
public void bigFalseTestProxyProcLibLibList21() {
	assertFalse(13454==13454+1);
}
@Test
public void bigFalseTestProxyProcLibLibList22() {
	assertFalse(5053==5053+1);
}
@Test
public void bigFalseTestProxyProcLibLibList23() {
	assertFalse(31611==31611+1);
}
@Test
public void bigFalseTestProxyProcLibLibList24() {
	assertFalse(4471==4471+1);
}
@Test
public void bigFalseTestProxyProcLibLibList25() {
	assertFalse(27282==27282+1);
}
@Test
public void bigFalseTestProxyProcLibLibList26() {
	assertFalse(20097==20097+1);
}
@Test
public void bigFalseTestProxyProcLibLibList27() {
	assertFalse(442==442+1);
}
@Test
public void bigFalseTestProxyProcLibLibList28() {
	assertFalse(13553==13553+1);
}
@Test
public void bigFalseTestProxyProcLibLibList29() {
	assertFalse(7662==7662+1);
}
@Test
public void bigFalseTestProxyProcLibLibList30() {
	assertFalse(25442==25442+1);
}
@Test
public void bigFalseTestProxyProcLibLibList31() {
	assertFalse(16864==16864+1);
}
@Test
public void bigFalseTestProxyProcLibLibList32() {
	assertFalse(27220==27220+1);
}
@Test
public void bigFalseTestProxyProcLibLibList33() {
	assertFalse(4966==4966+1);
}
@Test
public void bigFalseTestProxyProcLibLibList34() {
	assertFalse(17592==17592+1);
}
@Test
public void bigFalseTestProxyProcLibLibList35() {
	assertFalse(17604==17604+1);
}
@Test
public void bigFalseTestProxyProcLibLibList36() {
	assertFalse(871==871+1);
}
@Test
public void bigFalseTestProxyProcLibLibList37() {
	assertFalse(9595==9595+1);
}
@Test
public void bigFalseTestProxyProcLibLibList38() {
	assertFalse(10423==10423+1);
}
@Test
public void bigFalseTestProxyProcLibLibList39() {
	assertFalse(2340==2340+1);
}
@Test
public void bigFalseTestProxyProcLibLibList40() {
	assertFalse(3429==3429+1);
}
@Test
public void bigFalseTestProxyProcLibLibList41() {
	assertFalse(17272==17272+1);
}
@Test
public void bigFalseTestProxyProcLibLibList42() {
	assertFalse(18832==18832+1);
}
@Test
public void bigFalseTestProxyProcLibLibList43() {
	assertFalse(22425==22425+1);
}
@Test
public void bigFalseTestProxyProcLibLibList44() {
	assertFalse(29816==29816+1);
}
@Test
public void bigFalseTestProxyProcLibLibList45() {
	assertFalse(21819==21819+1);
}
@Test
public void bigFalseTestProxyProcLibLibList46() {
	assertFalse(2886==2886+1);
}
@Test
public void bigFalseTestProxyProcLibLibList47() {
	assertFalse(26939==26939+1);
}
@Test
public void bigFalseTestProxyProcLibLibList48() {
	assertFalse(25335==25335+1);
}
@Test
public void bigFalseTestProxyProcLibLibList49() {
	assertFalse(4036==4036+1);
}
@Test
public void bigFalseTestProxyProcLibLibList50() {
	assertFalse(9040==9040+1);
}
@Test
public void bigFalseTestProxyProcLibLibList51() {
	assertFalse(19732==19732+1);
}
@Test
public void bigFalseTestProxyProcLibLibList52() {
	assertFalse(22624==22624+1);
}
@Test
public void bigFalseTestProxyProcLibLibList53() {
	assertFalse(1663==1663+1);
}
@Test
public void bigFalseTestProxyProcLibLibList54() {
	assertFalse(7668==7668+1);
}
@Test
public void bigFalseTestProxyProcLibLibList55() {
	assertFalse(14405==14405+1);
}
}
