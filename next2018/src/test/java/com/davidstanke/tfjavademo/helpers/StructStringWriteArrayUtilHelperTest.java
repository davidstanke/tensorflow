package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructStringWriteArrayUtilHelperTest {
    @Test
    public void testValidStructStringWriteArrayUtil() {
		StructStringWriteArrayUtilHelper helper = new StructStringWriteArrayUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructStringWriteArrayUtil() {
	StructStringWriteArrayUtilHelper helper = new StructStringWriteArrayUtilHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructStringWriteArrayUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructStringWriteArrayUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil0() {
	assertFalse(15020==15020+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil1() {
	assertFalse(16214==16214+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil2() {
	assertFalse(17103==17103+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil3() {
	assertFalse(29374==29374+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil4() {
	assertFalse(3215==3215+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil5() {
	assertFalse(19596==19596+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil6() {
	assertFalse(27493==27493+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil7() {
	assertFalse(3534==3534+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil8() {
	assertFalse(14258==14258+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil9() {
	assertFalse(20565==20565+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil10() {
	assertFalse(4756==4756+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil11() {
	assertFalse(30719==30719+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil12() {
	assertFalse(23109==23109+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil13() {
	assertFalse(16993==16993+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil14() {
	assertFalse(32480==32480+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil15() {
	assertFalse(29031==29031+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil16() {
	assertFalse(5211==5211+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil17() {
	assertFalse(6982==6982+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil18() {
	assertFalse(22815==22815+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil19() {
	assertFalse(19924==19924+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil20() {
	assertFalse(8570==8570+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil21() {
	assertFalse(23835==23835+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil22() {
	assertFalse(24295==24295+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil23() {
	assertFalse(21709==21709+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil24() {
	assertFalse(32482==32482+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil25() {
	assertFalse(2519==2519+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil26() {
	assertFalse(20409==20409+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil27() {
	assertFalse(9548==9548+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil28() {
	assertFalse(10910==10910+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil29() {
	assertFalse(9063==9063+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil30() {
	assertFalse(234==234+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil31() {
	assertFalse(6462==6462+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil32() {
	assertFalse(18252==18252+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil33() {
	assertFalse(4497==4497+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil34() {
	assertFalse(17493==17493+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil35() {
	assertFalse(25782==25782+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil36() {
	assertFalse(12459==12459+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil37() {
	assertFalse(2443==2443+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil38() {
	assertFalse(3522==3522+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil39() {
	assertFalse(27893==27893+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil40() {
	assertFalse(19689==19689+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil41() {
	assertFalse(21338==21338+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil42() {
	assertFalse(789==789+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil43() {
	assertFalse(4891==4891+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil44() {
	assertFalse(9898==9898+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil45() {
	assertFalse(2284==2284+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil46() {
	assertFalse(25398==25398+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil47() {
	assertFalse(28329==28329+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil48() {
	assertFalse(7128==7128+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil49() {
	assertFalse(10996==10996+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil50() {
	assertFalse(28612==28612+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil51() {
	assertFalse(13246==13246+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil52() {
	assertFalse(11565==11565+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil53() {
	assertFalse(10121==10121+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil54() {
	assertFalse(17785==17785+1);
}
@Test
public void bigFalseTestStructStringWriteArrayUtil55() {
	assertFalse(16653==16653+1);
}
}
