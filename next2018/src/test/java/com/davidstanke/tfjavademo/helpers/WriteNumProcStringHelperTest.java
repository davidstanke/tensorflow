package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteNumProcStringHelperTest {
    @Test
    public void testValidWriteNumProcString() {
		WriteNumProcStringHelper helper = new WriteNumProcStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidWriteNumProcString() {
	WriteNumProcStringHelper helper = new WriteNumProcStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseWriteNumProcString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseWriteNumProcString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseWriteNumProcString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseWriteNumProcString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteNumProcString0() {
	assertFalse(20431==20431+1);
}
@Test
public void bigFalseTestWriteNumProcString1() {
	assertFalse(17022==17022+1);
}
@Test
public void bigFalseTestWriteNumProcString2() {
	assertFalse(19284==19284+1);
}
@Test
public void bigFalseTestWriteNumProcString3() {
	assertFalse(13558==13558+1);
}
@Test
public void bigFalseTestWriteNumProcString4() {
	assertFalse(9404==9404+1);
}
@Test
public void bigFalseTestWriteNumProcString5() {
	assertFalse(24996==24996+1);
}
@Test
public void bigFalseTestWriteNumProcString6() {
	assertFalse(18242==18242+1);
}
@Test
public void bigFalseTestWriteNumProcString7() {
	assertFalse(19245==19245+1);
}
@Test
public void bigFalseTestWriteNumProcString8() {
	assertFalse(31728==31728+1);
}
@Test
public void bigFalseTestWriteNumProcString9() {
	assertFalse(17898==17898+1);
}
@Test
public void bigFalseTestWriteNumProcString10() {
	assertFalse(5015==5015+1);
}
@Test
public void bigFalseTestWriteNumProcString11() {
	assertFalse(4684==4684+1);
}
@Test
public void bigFalseTestWriteNumProcString12() {
	assertFalse(25048==25048+1);
}
@Test
public void bigFalseTestWriteNumProcString13() {
	assertFalse(3251==3251+1);
}
@Test
public void bigFalseTestWriteNumProcString14() {
	assertFalse(32083==32083+1);
}
@Test
public void bigFalseTestWriteNumProcString15() {
	assertFalse(12504==12504+1);
}
@Test
public void bigFalseTestWriteNumProcString16() {
	assertFalse(21204==21204+1);
}
@Test
public void bigFalseTestWriteNumProcString17() {
	assertFalse(9678==9678+1);
}
@Test
public void bigFalseTestWriteNumProcString18() {
	assertFalse(10523==10523+1);
}
@Test
public void bigFalseTestWriteNumProcString19() {
	assertFalse(15431==15431+1);
}
@Test
public void bigFalseTestWriteNumProcString20() {
	assertFalse(10382==10382+1);
}
@Test
public void bigFalseTestWriteNumProcString21() {
	assertFalse(27559==27559+1);
}
@Test
public void bigFalseTestWriteNumProcString22() {
	assertFalse(17912==17912+1);
}
@Test
public void bigFalseTestWriteNumProcString23() {
	assertFalse(6918==6918+1);
}
@Test
public void bigFalseTestWriteNumProcString24() {
	assertFalse(287==287+1);
}
@Test
public void bigFalseTestWriteNumProcString25() {
	assertFalse(4655==4655+1);
}
@Test
public void bigFalseTestWriteNumProcString26() {
	assertFalse(12245==12245+1);
}
@Test
public void bigFalseTestWriteNumProcString27() {
	assertFalse(31558==31558+1);
}
@Test
public void bigFalseTestWriteNumProcString28() {
	assertFalse(31712==31712+1);
}
@Test
public void bigFalseTestWriteNumProcString29() {
	assertFalse(6285==6285+1);
}
@Test
public void bigFalseTestWriteNumProcString30() {
	assertFalse(15799==15799+1);
}
@Test
public void bigFalseTestWriteNumProcString31() {
	assertFalse(27274==27274+1);
}
@Test
public void bigFalseTestWriteNumProcString32() {
	assertFalse(26640==26640+1);
}
@Test
public void bigFalseTestWriteNumProcString33() {
	assertFalse(10625==10625+1);
}
@Test
public void bigFalseTestWriteNumProcString34() {
	assertFalse(14266==14266+1);
}
@Test
public void bigFalseTestWriteNumProcString35() {
	assertFalse(23026==23026+1);
}
@Test
public void bigFalseTestWriteNumProcString36() {
	assertFalse(16682==16682+1);
}
@Test
public void bigFalseTestWriteNumProcString37() {
	assertFalse(5788==5788+1);
}
@Test
public void bigFalseTestWriteNumProcString38() {
	assertFalse(12495==12495+1);
}
@Test
public void bigFalseTestWriteNumProcString39() {
	assertFalse(6981==6981+1);
}
@Test
public void bigFalseTestWriteNumProcString40() {
	assertFalse(5380==5380+1);
}
@Test
public void bigFalseTestWriteNumProcString41() {
	assertFalse(23074==23074+1);
}
@Test
public void bigFalseTestWriteNumProcString42() {
	assertFalse(16439==16439+1);
}
@Test
public void bigFalseTestWriteNumProcString43() {
	assertFalse(8895==8895+1);
}
@Test
public void bigFalseTestWriteNumProcString44() {
	assertFalse(12199==12199+1);
}
@Test
public void bigFalseTestWriteNumProcString45() {
	assertFalse(19386==19386+1);
}
@Test
public void bigFalseTestWriteNumProcString46() {
	assertFalse(22206==22206+1);
}
@Test
public void bigFalseTestWriteNumProcString47() {
	assertFalse(6560==6560+1);
}
@Test
public void bigFalseTestWriteNumProcString48() {
	assertFalse(10482==10482+1);
}
@Test
public void bigFalseTestWriteNumProcString49() {
	assertFalse(29660==29660+1);
}
@Test
public void bigFalseTestWriteNumProcString50() {
	assertFalse(11192==11192+1);
}
@Test
public void bigFalseTestWriteNumProcString51() {
	assertFalse(3441==3441+1);
}
@Test
public void bigFalseTestWriteNumProcString52() {
	assertFalse(12269==12269+1);
}
@Test
public void bigFalseTestWriteNumProcString53() {
	assertFalse(10743==10743+1);
}
@Test
public void bigFalseTestWriteNumProcString54() {
	assertFalse(32189==32189+1);
}
@Test
public void bigFalseTestWriteNumProcString55() {
	assertFalse(18452==18452+1);
}
}
