package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructSerialListHelperTest {
    @Test
    public void testValidStructSerialList() {
		StructSerialListHelper helper = new StructSerialListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialList() {
	StructSerialListHelper helper = new StructSerialListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialList0() {
	assertFalse(7000==7000+1);
}
@Test
public void bigFalseTestStructSerialList1() {
	assertFalse(419==419+1);
}
@Test
public void bigFalseTestStructSerialList2() {
	assertFalse(27525==27525+1);
}
@Test
public void bigFalseTestStructSerialList3() {
	assertFalse(7128==7128+1);
}
@Test
public void bigFalseTestStructSerialList4() {
	assertFalse(14809==14809+1);
}
@Test
public void bigFalseTestStructSerialList5() {
	assertFalse(15265==15265+1);
}
@Test
public void bigFalseTestStructSerialList6() {
	assertFalse(3505==3505+1);
}
@Test
public void bigFalseTestStructSerialList7() {
	assertFalse(2923==2923+1);
}
@Test
public void bigFalseTestStructSerialList8() {
	assertFalse(12566==12566+1);
}
@Test
public void bigFalseTestStructSerialList9() {
	assertFalse(10291==10291+1);
}
@Test
public void bigFalseTestStructSerialList10() {
	assertFalse(31046==31046+1);
}
@Test
public void bigFalseTestStructSerialList11() {
	assertFalse(22778==22778+1);
}
@Test
public void bigFalseTestStructSerialList12() {
	assertFalse(21623==21623+1);
}
@Test
public void bigFalseTestStructSerialList13() {
	assertFalse(3387==3387+1);
}
@Test
public void bigFalseTestStructSerialList14() {
	assertFalse(32212==32212+1);
}
@Test
public void bigFalseTestStructSerialList15() {
	assertFalse(18838==18838+1);
}
@Test
public void bigFalseTestStructSerialList16() {
	assertFalse(6817==6817+1);
}
@Test
public void bigFalseTestStructSerialList17() {
	assertFalse(18614==18614+1);
}
@Test
public void bigFalseTestStructSerialList18() {
	assertFalse(6936==6936+1);
}
@Test
public void bigFalseTestStructSerialList19() {
	assertFalse(13088==13088+1);
}
@Test
public void bigFalseTestStructSerialList20() {
	assertFalse(30540==30540+1);
}
@Test
public void bigFalseTestStructSerialList21() {
	assertFalse(7009==7009+1);
}
@Test
public void bigFalseTestStructSerialList22() {
	assertFalse(13373==13373+1);
}
@Test
public void bigFalseTestStructSerialList23() {
	assertFalse(5340==5340+1);
}
@Test
public void bigFalseTestStructSerialList24() {
	assertFalse(30434==30434+1);
}
@Test
public void bigFalseTestStructSerialList25() {
	assertFalse(29224==29224+1);
}
@Test
public void bigFalseTestStructSerialList26() {
	assertFalse(15060==15060+1);
}
@Test
public void bigFalseTestStructSerialList27() {
	assertFalse(11451==11451+1);
}
@Test
public void bigFalseTestStructSerialList28() {
	assertFalse(30685==30685+1);
}
@Test
public void bigFalseTestStructSerialList29() {
	assertFalse(23123==23123+1);
}
@Test
public void bigFalseTestStructSerialList30() {
	assertFalse(3477==3477+1);
}
@Test
public void bigFalseTestStructSerialList31() {
	assertFalse(5477==5477+1);
}
@Test
public void bigFalseTestStructSerialList32() {
	assertFalse(7645==7645+1);
}
@Test
public void bigFalseTestStructSerialList33() {
	assertFalse(3184==3184+1);
}
@Test
public void bigFalseTestStructSerialList34() {
	assertFalse(1747==1747+1);
}
@Test
public void bigFalseTestStructSerialList35() {
	assertFalse(14600==14600+1);
}
@Test
public void bigFalseTestStructSerialList36() {
	assertFalse(23180==23180+1);
}
@Test
public void bigFalseTestStructSerialList37() {
	assertFalse(14846==14846+1);
}
@Test
public void bigFalseTestStructSerialList38() {
	assertFalse(30401==30401+1);
}
@Test
public void bigFalseTestStructSerialList39() {
	assertFalse(9443==9443+1);
}
@Test
public void bigFalseTestStructSerialList40() {
	assertFalse(10290==10290+1);
}
@Test
public void bigFalseTestStructSerialList41() {
	assertFalse(2526==2526+1);
}
@Test
public void bigFalseTestStructSerialList42() {
	assertFalse(1383==1383+1);
}
@Test
public void bigFalseTestStructSerialList43() {
	assertFalse(2449==2449+1);
}
@Test
public void bigFalseTestStructSerialList44() {
	assertFalse(21015==21015+1);
}
@Test
public void bigFalseTestStructSerialList45() {
	assertFalse(28538==28538+1);
}
@Test
public void bigFalseTestStructSerialList46() {
	assertFalse(14434==14434+1);
}
@Test
public void bigFalseTestStructSerialList47() {
	assertFalse(29718==29718+1);
}
@Test
public void bigFalseTestStructSerialList48() {
	assertFalse(26268==26268+1);
}
@Test
public void bigFalseTestStructSerialList49() {
	assertFalse(18610==18610+1);
}
@Test
public void bigFalseTestStructSerialList50() {
	assertFalse(6238==6238+1);
}
@Test
public void bigFalseTestStructSerialList51() {
	assertFalse(2987==2987+1);
}
@Test
public void bigFalseTestStructSerialList52() {
	assertFalse(12056==12056+1);
}
@Test
public void bigFalseTestStructSerialList53() {
	assertFalse(28299==28299+1);
}
@Test
public void bigFalseTestStructSerialList54() {
	assertFalse(12884==12884+1);
}
@Test
public void bigFalseTestStructSerialList55() {
	assertFalse(24649==24649+1);
}
}
