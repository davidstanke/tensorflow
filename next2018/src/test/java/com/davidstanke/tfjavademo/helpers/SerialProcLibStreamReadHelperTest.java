package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialProcLibStreamReadHelperTest {
    @Test
    public void testValidSerialProcLibStreamRead() {
		SerialProcLibStreamReadHelper helper = new SerialProcLibStreamReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseSerialProcLibStreamRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialProcLibStreamRead0() {
	assertFalse(26135==26135+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead1() {
	assertFalse(28085==28085+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead2() {
	assertFalse(6126==6126+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead3() {
	assertFalse(15717==15717+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead4() {
	assertFalse(13810==13810+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead5() {
	assertFalse(4819==4819+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead6() {
	assertFalse(32667==32667+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead7() {
	assertFalse(5584==5584+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead8() {
	assertFalse(427==427+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead9() {
	assertFalse(20440==20440+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead10() {
	assertFalse(7019==7019+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead11() {
	assertFalse(11033==11033+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead12() {
	assertFalse(32593==32593+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead13() {
	assertFalse(2933==2933+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead14() {
	assertFalse(989==989+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead15() {
	assertFalse(9171==9171+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead16() {
	assertFalse(13320==13320+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead17() {
	assertFalse(3541==3541+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead18() {
	assertFalse(1953==1953+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead19() {
	assertFalse(5073==5073+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead20() {
	assertFalse(12912==12912+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead21() {
	assertFalse(31899==31899+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead22() {
	assertFalse(15847==15847+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead23() {
	assertFalse(28293==28293+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead24() {
	assertFalse(21462==21462+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead25() {
	assertFalse(6814==6814+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead26() {
	assertFalse(29026==29026+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead27() {
	assertFalse(17177==17177+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead28() {
	assertFalse(22557==22557+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead29() {
	assertFalse(18276==18276+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead30() {
	assertFalse(12318==12318+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead31() {
	assertFalse(7759==7759+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead32() {
	assertFalse(6251==6251+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead33() {
	assertFalse(31327==31327+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead34() {
	assertFalse(3079==3079+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead35() {
	assertFalse(11801==11801+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead36() {
	assertFalse(14483==14483+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead37() {
	assertFalse(13802==13802+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead38() {
	assertFalse(22581==22581+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead39() {
	assertFalse(760==760+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead40() {
	assertFalse(837==837+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead41() {
	assertFalse(11777==11777+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead42() {
	assertFalse(28408==28408+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead43() {
	assertFalse(2837==2837+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead44() {
	assertFalse(23799==23799+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead45() {
	assertFalse(7875==7875+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead46() {
	assertFalse(19624==19624+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead47() {
	assertFalse(8992==8992+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead48() {
	assertFalse(31122==31122+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead49() {
	assertFalse(3753==3753+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead50() {
	assertFalse(2857==2857+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead51() {
	assertFalse(22764==22764+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead52() {
	assertFalse(16605==16605+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead53() {
	assertFalse(30852==30852+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead54() {
	assertFalse(2624==2624+1);
}
@Test
public void bigFalseTestSerialProcLibStreamRead55() {
	assertFalse(15303==15303+1);
}
}
