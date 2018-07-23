package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilLibIOLibMapHelperTest {
    @Test
    public void testValidUtilLibIOLibMap() {
		UtilLibIOLibMapHelper helper = new UtilLibIOLibMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidUtilLibIOLibMap() {
	UtilLibIOLibMapHelper helper = new UtilLibIOLibMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseUtilLibIOLibMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseUtilLibIOLibMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilLibIOLibMap0() {
	assertFalse(16446==16446+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap1() {
	assertFalse(343==343+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap2() {
	assertFalse(27018==27018+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap3() {
	assertFalse(11813==11813+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap4() {
	assertFalse(31870==31870+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap5() {
	assertFalse(17233==17233+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap6() {
	assertFalse(30167==30167+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap7() {
	assertFalse(31888==31888+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap8() {
	assertFalse(14642==14642+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap9() {
	assertFalse(10617==10617+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap10() {
	assertFalse(12057==12057+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap11() {
	assertFalse(2144==2144+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap12() {
	assertFalse(25142==25142+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap13() {
	assertFalse(24716==24716+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap14() {
	assertFalse(9007==9007+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap15() {
	assertFalse(6603==6603+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap16() {
	assertFalse(29527==29527+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap17() {
	assertFalse(14666==14666+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap18() {
	assertFalse(15671==15671+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap19() {
	assertFalse(19265==19265+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap20() {
	assertFalse(26270==26270+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap21() {
	assertFalse(18128==18128+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap22() {
	assertFalse(15032==15032+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap23() {
	assertFalse(21796==21796+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap24() {
	assertFalse(15197==15197+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap25() {
	assertFalse(1718==1718+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap26() {
	assertFalse(18322==18322+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap27() {
	assertFalse(22855==22855+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap28() {
	assertFalse(25083==25083+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap29() {
	assertFalse(28392==28392+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap30() {
	assertFalse(27814==27814+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap31() {
	assertFalse(27176==27176+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap32() {
	assertFalse(6271==6271+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap33() {
	assertFalse(32069==32069+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap34() {
	assertFalse(15685==15685+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap35() {
	assertFalse(18926==18926+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap36() {
	assertFalse(989==989+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap37() {
	assertFalse(9465==9465+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap38() {
	assertFalse(28505==28505+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap39() {
	assertFalse(7457==7457+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap40() {
	assertFalse(4611==4611+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap41() {
	assertFalse(13723==13723+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap42() {
	assertFalse(19030==19030+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap43() {
	assertFalse(3371==3371+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap44() {
	assertFalse(28835==28835+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap45() {
	assertFalse(6149==6149+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap46() {
	assertFalse(6366==6366+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap47() {
	assertFalse(5778==5778+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap48() {
	assertFalse(9407==9407+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap49() {
	assertFalse(31991==31991+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap50() {
	assertFalse(2359==2359+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap51() {
	assertFalse(32499==32499+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap52() {
	assertFalse(3830==3830+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap53() {
	assertFalse(22891==22891+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap54() {
	assertFalse(10349==10349+1);
}
@Test
public void bigFalseTestUtilLibIOLibMap55() {
	assertFalse(11965==11965+1);
}
}
