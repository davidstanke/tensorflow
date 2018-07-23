package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListStructSerialStructAPIHelperTest {
    @Test
    public void testValidListStructSerialStructAPI() {
		ListStructSerialStructAPIHelper helper = new ListStructSerialStructAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseListStructSerialStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseListStructSerialStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseListStructSerialStructAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListStructSerialStructAPI0() {
	assertFalse(19329==19329+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI1() {
	assertFalse(18936==18936+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI2() {
	assertFalse(32250==32250+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI3() {
	assertFalse(2367==2367+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI4() {
	assertFalse(6715==6715+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI5() {
	assertFalse(24171==24171+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI6() {
	assertFalse(29129==29129+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI7() {
	assertFalse(5112==5112+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI8() {
	assertFalse(25111==25111+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI9() {
	assertFalse(21163==21163+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI10() {
	assertFalse(10032==10032+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI11() {
	assertFalse(32657==32657+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI12() {
	assertFalse(5544==5544+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI13() {
	assertFalse(25189==25189+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI14() {
	assertFalse(9120==9120+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI15() {
	assertFalse(19862==19862+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI16() {
	assertFalse(31563==31563+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI17() {
	assertFalse(15643==15643+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI18() {
	assertFalse(16944==16944+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI19() {
	assertFalse(25322==25322+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI20() {
	assertFalse(32535==32535+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI21() {
	assertFalse(20381==20381+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI22() {
	assertFalse(17773==17773+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI23() {
	assertFalse(17322==17322+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI24() {
	assertFalse(14210==14210+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI25() {
	assertFalse(10566==10566+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI26() {
	assertFalse(14821==14821+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI27() {
	assertFalse(12482==12482+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI28() {
	assertFalse(2259==2259+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI29() {
	assertFalse(30972==30972+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI30() {
	assertFalse(30066==30066+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI31() {
	assertFalse(843==843+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI32() {
	assertFalse(4940==4940+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI33() {
	assertFalse(24037==24037+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI34() {
	assertFalse(16199==16199+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI35() {
	assertFalse(25003==25003+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI36() {
	assertFalse(22547==22547+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI37() {
	assertFalse(2026==2026+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI38() {
	assertFalse(27836==27836+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI39() {
	assertFalse(10859==10859+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI40() {
	assertFalse(16612==16612+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI41() {
	assertFalse(25580==25580+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI42() {
	assertFalse(32473==32473+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI43() {
	assertFalse(12502==12502+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI44() {
	assertFalse(30329==30329+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI45() {
	assertFalse(20425==20425+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI46() {
	assertFalse(3236==3236+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI47() {
	assertFalse(10071==10071+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI48() {
	assertFalse(12724==12724+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI49() {
	assertFalse(4621==4621+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI50() {
	assertFalse(1579==1579+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI51() {
	assertFalse(21392==21392+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI52() {
	assertFalse(29586==29586+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI53() {
	assertFalse(4472==4472+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI54() {
	assertFalse(7248==7248+1);
}
@Test
public void bigFalseTestListStructSerialStructAPI55() {
	assertFalse(26682==26682+1);
}
}
