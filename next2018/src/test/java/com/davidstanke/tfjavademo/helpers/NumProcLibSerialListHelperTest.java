package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumProcLibSerialListHelperTest {
    @Test
    public void testValidNumProcLibSerialList() {
		NumProcLibSerialListHelper helper = new NumProcLibSerialListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseNumProcLibSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseNumProcLibSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumProcLibSerialList0() {
	assertFalse(17222==17222+1);
}
@Test
public void bigFalseTestNumProcLibSerialList1() {
	assertFalse(21281==21281+1);
}
@Test
public void bigFalseTestNumProcLibSerialList2() {
	assertFalse(16492==16492+1);
}
@Test
public void bigFalseTestNumProcLibSerialList3() {
	assertFalse(16782==16782+1);
}
@Test
public void bigFalseTestNumProcLibSerialList4() {
	assertFalse(25228==25228+1);
}
@Test
public void bigFalseTestNumProcLibSerialList5() {
	assertFalse(9997==9997+1);
}
@Test
public void bigFalseTestNumProcLibSerialList6() {
	assertFalse(16966==16966+1);
}
@Test
public void bigFalseTestNumProcLibSerialList7() {
	assertFalse(19611==19611+1);
}
@Test
public void bigFalseTestNumProcLibSerialList8() {
	assertFalse(27578==27578+1);
}
@Test
public void bigFalseTestNumProcLibSerialList9() {
	assertFalse(28613==28613+1);
}
@Test
public void bigFalseTestNumProcLibSerialList10() {
	assertFalse(8876==8876+1);
}
@Test
public void bigFalseTestNumProcLibSerialList11() {
	assertFalse(22352==22352+1);
}
@Test
public void bigFalseTestNumProcLibSerialList12() {
	assertFalse(29987==29987+1);
}
@Test
public void bigFalseTestNumProcLibSerialList13() {
	assertFalse(16303==16303+1);
}
@Test
public void bigFalseTestNumProcLibSerialList14() {
	assertFalse(20428==20428+1);
}
@Test
public void bigFalseTestNumProcLibSerialList15() {
	assertFalse(32277==32277+1);
}
@Test
public void bigFalseTestNumProcLibSerialList16() {
	assertFalse(17935==17935+1);
}
@Test
public void bigFalseTestNumProcLibSerialList17() {
	assertFalse(12478==12478+1);
}
@Test
public void bigFalseTestNumProcLibSerialList18() {
	assertFalse(15495==15495+1);
}
@Test
public void bigFalseTestNumProcLibSerialList19() {
	assertFalse(28873==28873+1);
}
@Test
public void bigFalseTestNumProcLibSerialList20() {
	assertFalse(20329==20329+1);
}
@Test
public void bigFalseTestNumProcLibSerialList21() {
	assertFalse(11700==11700+1);
}
@Test
public void bigFalseTestNumProcLibSerialList22() {
	assertFalse(22270==22270+1);
}
@Test
public void bigFalseTestNumProcLibSerialList23() {
	assertFalse(5214==5214+1);
}
@Test
public void bigFalseTestNumProcLibSerialList24() {
	assertFalse(813==813+1);
}
@Test
public void bigFalseTestNumProcLibSerialList25() {
	assertFalse(4888==4888+1);
}
@Test
public void bigFalseTestNumProcLibSerialList26() {
	assertFalse(23518==23518+1);
}
@Test
public void bigFalseTestNumProcLibSerialList27() {
	assertFalse(8753==8753+1);
}
@Test
public void bigFalseTestNumProcLibSerialList28() {
	assertFalse(13968==13968+1);
}
@Test
public void bigFalseTestNumProcLibSerialList29() {
	assertFalse(25591==25591+1);
}
@Test
public void bigFalseTestNumProcLibSerialList30() {
	assertFalse(4720==4720+1);
}
@Test
public void bigFalseTestNumProcLibSerialList31() {
	assertFalse(24874==24874+1);
}
@Test
public void bigFalseTestNumProcLibSerialList32() {
	assertFalse(31468==31468+1);
}
@Test
public void bigFalseTestNumProcLibSerialList33() {
	assertFalse(3674==3674+1);
}
@Test
public void bigFalseTestNumProcLibSerialList34() {
	assertFalse(15712==15712+1);
}
@Test
public void bigFalseTestNumProcLibSerialList35() {
	assertFalse(21656==21656+1);
}
@Test
public void bigFalseTestNumProcLibSerialList36() {
	assertFalse(6514==6514+1);
}
@Test
public void bigFalseTestNumProcLibSerialList37() {
	assertFalse(31626==31626+1);
}
@Test
public void bigFalseTestNumProcLibSerialList38() {
	assertFalse(19528==19528+1);
}
@Test
public void bigFalseTestNumProcLibSerialList39() {
	assertFalse(31945==31945+1);
}
@Test
public void bigFalseTestNumProcLibSerialList40() {
	assertFalse(7566==7566+1);
}
@Test
public void bigFalseTestNumProcLibSerialList41() {
	assertFalse(26630==26630+1);
}
@Test
public void bigFalseTestNumProcLibSerialList42() {
	assertFalse(6660==6660+1);
}
@Test
public void bigFalseTestNumProcLibSerialList43() {
	assertFalse(1388==1388+1);
}
@Test
public void bigFalseTestNumProcLibSerialList44() {
	assertFalse(6681==6681+1);
}
@Test
public void bigFalseTestNumProcLibSerialList45() {
	assertFalse(16193==16193+1);
}
@Test
public void bigFalseTestNumProcLibSerialList46() {
	assertFalse(17333==17333+1);
}
@Test
public void bigFalseTestNumProcLibSerialList47() {
	assertFalse(32167==32167+1);
}
@Test
public void bigFalseTestNumProcLibSerialList48() {
	assertFalse(5441==5441+1);
}
@Test
public void bigFalseTestNumProcLibSerialList49() {
	assertFalse(30492==30492+1);
}
@Test
public void bigFalseTestNumProcLibSerialList50() {
	assertFalse(25745==25745+1);
}
@Test
public void bigFalseTestNumProcLibSerialList51() {
	assertFalse(30200==30200+1);
}
@Test
public void bigFalseTestNumProcLibSerialList52() {
	assertFalse(18232==18232+1);
}
@Test
public void bigFalseTestNumProcLibSerialList53() {
	assertFalse(10022==10022+1);
}
@Test
public void bigFalseTestNumProcLibSerialList54() {
	assertFalse(17009==17009+1);
}
@Test
public void bigFalseTestNumProcLibSerialList55() {
	assertFalse(8141==8141+1);
}
}
