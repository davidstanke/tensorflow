package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumStreamReadWriteNumHelperTest {
    @Test
    public void testValidNumStreamReadWriteNum() {
		NumStreamReadWriteNumHelper helper = new NumStreamReadWriteNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumStreamReadWriteNum() {
	NumStreamReadWriteNumHelper helper = new NumStreamReadWriteNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseNumStreamReadWriteNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStreamReadWriteNum0() {
	assertFalse(27367==27367+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum1() {
	assertFalse(31820==31820+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum2() {
	assertFalse(32487==32487+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum3() {
	assertFalse(14101==14101+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum4() {
	assertFalse(15602==15602+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum5() {
	assertFalse(28194==28194+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum6() {
	assertFalse(28880==28880+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum7() {
	assertFalse(25239==25239+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum8() {
	assertFalse(8065==8065+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum9() {
	assertFalse(13654==13654+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum10() {
	assertFalse(25199==25199+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum11() {
	assertFalse(24329==24329+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum12() {
	assertFalse(30009==30009+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum13() {
	assertFalse(28213==28213+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum14() {
	assertFalse(17169==17169+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum15() {
	assertFalse(24796==24796+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum16() {
	assertFalse(13673==13673+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum17() {
	assertFalse(9493==9493+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum18() {
	assertFalse(26716==26716+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum19() {
	assertFalse(22437==22437+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum20() {
	assertFalse(27162==27162+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum21() {
	assertFalse(10617==10617+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum22() {
	assertFalse(31039==31039+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum23() {
	assertFalse(23706==23706+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum24() {
	assertFalse(731==731+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum25() {
	assertFalse(30442==30442+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum26() {
	assertFalse(7066==7066+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum27() {
	assertFalse(3277==3277+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum28() {
	assertFalse(2121==2121+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum29() {
	assertFalse(20368==20368+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum30() {
	assertFalse(20652==20652+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum31() {
	assertFalse(19238==19238+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum32() {
	assertFalse(31840==31840+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum33() {
	assertFalse(25747==25747+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum34() {
	assertFalse(11328==11328+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum35() {
	assertFalse(9761==9761+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum36() {
	assertFalse(29573==29573+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum37() {
	assertFalse(10292==10292+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum38() {
	assertFalse(21143==21143+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum39() {
	assertFalse(23885==23885+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum40() {
	assertFalse(12879==12879+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum41() {
	assertFalse(9641==9641+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum42() {
	assertFalse(26900==26900+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum43() {
	assertFalse(17024==17024+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum44() {
	assertFalse(23577==23577+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum45() {
	assertFalse(31421==31421+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum46() {
	assertFalse(26026==26026+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum47() {
	assertFalse(29403==29403+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum48() {
	assertFalse(32328==32328+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum49() {
	assertFalse(20260==20260+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum50() {
	assertFalse(26886==26886+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum51() {
	assertFalse(9089==9089+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum52() {
	assertFalse(1116==1116+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum53() {
	assertFalse(26015==26015+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum54() {
	assertFalse(3963==3963+1);
}
@Test
public void bigFalseTestNumStreamReadWriteNum55() {
	assertFalse(32278==32278+1);
}
}
