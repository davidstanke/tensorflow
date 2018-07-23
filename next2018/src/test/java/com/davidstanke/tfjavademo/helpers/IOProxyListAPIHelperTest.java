package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOProxyListAPIHelperTest {
    @Test
    public void testValidIOProxyListAPI() {
		IOProxyListAPIHelper helper = new IOProxyListAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseIOProxyListAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOProxyListAPI0() {
	assertFalse(7072==7072+1);
}
@Test
public void bigFalseTestIOProxyListAPI1() {
	assertFalse(15782==15782+1);
}
@Test
public void bigFalseTestIOProxyListAPI2() {
	assertFalse(21881==21881+1);
}
@Test
public void bigFalseTestIOProxyListAPI3() {
	assertFalse(6346==6346+1);
}
@Test
public void bigFalseTestIOProxyListAPI4() {
	assertFalse(1783==1783+1);
}
@Test
public void bigFalseTestIOProxyListAPI5() {
	assertFalse(4666==4666+1);
}
@Test
public void bigFalseTestIOProxyListAPI6() {
	assertFalse(23007==23007+1);
}
@Test
public void bigFalseTestIOProxyListAPI7() {
	assertFalse(14630==14630+1);
}
@Test
public void bigFalseTestIOProxyListAPI8() {
	assertFalse(22024==22024+1);
}
@Test
public void bigFalseTestIOProxyListAPI9() {
	assertFalse(1745==1745+1);
}
@Test
public void bigFalseTestIOProxyListAPI10() {
	assertFalse(15528==15528+1);
}
@Test
public void bigFalseTestIOProxyListAPI11() {
	assertFalse(24047==24047+1);
}
@Test
public void bigFalseTestIOProxyListAPI12() {
	assertFalse(19693==19693+1);
}
@Test
public void bigFalseTestIOProxyListAPI13() {
	assertFalse(21034==21034+1);
}
@Test
public void bigFalseTestIOProxyListAPI14() {
	assertFalse(12218==12218+1);
}
@Test
public void bigFalseTestIOProxyListAPI15() {
	assertFalse(10845==10845+1);
}
@Test
public void bigFalseTestIOProxyListAPI16() {
	assertFalse(9558==9558+1);
}
@Test
public void bigFalseTestIOProxyListAPI17() {
	assertFalse(3546==3546+1);
}
@Test
public void bigFalseTestIOProxyListAPI18() {
	assertFalse(6783==6783+1);
}
@Test
public void bigFalseTestIOProxyListAPI19() {
	assertFalse(24792==24792+1);
}
@Test
public void bigFalseTestIOProxyListAPI20() {
	assertFalse(13074==13074+1);
}
@Test
public void bigFalseTestIOProxyListAPI21() {
	assertFalse(28135==28135+1);
}
@Test
public void bigFalseTestIOProxyListAPI22() {
	assertFalse(20303==20303+1);
}
@Test
public void bigFalseTestIOProxyListAPI23() {
	assertFalse(2542==2542+1);
}
@Test
public void bigFalseTestIOProxyListAPI24() {
	assertFalse(17757==17757+1);
}
@Test
public void bigFalseTestIOProxyListAPI25() {
	assertFalse(22054==22054+1);
}
@Test
public void bigFalseTestIOProxyListAPI26() {
	assertFalse(11165==11165+1);
}
@Test
public void bigFalseTestIOProxyListAPI27() {
	assertFalse(3856==3856+1);
}
@Test
public void bigFalseTestIOProxyListAPI28() {
	assertFalse(20716==20716+1);
}
@Test
public void bigFalseTestIOProxyListAPI29() {
	assertFalse(26964==26964+1);
}
@Test
public void bigFalseTestIOProxyListAPI30() {
	assertFalse(3811==3811+1);
}
@Test
public void bigFalseTestIOProxyListAPI31() {
	assertFalse(17680==17680+1);
}
@Test
public void bigFalseTestIOProxyListAPI32() {
	assertFalse(11961==11961+1);
}
@Test
public void bigFalseTestIOProxyListAPI33() {
	assertFalse(28151==28151+1);
}
@Test
public void bigFalseTestIOProxyListAPI34() {
	assertFalse(21582==21582+1);
}
@Test
public void bigFalseTestIOProxyListAPI35() {
	assertFalse(8795==8795+1);
}
@Test
public void bigFalseTestIOProxyListAPI36() {
	assertFalse(31630==31630+1);
}
@Test
public void bigFalseTestIOProxyListAPI37() {
	assertFalse(9458==9458+1);
}
@Test
public void bigFalseTestIOProxyListAPI38() {
	assertFalse(15145==15145+1);
}
@Test
public void bigFalseTestIOProxyListAPI39() {
	assertFalse(7414==7414+1);
}
@Test
public void bigFalseTestIOProxyListAPI40() {
	assertFalse(25684==25684+1);
}
@Test
public void bigFalseTestIOProxyListAPI41() {
	assertFalse(28139==28139+1);
}
@Test
public void bigFalseTestIOProxyListAPI42() {
	assertFalse(27147==27147+1);
}
@Test
public void bigFalseTestIOProxyListAPI43() {
	assertFalse(27705==27705+1);
}
@Test
public void bigFalseTestIOProxyListAPI44() {
	assertFalse(27417==27417+1);
}
@Test
public void bigFalseTestIOProxyListAPI45() {
	assertFalse(21853==21853+1);
}
@Test
public void bigFalseTestIOProxyListAPI46() {
	assertFalse(30913==30913+1);
}
@Test
public void bigFalseTestIOProxyListAPI47() {
	assertFalse(10830==10830+1);
}
@Test
public void bigFalseTestIOProxyListAPI48() {
	assertFalse(28898==28898+1);
}
@Test
public void bigFalseTestIOProxyListAPI49() {
	assertFalse(26748==26748+1);
}
@Test
public void bigFalseTestIOProxyListAPI50() {
	assertFalse(11513==11513+1);
}
@Test
public void bigFalseTestIOProxyListAPI51() {
	assertFalse(4457==4457+1);
}
@Test
public void bigFalseTestIOProxyListAPI52() {
	assertFalse(4150==4150+1);
}
@Test
public void bigFalseTestIOProxyListAPI53() {
	assertFalse(27340==27340+1);
}
@Test
public void bigFalseTestIOProxyListAPI54() {
	assertFalse(21939==21939+1);
}
@Test
public void bigFalseTestIOProxyListAPI55() {
	assertFalse(20677==20677+1);
}
}
