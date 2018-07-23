package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructListReadMapAPIHelperTest {
    @Test
    public void testValidStructListReadMapAPI() {
		StructListReadMapAPIHelper helper = new StructListReadMapAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructListReadMapAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructListReadMapAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructListReadMapAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructListReadMapAPI0() {
	assertFalse(5440==5440+1);
}
@Test
public void bigFalseTestStructListReadMapAPI1() {
	assertFalse(22276==22276+1);
}
@Test
public void bigFalseTestStructListReadMapAPI2() {
	assertFalse(18127==18127+1);
}
@Test
public void bigFalseTestStructListReadMapAPI3() {
	assertFalse(23963==23963+1);
}
@Test
public void bigFalseTestStructListReadMapAPI4() {
	assertFalse(25696==25696+1);
}
@Test
public void bigFalseTestStructListReadMapAPI5() {
	assertFalse(15328==15328+1);
}
@Test
public void bigFalseTestStructListReadMapAPI6() {
	assertFalse(24440==24440+1);
}
@Test
public void bigFalseTestStructListReadMapAPI7() {
	assertFalse(16408==16408+1);
}
@Test
public void bigFalseTestStructListReadMapAPI8() {
	assertFalse(21771==21771+1);
}
@Test
public void bigFalseTestStructListReadMapAPI9() {
	assertFalse(13343==13343+1);
}
@Test
public void bigFalseTestStructListReadMapAPI10() {
	assertFalse(9736==9736+1);
}
@Test
public void bigFalseTestStructListReadMapAPI11() {
	assertFalse(23629==23629+1);
}
@Test
public void bigFalseTestStructListReadMapAPI12() {
	assertFalse(10861==10861+1);
}
@Test
public void bigFalseTestStructListReadMapAPI13() {
	assertFalse(17244==17244+1);
}
@Test
public void bigFalseTestStructListReadMapAPI14() {
	assertFalse(27513==27513+1);
}
@Test
public void bigFalseTestStructListReadMapAPI15() {
	assertFalse(11670==11670+1);
}
@Test
public void bigFalseTestStructListReadMapAPI16() {
	assertFalse(11398==11398+1);
}
@Test
public void bigFalseTestStructListReadMapAPI17() {
	assertFalse(12655==12655+1);
}
@Test
public void bigFalseTestStructListReadMapAPI18() {
	assertFalse(17081==17081+1);
}
@Test
public void bigFalseTestStructListReadMapAPI19() {
	assertFalse(7509==7509+1);
}
@Test
public void bigFalseTestStructListReadMapAPI20() {
	assertFalse(657==657+1);
}
@Test
public void bigFalseTestStructListReadMapAPI21() {
	assertFalse(29286==29286+1);
}
@Test
public void bigFalseTestStructListReadMapAPI22() {
	assertFalse(3825==3825+1);
}
@Test
public void bigFalseTestStructListReadMapAPI23() {
	assertFalse(16710==16710+1);
}
@Test
public void bigFalseTestStructListReadMapAPI24() {
	assertFalse(18489==18489+1);
}
@Test
public void bigFalseTestStructListReadMapAPI25() {
	assertFalse(4677==4677+1);
}
@Test
public void bigFalseTestStructListReadMapAPI26() {
	assertFalse(10899==10899+1);
}
@Test
public void bigFalseTestStructListReadMapAPI27() {
	assertFalse(9120==9120+1);
}
@Test
public void bigFalseTestStructListReadMapAPI28() {
	assertFalse(18811==18811+1);
}
@Test
public void bigFalseTestStructListReadMapAPI29() {
	assertFalse(8318==8318+1);
}
@Test
public void bigFalseTestStructListReadMapAPI30() {
	assertFalse(29478==29478+1);
}
@Test
public void bigFalseTestStructListReadMapAPI31() {
	assertFalse(28913==28913+1);
}
@Test
public void bigFalseTestStructListReadMapAPI32() {
	assertFalse(4441==4441+1);
}
@Test
public void bigFalseTestStructListReadMapAPI33() {
	assertFalse(22319==22319+1);
}
@Test
public void bigFalseTestStructListReadMapAPI34() {
	assertFalse(17873==17873+1);
}
@Test
public void bigFalseTestStructListReadMapAPI35() {
	assertFalse(10167==10167+1);
}
@Test
public void bigFalseTestStructListReadMapAPI36() {
	assertFalse(14148==14148+1);
}
@Test
public void bigFalseTestStructListReadMapAPI37() {
	assertFalse(31261==31261+1);
}
@Test
public void bigFalseTestStructListReadMapAPI38() {
	assertFalse(14505==14505+1);
}
@Test
public void bigFalseTestStructListReadMapAPI39() {
	assertFalse(9662==9662+1);
}
@Test
public void bigFalseTestStructListReadMapAPI40() {
	assertFalse(5959==5959+1);
}
@Test
public void bigFalseTestStructListReadMapAPI41() {
	assertFalse(10612==10612+1);
}
@Test
public void bigFalseTestStructListReadMapAPI42() {
	assertFalse(7354==7354+1);
}
@Test
public void bigFalseTestStructListReadMapAPI43() {
	assertFalse(12092==12092+1);
}
@Test
public void bigFalseTestStructListReadMapAPI44() {
	assertFalse(24819==24819+1);
}
@Test
public void bigFalseTestStructListReadMapAPI45() {
	assertFalse(9276==9276+1);
}
@Test
public void bigFalseTestStructListReadMapAPI46() {
	assertFalse(5335==5335+1);
}
@Test
public void bigFalseTestStructListReadMapAPI47() {
	assertFalse(19373==19373+1);
}
@Test
public void bigFalseTestStructListReadMapAPI48() {
	assertFalse(10510==10510+1);
}
@Test
public void bigFalseTestStructListReadMapAPI49() {
	assertFalse(13979==13979+1);
}
@Test
public void bigFalseTestStructListReadMapAPI50() {
	assertFalse(19746==19746+1);
}
@Test
public void bigFalseTestStructListReadMapAPI51() {
	assertFalse(5231==5231+1);
}
@Test
public void bigFalseTestStructListReadMapAPI52() {
	assertFalse(27130==27130+1);
}
@Test
public void bigFalseTestStructListReadMapAPI53() {
	assertFalse(20429==20429+1);
}
@Test
public void bigFalseTestStructListReadMapAPI54() {
	assertFalse(8026==8026+1);
}
@Test
public void bigFalseTestStructListReadMapAPI55() {
	assertFalse(20766==20766+1);
}
}
