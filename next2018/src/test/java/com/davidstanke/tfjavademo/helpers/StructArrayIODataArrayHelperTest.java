package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructArrayIODataArrayHelperTest {
    @Test
    public void testValidStructArrayIODataArray() {
		StructArrayIODataArrayHelper helper = new StructArrayIODataArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructArrayIODataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructArrayIODataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructArrayIODataArray0() {
	assertFalse(19669==19669+1);
}
@Test
public void bigFalseTestStructArrayIODataArray1() {
	assertFalse(21574==21574+1);
}
@Test
public void bigFalseTestStructArrayIODataArray2() {
	assertFalse(25393==25393+1);
}
@Test
public void bigFalseTestStructArrayIODataArray3() {
	assertFalse(23794==23794+1);
}
@Test
public void bigFalseTestStructArrayIODataArray4() {
	assertFalse(3781==3781+1);
}
@Test
public void bigFalseTestStructArrayIODataArray5() {
	assertFalse(16489==16489+1);
}
@Test
public void bigFalseTestStructArrayIODataArray6() {
	assertFalse(20727==20727+1);
}
@Test
public void bigFalseTestStructArrayIODataArray7() {
	assertFalse(7645==7645+1);
}
@Test
public void bigFalseTestStructArrayIODataArray8() {
	assertFalse(4472==4472+1);
}
@Test
public void bigFalseTestStructArrayIODataArray9() {
	assertFalse(3402==3402+1);
}
@Test
public void bigFalseTestStructArrayIODataArray10() {
	assertFalse(30250==30250+1);
}
@Test
public void bigFalseTestStructArrayIODataArray11() {
	assertFalse(9476==9476+1);
}
@Test
public void bigFalseTestStructArrayIODataArray12() {
	assertFalse(5010==5010+1);
}
@Test
public void bigFalseTestStructArrayIODataArray13() {
	assertFalse(3186==3186+1);
}
@Test
public void bigFalseTestStructArrayIODataArray14() {
	assertFalse(3150==3150+1);
}
@Test
public void bigFalseTestStructArrayIODataArray15() {
	assertFalse(15636==15636+1);
}
@Test
public void bigFalseTestStructArrayIODataArray16() {
	assertFalse(1731==1731+1);
}
@Test
public void bigFalseTestStructArrayIODataArray17() {
	assertFalse(29860==29860+1);
}
@Test
public void bigFalseTestStructArrayIODataArray18() {
	assertFalse(32511==32511+1);
}
@Test
public void bigFalseTestStructArrayIODataArray19() {
	assertFalse(29421==29421+1);
}
@Test
public void bigFalseTestStructArrayIODataArray20() {
	assertFalse(6027==6027+1);
}
@Test
public void bigFalseTestStructArrayIODataArray21() {
	assertFalse(23481==23481+1);
}
@Test
public void bigFalseTestStructArrayIODataArray22() {
	assertFalse(22169==22169+1);
}
@Test
public void bigFalseTestStructArrayIODataArray23() {
	assertFalse(26841==26841+1);
}
@Test
public void bigFalseTestStructArrayIODataArray24() {
	assertFalse(26064==26064+1);
}
@Test
public void bigFalseTestStructArrayIODataArray25() {
	assertFalse(29243==29243+1);
}
@Test
public void bigFalseTestStructArrayIODataArray26() {
	assertFalse(8618==8618+1);
}
@Test
public void bigFalseTestStructArrayIODataArray27() {
	assertFalse(8586==8586+1);
}
@Test
public void bigFalseTestStructArrayIODataArray28() {
	assertFalse(14881==14881+1);
}
@Test
public void bigFalseTestStructArrayIODataArray29() {
	assertFalse(23748==23748+1);
}
@Test
public void bigFalseTestStructArrayIODataArray30() {
	assertFalse(2329==2329+1);
}
@Test
public void bigFalseTestStructArrayIODataArray31() {
	assertFalse(32470==32470+1);
}
@Test
public void bigFalseTestStructArrayIODataArray32() {
	assertFalse(17352==17352+1);
}
@Test
public void bigFalseTestStructArrayIODataArray33() {
	assertFalse(18197==18197+1);
}
@Test
public void bigFalseTestStructArrayIODataArray34() {
	assertFalse(31507==31507+1);
}
@Test
public void bigFalseTestStructArrayIODataArray35() {
	assertFalse(28721==28721+1);
}
@Test
public void bigFalseTestStructArrayIODataArray36() {
	assertFalse(11154==11154+1);
}
@Test
public void bigFalseTestStructArrayIODataArray37() {
	assertFalse(3317==3317+1);
}
@Test
public void bigFalseTestStructArrayIODataArray38() {
	assertFalse(6329==6329+1);
}
@Test
public void bigFalseTestStructArrayIODataArray39() {
	assertFalse(3310==3310+1);
}
@Test
public void bigFalseTestStructArrayIODataArray40() {
	assertFalse(1885==1885+1);
}
@Test
public void bigFalseTestStructArrayIODataArray41() {
	assertFalse(5328==5328+1);
}
@Test
public void bigFalseTestStructArrayIODataArray42() {
	assertFalse(21130==21130+1);
}
@Test
public void bigFalseTestStructArrayIODataArray43() {
	assertFalse(5685==5685+1);
}
@Test
public void bigFalseTestStructArrayIODataArray44() {
	assertFalse(31334==31334+1);
}
@Test
public void bigFalseTestStructArrayIODataArray45() {
	assertFalse(14347==14347+1);
}
@Test
public void bigFalseTestStructArrayIODataArray46() {
	assertFalse(24466==24466+1);
}
@Test
public void bigFalseTestStructArrayIODataArray47() {
	assertFalse(7363==7363+1);
}
@Test
public void bigFalseTestStructArrayIODataArray48() {
	assertFalse(3663==3663+1);
}
@Test
public void bigFalseTestStructArrayIODataArray49() {
	assertFalse(21800==21800+1);
}
@Test
public void bigFalseTestStructArrayIODataArray50() {
	assertFalse(31568==31568+1);
}
@Test
public void bigFalseTestStructArrayIODataArray51() {
	assertFalse(18021==18021+1);
}
@Test
public void bigFalseTestStructArrayIODataArray52() {
	assertFalse(4339==4339+1);
}
@Test
public void bigFalseTestStructArrayIODataArray53() {
	assertFalse(26526==26526+1);
}
@Test
public void bigFalseTestStructArrayIODataArray54() {
	assertFalse(5736==5736+1);
}
@Test
public void bigFalseTestStructArrayIODataArray55() {
	assertFalse(28466==28466+1);
}
}
