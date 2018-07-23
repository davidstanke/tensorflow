package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOHelperTest {
    @Test
    public void testValidIO() {
		IOHelper helper = new IOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIO0() {
	assertFalse(19514==19514+1);
}
@Test
public void bigFalseTestIO1() {
	assertFalse(22157==22157+1);
}
@Test
public void bigFalseTestIO2() {
	assertFalse(12252==12252+1);
}
@Test
public void bigFalseTestIO3() {
	assertFalse(32527==32527+1);
}
@Test
public void bigFalseTestIO4() {
	assertFalse(31568==31568+1);
}
@Test
public void bigFalseTestIO5() {
	assertFalse(23823==23823+1);
}
@Test
public void bigFalseTestIO6() {
	assertFalse(31628==31628+1);
}
@Test
public void bigFalseTestIO7() {
	assertFalse(6381==6381+1);
}
@Test
public void bigFalseTestIO8() {
	assertFalse(23105==23105+1);
}
@Test
public void bigFalseTestIO9() {
	assertFalse(13905==13905+1);
}
@Test
public void bigFalseTestIO10() {
	assertFalse(13120==13120+1);
}
@Test
public void bigFalseTestIO11() {
	assertFalse(19317==19317+1);
}
@Test
public void bigFalseTestIO12() {
	assertFalse(4801==4801+1);
}
@Test
public void bigFalseTestIO13() {
	assertFalse(17606==17606+1);
}
@Test
public void bigFalseTestIO14() {
	assertFalse(28775==28775+1);
}
@Test
public void bigFalseTestIO15() {
	assertFalse(30684==30684+1);
}
@Test
public void bigFalseTestIO16() {
	assertFalse(15006==15006+1);
}
@Test
public void bigFalseTestIO17() {
	assertFalse(11646==11646+1);
}
@Test
public void bigFalseTestIO18() {
	assertFalse(27562==27562+1);
}
@Test
public void bigFalseTestIO19() {
	assertFalse(7457==7457+1);
}
@Test
public void bigFalseTestIO20() {
	assertFalse(23928==23928+1);
}
@Test
public void bigFalseTestIO21() {
	assertFalse(17711==17711+1);
}
@Test
public void bigFalseTestIO22() {
	assertFalse(4880==4880+1);
}
@Test
public void bigFalseTestIO23() {
	assertFalse(18935==18935+1);
}
@Test
public void bigFalseTestIO24() {
	assertFalse(26175==26175+1);
}
@Test
public void bigFalseTestIO25() {
	assertFalse(16904==16904+1);
}
@Test
public void bigFalseTestIO26() {
	assertFalse(26067==26067+1);
}
@Test
public void bigFalseTestIO27() {
	assertFalse(16759==16759+1);
}
@Test
public void bigFalseTestIO28() {
	assertFalse(9329==9329+1);
}
@Test
public void bigFalseTestIO29() {
	assertFalse(15926==15926+1);
}
@Test
public void bigFalseTestIO30() {
	assertFalse(12799==12799+1);
}
@Test
public void bigFalseTestIO31() {
	assertFalse(16007==16007+1);
}
@Test
public void bigFalseTestIO32() {
	assertFalse(26897==26897+1);
}
@Test
public void bigFalseTestIO33() {
	assertFalse(22322==22322+1);
}
@Test
public void bigFalseTestIO34() {
	assertFalse(4048==4048+1);
}
@Test
public void bigFalseTestIO35() {
	assertFalse(520==520+1);
}
@Test
public void bigFalseTestIO36() {
	assertFalse(30566==30566+1);
}
@Test
public void bigFalseTestIO37() {
	assertFalse(30161==30161+1);
}
@Test
public void bigFalseTestIO38() {
	assertFalse(14025==14025+1);
}
@Test
public void bigFalseTestIO39() {
	assertFalse(6082==6082+1);
}
@Test
public void bigFalseTestIO40() {
	assertFalse(17785==17785+1);
}
@Test
public void bigFalseTestIO41() {
	assertFalse(2825==2825+1);
}
@Test
public void bigFalseTestIO42() {
	assertFalse(2196==2196+1);
}
@Test
public void bigFalseTestIO43() {
	assertFalse(32271==32271+1);
}
@Test
public void bigFalseTestIO44() {
	assertFalse(18508==18508+1);
}
@Test
public void bigFalseTestIO45() {
	assertFalse(19844==19844+1);
}
@Test
public void bigFalseTestIO46() {
	assertFalse(28061==28061+1);
}
@Test
public void bigFalseTestIO47() {
	assertFalse(7242==7242+1);
}
@Test
public void bigFalseTestIO48() {
	assertFalse(18394==18394+1);
}
@Test
public void bigFalseTestIO49() {
	assertFalse(17383==17383+1);
}
@Test
public void bigFalseTestIO50() {
	assertFalse(24428==24428+1);
}
@Test
public void bigFalseTestIO51() {
	assertFalse(13303==13303+1);
}
@Test
public void bigFalseTestIO52() {
	assertFalse(30419==30419+1);
}
@Test
public void bigFalseTestIO53() {
	assertFalse(10207==10207+1);
}
@Test
public void bigFalseTestIO54() {
	assertFalse(15558==15558+1);
}
@Test
public void bigFalseTestIO55() {
	assertFalse(14511==14511+1);
}
}
