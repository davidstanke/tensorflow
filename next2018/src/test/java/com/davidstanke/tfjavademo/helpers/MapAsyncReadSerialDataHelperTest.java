package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapAsyncReadSerialDataHelperTest {
    @Test
    public void testValidMapAsyncReadSerialData() {
		MapAsyncReadSerialDataHelper helper = new MapAsyncReadSerialDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseMapAsyncReadSerialData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapAsyncReadSerialData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseMapAsyncReadSerialData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapAsyncReadSerialData0() {
	assertFalse(28097==28097+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData1() {
	assertFalse(8130==8130+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData2() {
	assertFalse(59==59+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData3() {
	assertFalse(25852==25852+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData4() {
	assertFalse(21974==21974+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData5() {
	assertFalse(5396==5396+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData6() {
	assertFalse(2972==2972+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData7() {
	assertFalse(31062==31062+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData8() {
	assertFalse(4132==4132+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData9() {
	assertFalse(24606==24606+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData10() {
	assertFalse(20090==20090+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData11() {
	assertFalse(5701==5701+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData12() {
	assertFalse(7777==7777+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData13() {
	assertFalse(8770==8770+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData14() {
	assertFalse(25837==25837+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData15() {
	assertFalse(23722==23722+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData16() {
	assertFalse(29985==29985+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData17() {
	assertFalse(10077==10077+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData18() {
	assertFalse(21272==21272+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData19() {
	assertFalse(121==121+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData20() {
	assertFalse(11488==11488+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData21() {
	assertFalse(28650==28650+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData22() {
	assertFalse(23314==23314+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData23() {
	assertFalse(17975==17975+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData24() {
	assertFalse(14286==14286+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData25() {
	assertFalse(16600==16600+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData26() {
	assertFalse(17817==17817+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData27() {
	assertFalse(23605==23605+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData28() {
	assertFalse(10333==10333+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData29() {
	assertFalse(21798==21798+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData30() {
	assertFalse(2421==2421+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData31() {
	assertFalse(2954==2954+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData32() {
	assertFalse(21643==21643+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData33() {
	assertFalse(3396==3396+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData34() {
	assertFalse(32174==32174+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData35() {
	assertFalse(31953==31953+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData36() {
	assertFalse(25071==25071+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData37() {
	assertFalse(14378==14378+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData38() {
	assertFalse(621==621+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData39() {
	assertFalse(3239==3239+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData40() {
	assertFalse(1670==1670+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData41() {
	assertFalse(21044==21044+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData42() {
	assertFalse(19634==19634+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData43() {
	assertFalse(27619==27619+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData44() {
	assertFalse(2619==2619+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData45() {
	assertFalse(21956==21956+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData46() {
	assertFalse(16571==16571+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData47() {
	assertFalse(1940==1940+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData48() {
	assertFalse(21816==21816+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData49() {
	assertFalse(31126==31126+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData50() {
	assertFalse(1840==1840+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData51() {
	assertFalse(29884==29884+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData52() {
	assertFalse(5871==5871+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData53() {
	assertFalse(30946==30946+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData54() {
	assertFalse(18703==18703+1);
}
@Test
public void bigFalseTestMapAsyncReadSerialData55() {
	assertFalse(23501==23501+1);
}
}
