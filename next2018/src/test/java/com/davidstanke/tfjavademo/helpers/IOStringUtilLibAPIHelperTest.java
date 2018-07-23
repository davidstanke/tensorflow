package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOStringUtilLibAPIHelperTest {
    @Test
    public void testValidIOStringUtilLibAPI() {
		IOStringUtilLibAPIHelper helper = new IOStringUtilLibAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIOStringUtilLibAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOStringUtilLibAPI0() {
	assertFalse(22822==22822+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI1() {
	assertFalse(8829==8829+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI2() {
	assertFalse(10045==10045+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI3() {
	assertFalse(22176==22176+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI4() {
	assertFalse(799==799+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI5() {
	assertFalse(12171==12171+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI6() {
	assertFalse(4615==4615+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI7() {
	assertFalse(10963==10963+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI8() {
	assertFalse(2830==2830+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI9() {
	assertFalse(11208==11208+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI10() {
	assertFalse(13791==13791+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI11() {
	assertFalse(7016==7016+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI12() {
	assertFalse(8288==8288+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI13() {
	assertFalse(9429==9429+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI14() {
	assertFalse(18684==18684+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI15() {
	assertFalse(6182==6182+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI16() {
	assertFalse(28883==28883+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI17() {
	assertFalse(8173==8173+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI18() {
	assertFalse(5368==5368+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI19() {
	assertFalse(14024==14024+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI20() {
	assertFalse(8076==8076+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI21() {
	assertFalse(22738==22738+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI22() {
	assertFalse(10573==10573+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI23() {
	assertFalse(31184==31184+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI24() {
	assertFalse(4599==4599+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI25() {
	assertFalse(888==888+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI26() {
	assertFalse(14735==14735+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI27() {
	assertFalse(14354==14354+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI28() {
	assertFalse(11875==11875+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI29() {
	assertFalse(31858==31858+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI30() {
	assertFalse(9068==9068+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI31() {
	assertFalse(28923==28923+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI32() {
	assertFalse(26713==26713+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI33() {
	assertFalse(5152==5152+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI34() {
	assertFalse(22627==22627+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI35() {
	assertFalse(6566==6566+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI36() {
	assertFalse(14015==14015+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI37() {
	assertFalse(24726==24726+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI38() {
	assertFalse(10055==10055+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI39() {
	assertFalse(11933==11933+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI40() {
	assertFalse(20401==20401+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI41() {
	assertFalse(16971==16971+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI42() {
	assertFalse(8563==8563+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI43() {
	assertFalse(5743==5743+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI44() {
	assertFalse(17947==17947+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI45() {
	assertFalse(1926==1926+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI46() {
	assertFalse(6090==6090+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI47() {
	assertFalse(8438==8438+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI48() {
	assertFalse(25878==25878+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI49() {
	assertFalse(23176==23176+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI50() {
	assertFalse(27509==27509+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI51() {
	assertFalse(12133==12133+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI52() {
	assertFalse(25864==25864+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI53() {
	assertFalse(26234==26234+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI54() {
	assertFalse(11868==11868+1);
}
@Test
public void bigFalseTestIOStringUtilLibAPI55() {
	assertFalse(20756==20756+1);
}
}
