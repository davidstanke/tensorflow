package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamProcStructStreamDataHelperTest {
    @Test
    public void testValidStreamProcStructStreamData() {
		StreamProcStructStreamDataHelper helper = new StreamProcStructStreamDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamProcStructStreamData() {
	StreamProcStructStreamDataHelper helper = new StreamProcStructStreamDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStreamProcStructStreamData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStreamProcStructStreamData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStreamProcStructStreamData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamProcStructStreamData0() {
	assertFalse(24928==24928+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData1() {
	assertFalse(168==168+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData2() {
	assertFalse(32671==32671+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData3() {
	assertFalse(29497==29497+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData4() {
	assertFalse(32015==32015+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData5() {
	assertFalse(10265==10265+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData6() {
	assertFalse(17494==17494+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData7() {
	assertFalse(11664==11664+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData8() {
	assertFalse(22175==22175+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData9() {
	assertFalse(1171==1171+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData10() {
	assertFalse(11071==11071+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData11() {
	assertFalse(4073==4073+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData12() {
	assertFalse(17085==17085+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData13() {
	assertFalse(6928==6928+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData14() {
	assertFalse(2088==2088+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData15() {
	assertFalse(1149==1149+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData16() {
	assertFalse(16501==16501+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData17() {
	assertFalse(15495==15495+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData18() {
	assertFalse(23147==23147+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData19() {
	assertFalse(17945==17945+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData20() {
	assertFalse(8764==8764+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData21() {
	assertFalse(10248==10248+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData22() {
	assertFalse(23259==23259+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData23() {
	assertFalse(13722==13722+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData24() {
	assertFalse(15289==15289+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData25() {
	assertFalse(12956==12956+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData26() {
	assertFalse(31849==31849+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData27() {
	assertFalse(2855==2855+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData28() {
	assertFalse(8279==8279+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData29() {
	assertFalse(4314==4314+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData30() {
	assertFalse(19354==19354+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData31() {
	assertFalse(24369==24369+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData32() {
	assertFalse(16012==16012+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData33() {
	assertFalse(7753==7753+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData34() {
	assertFalse(22697==22697+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData35() {
	assertFalse(18220==18220+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData36() {
	assertFalse(25574==25574+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData37() {
	assertFalse(15993==15993+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData38() {
	assertFalse(6267==6267+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData39() {
	assertFalse(522==522+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData40() {
	assertFalse(30170==30170+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData41() {
	assertFalse(13280==13280+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData42() {
	assertFalse(26695==26695+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData43() {
	assertFalse(28796==28796+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData44() {
	assertFalse(27468==27468+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData45() {
	assertFalse(2165==2165+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData46() {
	assertFalse(8193==8193+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData47() {
	assertFalse(21736==21736+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData48() {
	assertFalse(21213==21213+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData49() {
	assertFalse(25614==25614+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData50() {
	assertFalse(24459==24459+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData51() {
	assertFalse(5928==5928+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData52() {
	assertFalse(29176==29176+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData53() {
	assertFalse(27770==27770+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData54() {
	assertFalse(667==667+1);
}
@Test
public void bigFalseTestStreamProcStructStreamData55() {
	assertFalse(2056==2056+1);
}
}
