package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIDataArrayStringStructHelperTest {
    @Test
    public void testValidAPIDataArrayStringStruct() {
		APIDataArrayStringStructHelper helper = new APIDataArrayStringStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIDataArrayStringStruct() {
	APIDataArrayStringStructHelper helper = new APIDataArrayStringStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPIDataArrayStringStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIDataArrayStringStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct0() {
	assertFalse(15365==15365+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct1() {
	assertFalse(26722==26722+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct2() {
	assertFalse(17515==17515+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct3() {
	assertFalse(9101==9101+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct4() {
	assertFalse(4522==4522+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct5() {
	assertFalse(31799==31799+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct6() {
	assertFalse(28060==28060+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct7() {
	assertFalse(25290==25290+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct8() {
	assertFalse(19059==19059+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct9() {
	assertFalse(23207==23207+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct10() {
	assertFalse(2304==2304+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct11() {
	assertFalse(10710==10710+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct12() {
	assertFalse(32201==32201+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct13() {
	assertFalse(11198==11198+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct14() {
	assertFalse(516==516+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct15() {
	assertFalse(14279==14279+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct16() {
	assertFalse(27806==27806+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct17() {
	assertFalse(21604==21604+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct18() {
	assertFalse(23513==23513+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct19() {
	assertFalse(23801==23801+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct20() {
	assertFalse(29464==29464+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct21() {
	assertFalse(17566==17566+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct22() {
	assertFalse(18691==18691+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct23() {
	assertFalse(10666==10666+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct24() {
	assertFalse(26874==26874+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct25() {
	assertFalse(28042==28042+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct26() {
	assertFalse(12191==12191+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct27() {
	assertFalse(27221==27221+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct28() {
	assertFalse(7378==7378+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct29() {
	assertFalse(6937==6937+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct30() {
	assertFalse(9847==9847+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct31() {
	assertFalse(3536==3536+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct32() {
	assertFalse(21989==21989+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct33() {
	assertFalse(11658==11658+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct34() {
	assertFalse(14023==14023+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct35() {
	assertFalse(20772==20772+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct36() {
	assertFalse(2266==2266+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct37() {
	assertFalse(28330==28330+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct38() {
	assertFalse(28364==28364+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct39() {
	assertFalse(19760==19760+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct40() {
	assertFalse(11049==11049+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct41() {
	assertFalse(32461==32461+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct42() {
	assertFalse(4370==4370+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct43() {
	assertFalse(16892==16892+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct44() {
	assertFalse(20801==20801+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct45() {
	assertFalse(5514==5514+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct46() {
	assertFalse(27771==27771+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct47() {
	assertFalse(15326==15326+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct48() {
	assertFalse(892==892+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct49() {
	assertFalse(4666==4666+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct50() {
	assertFalse(10510==10510+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct51() {
	assertFalse(28239==28239+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct52() {
	assertFalse(30147==30147+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct53() {
	assertFalse(6192==6192+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct54() {
	assertFalse(5509==5509+1);
}
@Test
public void bigFalseTestAPIDataArrayStringStruct55() {
	assertFalse(24714==24714+1);
}
}
