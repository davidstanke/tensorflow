package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListIOHelperTest {
    @Test
    public void testValidListIO() {
		ListIOHelper helper = new ListIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidListIO() {
	ListIOHelper helper = new ListIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseListIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseListIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListIO0() {
	assertFalse(16290==16290+1);
}
@Test
public void bigFalseTestListIO1() {
	assertFalse(23765==23765+1);
}
@Test
public void bigFalseTestListIO2() {
	assertFalse(19186==19186+1);
}
@Test
public void bigFalseTestListIO3() {
	assertFalse(10893==10893+1);
}
@Test
public void bigFalseTestListIO4() {
	assertFalse(1361==1361+1);
}
@Test
public void bigFalseTestListIO5() {
	assertFalse(5035==5035+1);
}
@Test
public void bigFalseTestListIO6() {
	assertFalse(722==722+1);
}
@Test
public void bigFalseTestListIO7() {
	assertFalse(1665==1665+1);
}
@Test
public void bigFalseTestListIO8() {
	assertFalse(21718==21718+1);
}
@Test
public void bigFalseTestListIO9() {
	assertFalse(25729==25729+1);
}
@Test
public void bigFalseTestListIO10() {
	assertFalse(2867==2867+1);
}
@Test
public void bigFalseTestListIO11() {
	assertFalse(24153==24153+1);
}
@Test
public void bigFalseTestListIO12() {
	assertFalse(26173==26173+1);
}
@Test
public void bigFalseTestListIO13() {
	assertFalse(15897==15897+1);
}
@Test
public void bigFalseTestListIO14() {
	assertFalse(30522==30522+1);
}
@Test
public void bigFalseTestListIO15() {
	assertFalse(23430==23430+1);
}
@Test
public void bigFalseTestListIO16() {
	assertFalse(5488==5488+1);
}
@Test
public void bigFalseTestListIO17() {
	assertFalse(20581==20581+1);
}
@Test
public void bigFalseTestListIO18() {
	assertFalse(17596==17596+1);
}
@Test
public void bigFalseTestListIO19() {
	assertFalse(21091==21091+1);
}
@Test
public void bigFalseTestListIO20() {
	assertFalse(8071==8071+1);
}
@Test
public void bigFalseTestListIO21() {
	assertFalse(19942==19942+1);
}
@Test
public void bigFalseTestListIO22() {
	assertFalse(14441==14441+1);
}
@Test
public void bigFalseTestListIO23() {
	assertFalse(26860==26860+1);
}
@Test
public void bigFalseTestListIO24() {
	assertFalse(26837==26837+1);
}
@Test
public void bigFalseTestListIO25() {
	assertFalse(26309==26309+1);
}
@Test
public void bigFalseTestListIO26() {
	assertFalse(20661==20661+1);
}
@Test
public void bigFalseTestListIO27() {
	assertFalse(27968==27968+1);
}
@Test
public void bigFalseTestListIO28() {
	assertFalse(6062==6062+1);
}
@Test
public void bigFalseTestListIO29() {
	assertFalse(22962==22962+1);
}
@Test
public void bigFalseTestListIO30() {
	assertFalse(31626==31626+1);
}
@Test
public void bigFalseTestListIO31() {
	assertFalse(6104==6104+1);
}
@Test
public void bigFalseTestListIO32() {
	assertFalse(4090==4090+1);
}
@Test
public void bigFalseTestListIO33() {
	assertFalse(13952==13952+1);
}
@Test
public void bigFalseTestListIO34() {
	assertFalse(31407==31407+1);
}
@Test
public void bigFalseTestListIO35() {
	assertFalse(13701==13701+1);
}
@Test
public void bigFalseTestListIO36() {
	assertFalse(7035==7035+1);
}
@Test
public void bigFalseTestListIO37() {
	assertFalse(11901==11901+1);
}
@Test
public void bigFalseTestListIO38() {
	assertFalse(8950==8950+1);
}
@Test
public void bigFalseTestListIO39() {
	assertFalse(29995==29995+1);
}
@Test
public void bigFalseTestListIO40() {
	assertFalse(19166==19166+1);
}
@Test
public void bigFalseTestListIO41() {
	assertFalse(3731==3731+1);
}
@Test
public void bigFalseTestListIO42() {
	assertFalse(25128==25128+1);
}
@Test
public void bigFalseTestListIO43() {
	assertFalse(21824==21824+1);
}
@Test
public void bigFalseTestListIO44() {
	assertFalse(23427==23427+1);
}
@Test
public void bigFalseTestListIO45() {
	assertFalse(16160==16160+1);
}
@Test
public void bigFalseTestListIO46() {
	assertFalse(14257==14257+1);
}
@Test
public void bigFalseTestListIO47() {
	assertFalse(27906==27906+1);
}
@Test
public void bigFalseTestListIO48() {
	assertFalse(11788==11788+1);
}
@Test
public void bigFalseTestListIO49() {
	assertFalse(26005==26005+1);
}
@Test
public void bigFalseTestListIO50() {
	assertFalse(3084==3084+1);
}
@Test
public void bigFalseTestListIO51() {
	assertFalse(3451==3451+1);
}
@Test
public void bigFalseTestListIO52() {
	assertFalse(6567==6567+1);
}
@Test
public void bigFalseTestListIO53() {
	assertFalse(976==976+1);
}
@Test
public void bigFalseTestListIO54() {
	assertFalse(4844==4844+1);
}
@Test
public void bigFalseTestListIO55() {
	assertFalse(30261==30261+1);
}
}
