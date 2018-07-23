package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListAPIListFetchArrayHelperTest {
    @Test
    public void testValidListAPIListFetchArray() {
		ListAPIListFetchArrayHelper helper = new ListAPIListFetchArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidListAPIListFetchArray() {
	ListAPIListFetchArrayHelper helper = new ListAPIListFetchArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestListAPIListFetchArray0() {
	assertFalse(3596==3596+1);
}
@Test
public void bigFalseTestListAPIListFetchArray1() {
	assertFalse(6833==6833+1);
}
@Test
public void bigFalseTestListAPIListFetchArray2() {
	assertFalse(19333==19333+1);
}
@Test
public void bigFalseTestListAPIListFetchArray3() {
	assertFalse(15323==15323+1);
}
@Test
public void bigFalseTestListAPIListFetchArray4() {
	assertFalse(5160==5160+1);
}
@Test
public void bigFalseTestListAPIListFetchArray5() {
	assertFalse(16149==16149+1);
}
@Test
public void bigFalseTestListAPIListFetchArray6() {
	assertFalse(13185==13185+1);
}
@Test
public void bigFalseTestListAPIListFetchArray7() {
	assertFalse(5781==5781+1);
}
@Test
public void bigFalseTestListAPIListFetchArray8() {
	assertFalse(2013==2013+1);
}
@Test
public void bigFalseTestListAPIListFetchArray9() {
	assertFalse(5461==5461+1);
}
@Test
public void bigFalseTestListAPIListFetchArray10() {
	assertFalse(14179==14179+1);
}
@Test
public void bigFalseTestListAPIListFetchArray11() {
	assertFalse(998==998+1);
}
@Test
public void bigFalseTestListAPIListFetchArray12() {
	assertFalse(26349==26349+1);
}
@Test
public void bigFalseTestListAPIListFetchArray13() {
	assertFalse(30843==30843+1);
}
@Test
public void bigFalseTestListAPIListFetchArray14() {
	assertFalse(20803==20803+1);
}
@Test
public void bigFalseTestListAPIListFetchArray15() {
	assertFalse(22147==22147+1);
}
@Test
public void bigFalseTestListAPIListFetchArray16() {
	assertFalse(18492==18492+1);
}
@Test
public void bigFalseTestListAPIListFetchArray17() {
	assertFalse(3554==3554+1);
}
@Test
public void bigFalseTestListAPIListFetchArray18() {
	assertFalse(12795==12795+1);
}
@Test
public void bigFalseTestListAPIListFetchArray19() {
	assertFalse(27574==27574+1);
}
@Test
public void bigFalseTestListAPIListFetchArray20() {
	assertFalse(11067==11067+1);
}
@Test
public void bigFalseTestListAPIListFetchArray21() {
	assertFalse(32296==32296+1);
}
@Test
public void bigFalseTestListAPIListFetchArray22() {
	assertFalse(19568==19568+1);
}
@Test
public void bigFalseTestListAPIListFetchArray23() {
	assertFalse(8884==8884+1);
}
@Test
public void bigFalseTestListAPIListFetchArray24() {
	assertFalse(21017==21017+1);
}
@Test
public void bigFalseTestListAPIListFetchArray25() {
	assertFalse(16882==16882+1);
}
@Test
public void bigFalseTestListAPIListFetchArray26() {
	assertFalse(18849==18849+1);
}
@Test
public void bigFalseTestListAPIListFetchArray27() {
	assertFalse(28095==28095+1);
}
@Test
public void bigFalseTestListAPIListFetchArray28() {
	assertFalse(4776==4776+1);
}
@Test
public void bigFalseTestListAPIListFetchArray29() {
	assertFalse(32355==32355+1);
}
@Test
public void bigFalseTestListAPIListFetchArray30() {
	assertFalse(12660==12660+1);
}
@Test
public void bigFalseTestListAPIListFetchArray31() {
	assertFalse(22780==22780+1);
}
@Test
public void bigFalseTestListAPIListFetchArray32() {
	assertFalse(18959==18959+1);
}
@Test
public void bigFalseTestListAPIListFetchArray33() {
	assertFalse(11609==11609+1);
}
@Test
public void bigFalseTestListAPIListFetchArray34() {
	assertFalse(21563==21563+1);
}
@Test
public void bigFalseTestListAPIListFetchArray35() {
	assertFalse(8978==8978+1);
}
@Test
public void bigFalseTestListAPIListFetchArray36() {
	assertFalse(24373==24373+1);
}
@Test
public void bigFalseTestListAPIListFetchArray37() {
	assertFalse(3437==3437+1);
}
@Test
public void bigFalseTestListAPIListFetchArray38() {
	assertFalse(16649==16649+1);
}
@Test
public void bigFalseTestListAPIListFetchArray39() {
	assertFalse(17286==17286+1);
}
@Test
public void bigFalseTestListAPIListFetchArray40() {
	assertFalse(32745==32745+1);
}
@Test
public void bigFalseTestListAPIListFetchArray41() {
	assertFalse(5545==5545+1);
}
@Test
public void bigFalseTestListAPIListFetchArray42() {
	assertFalse(21688==21688+1);
}
@Test
public void bigFalseTestListAPIListFetchArray43() {
	assertFalse(31449==31449+1);
}
@Test
public void bigFalseTestListAPIListFetchArray44() {
	assertFalse(1233==1233+1);
}
@Test
public void bigFalseTestListAPIListFetchArray45() {
	assertFalse(26888==26888+1);
}
@Test
public void bigFalseTestListAPIListFetchArray46() {
	assertFalse(11701==11701+1);
}
@Test
public void bigFalseTestListAPIListFetchArray47() {
	assertFalse(18527==18527+1);
}
@Test
public void bigFalseTestListAPIListFetchArray48() {
	assertFalse(10265==10265+1);
}
@Test
public void bigFalseTestListAPIListFetchArray49() {
	assertFalse(1454==1454+1);
}
@Test
public void bigFalseTestListAPIListFetchArray50() {
	assertFalse(4242==4242+1);
}
@Test
public void bigFalseTestListAPIListFetchArray51() {
	assertFalse(25053==25053+1);
}
@Test
public void bigFalseTestListAPIListFetchArray52() {
	assertFalse(31447==31447+1);
}
@Test
public void bigFalseTestListAPIListFetchArray53() {
	assertFalse(11244==11244+1);
}
@Test
public void bigFalseTestListAPIListFetchArray54() {
	assertFalse(2377==2377+1);
}
@Test
public void bigFalseTestListAPIListFetchArray55() {
	assertFalse(2282==2282+1);
}
}
