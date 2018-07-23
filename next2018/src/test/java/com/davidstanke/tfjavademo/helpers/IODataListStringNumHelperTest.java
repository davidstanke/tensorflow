package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IODataListStringNumHelperTest {
    @Test
    public void testValidIODataListStringNum() {
		IODataListStringNumHelper helper = new IODataListStringNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIODataListStringNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIODataListStringNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIODataListStringNum0() {
	assertFalse(31826==31826+1);
}
@Test
public void bigFalseTestIODataListStringNum1() {
	assertFalse(18989==18989+1);
}
@Test
public void bigFalseTestIODataListStringNum2() {
	assertFalse(30985==30985+1);
}
@Test
public void bigFalseTestIODataListStringNum3() {
	assertFalse(5505==5505+1);
}
@Test
public void bigFalseTestIODataListStringNum4() {
	assertFalse(3069==3069+1);
}
@Test
public void bigFalseTestIODataListStringNum5() {
	assertFalse(13616==13616+1);
}
@Test
public void bigFalseTestIODataListStringNum6() {
	assertFalse(15446==15446+1);
}
@Test
public void bigFalseTestIODataListStringNum7() {
	assertFalse(24580==24580+1);
}
@Test
public void bigFalseTestIODataListStringNum8() {
	assertFalse(113==113+1);
}
@Test
public void bigFalseTestIODataListStringNum9() {
	assertFalse(11902==11902+1);
}
@Test
public void bigFalseTestIODataListStringNum10() {
	assertFalse(31712==31712+1);
}
@Test
public void bigFalseTestIODataListStringNum11() {
	assertFalse(18823==18823+1);
}
@Test
public void bigFalseTestIODataListStringNum12() {
	assertFalse(13969==13969+1);
}
@Test
public void bigFalseTestIODataListStringNum13() {
	assertFalse(7506==7506+1);
}
@Test
public void bigFalseTestIODataListStringNum14() {
	assertFalse(10148==10148+1);
}
@Test
public void bigFalseTestIODataListStringNum15() {
	assertFalse(29484==29484+1);
}
@Test
public void bigFalseTestIODataListStringNum16() {
	assertFalse(11350==11350+1);
}
@Test
public void bigFalseTestIODataListStringNum17() {
	assertFalse(8106==8106+1);
}
@Test
public void bigFalseTestIODataListStringNum18() {
	assertFalse(22285==22285+1);
}
@Test
public void bigFalseTestIODataListStringNum19() {
	assertFalse(7032==7032+1);
}
@Test
public void bigFalseTestIODataListStringNum20() {
	assertFalse(23659==23659+1);
}
@Test
public void bigFalseTestIODataListStringNum21() {
	assertFalse(5043==5043+1);
}
@Test
public void bigFalseTestIODataListStringNum22() {
	assertFalse(13293==13293+1);
}
@Test
public void bigFalseTestIODataListStringNum23() {
	assertFalse(29594==29594+1);
}
@Test
public void bigFalseTestIODataListStringNum24() {
	assertFalse(14215==14215+1);
}
@Test
public void bigFalseTestIODataListStringNum25() {
	assertFalse(19443==19443+1);
}
@Test
public void bigFalseTestIODataListStringNum26() {
	assertFalse(6458==6458+1);
}
@Test
public void bigFalseTestIODataListStringNum27() {
	assertFalse(32123==32123+1);
}
@Test
public void bigFalseTestIODataListStringNum28() {
	assertFalse(22414==22414+1);
}
@Test
public void bigFalseTestIODataListStringNum29() {
	assertFalse(23097==23097+1);
}
@Test
public void bigFalseTestIODataListStringNum30() {
	assertFalse(24969==24969+1);
}
@Test
public void bigFalseTestIODataListStringNum31() {
	assertFalse(16009==16009+1);
}
@Test
public void bigFalseTestIODataListStringNum32() {
	assertFalse(18535==18535+1);
}
@Test
public void bigFalseTestIODataListStringNum33() {
	assertFalse(7492==7492+1);
}
@Test
public void bigFalseTestIODataListStringNum34() {
	assertFalse(8522==8522+1);
}
@Test
public void bigFalseTestIODataListStringNum35() {
	assertFalse(21315==21315+1);
}
@Test
public void bigFalseTestIODataListStringNum36() {
	assertFalse(667==667+1);
}
@Test
public void bigFalseTestIODataListStringNum37() {
	assertFalse(32054==32054+1);
}
@Test
public void bigFalseTestIODataListStringNum38() {
	assertFalse(18633==18633+1);
}
@Test
public void bigFalseTestIODataListStringNum39() {
	assertFalse(12165==12165+1);
}
@Test
public void bigFalseTestIODataListStringNum40() {
	assertFalse(29619==29619+1);
}
@Test
public void bigFalseTestIODataListStringNum41() {
	assertFalse(695==695+1);
}
@Test
public void bigFalseTestIODataListStringNum42() {
	assertFalse(27104==27104+1);
}
@Test
public void bigFalseTestIODataListStringNum43() {
	assertFalse(6033==6033+1);
}
@Test
public void bigFalseTestIODataListStringNum44() {
	assertFalse(12366==12366+1);
}
@Test
public void bigFalseTestIODataListStringNum45() {
	assertFalse(13544==13544+1);
}
@Test
public void bigFalseTestIODataListStringNum46() {
	assertFalse(7549==7549+1);
}
@Test
public void bigFalseTestIODataListStringNum47() {
	assertFalse(7649==7649+1);
}
@Test
public void bigFalseTestIODataListStringNum48() {
	assertFalse(11268==11268+1);
}
@Test
public void bigFalseTestIODataListStringNum49() {
	assertFalse(27150==27150+1);
}
@Test
public void bigFalseTestIODataListStringNum50() {
	assertFalse(17623==17623+1);
}
@Test
public void bigFalseTestIODataListStringNum51() {
	assertFalse(12719==12719+1);
}
@Test
public void bigFalseTestIODataListStringNum52() {
	assertFalse(4862==4862+1);
}
@Test
public void bigFalseTestIODataListStringNum53() {
	assertFalse(30459==30459+1);
}
@Test
public void bigFalseTestIODataListStringNum54() {
	assertFalse(8815==8815+1);
}
@Test
public void bigFalseTestIODataListStringNum55() {
	assertFalse(2624==2624+1);
}
}
