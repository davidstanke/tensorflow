package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncListStructReadStreamHelperTest {
    @Test
    public void testValidAsyncListStructReadStream() {
		AsyncListStructReadStreamHelper helper = new AsyncListStructReadStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncListStructReadStream() {
	AsyncListStructReadStreamHelper helper = new AsyncListStructReadStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAsyncListStructReadStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAsyncListStructReadStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAsyncListStructReadStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncListStructReadStream0() {
	assertFalse(20404==20404+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream1() {
	assertFalse(1927==1927+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream2() {
	assertFalse(947==947+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream3() {
	assertFalse(16774==16774+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream4() {
	assertFalse(12989==12989+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream5() {
	assertFalse(26683==26683+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream6() {
	assertFalse(1329==1329+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream7() {
	assertFalse(24075==24075+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream8() {
	assertFalse(13098==13098+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream9() {
	assertFalse(19921==19921+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream10() {
	assertFalse(32406==32406+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream11() {
	assertFalse(19555==19555+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream12() {
	assertFalse(11495==11495+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream13() {
	assertFalse(17093==17093+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream14() {
	assertFalse(32508==32508+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream15() {
	assertFalse(22467==22467+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream16() {
	assertFalse(921==921+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream17() {
	assertFalse(31351==31351+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream18() {
	assertFalse(5255==5255+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream19() {
	assertFalse(30688==30688+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream20() {
	assertFalse(18482==18482+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream21() {
	assertFalse(23702==23702+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream22() {
	assertFalse(4449==4449+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream23() {
	assertFalse(30781==30781+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream24() {
	assertFalse(7254==7254+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream25() {
	assertFalse(23370==23370+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream26() {
	assertFalse(9340==9340+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream27() {
	assertFalse(18484==18484+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream28() {
	assertFalse(28529==28529+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream29() {
	assertFalse(36==36+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream30() {
	assertFalse(16903==16903+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream31() {
	assertFalse(16326==16326+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream32() {
	assertFalse(29077==29077+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream33() {
	assertFalse(23494==23494+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream34() {
	assertFalse(6061==6061+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream35() {
	assertFalse(25890==25890+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream36() {
	assertFalse(22548==22548+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream37() {
	assertFalse(17489==17489+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream38() {
	assertFalse(2192==2192+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream39() {
	assertFalse(32502==32502+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream40() {
	assertFalse(20450==20450+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream41() {
	assertFalse(3731==3731+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream42() {
	assertFalse(27912==27912+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream43() {
	assertFalse(32633==32633+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream44() {
	assertFalse(14759==14759+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream45() {
	assertFalse(11758==11758+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream46() {
	assertFalse(4636==4636+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream47() {
	assertFalse(5173==5173+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream48() {
	assertFalse(2983==2983+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream49() {
	assertFalse(26374==26374+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream50() {
	assertFalse(13500==13500+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream51() {
	assertFalse(26261==26261+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream52() {
	assertFalse(30034==30034+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream53() {
	assertFalse(306==306+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream54() {
	assertFalse(29892==29892+1);
}
@Test
public void bigFalseTestAsyncListStructReadStream55() {
	assertFalse(22835==22835+1);
}
}
