package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamStructAsyncReadHelperTest {
    @Test
    public void testValidStreamStructAsyncRead() {
		StreamStructAsyncReadHelper helper = new StreamStructAsyncReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStreamStructAsyncRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStreamStructAsyncRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamStructAsyncRead0() {
	assertFalse(3253==3253+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead1() {
	assertFalse(14260==14260+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead2() {
	assertFalse(23339==23339+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead3() {
	assertFalse(9032==9032+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead4() {
	assertFalse(19253==19253+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead5() {
	assertFalse(6364==6364+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead6() {
	assertFalse(15395==15395+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead7() {
	assertFalse(16113==16113+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead8() {
	assertFalse(22469==22469+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead9() {
	assertFalse(27662==27662+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead10() {
	assertFalse(2553==2553+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead11() {
	assertFalse(27531==27531+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead12() {
	assertFalse(28105==28105+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead13() {
	assertFalse(7157==7157+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead14() {
	assertFalse(25045==25045+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead15() {
	assertFalse(8806==8806+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead16() {
	assertFalse(22656==22656+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead17() {
	assertFalse(31198==31198+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead18() {
	assertFalse(30999==30999+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead19() {
	assertFalse(30589==30589+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead20() {
	assertFalse(30191==30191+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead21() {
	assertFalse(25654==25654+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead22() {
	assertFalse(18471==18471+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead23() {
	assertFalse(31311==31311+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead24() {
	assertFalse(31889==31889+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead25() {
	assertFalse(22728==22728+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead26() {
	assertFalse(5625==5625+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead27() {
	assertFalse(18559==18559+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead28() {
	assertFalse(28603==28603+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead29() {
	assertFalse(28339==28339+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead30() {
	assertFalse(12386==12386+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead31() {
	assertFalse(11819==11819+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead32() {
	assertFalse(28369==28369+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead33() {
	assertFalse(29740==29740+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead34() {
	assertFalse(23838==23838+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead35() {
	assertFalse(28684==28684+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead36() {
	assertFalse(19243==19243+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead37() {
	assertFalse(11257==11257+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead38() {
	assertFalse(20381==20381+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead39() {
	assertFalse(6994==6994+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead40() {
	assertFalse(4292==4292+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead41() {
	assertFalse(26280==26280+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead42() {
	assertFalse(12178==12178+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead43() {
	assertFalse(30525==30525+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead44() {
	assertFalse(28072==28072+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead45() {
	assertFalse(29587==29587+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead46() {
	assertFalse(31801==31801+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead47() {
	assertFalse(29819==29819+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead48() {
	assertFalse(9244==9244+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead49() {
	assertFalse(9621==9621+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead50() {
	assertFalse(22634==22634+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead51() {
	assertFalse(13893==13893+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead52() {
	assertFalse(29578==29578+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead53() {
	assertFalse(26506==26506+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead54() {
	assertFalse(2914==2914+1);
}
@Test
public void bigFalseTestStreamStructAsyncRead55() {
	assertFalse(4407==4407+1);
}
}
