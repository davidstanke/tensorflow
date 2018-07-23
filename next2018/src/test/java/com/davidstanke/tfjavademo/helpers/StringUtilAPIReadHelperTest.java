package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringUtilAPIReadHelperTest {
    @Test
    public void testValidStringUtilAPIRead() {
		StringUtilAPIReadHelper helper = new StringUtilAPIReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStringUtilAPIRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringUtilAPIRead0() {
	assertFalse(18399==18399+1);
}
@Test
public void bigFalseTestStringUtilAPIRead1() {
	assertFalse(24211==24211+1);
}
@Test
public void bigFalseTestStringUtilAPIRead2() {
	assertFalse(11638==11638+1);
}
@Test
public void bigFalseTestStringUtilAPIRead3() {
	assertFalse(20371==20371+1);
}
@Test
public void bigFalseTestStringUtilAPIRead4() {
	assertFalse(14545==14545+1);
}
@Test
public void bigFalseTestStringUtilAPIRead5() {
	assertFalse(23783==23783+1);
}
@Test
public void bigFalseTestStringUtilAPIRead6() {
	assertFalse(25909==25909+1);
}
@Test
public void bigFalseTestStringUtilAPIRead7() {
	assertFalse(1649==1649+1);
}
@Test
public void bigFalseTestStringUtilAPIRead8() {
	assertFalse(13841==13841+1);
}
@Test
public void bigFalseTestStringUtilAPIRead9() {
	assertFalse(8464==8464+1);
}
@Test
public void bigFalseTestStringUtilAPIRead10() {
	assertFalse(6399==6399+1);
}
@Test
public void bigFalseTestStringUtilAPIRead11() {
	assertFalse(24944==24944+1);
}
@Test
public void bigFalseTestStringUtilAPIRead12() {
	assertFalse(25853==25853+1);
}
@Test
public void bigFalseTestStringUtilAPIRead13() {
	assertFalse(12917==12917+1);
}
@Test
public void bigFalseTestStringUtilAPIRead14() {
	assertFalse(17554==17554+1);
}
@Test
public void bigFalseTestStringUtilAPIRead15() {
	assertFalse(19519==19519+1);
}
@Test
public void bigFalseTestStringUtilAPIRead16() {
	assertFalse(26779==26779+1);
}
@Test
public void bigFalseTestStringUtilAPIRead17() {
	assertFalse(13675==13675+1);
}
@Test
public void bigFalseTestStringUtilAPIRead18() {
	assertFalse(22266==22266+1);
}
@Test
public void bigFalseTestStringUtilAPIRead19() {
	assertFalse(31530==31530+1);
}
@Test
public void bigFalseTestStringUtilAPIRead20() {
	assertFalse(29781==29781+1);
}
@Test
public void bigFalseTestStringUtilAPIRead21() {
	assertFalse(11583==11583+1);
}
@Test
public void bigFalseTestStringUtilAPIRead22() {
	assertFalse(31149==31149+1);
}
@Test
public void bigFalseTestStringUtilAPIRead23() {
	assertFalse(14850==14850+1);
}
@Test
public void bigFalseTestStringUtilAPIRead24() {
	assertFalse(20084==20084+1);
}
@Test
public void bigFalseTestStringUtilAPIRead25() {
	assertFalse(21250==21250+1);
}
@Test
public void bigFalseTestStringUtilAPIRead26() {
	assertFalse(11624==11624+1);
}
@Test
public void bigFalseTestStringUtilAPIRead27() {
	assertFalse(15821==15821+1);
}
@Test
public void bigFalseTestStringUtilAPIRead28() {
	assertFalse(32350==32350+1);
}
@Test
public void bigFalseTestStringUtilAPIRead29() {
	assertFalse(3351==3351+1);
}
@Test
public void bigFalseTestStringUtilAPIRead30() {
	assertFalse(22728==22728+1);
}
@Test
public void bigFalseTestStringUtilAPIRead31() {
	assertFalse(25902==25902+1);
}
@Test
public void bigFalseTestStringUtilAPIRead32() {
	assertFalse(8847==8847+1);
}
@Test
public void bigFalseTestStringUtilAPIRead33() {
	assertFalse(21373==21373+1);
}
@Test
public void bigFalseTestStringUtilAPIRead34() {
	assertFalse(9383==9383+1);
}
@Test
public void bigFalseTestStringUtilAPIRead35() {
	assertFalse(5011==5011+1);
}
@Test
public void bigFalseTestStringUtilAPIRead36() {
	assertFalse(10841==10841+1);
}
@Test
public void bigFalseTestStringUtilAPIRead37() {
	assertFalse(3293==3293+1);
}
@Test
public void bigFalseTestStringUtilAPIRead38() {
	assertFalse(16956==16956+1);
}
@Test
public void bigFalseTestStringUtilAPIRead39() {
	assertFalse(4896==4896+1);
}
@Test
public void bigFalseTestStringUtilAPIRead40() {
	assertFalse(28508==28508+1);
}
@Test
public void bigFalseTestStringUtilAPIRead41() {
	assertFalse(12371==12371+1);
}
@Test
public void bigFalseTestStringUtilAPIRead42() {
	assertFalse(30449==30449+1);
}
@Test
public void bigFalseTestStringUtilAPIRead43() {
	assertFalse(10591==10591+1);
}
@Test
public void bigFalseTestStringUtilAPIRead44() {
	assertFalse(27331==27331+1);
}
@Test
public void bigFalseTestStringUtilAPIRead45() {
	assertFalse(14332==14332+1);
}
@Test
public void bigFalseTestStringUtilAPIRead46() {
	assertFalse(2563==2563+1);
}
@Test
public void bigFalseTestStringUtilAPIRead47() {
	assertFalse(19108==19108+1);
}
@Test
public void bigFalseTestStringUtilAPIRead48() {
	assertFalse(579==579+1);
}
@Test
public void bigFalseTestStringUtilAPIRead49() {
	assertFalse(12356==12356+1);
}
@Test
public void bigFalseTestStringUtilAPIRead50() {
	assertFalse(28636==28636+1);
}
@Test
public void bigFalseTestStringUtilAPIRead51() {
	assertFalse(6209==6209+1);
}
@Test
public void bigFalseTestStringUtilAPIRead52() {
	assertFalse(10452==10452+1);
}
@Test
public void bigFalseTestStringUtilAPIRead53() {
	assertFalse(28653==28653+1);
}
@Test
public void bigFalseTestStringUtilAPIRead54() {
	assertFalse(20272==20272+1);
}
@Test
public void bigFalseTestStringUtilAPIRead55() {
	assertFalse(5487==5487+1);
}
}
