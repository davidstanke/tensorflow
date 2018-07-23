package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapStructMapProcAPIHelperTest {
    @Test
    public void testValidMapStructMapProcAPI() {
		MapStructMapProcAPIHelper helper = new MapStructMapProcAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidMapStructMapProcAPI() {
	MapStructMapProcAPIHelper helper = new MapStructMapProcAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseMapStructMapProcAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapStructMapProcAPI0() {
	assertFalse(5197==5197+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI1() {
	assertFalse(15931==15931+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI2() {
	assertFalse(25684==25684+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI3() {
	assertFalse(3898==3898+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI4() {
	assertFalse(12759==12759+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI5() {
	assertFalse(24566==24566+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI6() {
	assertFalse(17941==17941+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI7() {
	assertFalse(358==358+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI8() {
	assertFalse(24663==24663+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI9() {
	assertFalse(12669==12669+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI10() {
	assertFalse(11969==11969+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI11() {
	assertFalse(8682==8682+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI12() {
	assertFalse(10329==10329+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI13() {
	assertFalse(27539==27539+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI14() {
	assertFalse(29423==29423+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI15() {
	assertFalse(12064==12064+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI16() {
	assertFalse(2673==2673+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI17() {
	assertFalse(13990==13990+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI18() {
	assertFalse(18390==18390+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI19() {
	assertFalse(1625==1625+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI20() {
	assertFalse(23710==23710+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI21() {
	assertFalse(22989==22989+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI22() {
	assertFalse(3227==3227+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI23() {
	assertFalse(303==303+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI24() {
	assertFalse(4732==4732+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI25() {
	assertFalse(23936==23936+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI26() {
	assertFalse(23642==23642+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI27() {
	assertFalse(19626==19626+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI28() {
	assertFalse(23597==23597+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI29() {
	assertFalse(7705==7705+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI30() {
	assertFalse(13558==13558+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI31() {
	assertFalse(5653==5653+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI32() {
	assertFalse(18438==18438+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI33() {
	assertFalse(2574==2574+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI34() {
	assertFalse(16033==16033+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI35() {
	assertFalse(10654==10654+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI36() {
	assertFalse(21241==21241+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI37() {
	assertFalse(2027==2027+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI38() {
	assertFalse(42==42+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI39() {
	assertFalse(24240==24240+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI40() {
	assertFalse(5061==5061+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI41() {
	assertFalse(16402==16402+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI42() {
	assertFalse(3082==3082+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI43() {
	assertFalse(28177==28177+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI44() {
	assertFalse(27871==27871+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI45() {
	assertFalse(17971==17971+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI46() {
	assertFalse(29228==29228+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI47() {
	assertFalse(3514==3514+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI48() {
	assertFalse(28958==28958+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI49() {
	assertFalse(24201==24201+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI50() {
	assertFalse(640==640+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI51() {
	assertFalse(28282==28282+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI52() {
	assertFalse(26410==26410+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI53() {
	assertFalse(23257==23257+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI54() {
	assertFalse(11326==11326+1);
}
@Test
public void bigFalseTestMapStructMapProcAPI55() {
	assertFalse(30537==30537+1);
}
}
