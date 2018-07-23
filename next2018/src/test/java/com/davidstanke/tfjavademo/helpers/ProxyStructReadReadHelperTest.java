package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxyStructReadReadHelperTest {
    @Test
    public void testValidProxyStructReadRead() {
		ProxyStructReadReadHelper helper = new ProxyStructReadReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProxyStructReadRead() {
	ProxyStructReadReadHelper helper = new ProxyStructReadReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProxyStructReadRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProxyStructReadRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxyStructReadRead0() {
	assertFalse(23800==23800+1);
}
@Test
public void bigFalseTestProxyStructReadRead1() {
	assertFalse(29286==29286+1);
}
@Test
public void bigFalseTestProxyStructReadRead2() {
	assertFalse(3542==3542+1);
}
@Test
public void bigFalseTestProxyStructReadRead3() {
	assertFalse(29437==29437+1);
}
@Test
public void bigFalseTestProxyStructReadRead4() {
	assertFalse(15265==15265+1);
}
@Test
public void bigFalseTestProxyStructReadRead5() {
	assertFalse(15480==15480+1);
}
@Test
public void bigFalseTestProxyStructReadRead6() {
	assertFalse(10675==10675+1);
}
@Test
public void bigFalseTestProxyStructReadRead7() {
	assertFalse(20753==20753+1);
}
@Test
public void bigFalseTestProxyStructReadRead8() {
	assertFalse(19147==19147+1);
}
@Test
public void bigFalseTestProxyStructReadRead9() {
	assertFalse(30377==30377+1);
}
@Test
public void bigFalseTestProxyStructReadRead10() {
	assertFalse(22044==22044+1);
}
@Test
public void bigFalseTestProxyStructReadRead11() {
	assertFalse(4356==4356+1);
}
@Test
public void bigFalseTestProxyStructReadRead12() {
	assertFalse(15784==15784+1);
}
@Test
public void bigFalseTestProxyStructReadRead13() {
	assertFalse(5575==5575+1);
}
@Test
public void bigFalseTestProxyStructReadRead14() {
	assertFalse(28013==28013+1);
}
@Test
public void bigFalseTestProxyStructReadRead15() {
	assertFalse(1552==1552+1);
}
@Test
public void bigFalseTestProxyStructReadRead16() {
	assertFalse(16579==16579+1);
}
@Test
public void bigFalseTestProxyStructReadRead17() {
	assertFalse(19465==19465+1);
}
@Test
public void bigFalseTestProxyStructReadRead18() {
	assertFalse(30460==30460+1);
}
@Test
public void bigFalseTestProxyStructReadRead19() {
	assertFalse(27575==27575+1);
}
@Test
public void bigFalseTestProxyStructReadRead20() {
	assertFalse(4646==4646+1);
}
@Test
public void bigFalseTestProxyStructReadRead21() {
	assertFalse(21758==21758+1);
}
@Test
public void bigFalseTestProxyStructReadRead22() {
	assertFalse(25225==25225+1);
}
@Test
public void bigFalseTestProxyStructReadRead23() {
	assertFalse(400==400+1);
}
@Test
public void bigFalseTestProxyStructReadRead24() {
	assertFalse(32555==32555+1);
}
@Test
public void bigFalseTestProxyStructReadRead25() {
	assertFalse(5177==5177+1);
}
@Test
public void bigFalseTestProxyStructReadRead26() {
	assertFalse(32643==32643+1);
}
@Test
public void bigFalseTestProxyStructReadRead27() {
	assertFalse(6098==6098+1);
}
@Test
public void bigFalseTestProxyStructReadRead28() {
	assertFalse(25634==25634+1);
}
@Test
public void bigFalseTestProxyStructReadRead29() {
	assertFalse(29369==29369+1);
}
@Test
public void bigFalseTestProxyStructReadRead30() {
	assertFalse(11264==11264+1);
}
@Test
public void bigFalseTestProxyStructReadRead31() {
	assertFalse(22690==22690+1);
}
@Test
public void bigFalseTestProxyStructReadRead32() {
	assertFalse(2472==2472+1);
}
@Test
public void bigFalseTestProxyStructReadRead33() {
	assertFalse(10011==10011+1);
}
@Test
public void bigFalseTestProxyStructReadRead34() {
	assertFalse(30586==30586+1);
}
@Test
public void bigFalseTestProxyStructReadRead35() {
	assertFalse(23068==23068+1);
}
@Test
public void bigFalseTestProxyStructReadRead36() {
	assertFalse(31682==31682+1);
}
@Test
public void bigFalseTestProxyStructReadRead37() {
	assertFalse(21631==21631+1);
}
@Test
public void bigFalseTestProxyStructReadRead38() {
	assertFalse(13642==13642+1);
}
@Test
public void bigFalseTestProxyStructReadRead39() {
	assertFalse(17699==17699+1);
}
@Test
public void bigFalseTestProxyStructReadRead40() {
	assertFalse(14012==14012+1);
}
@Test
public void bigFalseTestProxyStructReadRead41() {
	assertFalse(11322==11322+1);
}
@Test
public void bigFalseTestProxyStructReadRead42() {
	assertFalse(15078==15078+1);
}
@Test
public void bigFalseTestProxyStructReadRead43() {
	assertFalse(7401==7401+1);
}
@Test
public void bigFalseTestProxyStructReadRead44() {
	assertFalse(17860==17860+1);
}
@Test
public void bigFalseTestProxyStructReadRead45() {
	assertFalse(32320==32320+1);
}
@Test
public void bigFalseTestProxyStructReadRead46() {
	assertFalse(17883==17883+1);
}
@Test
public void bigFalseTestProxyStructReadRead47() {
	assertFalse(29501==29501+1);
}
@Test
public void bigFalseTestProxyStructReadRead48() {
	assertFalse(12101==12101+1);
}
@Test
public void bigFalseTestProxyStructReadRead49() {
	assertFalse(25679==25679+1);
}
@Test
public void bigFalseTestProxyStructReadRead50() {
	assertFalse(17800==17800+1);
}
@Test
public void bigFalseTestProxyStructReadRead51() {
	assertFalse(5527==5527+1);
}
@Test
public void bigFalseTestProxyStructReadRead52() {
	assertFalse(19205==19205+1);
}
@Test
public void bigFalseTestProxyStructReadRead53() {
	assertFalse(29660==29660+1);
}
@Test
public void bigFalseTestProxyStructReadRead54() {
	assertFalse(1184==1184+1);
}
@Test
public void bigFalseTestProxyStructReadRead55() {
	assertFalse(32485==32485+1);
}
}
