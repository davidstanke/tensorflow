package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructReadDataUtilHelperTest {
    @Test
    public void testValidStructReadDataUtil() {
		StructReadDataUtilHelper helper = new StructReadDataUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructReadDataUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructReadDataUtil0() {
	assertFalse(23625==23625+1);
}
@Test
public void bigFalseTestStructReadDataUtil1() {
	assertFalse(29674==29674+1);
}
@Test
public void bigFalseTestStructReadDataUtil2() {
	assertFalse(7183==7183+1);
}
@Test
public void bigFalseTestStructReadDataUtil3() {
	assertFalse(2607==2607+1);
}
@Test
public void bigFalseTestStructReadDataUtil4() {
	assertFalse(14406==14406+1);
}
@Test
public void bigFalseTestStructReadDataUtil5() {
	assertFalse(24057==24057+1);
}
@Test
public void bigFalseTestStructReadDataUtil6() {
	assertFalse(25500==25500+1);
}
@Test
public void bigFalseTestStructReadDataUtil7() {
	assertFalse(20044==20044+1);
}
@Test
public void bigFalseTestStructReadDataUtil8() {
	assertFalse(30713==30713+1);
}
@Test
public void bigFalseTestStructReadDataUtil9() {
	assertFalse(18321==18321+1);
}
@Test
public void bigFalseTestStructReadDataUtil10() {
	assertFalse(10833==10833+1);
}
@Test
public void bigFalseTestStructReadDataUtil11() {
	assertFalse(6899==6899+1);
}
@Test
public void bigFalseTestStructReadDataUtil12() {
	assertFalse(32057==32057+1);
}
@Test
public void bigFalseTestStructReadDataUtil13() {
	assertFalse(27672==27672+1);
}
@Test
public void bigFalseTestStructReadDataUtil14() {
	assertFalse(4810==4810+1);
}
@Test
public void bigFalseTestStructReadDataUtil15() {
	assertFalse(6264==6264+1);
}
@Test
public void bigFalseTestStructReadDataUtil16() {
	assertFalse(24309==24309+1);
}
@Test
public void bigFalseTestStructReadDataUtil17() {
	assertFalse(11518==11518+1);
}
@Test
public void bigFalseTestStructReadDataUtil18() {
	assertFalse(27213==27213+1);
}
@Test
public void bigFalseTestStructReadDataUtil19() {
	assertFalse(26287==26287+1);
}
@Test
public void bigFalseTestStructReadDataUtil20() {
	assertFalse(512==512+1);
}
@Test
public void bigFalseTestStructReadDataUtil21() {
	assertFalse(18585==18585+1);
}
@Test
public void bigFalseTestStructReadDataUtil22() {
	assertFalse(3183==3183+1);
}
@Test
public void bigFalseTestStructReadDataUtil23() {
	assertFalse(29992==29992+1);
}
@Test
public void bigFalseTestStructReadDataUtil24() {
	assertFalse(29344==29344+1);
}
@Test
public void bigFalseTestStructReadDataUtil25() {
	assertFalse(8896==8896+1);
}
@Test
public void bigFalseTestStructReadDataUtil26() {
	assertFalse(21894==21894+1);
}
@Test
public void bigFalseTestStructReadDataUtil27() {
	assertFalse(9001==9001+1);
}
@Test
public void bigFalseTestStructReadDataUtil28() {
	assertFalse(19156==19156+1);
}
@Test
public void bigFalseTestStructReadDataUtil29() {
	assertFalse(31529==31529+1);
}
@Test
public void bigFalseTestStructReadDataUtil30() {
	assertFalse(20434==20434+1);
}
@Test
public void bigFalseTestStructReadDataUtil31() {
	assertFalse(25452==25452+1);
}
@Test
public void bigFalseTestStructReadDataUtil32() {
	assertFalse(12649==12649+1);
}
@Test
public void bigFalseTestStructReadDataUtil33() {
	assertFalse(11651==11651+1);
}
@Test
public void bigFalseTestStructReadDataUtil34() {
	assertFalse(1898==1898+1);
}
@Test
public void bigFalseTestStructReadDataUtil35() {
	assertFalse(24477==24477+1);
}
@Test
public void bigFalseTestStructReadDataUtil36() {
	assertFalse(15803==15803+1);
}
@Test
public void bigFalseTestStructReadDataUtil37() {
	assertFalse(22355==22355+1);
}
@Test
public void bigFalseTestStructReadDataUtil38() {
	assertFalse(12520==12520+1);
}
@Test
public void bigFalseTestStructReadDataUtil39() {
	assertFalse(22418==22418+1);
}
@Test
public void bigFalseTestStructReadDataUtil40() {
	assertFalse(19532==19532+1);
}
@Test
public void bigFalseTestStructReadDataUtil41() {
	assertFalse(32655==32655+1);
}
@Test
public void bigFalseTestStructReadDataUtil42() {
	assertFalse(3796==3796+1);
}
@Test
public void bigFalseTestStructReadDataUtil43() {
	assertFalse(14408==14408+1);
}
@Test
public void bigFalseTestStructReadDataUtil44() {
	assertFalse(4102==4102+1);
}
@Test
public void bigFalseTestStructReadDataUtil45() {
	assertFalse(7163==7163+1);
}
@Test
public void bigFalseTestStructReadDataUtil46() {
	assertFalse(16849==16849+1);
}
@Test
public void bigFalseTestStructReadDataUtil47() {
	assertFalse(9889==9889+1);
}
@Test
public void bigFalseTestStructReadDataUtil48() {
	assertFalse(27728==27728+1);
}
@Test
public void bigFalseTestStructReadDataUtil49() {
	assertFalse(4167==4167+1);
}
@Test
public void bigFalseTestStructReadDataUtil50() {
	assertFalse(28553==28553+1);
}
@Test
public void bigFalseTestStructReadDataUtil51() {
	assertFalse(31200==31200+1);
}
@Test
public void bigFalseTestStructReadDataUtil52() {
	assertFalse(25555==25555+1);
}
@Test
public void bigFalseTestStructReadDataUtil53() {
	assertFalse(741==741+1);
}
@Test
public void bigFalseTestStructReadDataUtil54() {
	assertFalse(27738==27738+1);
}
@Test
public void bigFalseTestStructReadDataUtil55() {
	assertFalse(25056==25056+1);
}
}
