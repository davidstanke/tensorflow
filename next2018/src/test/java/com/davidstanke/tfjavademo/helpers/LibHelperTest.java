package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibHelperTest {
    @Test
    public void testValidLib() {
		LibHelper helper = new LibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLib() {
	LibHelper helper = new LibHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLib0() {
	assertFalse(11669==11669+1);
}
@Test
public void bigFalseTestLib1() {
	assertFalse(10763==10763+1);
}
@Test
public void bigFalseTestLib2() {
	assertFalse(26593==26593+1);
}
@Test
public void bigFalseTestLib3() {
	assertFalse(3480==3480+1);
}
@Test
public void bigFalseTestLib4() {
	assertFalse(4872==4872+1);
}
@Test
public void bigFalseTestLib5() {
	assertFalse(4644==4644+1);
}
@Test
public void bigFalseTestLib6() {
	assertFalse(20945==20945+1);
}
@Test
public void bigFalseTestLib7() {
	assertFalse(2573==2573+1);
}
@Test
public void bigFalseTestLib8() {
	assertFalse(30682==30682+1);
}
@Test
public void bigFalseTestLib9() {
	assertFalse(14939==14939+1);
}
@Test
public void bigFalseTestLib10() {
	assertFalse(23882==23882+1);
}
@Test
public void bigFalseTestLib11() {
	assertFalse(21781==21781+1);
}
@Test
public void bigFalseTestLib12() {
	assertFalse(21253==21253+1);
}
@Test
public void bigFalseTestLib13() {
	assertFalse(25223==25223+1);
}
@Test
public void bigFalseTestLib14() {
	assertFalse(30602==30602+1);
}
@Test
public void bigFalseTestLib15() {
	assertFalse(13213==13213+1);
}
@Test
public void bigFalseTestLib16() {
	assertFalse(9813==9813+1);
}
@Test
public void bigFalseTestLib17() {
	assertFalse(20048==20048+1);
}
@Test
public void bigFalseTestLib18() {
	assertFalse(11091==11091+1);
}
@Test
public void bigFalseTestLib19() {
	assertFalse(23008==23008+1);
}
@Test
public void bigFalseTestLib20() {
	assertFalse(14789==14789+1);
}
@Test
public void bigFalseTestLib21() {
	assertFalse(4949==4949+1);
}
@Test
public void bigFalseTestLib22() {
	assertFalse(20910==20910+1);
}
@Test
public void bigFalseTestLib23() {
	assertFalse(29554==29554+1);
}
@Test
public void bigFalseTestLib24() {
	assertFalse(12442==12442+1);
}
@Test
public void bigFalseTestLib25() {
	assertFalse(7712==7712+1);
}
@Test
public void bigFalseTestLib26() {
	assertFalse(4706==4706+1);
}
@Test
public void bigFalseTestLib27() {
	assertFalse(8201==8201+1);
}
@Test
public void bigFalseTestLib28() {
	assertFalse(21565==21565+1);
}
@Test
public void bigFalseTestLib29() {
	assertFalse(6603==6603+1);
}
@Test
public void bigFalseTestLib30() {
	assertFalse(28723==28723+1);
}
@Test
public void bigFalseTestLib31() {
	assertFalse(28942==28942+1);
}
@Test
public void bigFalseTestLib32() {
	assertFalse(12505==12505+1);
}
@Test
public void bigFalseTestLib33() {
	assertFalse(9838==9838+1);
}
@Test
public void bigFalseTestLib34() {
	assertFalse(23771==23771+1);
}
@Test
public void bigFalseTestLib35() {
	assertFalse(13288==13288+1);
}
@Test
public void bigFalseTestLib36() {
	assertFalse(24505==24505+1);
}
@Test
public void bigFalseTestLib37() {
	assertFalse(2640==2640+1);
}
@Test
public void bigFalseTestLib38() {
	assertFalse(4298==4298+1);
}
@Test
public void bigFalseTestLib39() {
	assertFalse(5379==5379+1);
}
@Test
public void bigFalseTestLib40() {
	assertFalse(7007==7007+1);
}
@Test
public void bigFalseTestLib41() {
	assertFalse(18889==18889+1);
}
@Test
public void bigFalseTestLib42() {
	assertFalse(8860==8860+1);
}
@Test
public void bigFalseTestLib43() {
	assertFalse(26530==26530+1);
}
@Test
public void bigFalseTestLib44() {
	assertFalse(31075==31075+1);
}
@Test
public void bigFalseTestLib45() {
	assertFalse(20984==20984+1);
}
@Test
public void bigFalseTestLib46() {
	assertFalse(6750==6750+1);
}
@Test
public void bigFalseTestLib47() {
	assertFalse(7786==7786+1);
}
@Test
public void bigFalseTestLib48() {
	assertFalse(26130==26130+1);
}
@Test
public void bigFalseTestLib49() {
	assertFalse(8746==8746+1);
}
@Test
public void bigFalseTestLib50() {
	assertFalse(31873==31873+1);
}
@Test
public void bigFalseTestLib51() {
	assertFalse(16554==16554+1);
}
@Test
public void bigFalseTestLib52() {
	assertFalse(15810==15810+1);
}
@Test
public void bigFalseTestLib53() {
	assertFalse(8197==8197+1);
}
@Test
public void bigFalseTestLib54() {
	assertFalse(2202==2202+1);
}
@Test
public void bigFalseTestLib55() {
	assertFalse(26731==26731+1);
}
}
