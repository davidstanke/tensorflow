package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadUtilArrayIOLibHelperTest {
    @Test
    public void testValidReadUtilArrayIOLib() {
		ReadUtilArrayIOLibHelper helper = new ReadUtilArrayIOLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidReadUtilArrayIOLib() {
	ReadUtilArrayIOLibHelper helper = new ReadUtilArrayIOLibHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseReadUtilArrayIOLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseReadUtilArrayIOLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadUtilArrayIOLib0() {
	assertFalse(28327==28327+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib1() {
	assertFalse(8511==8511+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib2() {
	assertFalse(24117==24117+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib3() {
	assertFalse(9260==9260+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib4() {
	assertFalse(5490==5490+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib5() {
	assertFalse(10005==10005+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib6() {
	assertFalse(14981==14981+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib7() {
	assertFalse(7810==7810+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib8() {
	assertFalse(29712==29712+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib9() {
	assertFalse(23594==23594+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib10() {
	assertFalse(913==913+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib11() {
	assertFalse(18477==18477+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib12() {
	assertFalse(1925==1925+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib13() {
	assertFalse(32479==32479+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib14() {
	assertFalse(1849==1849+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib15() {
	assertFalse(23001==23001+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib16() {
	assertFalse(26378==26378+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib17() {
	assertFalse(2187==2187+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib18() {
	assertFalse(3714==3714+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib19() {
	assertFalse(4223==4223+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib20() {
	assertFalse(4760==4760+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib21() {
	assertFalse(18199==18199+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib22() {
	assertFalse(19709==19709+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib23() {
	assertFalse(1631==1631+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib24() {
	assertFalse(7734==7734+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib25() {
	assertFalse(29784==29784+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib26() {
	assertFalse(23289==23289+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib27() {
	assertFalse(8124==8124+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib28() {
	assertFalse(17923==17923+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib29() {
	assertFalse(26415==26415+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib30() {
	assertFalse(9832==9832+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib31() {
	assertFalse(1883==1883+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib32() {
	assertFalse(14083==14083+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib33() {
	assertFalse(14946==14946+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib34() {
	assertFalse(1682==1682+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib35() {
	assertFalse(30393==30393+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib36() {
	assertFalse(6313==6313+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib37() {
	assertFalse(1337==1337+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib38() {
	assertFalse(24187==24187+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib39() {
	assertFalse(17935==17935+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib40() {
	assertFalse(9000==9000+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib41() {
	assertFalse(472==472+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib42() {
	assertFalse(31253==31253+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib43() {
	assertFalse(6==6+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib44() {
	assertFalse(20090==20090+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib45() {
	assertFalse(15712==15712+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib46() {
	assertFalse(4646==4646+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib47() {
	assertFalse(30010==30010+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib48() {
	assertFalse(26157==26157+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib49() {
	assertFalse(11716==11716+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib50() {
	assertFalse(8951==8951+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib51() {
	assertFalse(2929==2929+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib52() {
	assertFalse(3568==3568+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib53() {
	assertFalse(18795==18795+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib54() {
	assertFalse(450==450+1);
}
@Test
public void bigFalseTestReadUtilArrayIOLib55() {
	assertFalse(17560==17560+1);
}
}
