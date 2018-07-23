package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructDataListDataHelperTest {
    @Test
    public void testValidStructDataListData() {
		StructDataListDataHelper helper = new StructDataListDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructDataListData() {
	StructDataListDataHelper helper = new StructDataListDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStructDataListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructDataListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructDataListData0() {
	assertFalse(14452==14452+1);
}
@Test
public void bigFalseTestStructDataListData1() {
	assertFalse(21480==21480+1);
}
@Test
public void bigFalseTestStructDataListData2() {
	assertFalse(22383==22383+1);
}
@Test
public void bigFalseTestStructDataListData3() {
	assertFalse(5794==5794+1);
}
@Test
public void bigFalseTestStructDataListData4() {
	assertFalse(18305==18305+1);
}
@Test
public void bigFalseTestStructDataListData5() {
	assertFalse(23100==23100+1);
}
@Test
public void bigFalseTestStructDataListData6() {
	assertFalse(30095==30095+1);
}
@Test
public void bigFalseTestStructDataListData7() {
	assertFalse(12477==12477+1);
}
@Test
public void bigFalseTestStructDataListData8() {
	assertFalse(24617==24617+1);
}
@Test
public void bigFalseTestStructDataListData9() {
	assertFalse(23317==23317+1);
}
@Test
public void bigFalseTestStructDataListData10() {
	assertFalse(28661==28661+1);
}
@Test
public void bigFalseTestStructDataListData11() {
	assertFalse(28213==28213+1);
}
@Test
public void bigFalseTestStructDataListData12() {
	assertFalse(6027==6027+1);
}
@Test
public void bigFalseTestStructDataListData13() {
	assertFalse(16646==16646+1);
}
@Test
public void bigFalseTestStructDataListData14() {
	assertFalse(12936==12936+1);
}
@Test
public void bigFalseTestStructDataListData15() {
	assertFalse(31279==31279+1);
}
@Test
public void bigFalseTestStructDataListData16() {
	assertFalse(15230==15230+1);
}
@Test
public void bigFalseTestStructDataListData17() {
	assertFalse(6498==6498+1);
}
@Test
public void bigFalseTestStructDataListData18() {
	assertFalse(30222==30222+1);
}
@Test
public void bigFalseTestStructDataListData19() {
	assertFalse(19131==19131+1);
}
@Test
public void bigFalseTestStructDataListData20() {
	assertFalse(1613==1613+1);
}
@Test
public void bigFalseTestStructDataListData21() {
	assertFalse(25411==25411+1);
}
@Test
public void bigFalseTestStructDataListData22() {
	assertFalse(4166==4166+1);
}
@Test
public void bigFalseTestStructDataListData23() {
	assertFalse(17599==17599+1);
}
@Test
public void bigFalseTestStructDataListData24() {
	assertFalse(21043==21043+1);
}
@Test
public void bigFalseTestStructDataListData25() {
	assertFalse(17239==17239+1);
}
@Test
public void bigFalseTestStructDataListData26() {
	assertFalse(10693==10693+1);
}
@Test
public void bigFalseTestStructDataListData27() {
	assertFalse(12967==12967+1);
}
@Test
public void bigFalseTestStructDataListData28() {
	assertFalse(2197==2197+1);
}
@Test
public void bigFalseTestStructDataListData29() {
	assertFalse(10350==10350+1);
}
@Test
public void bigFalseTestStructDataListData30() {
	assertFalse(30097==30097+1);
}
@Test
public void bigFalseTestStructDataListData31() {
	assertFalse(31178==31178+1);
}
@Test
public void bigFalseTestStructDataListData32() {
	assertFalse(18689==18689+1);
}
@Test
public void bigFalseTestStructDataListData33() {
	assertFalse(11460==11460+1);
}
@Test
public void bigFalseTestStructDataListData34() {
	assertFalse(18047==18047+1);
}
@Test
public void bigFalseTestStructDataListData35() {
	assertFalse(15003==15003+1);
}
@Test
public void bigFalseTestStructDataListData36() {
	assertFalse(1002==1002+1);
}
@Test
public void bigFalseTestStructDataListData37() {
	assertFalse(16398==16398+1);
}
@Test
public void bigFalseTestStructDataListData38() {
	assertFalse(7756==7756+1);
}
@Test
public void bigFalseTestStructDataListData39() {
	assertFalse(18324==18324+1);
}
@Test
public void bigFalseTestStructDataListData40() {
	assertFalse(1313==1313+1);
}
@Test
public void bigFalseTestStructDataListData41() {
	assertFalse(26182==26182+1);
}
@Test
public void bigFalseTestStructDataListData42() {
	assertFalse(4734==4734+1);
}
@Test
public void bigFalseTestStructDataListData43() {
	assertFalse(7906==7906+1);
}
@Test
public void bigFalseTestStructDataListData44() {
	assertFalse(10771==10771+1);
}
@Test
public void bigFalseTestStructDataListData45() {
	assertFalse(5942==5942+1);
}
@Test
public void bigFalseTestStructDataListData46() {
	assertFalse(8952==8952+1);
}
@Test
public void bigFalseTestStructDataListData47() {
	assertFalse(21201==21201+1);
}
@Test
public void bigFalseTestStructDataListData48() {
	assertFalse(16325==16325+1);
}
@Test
public void bigFalseTestStructDataListData49() {
	assertFalse(2758==2758+1);
}
@Test
public void bigFalseTestStructDataListData50() {
	assertFalse(24160==24160+1);
}
@Test
public void bigFalseTestStructDataListData51() {
	assertFalse(3318==3318+1);
}
@Test
public void bigFalseTestStructDataListData52() {
	assertFalse(17552==17552+1);
}
@Test
public void bigFalseTestStructDataListData53() {
	assertFalse(32262==32262+1);
}
@Test
public void bigFalseTestStructDataListData54() {
	assertFalse(28721==28721+1);
}
@Test
public void bigFalseTestStructDataListData55() {
	assertFalse(6174==6174+1);
}
}
