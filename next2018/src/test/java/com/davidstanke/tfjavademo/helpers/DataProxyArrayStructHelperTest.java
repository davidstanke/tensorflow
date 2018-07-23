package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataProxyArrayStructHelperTest {
    @Test
    public void testValidDataProxyArrayStruct() {
		DataProxyArrayStructHelper helper = new DataProxyArrayStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseDataProxyArrayStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataProxyArrayStruct0() {
	assertFalse(4957==4957+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct1() {
	assertFalse(5193==5193+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct2() {
	assertFalse(5640==5640+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct3() {
	assertFalse(15088==15088+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct4() {
	assertFalse(799==799+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct5() {
	assertFalse(31902==31902+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct6() {
	assertFalse(22035==22035+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct7() {
	assertFalse(774==774+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct8() {
	assertFalse(31285==31285+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct9() {
	assertFalse(3787==3787+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct10() {
	assertFalse(14693==14693+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct11() {
	assertFalse(17714==17714+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct12() {
	assertFalse(19822==19822+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct13() {
	assertFalse(26422==26422+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct14() {
	assertFalse(13370==13370+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct15() {
	assertFalse(14819==14819+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct16() {
	assertFalse(11736==11736+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct17() {
	assertFalse(1919==1919+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct18() {
	assertFalse(20493==20493+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct19() {
	assertFalse(9960==9960+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct20() {
	assertFalse(3562==3562+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct21() {
	assertFalse(21049==21049+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct22() {
	assertFalse(8862==8862+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct23() {
	assertFalse(14216==14216+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct24() {
	assertFalse(11636==11636+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct25() {
	assertFalse(1637==1637+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct26() {
	assertFalse(10693==10693+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct27() {
	assertFalse(14943==14943+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct28() {
	assertFalse(30791==30791+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct29() {
	assertFalse(30386==30386+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct30() {
	assertFalse(6137==6137+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct31() {
	assertFalse(24827==24827+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct32() {
	assertFalse(9124==9124+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct33() {
	assertFalse(30839==30839+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct34() {
	assertFalse(23967==23967+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct35() {
	assertFalse(23866==23866+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct36() {
	assertFalse(13925==13925+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct37() {
	assertFalse(18028==18028+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct38() {
	assertFalse(31508==31508+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct39() {
	assertFalse(30817==30817+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct40() {
	assertFalse(26605==26605+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct41() {
	assertFalse(21292==21292+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct42() {
	assertFalse(26489==26489+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct43() {
	assertFalse(32765==32765+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct44() {
	assertFalse(465==465+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct45() {
	assertFalse(18283==18283+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct46() {
	assertFalse(6209==6209+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct47() {
	assertFalse(9338==9338+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct48() {
	assertFalse(12355==12355+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct49() {
	assertFalse(10231==10231+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct50() {
	assertFalse(30076==30076+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct51() {
	assertFalse(9604==9604+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct52() {
	assertFalse(27970==27970+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct53() {
	assertFalse(24432==24432+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct54() {
	assertFalse(18145==18145+1);
}
@Test
public void bigFalseTestDataProxyArrayStruct55() {
	assertFalse(26657==26657+1);
}
}
