package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilProcListLibStringHelperTest {
    @Test
    public void testValidUtilProcListLibString() {
		UtilProcListLibStringHelper helper = new UtilProcListLibStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseUtilProcListLibString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseUtilProcListLibString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseUtilProcListLibString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilProcListLibString0() {
	assertFalse(17061==17061+1);
}
@Test
public void bigFalseTestUtilProcListLibString1() {
	assertFalse(32300==32300+1);
}
@Test
public void bigFalseTestUtilProcListLibString2() {
	assertFalse(10195==10195+1);
}
@Test
public void bigFalseTestUtilProcListLibString3() {
	assertFalse(24964==24964+1);
}
@Test
public void bigFalseTestUtilProcListLibString4() {
	assertFalse(10796==10796+1);
}
@Test
public void bigFalseTestUtilProcListLibString5() {
	assertFalse(25177==25177+1);
}
@Test
public void bigFalseTestUtilProcListLibString6() {
	assertFalse(7919==7919+1);
}
@Test
public void bigFalseTestUtilProcListLibString7() {
	assertFalse(19082==19082+1);
}
@Test
public void bigFalseTestUtilProcListLibString8() {
	assertFalse(23794==23794+1);
}
@Test
public void bigFalseTestUtilProcListLibString9() {
	assertFalse(14714==14714+1);
}
@Test
public void bigFalseTestUtilProcListLibString10() {
	assertFalse(26748==26748+1);
}
@Test
public void bigFalseTestUtilProcListLibString11() {
	assertFalse(11778==11778+1);
}
@Test
public void bigFalseTestUtilProcListLibString12() {
	assertFalse(15964==15964+1);
}
@Test
public void bigFalseTestUtilProcListLibString13() {
	assertFalse(4150==4150+1);
}
@Test
public void bigFalseTestUtilProcListLibString14() {
	assertFalse(21971==21971+1);
}
@Test
public void bigFalseTestUtilProcListLibString15() {
	assertFalse(5819==5819+1);
}
@Test
public void bigFalseTestUtilProcListLibString16() {
	assertFalse(30386==30386+1);
}
@Test
public void bigFalseTestUtilProcListLibString17() {
	assertFalse(22043==22043+1);
}
@Test
public void bigFalseTestUtilProcListLibString18() {
	assertFalse(23742==23742+1);
}
@Test
public void bigFalseTestUtilProcListLibString19() {
	assertFalse(22865==22865+1);
}
@Test
public void bigFalseTestUtilProcListLibString20() {
	assertFalse(17201==17201+1);
}
@Test
public void bigFalseTestUtilProcListLibString21() {
	assertFalse(402==402+1);
}
@Test
public void bigFalseTestUtilProcListLibString22() {
	assertFalse(19191==19191+1);
}
@Test
public void bigFalseTestUtilProcListLibString23() {
	assertFalse(18419==18419+1);
}
@Test
public void bigFalseTestUtilProcListLibString24() {
	assertFalse(11248==11248+1);
}
@Test
public void bigFalseTestUtilProcListLibString25() {
	assertFalse(1667==1667+1);
}
@Test
public void bigFalseTestUtilProcListLibString26() {
	assertFalse(13668==13668+1);
}
@Test
public void bigFalseTestUtilProcListLibString27() {
	assertFalse(22255==22255+1);
}
@Test
public void bigFalseTestUtilProcListLibString28() {
	assertFalse(15219==15219+1);
}
@Test
public void bigFalseTestUtilProcListLibString29() {
	assertFalse(3015==3015+1);
}
@Test
public void bigFalseTestUtilProcListLibString30() {
	assertFalse(7957==7957+1);
}
@Test
public void bigFalseTestUtilProcListLibString31() {
	assertFalse(32258==32258+1);
}
@Test
public void bigFalseTestUtilProcListLibString32() {
	assertFalse(5136==5136+1);
}
@Test
public void bigFalseTestUtilProcListLibString33() {
	assertFalse(2897==2897+1);
}
@Test
public void bigFalseTestUtilProcListLibString34() {
	assertFalse(5113==5113+1);
}
@Test
public void bigFalseTestUtilProcListLibString35() {
	assertFalse(25186==25186+1);
}
@Test
public void bigFalseTestUtilProcListLibString36() {
	assertFalse(32518==32518+1);
}
@Test
public void bigFalseTestUtilProcListLibString37() {
	assertFalse(18716==18716+1);
}
@Test
public void bigFalseTestUtilProcListLibString38() {
	assertFalse(13155==13155+1);
}
@Test
public void bigFalseTestUtilProcListLibString39() {
	assertFalse(5511==5511+1);
}
@Test
public void bigFalseTestUtilProcListLibString40() {
	assertFalse(20823==20823+1);
}
@Test
public void bigFalseTestUtilProcListLibString41() {
	assertFalse(19668==19668+1);
}
@Test
public void bigFalseTestUtilProcListLibString42() {
	assertFalse(26177==26177+1);
}
@Test
public void bigFalseTestUtilProcListLibString43() {
	assertFalse(29885==29885+1);
}
@Test
public void bigFalseTestUtilProcListLibString44() {
	assertFalse(17001==17001+1);
}
@Test
public void bigFalseTestUtilProcListLibString45() {
	assertFalse(19012==19012+1);
}
@Test
public void bigFalseTestUtilProcListLibString46() {
	assertFalse(15638==15638+1);
}
@Test
public void bigFalseTestUtilProcListLibString47() {
	assertFalse(30059==30059+1);
}
@Test
public void bigFalseTestUtilProcListLibString48() {
	assertFalse(4192==4192+1);
}
@Test
public void bigFalseTestUtilProcListLibString49() {
	assertFalse(9346==9346+1);
}
@Test
public void bigFalseTestUtilProcListLibString50() {
	assertFalse(12732==12732+1);
}
@Test
public void bigFalseTestUtilProcListLibString51() {
	assertFalse(27169==27169+1);
}
@Test
public void bigFalseTestUtilProcListLibString52() {
	assertFalse(3640==3640+1);
}
@Test
public void bigFalseTestUtilProcListLibString53() {
	assertFalse(30684==30684+1);
}
@Test
public void bigFalseTestUtilProcListLibString54() {
	assertFalse(18652==18652+1);
}
@Test
public void bigFalseTestUtilProcListLibString55() {
	assertFalse(3171==3171+1);
}
}
