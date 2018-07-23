package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListStructNumUtilProcHelperTest {
    @Test
    public void testValidListStructNumUtilProc() {
		ListStructNumUtilProcHelper helper = new ListStructNumUtilProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidListStructNumUtilProc() {
	ListStructNumUtilProcHelper helper = new ListStructNumUtilProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseListStructNumUtilProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseListStructNumUtilProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseListStructNumUtilProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListStructNumUtilProc0() {
	assertFalse(23370==23370+1);
}
@Test
public void bigFalseTestListStructNumUtilProc1() {
	assertFalse(19438==19438+1);
}
@Test
public void bigFalseTestListStructNumUtilProc2() {
	assertFalse(12836==12836+1);
}
@Test
public void bigFalseTestListStructNumUtilProc3() {
	assertFalse(27748==27748+1);
}
@Test
public void bigFalseTestListStructNumUtilProc4() {
	assertFalse(32353==32353+1);
}
@Test
public void bigFalseTestListStructNumUtilProc5() {
	assertFalse(10151==10151+1);
}
@Test
public void bigFalseTestListStructNumUtilProc6() {
	assertFalse(20402==20402+1);
}
@Test
public void bigFalseTestListStructNumUtilProc7() {
	assertFalse(14542==14542+1);
}
@Test
public void bigFalseTestListStructNumUtilProc8() {
	assertFalse(2643==2643+1);
}
@Test
public void bigFalseTestListStructNumUtilProc9() {
	assertFalse(8800==8800+1);
}
@Test
public void bigFalseTestListStructNumUtilProc10() {
	assertFalse(727==727+1);
}
@Test
public void bigFalseTestListStructNumUtilProc11() {
	assertFalse(32577==32577+1);
}
@Test
public void bigFalseTestListStructNumUtilProc12() {
	assertFalse(32348==32348+1);
}
@Test
public void bigFalseTestListStructNumUtilProc13() {
	assertFalse(15297==15297+1);
}
@Test
public void bigFalseTestListStructNumUtilProc14() {
	assertFalse(27989==27989+1);
}
@Test
public void bigFalseTestListStructNumUtilProc15() {
	assertFalse(31912==31912+1);
}
@Test
public void bigFalseTestListStructNumUtilProc16() {
	assertFalse(28138==28138+1);
}
@Test
public void bigFalseTestListStructNumUtilProc17() {
	assertFalse(18910==18910+1);
}
@Test
public void bigFalseTestListStructNumUtilProc18() {
	assertFalse(6046==6046+1);
}
@Test
public void bigFalseTestListStructNumUtilProc19() {
	assertFalse(18427==18427+1);
}
@Test
public void bigFalseTestListStructNumUtilProc20() {
	assertFalse(29891==29891+1);
}
@Test
public void bigFalseTestListStructNumUtilProc21() {
	assertFalse(22506==22506+1);
}
@Test
public void bigFalseTestListStructNumUtilProc22() {
	assertFalse(3803==3803+1);
}
@Test
public void bigFalseTestListStructNumUtilProc23() {
	assertFalse(17756==17756+1);
}
@Test
public void bigFalseTestListStructNumUtilProc24() {
	assertFalse(16886==16886+1);
}
@Test
public void bigFalseTestListStructNumUtilProc25() {
	assertFalse(13501==13501+1);
}
@Test
public void bigFalseTestListStructNumUtilProc26() {
	assertFalse(22457==22457+1);
}
@Test
public void bigFalseTestListStructNumUtilProc27() {
	assertFalse(12019==12019+1);
}
@Test
public void bigFalseTestListStructNumUtilProc28() {
	assertFalse(25987==25987+1);
}
@Test
public void bigFalseTestListStructNumUtilProc29() {
	assertFalse(27911==27911+1);
}
@Test
public void bigFalseTestListStructNumUtilProc30() {
	assertFalse(16886==16886+1);
}
@Test
public void bigFalseTestListStructNumUtilProc31() {
	assertFalse(20362==20362+1);
}
@Test
public void bigFalseTestListStructNumUtilProc32() {
	assertFalse(19658==19658+1);
}
@Test
public void bigFalseTestListStructNumUtilProc33() {
	assertFalse(11602==11602+1);
}
@Test
public void bigFalseTestListStructNumUtilProc34() {
	assertFalse(26798==26798+1);
}
@Test
public void bigFalseTestListStructNumUtilProc35() {
	assertFalse(19176==19176+1);
}
@Test
public void bigFalseTestListStructNumUtilProc36() {
	assertFalse(6580==6580+1);
}
@Test
public void bigFalseTestListStructNumUtilProc37() {
	assertFalse(18361==18361+1);
}
@Test
public void bigFalseTestListStructNumUtilProc38() {
	assertFalse(27494==27494+1);
}
@Test
public void bigFalseTestListStructNumUtilProc39() {
	assertFalse(4077==4077+1);
}
@Test
public void bigFalseTestListStructNumUtilProc40() {
	assertFalse(16547==16547+1);
}
@Test
public void bigFalseTestListStructNumUtilProc41() {
	assertFalse(22890==22890+1);
}
@Test
public void bigFalseTestListStructNumUtilProc42() {
	assertFalse(11221==11221+1);
}
@Test
public void bigFalseTestListStructNumUtilProc43() {
	assertFalse(20594==20594+1);
}
@Test
public void bigFalseTestListStructNumUtilProc44() {
	assertFalse(6426==6426+1);
}
@Test
public void bigFalseTestListStructNumUtilProc45() {
	assertFalse(19421==19421+1);
}
@Test
public void bigFalseTestListStructNumUtilProc46() {
	assertFalse(7286==7286+1);
}
@Test
public void bigFalseTestListStructNumUtilProc47() {
	assertFalse(6878==6878+1);
}
@Test
public void bigFalseTestListStructNumUtilProc48() {
	assertFalse(19756==19756+1);
}
@Test
public void bigFalseTestListStructNumUtilProc49() {
	assertFalse(11729==11729+1);
}
@Test
public void bigFalseTestListStructNumUtilProc50() {
	assertFalse(27599==27599+1);
}
@Test
public void bigFalseTestListStructNumUtilProc51() {
	assertFalse(29063==29063+1);
}
@Test
public void bigFalseTestListStructNumUtilProc52() {
	assertFalse(21414==21414+1);
}
@Test
public void bigFalseTestListStructNumUtilProc53() {
	assertFalse(8203==8203+1);
}
@Test
public void bigFalseTestListStructNumUtilProc54() {
	assertFalse(6270==6270+1);
}
@Test
public void bigFalseTestListStructNumUtilProc55() {
	assertFalse(31695==31695+1);
}
}
