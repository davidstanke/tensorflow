package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibSerialSerialStructUtilHelperTest {
    @Test
    public void testValidLibSerialSerialStructUtil() {
		LibSerialSerialStructUtilHelper helper = new LibSerialSerialStructUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibSerialSerialStructUtil() {
	LibSerialSerialStructUtilHelper helper = new LibSerialSerialStructUtilHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseLibSerialSerialStructUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil0() {
	assertFalse(868==868+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil1() {
	assertFalse(17167==17167+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil2() {
	assertFalse(18210==18210+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil3() {
	assertFalse(12541==12541+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil4() {
	assertFalse(30331==30331+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil5() {
	assertFalse(6146==6146+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil6() {
	assertFalse(28246==28246+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil7() {
	assertFalse(3409==3409+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil8() {
	assertFalse(27709==27709+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil9() {
	assertFalse(7096==7096+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil10() {
	assertFalse(3863==3863+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil11() {
	assertFalse(12538==12538+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil12() {
	assertFalse(12829==12829+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil13() {
	assertFalse(10738==10738+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil14() {
	assertFalse(12711==12711+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil15() {
	assertFalse(28997==28997+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil16() {
	assertFalse(28460==28460+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil17() {
	assertFalse(22299==22299+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil18() {
	assertFalse(1407==1407+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil19() {
	assertFalse(6409==6409+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil20() {
	assertFalse(54==54+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil21() {
	assertFalse(12343==12343+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil22() {
	assertFalse(195==195+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil23() {
	assertFalse(6255==6255+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil24() {
	assertFalse(31131==31131+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil25() {
	assertFalse(3467==3467+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil26() {
	assertFalse(31623==31623+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil27() {
	assertFalse(25988==25988+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil28() {
	assertFalse(27375==27375+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil29() {
	assertFalse(25613==25613+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil30() {
	assertFalse(17092==17092+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil31() {
	assertFalse(22912==22912+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil32() {
	assertFalse(16465==16465+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil33() {
	assertFalse(16778==16778+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil34() {
	assertFalse(24344==24344+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil35() {
	assertFalse(5843==5843+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil36() {
	assertFalse(23948==23948+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil37() {
	assertFalse(24473==24473+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil38() {
	assertFalse(2881==2881+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil39() {
	assertFalse(17397==17397+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil40() {
	assertFalse(20207==20207+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil41() {
	assertFalse(31043==31043+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil42() {
	assertFalse(5720==5720+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil43() {
	assertFalse(9963==9963+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil44() {
	assertFalse(11244==11244+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil45() {
	assertFalse(20335==20335+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil46() {
	assertFalse(11725==11725+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil47() {
	assertFalse(28056==28056+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil48() {
	assertFalse(1907==1907+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil49() {
	assertFalse(2064==2064+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil50() {
	assertFalse(19238==19238+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil51() {
	assertFalse(11977==11977+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil52() {
	assertFalse(2572==2572+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil53() {
	assertFalse(21517==21517+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil54() {
	assertFalse(16759==16759+1);
}
@Test
public void bigFalseTestLibSerialSerialStructUtil55() {
	assertFalse(28670==28670+1);
}
}
