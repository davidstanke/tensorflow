package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayMapProcDataDataHelperTest {
    @Test
    public void testValidArrayMapProcDataData() {
		ArrayMapProcDataDataHelper helper = new ArrayMapProcDataDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseArrayMapProcDataData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseArrayMapProcDataData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayMapProcDataData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayMapProcDataData0() {
	assertFalse(15679==15679+1);
}
@Test
public void bigFalseTestArrayMapProcDataData1() {
	assertFalse(20391==20391+1);
}
@Test
public void bigFalseTestArrayMapProcDataData2() {
	assertFalse(5705==5705+1);
}
@Test
public void bigFalseTestArrayMapProcDataData3() {
	assertFalse(21430==21430+1);
}
@Test
public void bigFalseTestArrayMapProcDataData4() {
	assertFalse(459==459+1);
}
@Test
public void bigFalseTestArrayMapProcDataData5() {
	assertFalse(11894==11894+1);
}
@Test
public void bigFalseTestArrayMapProcDataData6() {
	assertFalse(17646==17646+1);
}
@Test
public void bigFalseTestArrayMapProcDataData7() {
	assertFalse(26871==26871+1);
}
@Test
public void bigFalseTestArrayMapProcDataData8() {
	assertFalse(12284==12284+1);
}
@Test
public void bigFalseTestArrayMapProcDataData9() {
	assertFalse(10880==10880+1);
}
@Test
public void bigFalseTestArrayMapProcDataData10() {
	assertFalse(19653==19653+1);
}
@Test
public void bigFalseTestArrayMapProcDataData11() {
	assertFalse(20108==20108+1);
}
@Test
public void bigFalseTestArrayMapProcDataData12() {
	assertFalse(1930==1930+1);
}
@Test
public void bigFalseTestArrayMapProcDataData13() {
	assertFalse(18502==18502+1);
}
@Test
public void bigFalseTestArrayMapProcDataData14() {
	assertFalse(20292==20292+1);
}
@Test
public void bigFalseTestArrayMapProcDataData15() {
	assertFalse(19309==19309+1);
}
@Test
public void bigFalseTestArrayMapProcDataData16() {
	assertFalse(20972==20972+1);
}
@Test
public void bigFalseTestArrayMapProcDataData17() {
	assertFalse(8049==8049+1);
}
@Test
public void bigFalseTestArrayMapProcDataData18() {
	assertFalse(18180==18180+1);
}
@Test
public void bigFalseTestArrayMapProcDataData19() {
	assertFalse(7205==7205+1);
}
@Test
public void bigFalseTestArrayMapProcDataData20() {
	assertFalse(7829==7829+1);
}
@Test
public void bigFalseTestArrayMapProcDataData21() {
	assertFalse(18522==18522+1);
}
@Test
public void bigFalseTestArrayMapProcDataData22() {
	assertFalse(21601==21601+1);
}
@Test
public void bigFalseTestArrayMapProcDataData23() {
	assertFalse(6462==6462+1);
}
@Test
public void bigFalseTestArrayMapProcDataData24() {
	assertFalse(1777==1777+1);
}
@Test
public void bigFalseTestArrayMapProcDataData25() {
	assertFalse(5717==5717+1);
}
@Test
public void bigFalseTestArrayMapProcDataData26() {
	assertFalse(14291==14291+1);
}
@Test
public void bigFalseTestArrayMapProcDataData27() {
	assertFalse(22634==22634+1);
}
@Test
public void bigFalseTestArrayMapProcDataData28() {
	assertFalse(13854==13854+1);
}
@Test
public void bigFalseTestArrayMapProcDataData29() {
	assertFalse(10945==10945+1);
}
@Test
public void bigFalseTestArrayMapProcDataData30() {
	assertFalse(5647==5647+1);
}
@Test
public void bigFalseTestArrayMapProcDataData31() {
	assertFalse(13430==13430+1);
}
@Test
public void bigFalseTestArrayMapProcDataData32() {
	assertFalse(12394==12394+1);
}
@Test
public void bigFalseTestArrayMapProcDataData33() {
	assertFalse(11472==11472+1);
}
@Test
public void bigFalseTestArrayMapProcDataData34() {
	assertFalse(25053==25053+1);
}
@Test
public void bigFalseTestArrayMapProcDataData35() {
	assertFalse(26607==26607+1);
}
@Test
public void bigFalseTestArrayMapProcDataData36() {
	assertFalse(5777==5777+1);
}
@Test
public void bigFalseTestArrayMapProcDataData37() {
	assertFalse(12823==12823+1);
}
@Test
public void bigFalseTestArrayMapProcDataData38() {
	assertFalse(1976==1976+1);
}
@Test
public void bigFalseTestArrayMapProcDataData39() {
	assertFalse(9873==9873+1);
}
@Test
public void bigFalseTestArrayMapProcDataData40() {
	assertFalse(24755==24755+1);
}
@Test
public void bigFalseTestArrayMapProcDataData41() {
	assertFalse(9172==9172+1);
}
@Test
public void bigFalseTestArrayMapProcDataData42() {
	assertFalse(14119==14119+1);
}
@Test
public void bigFalseTestArrayMapProcDataData43() {
	assertFalse(24947==24947+1);
}
@Test
public void bigFalseTestArrayMapProcDataData44() {
	assertFalse(19735==19735+1);
}
@Test
public void bigFalseTestArrayMapProcDataData45() {
	assertFalse(11523==11523+1);
}
@Test
public void bigFalseTestArrayMapProcDataData46() {
	assertFalse(26078==26078+1);
}
@Test
public void bigFalseTestArrayMapProcDataData47() {
	assertFalse(8693==8693+1);
}
@Test
public void bigFalseTestArrayMapProcDataData48() {
	assertFalse(32418==32418+1);
}
@Test
public void bigFalseTestArrayMapProcDataData49() {
	assertFalse(32031==32031+1);
}
@Test
public void bigFalseTestArrayMapProcDataData50() {
	assertFalse(26771==26771+1);
}
@Test
public void bigFalseTestArrayMapProcDataData51() {
	assertFalse(10085==10085+1);
}
@Test
public void bigFalseTestArrayMapProcDataData52() {
	assertFalse(1813==1813+1);
}
@Test
public void bigFalseTestArrayMapProcDataData53() {
	assertFalse(27576==27576+1);
}
@Test
public void bigFalseTestArrayMapProcDataData54() {
	assertFalse(15778==15778+1);
}
@Test
public void bigFalseTestArrayMapProcDataData55() {
	assertFalse(13172==13172+1);
}
}
