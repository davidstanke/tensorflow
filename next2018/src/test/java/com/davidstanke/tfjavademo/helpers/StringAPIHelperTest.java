package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringAPIHelperTest {
    @Test
    public void testValidStringAPI() {
		StringAPIHelper helper = new StringAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringAPI() {
	StringAPIHelper helper = new StringAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringAPI0() {
	assertFalse(22291==22291+1);
}
@Test
public void bigFalseTestStringAPI1() {
	assertFalse(20063==20063+1);
}
@Test
public void bigFalseTestStringAPI2() {
	assertFalse(28752==28752+1);
}
@Test
public void bigFalseTestStringAPI3() {
	assertFalse(8746==8746+1);
}
@Test
public void bigFalseTestStringAPI4() {
	assertFalse(4441==4441+1);
}
@Test
public void bigFalseTestStringAPI5() {
	assertFalse(13285==13285+1);
}
@Test
public void bigFalseTestStringAPI6() {
	assertFalse(2288==2288+1);
}
@Test
public void bigFalseTestStringAPI7() {
	assertFalse(30837==30837+1);
}
@Test
public void bigFalseTestStringAPI8() {
	assertFalse(14561==14561+1);
}
@Test
public void bigFalseTestStringAPI9() {
	assertFalse(18610==18610+1);
}
@Test
public void bigFalseTestStringAPI10() {
	assertFalse(5583==5583+1);
}
@Test
public void bigFalseTestStringAPI11() {
	assertFalse(18001==18001+1);
}
@Test
public void bigFalseTestStringAPI12() {
	assertFalse(11113==11113+1);
}
@Test
public void bigFalseTestStringAPI13() {
	assertFalse(18672==18672+1);
}
@Test
public void bigFalseTestStringAPI14() {
	assertFalse(31537==31537+1);
}
@Test
public void bigFalseTestStringAPI15() {
	assertFalse(6440==6440+1);
}
@Test
public void bigFalseTestStringAPI16() {
	assertFalse(17117==17117+1);
}
@Test
public void bigFalseTestStringAPI17() {
	assertFalse(3889==3889+1);
}
@Test
public void bigFalseTestStringAPI18() {
	assertFalse(11268==11268+1);
}
@Test
public void bigFalseTestStringAPI19() {
	assertFalse(24692==24692+1);
}
@Test
public void bigFalseTestStringAPI20() {
	assertFalse(18821==18821+1);
}
@Test
public void bigFalseTestStringAPI21() {
	assertFalse(29482==29482+1);
}
@Test
public void bigFalseTestStringAPI22() {
	assertFalse(18419==18419+1);
}
@Test
public void bigFalseTestStringAPI23() {
	assertFalse(24789==24789+1);
}
@Test
public void bigFalseTestStringAPI24() {
	assertFalse(1262==1262+1);
}
@Test
public void bigFalseTestStringAPI25() {
	assertFalse(22578==22578+1);
}
@Test
public void bigFalseTestStringAPI26() {
	assertFalse(3627==3627+1);
}
@Test
public void bigFalseTestStringAPI27() {
	assertFalse(15605==15605+1);
}
@Test
public void bigFalseTestStringAPI28() {
	assertFalse(922==922+1);
}
@Test
public void bigFalseTestStringAPI29() {
	assertFalse(10104==10104+1);
}
@Test
public void bigFalseTestStringAPI30() {
	assertFalse(12523==12523+1);
}
@Test
public void bigFalseTestStringAPI31() {
	assertFalse(12316==12316+1);
}
@Test
public void bigFalseTestStringAPI32() {
	assertFalse(6503==6503+1);
}
@Test
public void bigFalseTestStringAPI33() {
	assertFalse(12807==12807+1);
}
@Test
public void bigFalseTestStringAPI34() {
	assertFalse(21966==21966+1);
}
@Test
public void bigFalseTestStringAPI35() {
	assertFalse(22162==22162+1);
}
@Test
public void bigFalseTestStringAPI36() {
	assertFalse(14016==14016+1);
}
@Test
public void bigFalseTestStringAPI37() {
	assertFalse(13947==13947+1);
}
@Test
public void bigFalseTestStringAPI38() {
	assertFalse(20184==20184+1);
}
@Test
public void bigFalseTestStringAPI39() {
	assertFalse(8120==8120+1);
}
@Test
public void bigFalseTestStringAPI40() {
	assertFalse(1669==1669+1);
}
@Test
public void bigFalseTestStringAPI41() {
	assertFalse(1665==1665+1);
}
@Test
public void bigFalseTestStringAPI42() {
	assertFalse(22594==22594+1);
}
@Test
public void bigFalseTestStringAPI43() {
	assertFalse(17893==17893+1);
}
@Test
public void bigFalseTestStringAPI44() {
	assertFalse(32443==32443+1);
}
@Test
public void bigFalseTestStringAPI45() {
	assertFalse(2064==2064+1);
}
@Test
public void bigFalseTestStringAPI46() {
	assertFalse(26374==26374+1);
}
@Test
public void bigFalseTestStringAPI47() {
	assertFalse(26626==26626+1);
}
@Test
public void bigFalseTestStringAPI48() {
	assertFalse(20467==20467+1);
}
@Test
public void bigFalseTestStringAPI49() {
	assertFalse(3689==3689+1);
}
@Test
public void bigFalseTestStringAPI50() {
	assertFalse(21545==21545+1);
}
@Test
public void bigFalseTestStringAPI51() {
	assertFalse(8420==8420+1);
}
@Test
public void bigFalseTestStringAPI52() {
	assertFalse(24444==24444+1);
}
@Test
public void bigFalseTestStringAPI53() {
	assertFalse(18127==18127+1);
}
@Test
public void bigFalseTestStringAPI54() {
	assertFalse(28875==28875+1);
}
@Test
public void bigFalseTestStringAPI55() {
	assertFalse(14444==14444+1);
}
}
