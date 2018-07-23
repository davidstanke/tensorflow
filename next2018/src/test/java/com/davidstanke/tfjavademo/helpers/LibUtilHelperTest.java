package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibUtilHelperTest {
    @Test
    public void testValidLibUtil() {
		LibUtilHelper helper = new LibUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibUtil() {
	LibUtilHelper helper = new LibUtilHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testThisFalseLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibUtil0() {
	assertFalse(7646==7646+1);
}
@Test
public void bigFalseTestLibUtil1() {
	assertFalse(28585==28585+1);
}
@Test
public void bigFalseTestLibUtil2() {
	assertFalse(7341==7341+1);
}
@Test
public void bigFalseTestLibUtil3() {
	assertFalse(32549==32549+1);
}
@Test
public void bigFalseTestLibUtil4() {
	assertFalse(13306==13306+1);
}
@Test
public void bigFalseTestLibUtil5() {
	assertFalse(22204==22204+1);
}
@Test
public void bigFalseTestLibUtil6() {
	assertFalse(25535==25535+1);
}
@Test
public void bigFalseTestLibUtil7() {
	assertFalse(21622==21622+1);
}
@Test
public void bigFalseTestLibUtil8() {
	assertFalse(23447==23447+1);
}
@Test
public void bigFalseTestLibUtil9() {
	assertFalse(45==45+1);
}
@Test
public void bigFalseTestLibUtil10() {
	assertFalse(1865==1865+1);
}
@Test
public void bigFalseTestLibUtil11() {
	assertFalse(16165==16165+1);
}
@Test
public void bigFalseTestLibUtil12() {
	assertFalse(1176==1176+1);
}
@Test
public void bigFalseTestLibUtil13() {
	assertFalse(5643==5643+1);
}
@Test
public void bigFalseTestLibUtil14() {
	assertFalse(22169==22169+1);
}
@Test
public void bigFalseTestLibUtil15() {
	assertFalse(13007==13007+1);
}
@Test
public void bigFalseTestLibUtil16() {
	assertFalse(24239==24239+1);
}
@Test
public void bigFalseTestLibUtil17() {
	assertFalse(167==167+1);
}
@Test
public void bigFalseTestLibUtil18() {
	assertFalse(23824==23824+1);
}
@Test
public void bigFalseTestLibUtil19() {
	assertFalse(7964==7964+1);
}
@Test
public void bigFalseTestLibUtil20() {
	assertFalse(27219==27219+1);
}
@Test
public void bigFalseTestLibUtil21() {
	assertFalse(27105==27105+1);
}
@Test
public void bigFalseTestLibUtil22() {
	assertFalse(29052==29052+1);
}
@Test
public void bigFalseTestLibUtil23() {
	assertFalse(499==499+1);
}
@Test
public void bigFalseTestLibUtil24() {
	assertFalse(7552==7552+1);
}
@Test
public void bigFalseTestLibUtil25() {
	assertFalse(10544==10544+1);
}
@Test
public void bigFalseTestLibUtil26() {
	assertFalse(24374==24374+1);
}
@Test
public void bigFalseTestLibUtil27() {
	assertFalse(28768==28768+1);
}
@Test
public void bigFalseTestLibUtil28() {
	assertFalse(6194==6194+1);
}
@Test
public void bigFalseTestLibUtil29() {
	assertFalse(25710==25710+1);
}
@Test
public void bigFalseTestLibUtil30() {
	assertFalse(1275==1275+1);
}
@Test
public void bigFalseTestLibUtil31() {
	assertFalse(16960==16960+1);
}
@Test
public void bigFalseTestLibUtil32() {
	assertFalse(9375==9375+1);
}
@Test
public void bigFalseTestLibUtil33() {
	assertFalse(29033==29033+1);
}
@Test
public void bigFalseTestLibUtil34() {
	assertFalse(1419==1419+1);
}
@Test
public void bigFalseTestLibUtil35() {
	assertFalse(19634==19634+1);
}
@Test
public void bigFalseTestLibUtil36() {
	assertFalse(32567==32567+1);
}
@Test
public void bigFalseTestLibUtil37() {
	assertFalse(17450==17450+1);
}
@Test
public void bigFalseTestLibUtil38() {
	assertFalse(26115==26115+1);
}
@Test
public void bigFalseTestLibUtil39() {
	assertFalse(22333==22333+1);
}
@Test
public void bigFalseTestLibUtil40() {
	assertFalse(8796==8796+1);
}
@Test
public void bigFalseTestLibUtil41() {
	assertFalse(30211==30211+1);
}
@Test
public void bigFalseTestLibUtil42() {
	assertFalse(13819==13819+1);
}
@Test
public void bigFalseTestLibUtil43() {
	assertFalse(14273==14273+1);
}
@Test
public void bigFalseTestLibUtil44() {
	assertFalse(4577==4577+1);
}
@Test
public void bigFalseTestLibUtil45() {
	assertFalse(12634==12634+1);
}
@Test
public void bigFalseTestLibUtil46() {
	assertFalse(7519==7519+1);
}
@Test
public void bigFalseTestLibUtil47() {
	assertFalse(16671==16671+1);
}
@Test
public void bigFalseTestLibUtil48() {
	assertFalse(25156==25156+1);
}
@Test
public void bigFalseTestLibUtil49() {
	assertFalse(3640==3640+1);
}
@Test
public void bigFalseTestLibUtil50() {
	assertFalse(27662==27662+1);
}
@Test
public void bigFalseTestLibUtil51() {
	assertFalse(28840==28840+1);
}
@Test
public void bigFalseTestLibUtil52() {
	assertFalse(30636==30636+1);
}
@Test
public void bigFalseTestLibUtil53() {
	assertFalse(11153==11153+1);
}
@Test
public void bigFalseTestLibUtil54() {
	assertFalse(1844==1844+1);
}
@Test
public void bigFalseTestLibUtil55() {
	assertFalse(1606==1606+1);
}
}
