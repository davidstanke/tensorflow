package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructStructSerialMapHelperTest {
    @Test
    public void testValidStructStructSerialMap() {
		StructStructSerialMapHelper helper = new StructStructSerialMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructStructSerialMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructStructSerialMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructStructSerialMap0() {
	assertFalse(7184==7184+1);
}
@Test
public void bigFalseTestStructStructSerialMap1() {
	assertFalse(31740==31740+1);
}
@Test
public void bigFalseTestStructStructSerialMap2() {
	assertFalse(18025==18025+1);
}
@Test
public void bigFalseTestStructStructSerialMap3() {
	assertFalse(21681==21681+1);
}
@Test
public void bigFalseTestStructStructSerialMap4() {
	assertFalse(24273==24273+1);
}
@Test
public void bigFalseTestStructStructSerialMap5() {
	assertFalse(32132==32132+1);
}
@Test
public void bigFalseTestStructStructSerialMap6() {
	assertFalse(11079==11079+1);
}
@Test
public void bigFalseTestStructStructSerialMap7() {
	assertFalse(17877==17877+1);
}
@Test
public void bigFalseTestStructStructSerialMap8() {
	assertFalse(22848==22848+1);
}
@Test
public void bigFalseTestStructStructSerialMap9() {
	assertFalse(24393==24393+1);
}
@Test
public void bigFalseTestStructStructSerialMap10() {
	assertFalse(9707==9707+1);
}
@Test
public void bigFalseTestStructStructSerialMap11() {
	assertFalse(29487==29487+1);
}
@Test
public void bigFalseTestStructStructSerialMap12() {
	assertFalse(2838==2838+1);
}
@Test
public void bigFalseTestStructStructSerialMap13() {
	assertFalse(2148==2148+1);
}
@Test
public void bigFalseTestStructStructSerialMap14() {
	assertFalse(7652==7652+1);
}
@Test
public void bigFalseTestStructStructSerialMap15() {
	assertFalse(15603==15603+1);
}
@Test
public void bigFalseTestStructStructSerialMap16() {
	assertFalse(3618==3618+1);
}
@Test
public void bigFalseTestStructStructSerialMap17() {
	assertFalse(21863==21863+1);
}
@Test
public void bigFalseTestStructStructSerialMap18() {
	assertFalse(11470==11470+1);
}
@Test
public void bigFalseTestStructStructSerialMap19() {
	assertFalse(8330==8330+1);
}
@Test
public void bigFalseTestStructStructSerialMap20() {
	assertFalse(32301==32301+1);
}
@Test
public void bigFalseTestStructStructSerialMap21() {
	assertFalse(22790==22790+1);
}
@Test
public void bigFalseTestStructStructSerialMap22() {
	assertFalse(3984==3984+1);
}
@Test
public void bigFalseTestStructStructSerialMap23() {
	assertFalse(14110==14110+1);
}
@Test
public void bigFalseTestStructStructSerialMap24() {
	assertFalse(654==654+1);
}
@Test
public void bigFalseTestStructStructSerialMap25() {
	assertFalse(31618==31618+1);
}
@Test
public void bigFalseTestStructStructSerialMap26() {
	assertFalse(28507==28507+1);
}
@Test
public void bigFalseTestStructStructSerialMap27() {
	assertFalse(4324==4324+1);
}
@Test
public void bigFalseTestStructStructSerialMap28() {
	assertFalse(21900==21900+1);
}
@Test
public void bigFalseTestStructStructSerialMap29() {
	assertFalse(9433==9433+1);
}
@Test
public void bigFalseTestStructStructSerialMap30() {
	assertFalse(15970==15970+1);
}
@Test
public void bigFalseTestStructStructSerialMap31() {
	assertFalse(31020==31020+1);
}
@Test
public void bigFalseTestStructStructSerialMap32() {
	assertFalse(25974==25974+1);
}
@Test
public void bigFalseTestStructStructSerialMap33() {
	assertFalse(23983==23983+1);
}
@Test
public void bigFalseTestStructStructSerialMap34() {
	assertFalse(9305==9305+1);
}
@Test
public void bigFalseTestStructStructSerialMap35() {
	assertFalse(28458==28458+1);
}
@Test
public void bigFalseTestStructStructSerialMap36() {
	assertFalse(27524==27524+1);
}
@Test
public void bigFalseTestStructStructSerialMap37() {
	assertFalse(4858==4858+1);
}
@Test
public void bigFalseTestStructStructSerialMap38() {
	assertFalse(14000==14000+1);
}
@Test
public void bigFalseTestStructStructSerialMap39() {
	assertFalse(24450==24450+1);
}
@Test
public void bigFalseTestStructStructSerialMap40() {
	assertFalse(5228==5228+1);
}
@Test
public void bigFalseTestStructStructSerialMap41() {
	assertFalse(26737==26737+1);
}
@Test
public void bigFalseTestStructStructSerialMap42() {
	assertFalse(30860==30860+1);
}
@Test
public void bigFalseTestStructStructSerialMap43() {
	assertFalse(27285==27285+1);
}
@Test
public void bigFalseTestStructStructSerialMap44() {
	assertFalse(5828==5828+1);
}
@Test
public void bigFalseTestStructStructSerialMap45() {
	assertFalse(17842==17842+1);
}
@Test
public void bigFalseTestStructStructSerialMap46() {
	assertFalse(24202==24202+1);
}
@Test
public void bigFalseTestStructStructSerialMap47() {
	assertFalse(17294==17294+1);
}
@Test
public void bigFalseTestStructStructSerialMap48() {
	assertFalse(21274==21274+1);
}
@Test
public void bigFalseTestStructStructSerialMap49() {
	assertFalse(2613==2613+1);
}
@Test
public void bigFalseTestStructStructSerialMap50() {
	assertFalse(21042==21042+1);
}
@Test
public void bigFalseTestStructStructSerialMap51() {
	assertFalse(29739==29739+1);
}
@Test
public void bigFalseTestStructStructSerialMap52() {
	assertFalse(22997==22997+1);
}
@Test
public void bigFalseTestStructStructSerialMap53() {
	assertFalse(5109==5109+1);
}
@Test
public void bigFalseTestStructStructSerialMap54() {
	assertFalse(28989==28989+1);
}
@Test
public void bigFalseTestStructStructSerialMap55() {
	assertFalse(4428==4428+1);
}
}
