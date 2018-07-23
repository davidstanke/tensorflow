package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataUtilSerialListProcHelperTest {
    @Test
    public void testValidDataUtilSerialListProc() {
		DataUtilSerialListProcHelper helper = new DataUtilSerialListProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseDataUtilSerialListProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataUtilSerialListProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataUtilSerialListProc0() {
	assertFalse(17536==17536+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc1() {
	assertFalse(28172==28172+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc2() {
	assertFalse(23691==23691+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc3() {
	assertFalse(29716==29716+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc4() {
	assertFalse(29480==29480+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc5() {
	assertFalse(19965==19965+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc6() {
	assertFalse(4965==4965+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc7() {
	assertFalse(2711==2711+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc8() {
	assertFalse(32589==32589+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc9() {
	assertFalse(4150==4150+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc10() {
	assertFalse(20168==20168+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc11() {
	assertFalse(4366==4366+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc12() {
	assertFalse(14587==14587+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc13() {
	assertFalse(18848==18848+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc14() {
	assertFalse(12730==12730+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc15() {
	assertFalse(3829==3829+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc16() {
	assertFalse(23150==23150+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc17() {
	assertFalse(13595==13595+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc18() {
	assertFalse(29057==29057+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc19() {
	assertFalse(30494==30494+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc20() {
	assertFalse(23849==23849+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc21() {
	assertFalse(30831==30831+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc22() {
	assertFalse(5670==5670+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc23() {
	assertFalse(25728==25728+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc24() {
	assertFalse(1238==1238+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc25() {
	assertFalse(19447==19447+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc26() {
	assertFalse(18091==18091+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc27() {
	assertFalse(22469==22469+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc28() {
	assertFalse(15329==15329+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc29() {
	assertFalse(28940==28940+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc30() {
	assertFalse(7435==7435+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc31() {
	assertFalse(16785==16785+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc32() {
	assertFalse(7634==7634+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc33() {
	assertFalse(9010==9010+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc34() {
	assertFalse(15862==15862+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc35() {
	assertFalse(26004==26004+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc36() {
	assertFalse(19310==19310+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc37() {
	assertFalse(28677==28677+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc38() {
	assertFalse(12361==12361+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc39() {
	assertFalse(25166==25166+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc40() {
	assertFalse(25741==25741+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc41() {
	assertFalse(8674==8674+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc42() {
	assertFalse(12367==12367+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc43() {
	assertFalse(27045==27045+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc44() {
	assertFalse(17338==17338+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc45() {
	assertFalse(10580==10580+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc46() {
	assertFalse(31418==31418+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc47() {
	assertFalse(30248==30248+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc48() {
	assertFalse(22413==22413+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc49() {
	assertFalse(12613==12613+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc50() {
	assertFalse(19295==19295+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc51() {
	assertFalse(2337==2337+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc52() {
	assertFalse(13767==13767+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc53() {
	assertFalse(18913==18913+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc54() {
	assertFalse(2997==2997+1);
}
@Test
public void bigFalseTestDataUtilSerialListProc55() {
	assertFalse(15709==15709+1);
}
}
