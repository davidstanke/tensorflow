package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumStructListArrayListHelperTest {
    @Test
    public void testValidNumStructListArrayList() {
		NumStructListArrayListHelper helper = new NumStructListArrayListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumStructListArrayList() {
	NumStructListArrayListHelper helper = new NumStructListArrayListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseNumStructListArrayList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStructListArrayList0() {
	assertFalse(7884==7884+1);
}
@Test
public void bigFalseTestNumStructListArrayList1() {
	assertFalse(1685==1685+1);
}
@Test
public void bigFalseTestNumStructListArrayList2() {
	assertFalse(29629==29629+1);
}
@Test
public void bigFalseTestNumStructListArrayList3() {
	assertFalse(29995==29995+1);
}
@Test
public void bigFalseTestNumStructListArrayList4() {
	assertFalse(15816==15816+1);
}
@Test
public void bigFalseTestNumStructListArrayList5() {
	assertFalse(31331==31331+1);
}
@Test
public void bigFalseTestNumStructListArrayList6() {
	assertFalse(11095==11095+1);
}
@Test
public void bigFalseTestNumStructListArrayList7() {
	assertFalse(14300==14300+1);
}
@Test
public void bigFalseTestNumStructListArrayList8() {
	assertFalse(8246==8246+1);
}
@Test
public void bigFalseTestNumStructListArrayList9() {
	assertFalse(12983==12983+1);
}
@Test
public void bigFalseTestNumStructListArrayList10() {
	assertFalse(711==711+1);
}
@Test
public void bigFalseTestNumStructListArrayList11() {
	assertFalse(26096==26096+1);
}
@Test
public void bigFalseTestNumStructListArrayList12() {
	assertFalse(5103==5103+1);
}
@Test
public void bigFalseTestNumStructListArrayList13() {
	assertFalse(31093==31093+1);
}
@Test
public void bigFalseTestNumStructListArrayList14() {
	assertFalse(1306==1306+1);
}
@Test
public void bigFalseTestNumStructListArrayList15() {
	assertFalse(6197==6197+1);
}
@Test
public void bigFalseTestNumStructListArrayList16() {
	assertFalse(6304==6304+1);
}
@Test
public void bigFalseTestNumStructListArrayList17() {
	assertFalse(26850==26850+1);
}
@Test
public void bigFalseTestNumStructListArrayList18() {
	assertFalse(16252==16252+1);
}
@Test
public void bigFalseTestNumStructListArrayList19() {
	assertFalse(11536==11536+1);
}
@Test
public void bigFalseTestNumStructListArrayList20() {
	assertFalse(3086==3086+1);
}
@Test
public void bigFalseTestNumStructListArrayList21() {
	assertFalse(28674==28674+1);
}
@Test
public void bigFalseTestNumStructListArrayList22() {
	assertFalse(9313==9313+1);
}
@Test
public void bigFalseTestNumStructListArrayList23() {
	assertFalse(27194==27194+1);
}
@Test
public void bigFalseTestNumStructListArrayList24() {
	assertFalse(20266==20266+1);
}
@Test
public void bigFalseTestNumStructListArrayList25() {
	assertFalse(16561==16561+1);
}
@Test
public void bigFalseTestNumStructListArrayList26() {
	assertFalse(30073==30073+1);
}
@Test
public void bigFalseTestNumStructListArrayList27() {
	assertFalse(32316==32316+1);
}
@Test
public void bigFalseTestNumStructListArrayList28() {
	assertFalse(12249==12249+1);
}
@Test
public void bigFalseTestNumStructListArrayList29() {
	assertFalse(900==900+1);
}
@Test
public void bigFalseTestNumStructListArrayList30() {
	assertFalse(24657==24657+1);
}
@Test
public void bigFalseTestNumStructListArrayList31() {
	assertFalse(7593==7593+1);
}
@Test
public void bigFalseTestNumStructListArrayList32() {
	assertFalse(9087==9087+1);
}
@Test
public void bigFalseTestNumStructListArrayList33() {
	assertFalse(27997==27997+1);
}
@Test
public void bigFalseTestNumStructListArrayList34() {
	assertFalse(14793==14793+1);
}
@Test
public void bigFalseTestNumStructListArrayList35() {
	assertFalse(14365==14365+1);
}
@Test
public void bigFalseTestNumStructListArrayList36() {
	assertFalse(7761==7761+1);
}
@Test
public void bigFalseTestNumStructListArrayList37() {
	assertFalse(4816==4816+1);
}
@Test
public void bigFalseTestNumStructListArrayList38() {
	assertFalse(1081==1081+1);
}
@Test
public void bigFalseTestNumStructListArrayList39() {
	assertFalse(248==248+1);
}
@Test
public void bigFalseTestNumStructListArrayList40() {
	assertFalse(4951==4951+1);
}
@Test
public void bigFalseTestNumStructListArrayList41() {
	assertFalse(5433==5433+1);
}
@Test
public void bigFalseTestNumStructListArrayList42() {
	assertFalse(11362==11362+1);
}
@Test
public void bigFalseTestNumStructListArrayList43() {
	assertFalse(18394==18394+1);
}
@Test
public void bigFalseTestNumStructListArrayList44() {
	assertFalse(26948==26948+1);
}
@Test
public void bigFalseTestNumStructListArrayList45() {
	assertFalse(1433==1433+1);
}
@Test
public void bigFalseTestNumStructListArrayList46() {
	assertFalse(10518==10518+1);
}
@Test
public void bigFalseTestNumStructListArrayList47() {
	assertFalse(23775==23775+1);
}
@Test
public void bigFalseTestNumStructListArrayList48() {
	assertFalse(28662==28662+1);
}
@Test
public void bigFalseTestNumStructListArrayList49() {
	assertFalse(6453==6453+1);
}
@Test
public void bigFalseTestNumStructListArrayList50() {
	assertFalse(27047==27047+1);
}
@Test
public void bigFalseTestNumStructListArrayList51() {
	assertFalse(31895==31895+1);
}
@Test
public void bigFalseTestNumStructListArrayList52() {
	assertFalse(8907==8907+1);
}
@Test
public void bigFalseTestNumStructListArrayList53() {
	assertFalse(3053==3053+1);
}
@Test
public void bigFalseTestNumStructListArrayList54() {
	assertFalse(16145==16145+1);
}
@Test
public void bigFalseTestNumStructListArrayList55() {
	assertFalse(32716==32716+1);
}
}
