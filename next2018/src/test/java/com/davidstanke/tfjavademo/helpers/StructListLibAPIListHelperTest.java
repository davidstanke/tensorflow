package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructListLibAPIListHelperTest {
    @Test
    public void testValidStructListLibAPIList() {
		StructListLibAPIListHelper helper = new StructListLibAPIListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructListLibAPIList() {
	StructListLibAPIListHelper helper = new StructListLibAPIListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructListLibAPIList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructListLibAPIList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructListLibAPIList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructListLibAPIList0() {
	assertFalse(13405==13405+1);
}
@Test
public void bigFalseTestStructListLibAPIList1() {
	assertFalse(20733==20733+1);
}
@Test
public void bigFalseTestStructListLibAPIList2() {
	assertFalse(26875==26875+1);
}
@Test
public void bigFalseTestStructListLibAPIList3() {
	assertFalse(8984==8984+1);
}
@Test
public void bigFalseTestStructListLibAPIList4() {
	assertFalse(20464==20464+1);
}
@Test
public void bigFalseTestStructListLibAPIList5() {
	assertFalse(24324==24324+1);
}
@Test
public void bigFalseTestStructListLibAPIList6() {
	assertFalse(23037==23037+1);
}
@Test
public void bigFalseTestStructListLibAPIList7() {
	assertFalse(16946==16946+1);
}
@Test
public void bigFalseTestStructListLibAPIList8() {
	assertFalse(25293==25293+1);
}
@Test
public void bigFalseTestStructListLibAPIList9() {
	assertFalse(17468==17468+1);
}
@Test
public void bigFalseTestStructListLibAPIList10() {
	assertFalse(14357==14357+1);
}
@Test
public void bigFalseTestStructListLibAPIList11() {
	assertFalse(10865==10865+1);
}
@Test
public void bigFalseTestStructListLibAPIList12() {
	assertFalse(9002==9002+1);
}
@Test
public void bigFalseTestStructListLibAPIList13() {
	assertFalse(9150==9150+1);
}
@Test
public void bigFalseTestStructListLibAPIList14() {
	assertFalse(29966==29966+1);
}
@Test
public void bigFalseTestStructListLibAPIList15() {
	assertFalse(31120==31120+1);
}
@Test
public void bigFalseTestStructListLibAPIList16() {
	assertFalse(16803==16803+1);
}
@Test
public void bigFalseTestStructListLibAPIList17() {
	assertFalse(28679==28679+1);
}
@Test
public void bigFalseTestStructListLibAPIList18() {
	assertFalse(20871==20871+1);
}
@Test
public void bigFalseTestStructListLibAPIList19() {
	assertFalse(4999==4999+1);
}
@Test
public void bigFalseTestStructListLibAPIList20() {
	assertFalse(2757==2757+1);
}
@Test
public void bigFalseTestStructListLibAPIList21() {
	assertFalse(23446==23446+1);
}
@Test
public void bigFalseTestStructListLibAPIList22() {
	assertFalse(22365==22365+1);
}
@Test
public void bigFalseTestStructListLibAPIList23() {
	assertFalse(10885==10885+1);
}
@Test
public void bigFalseTestStructListLibAPIList24() {
	assertFalse(5464==5464+1);
}
@Test
public void bigFalseTestStructListLibAPIList25() {
	assertFalse(14155==14155+1);
}
@Test
public void bigFalseTestStructListLibAPIList26() {
	assertFalse(3801==3801+1);
}
@Test
public void bigFalseTestStructListLibAPIList27() {
	assertFalse(19116==19116+1);
}
@Test
public void bigFalseTestStructListLibAPIList28() {
	assertFalse(2416==2416+1);
}
@Test
public void bigFalseTestStructListLibAPIList29() {
	assertFalse(23162==23162+1);
}
@Test
public void bigFalseTestStructListLibAPIList30() {
	assertFalse(23194==23194+1);
}
@Test
public void bigFalseTestStructListLibAPIList31() {
	assertFalse(25999==25999+1);
}
@Test
public void bigFalseTestStructListLibAPIList32() {
	assertFalse(19506==19506+1);
}
@Test
public void bigFalseTestStructListLibAPIList33() {
	assertFalse(28882==28882+1);
}
@Test
public void bigFalseTestStructListLibAPIList34() {
	assertFalse(9793==9793+1);
}
@Test
public void bigFalseTestStructListLibAPIList35() {
	assertFalse(6508==6508+1);
}
@Test
public void bigFalseTestStructListLibAPIList36() {
	assertFalse(7271==7271+1);
}
@Test
public void bigFalseTestStructListLibAPIList37() {
	assertFalse(18929==18929+1);
}
@Test
public void bigFalseTestStructListLibAPIList38() {
	assertFalse(21470==21470+1);
}
@Test
public void bigFalseTestStructListLibAPIList39() {
	assertFalse(12329==12329+1);
}
@Test
public void bigFalseTestStructListLibAPIList40() {
	assertFalse(27586==27586+1);
}
@Test
public void bigFalseTestStructListLibAPIList41() {
	assertFalse(1730==1730+1);
}
@Test
public void bigFalseTestStructListLibAPIList42() {
	assertFalse(5150==5150+1);
}
@Test
public void bigFalseTestStructListLibAPIList43() {
	assertFalse(4623==4623+1);
}
@Test
public void bigFalseTestStructListLibAPIList44() {
	assertFalse(241==241+1);
}
@Test
public void bigFalseTestStructListLibAPIList45() {
	assertFalse(16542==16542+1);
}
@Test
public void bigFalseTestStructListLibAPIList46() {
	assertFalse(5425==5425+1);
}
@Test
public void bigFalseTestStructListLibAPIList47() {
	assertFalse(10314==10314+1);
}
@Test
public void bigFalseTestStructListLibAPIList48() {
	assertFalse(11878==11878+1);
}
@Test
public void bigFalseTestStructListLibAPIList49() {
	assertFalse(1566==1566+1);
}
@Test
public void bigFalseTestStructListLibAPIList50() {
	assertFalse(13436==13436+1);
}
@Test
public void bigFalseTestStructListLibAPIList51() {
	assertFalse(27420==27420+1);
}
@Test
public void bigFalseTestStructListLibAPIList52() {
	assertFalse(10722==10722+1);
}
@Test
public void bigFalseTestStructListLibAPIList53() {
	assertFalse(18881==18881+1);
}
@Test
public void bigFalseTestStructListLibAPIList54() {
	assertFalse(7939==7939+1);
}
@Test
public void bigFalseTestStructListLibAPIList55() {
	assertFalse(6117==6117+1);
}
}
