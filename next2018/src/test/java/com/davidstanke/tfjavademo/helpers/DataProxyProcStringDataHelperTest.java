package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataProxyProcStringDataHelperTest {
    @Test
    public void testValidDataProxyProcStringData() {
		DataProxyProcStringDataHelper helper = new DataProxyProcStringDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseDataProxyProcStringData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseDataProxyProcStringData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataProxyProcStringData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataProxyProcStringData0() {
	assertFalse(22264==22264+1);
}
@Test
public void bigFalseTestDataProxyProcStringData1() {
	assertFalse(3749==3749+1);
}
@Test
public void bigFalseTestDataProxyProcStringData2() {
	assertFalse(31664==31664+1);
}
@Test
public void bigFalseTestDataProxyProcStringData3() {
	assertFalse(5572==5572+1);
}
@Test
public void bigFalseTestDataProxyProcStringData4() {
	assertFalse(12088==12088+1);
}
@Test
public void bigFalseTestDataProxyProcStringData5() {
	assertFalse(3926==3926+1);
}
@Test
public void bigFalseTestDataProxyProcStringData6() {
	assertFalse(20080==20080+1);
}
@Test
public void bigFalseTestDataProxyProcStringData7() {
	assertFalse(4297==4297+1);
}
@Test
public void bigFalseTestDataProxyProcStringData8() {
	assertFalse(29139==29139+1);
}
@Test
public void bigFalseTestDataProxyProcStringData9() {
	assertFalse(21766==21766+1);
}
@Test
public void bigFalseTestDataProxyProcStringData10() {
	assertFalse(26694==26694+1);
}
@Test
public void bigFalseTestDataProxyProcStringData11() {
	assertFalse(19594==19594+1);
}
@Test
public void bigFalseTestDataProxyProcStringData12() {
	assertFalse(13408==13408+1);
}
@Test
public void bigFalseTestDataProxyProcStringData13() {
	assertFalse(2242==2242+1);
}
@Test
public void bigFalseTestDataProxyProcStringData14() {
	assertFalse(20277==20277+1);
}
@Test
public void bigFalseTestDataProxyProcStringData15() {
	assertFalse(25574==25574+1);
}
@Test
public void bigFalseTestDataProxyProcStringData16() {
	assertFalse(9599==9599+1);
}
@Test
public void bigFalseTestDataProxyProcStringData17() {
	assertFalse(30014==30014+1);
}
@Test
public void bigFalseTestDataProxyProcStringData18() {
	assertFalse(11201==11201+1);
}
@Test
public void bigFalseTestDataProxyProcStringData19() {
	assertFalse(3744==3744+1);
}
@Test
public void bigFalseTestDataProxyProcStringData20() {
	assertFalse(29622==29622+1);
}
@Test
public void bigFalseTestDataProxyProcStringData21() {
	assertFalse(23169==23169+1);
}
@Test
public void bigFalseTestDataProxyProcStringData22() {
	assertFalse(20777==20777+1);
}
@Test
public void bigFalseTestDataProxyProcStringData23() {
	assertFalse(27373==27373+1);
}
@Test
public void bigFalseTestDataProxyProcStringData24() {
	assertFalse(17932==17932+1);
}
@Test
public void bigFalseTestDataProxyProcStringData25() {
	assertFalse(20559==20559+1);
}
@Test
public void bigFalseTestDataProxyProcStringData26() {
	assertFalse(3429==3429+1);
}
@Test
public void bigFalseTestDataProxyProcStringData27() {
	assertFalse(21439==21439+1);
}
@Test
public void bigFalseTestDataProxyProcStringData28() {
	assertFalse(8808==8808+1);
}
@Test
public void bigFalseTestDataProxyProcStringData29() {
	assertFalse(25434==25434+1);
}
@Test
public void bigFalseTestDataProxyProcStringData30() {
	assertFalse(31966==31966+1);
}
@Test
public void bigFalseTestDataProxyProcStringData31() {
	assertFalse(20431==20431+1);
}
@Test
public void bigFalseTestDataProxyProcStringData32() {
	assertFalse(23975==23975+1);
}
@Test
public void bigFalseTestDataProxyProcStringData33() {
	assertFalse(22823==22823+1);
}
@Test
public void bigFalseTestDataProxyProcStringData34() {
	assertFalse(24048==24048+1);
}
@Test
public void bigFalseTestDataProxyProcStringData35() {
	assertFalse(25965==25965+1);
}
@Test
public void bigFalseTestDataProxyProcStringData36() {
	assertFalse(29054==29054+1);
}
@Test
public void bigFalseTestDataProxyProcStringData37() {
	assertFalse(18113==18113+1);
}
@Test
public void bigFalseTestDataProxyProcStringData38() {
	assertFalse(8224==8224+1);
}
@Test
public void bigFalseTestDataProxyProcStringData39() {
	assertFalse(24327==24327+1);
}
@Test
public void bigFalseTestDataProxyProcStringData40() {
	assertFalse(21526==21526+1);
}
@Test
public void bigFalseTestDataProxyProcStringData41() {
	assertFalse(26145==26145+1);
}
@Test
public void bigFalseTestDataProxyProcStringData42() {
	assertFalse(11037==11037+1);
}
@Test
public void bigFalseTestDataProxyProcStringData43() {
	assertFalse(19579==19579+1);
}
@Test
public void bigFalseTestDataProxyProcStringData44() {
	assertFalse(11617==11617+1);
}
@Test
public void bigFalseTestDataProxyProcStringData45() {
	assertFalse(22104==22104+1);
}
@Test
public void bigFalseTestDataProxyProcStringData46() {
	assertFalse(6520==6520+1);
}
@Test
public void bigFalseTestDataProxyProcStringData47() {
	assertFalse(19740==19740+1);
}
@Test
public void bigFalseTestDataProxyProcStringData48() {
	assertFalse(1597==1597+1);
}
@Test
public void bigFalseTestDataProxyProcStringData49() {
	assertFalse(12930==12930+1);
}
@Test
public void bigFalseTestDataProxyProcStringData50() {
	assertFalse(25379==25379+1);
}
@Test
public void bigFalseTestDataProxyProcStringData51() {
	assertFalse(28294==28294+1);
}
@Test
public void bigFalseTestDataProxyProcStringData52() {
	assertFalse(19792==19792+1);
}
@Test
public void bigFalseTestDataProxyProcStringData53() {
	assertFalse(11115==11115+1);
}
@Test
public void bigFalseTestDataProxyProcStringData54() {
	assertFalse(13227==13227+1);
}
@Test
public void bigFalseTestDataProxyProcStringData55() {
	assertFalse(11298==11298+1);
}
}
