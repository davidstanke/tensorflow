package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadProxyProcListHelperTest {
    @Test
    public void testValidReadProxyProcList() {
		ReadProxyProcListHelper helper = new ReadProxyProcListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidReadProxyProcList() {
	ReadProxyProcListHelper helper = new ReadProxyProcListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestReadProxyProcList0() {
	assertFalse(9683==9683+1);
}
@Test
public void bigFalseTestReadProxyProcList1() {
	assertFalse(17072==17072+1);
}
@Test
public void bigFalseTestReadProxyProcList2() {
	assertFalse(1064==1064+1);
}
@Test
public void bigFalseTestReadProxyProcList3() {
	assertFalse(30270==30270+1);
}
@Test
public void bigFalseTestReadProxyProcList4() {
	assertFalse(26583==26583+1);
}
@Test
public void bigFalseTestReadProxyProcList5() {
	assertFalse(4279==4279+1);
}
@Test
public void bigFalseTestReadProxyProcList6() {
	assertFalse(15528==15528+1);
}
@Test
public void bigFalseTestReadProxyProcList7() {
	assertFalse(1303==1303+1);
}
@Test
public void bigFalseTestReadProxyProcList8() {
	assertFalse(28603==28603+1);
}
@Test
public void bigFalseTestReadProxyProcList9() {
	assertFalse(11833==11833+1);
}
@Test
public void bigFalseTestReadProxyProcList10() {
	assertFalse(29740==29740+1);
}
@Test
public void bigFalseTestReadProxyProcList11() {
	assertFalse(20952==20952+1);
}
@Test
public void bigFalseTestReadProxyProcList12() {
	assertFalse(17959==17959+1);
}
@Test
public void bigFalseTestReadProxyProcList13() {
	assertFalse(30720==30720+1);
}
@Test
public void bigFalseTestReadProxyProcList14() {
	assertFalse(19569==19569+1);
}
@Test
public void bigFalseTestReadProxyProcList15() {
	assertFalse(877==877+1);
}
@Test
public void bigFalseTestReadProxyProcList16() {
	assertFalse(9509==9509+1);
}
@Test
public void bigFalseTestReadProxyProcList17() {
	assertFalse(1338==1338+1);
}
@Test
public void bigFalseTestReadProxyProcList18() {
	assertFalse(17669==17669+1);
}
@Test
public void bigFalseTestReadProxyProcList19() {
	assertFalse(27132==27132+1);
}
@Test
public void bigFalseTestReadProxyProcList20() {
	assertFalse(2483==2483+1);
}
@Test
public void bigFalseTestReadProxyProcList21() {
	assertFalse(18454==18454+1);
}
@Test
public void bigFalseTestReadProxyProcList22() {
	assertFalse(9654==9654+1);
}
@Test
public void bigFalseTestReadProxyProcList23() {
	assertFalse(14053==14053+1);
}
@Test
public void bigFalseTestReadProxyProcList24() {
	assertFalse(21002==21002+1);
}
@Test
public void bigFalseTestReadProxyProcList25() {
	assertFalse(7200==7200+1);
}
@Test
public void bigFalseTestReadProxyProcList26() {
	assertFalse(9147==9147+1);
}
@Test
public void bigFalseTestReadProxyProcList27() {
	assertFalse(14458==14458+1);
}
@Test
public void bigFalseTestReadProxyProcList28() {
	assertFalse(29869==29869+1);
}
@Test
public void bigFalseTestReadProxyProcList29() {
	assertFalse(24162==24162+1);
}
@Test
public void bigFalseTestReadProxyProcList30() {
	assertFalse(11683==11683+1);
}
@Test
public void bigFalseTestReadProxyProcList31() {
	assertFalse(5502==5502+1);
}
@Test
public void bigFalseTestReadProxyProcList32() {
	assertFalse(7216==7216+1);
}
@Test
public void bigFalseTestReadProxyProcList33() {
	assertFalse(27446==27446+1);
}
@Test
public void bigFalseTestReadProxyProcList34() {
	assertFalse(2561==2561+1);
}
@Test
public void bigFalseTestReadProxyProcList35() {
	assertFalse(17503==17503+1);
}
@Test
public void bigFalseTestReadProxyProcList36() {
	assertFalse(13261==13261+1);
}
@Test
public void bigFalseTestReadProxyProcList37() {
	assertFalse(7660==7660+1);
}
@Test
public void bigFalseTestReadProxyProcList38() {
	assertFalse(13525==13525+1);
}
@Test
public void bigFalseTestReadProxyProcList39() {
	assertFalse(14899==14899+1);
}
@Test
public void bigFalseTestReadProxyProcList40() {
	assertFalse(12456==12456+1);
}
@Test
public void bigFalseTestReadProxyProcList41() {
	assertFalse(11809==11809+1);
}
@Test
public void bigFalseTestReadProxyProcList42() {
	assertFalse(10169==10169+1);
}
@Test
public void bigFalseTestReadProxyProcList43() {
	assertFalse(3444==3444+1);
}
@Test
public void bigFalseTestReadProxyProcList44() {
	assertFalse(9182==9182+1);
}
@Test
public void bigFalseTestReadProxyProcList45() {
	assertFalse(1754==1754+1);
}
@Test
public void bigFalseTestReadProxyProcList46() {
	assertFalse(30928==30928+1);
}
@Test
public void bigFalseTestReadProxyProcList47() {
	assertFalse(2172==2172+1);
}
@Test
public void bigFalseTestReadProxyProcList48() {
	assertFalse(24912==24912+1);
}
@Test
public void bigFalseTestReadProxyProcList49() {
	assertFalse(29539==29539+1);
}
@Test
public void bigFalseTestReadProxyProcList50() {
	assertFalse(31854==31854+1);
}
@Test
public void bigFalseTestReadProxyProcList51() {
	assertFalse(26559==26559+1);
}
@Test
public void bigFalseTestReadProxyProcList52() {
	assertFalse(18224==18224+1);
}
@Test
public void bigFalseTestReadProxyProcList53() {
	assertFalse(15850==15850+1);
}
@Test
public void bigFalseTestReadProxyProcList54() {
	assertFalse(21895==21895+1);
}
@Test
public void bigFalseTestReadProxyProcList55() {
	assertFalse(16330==16330+1);
}
}
