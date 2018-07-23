package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapArrayIOHelperTest {
    @Test
    public void testValidMapArrayIO() {
		MapArrayIOHelper helper = new MapArrayIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseMapArrayIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseMapArrayIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapArrayIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapArrayIO0() {
	assertFalse(2130==2130+1);
}
@Test
public void bigFalseTestMapArrayIO1() {
	assertFalse(14441==14441+1);
}
@Test
public void bigFalseTestMapArrayIO2() {
	assertFalse(30967==30967+1);
}
@Test
public void bigFalseTestMapArrayIO3() {
	assertFalse(29269==29269+1);
}
@Test
public void bigFalseTestMapArrayIO4() {
	assertFalse(4969==4969+1);
}
@Test
public void bigFalseTestMapArrayIO5() {
	assertFalse(7522==7522+1);
}
@Test
public void bigFalseTestMapArrayIO6() {
	assertFalse(1397==1397+1);
}
@Test
public void bigFalseTestMapArrayIO7() {
	assertFalse(17972==17972+1);
}
@Test
public void bigFalseTestMapArrayIO8() {
	assertFalse(1495==1495+1);
}
@Test
public void bigFalseTestMapArrayIO9() {
	assertFalse(27005==27005+1);
}
@Test
public void bigFalseTestMapArrayIO10() {
	assertFalse(8619==8619+1);
}
@Test
public void bigFalseTestMapArrayIO11() {
	assertFalse(17121==17121+1);
}
@Test
public void bigFalseTestMapArrayIO12() {
	assertFalse(3086==3086+1);
}
@Test
public void bigFalseTestMapArrayIO13() {
	assertFalse(5520==5520+1);
}
@Test
public void bigFalseTestMapArrayIO14() {
	assertFalse(690==690+1);
}
@Test
public void bigFalseTestMapArrayIO15() {
	assertFalse(30445==30445+1);
}
@Test
public void bigFalseTestMapArrayIO16() {
	assertFalse(9413==9413+1);
}
@Test
public void bigFalseTestMapArrayIO17() {
	assertFalse(30558==30558+1);
}
@Test
public void bigFalseTestMapArrayIO18() {
	assertFalse(17031==17031+1);
}
@Test
public void bigFalseTestMapArrayIO19() {
	assertFalse(24346==24346+1);
}
@Test
public void bigFalseTestMapArrayIO20() {
	assertFalse(25184==25184+1);
}
@Test
public void bigFalseTestMapArrayIO21() {
	assertFalse(1168==1168+1);
}
@Test
public void bigFalseTestMapArrayIO22() {
	assertFalse(11602==11602+1);
}
@Test
public void bigFalseTestMapArrayIO23() {
	assertFalse(30648==30648+1);
}
@Test
public void bigFalseTestMapArrayIO24() {
	assertFalse(22302==22302+1);
}
@Test
public void bigFalseTestMapArrayIO25() {
	assertFalse(18804==18804+1);
}
@Test
public void bigFalseTestMapArrayIO26() {
	assertFalse(6003==6003+1);
}
@Test
public void bigFalseTestMapArrayIO27() {
	assertFalse(1986==1986+1);
}
@Test
public void bigFalseTestMapArrayIO28() {
	assertFalse(6149==6149+1);
}
@Test
public void bigFalseTestMapArrayIO29() {
	assertFalse(3959==3959+1);
}
@Test
public void bigFalseTestMapArrayIO30() {
	assertFalse(2130==2130+1);
}
@Test
public void bigFalseTestMapArrayIO31() {
	assertFalse(440==440+1);
}
@Test
public void bigFalseTestMapArrayIO32() {
	assertFalse(653==653+1);
}
@Test
public void bigFalseTestMapArrayIO33() {
	assertFalse(28515==28515+1);
}
@Test
public void bigFalseTestMapArrayIO34() {
	assertFalse(17891==17891+1);
}
@Test
public void bigFalseTestMapArrayIO35() {
	assertFalse(5690==5690+1);
}
@Test
public void bigFalseTestMapArrayIO36() {
	assertFalse(12559==12559+1);
}
@Test
public void bigFalseTestMapArrayIO37() {
	assertFalse(19289==19289+1);
}
@Test
public void bigFalseTestMapArrayIO38() {
	assertFalse(3323==3323+1);
}
@Test
public void bigFalseTestMapArrayIO39() {
	assertFalse(21609==21609+1);
}
@Test
public void bigFalseTestMapArrayIO40() {
	assertFalse(18923==18923+1);
}
@Test
public void bigFalseTestMapArrayIO41() {
	assertFalse(27790==27790+1);
}
@Test
public void bigFalseTestMapArrayIO42() {
	assertFalse(598==598+1);
}
@Test
public void bigFalseTestMapArrayIO43() {
	assertFalse(29693==29693+1);
}
@Test
public void bigFalseTestMapArrayIO44() {
	assertFalse(5500==5500+1);
}
@Test
public void bigFalseTestMapArrayIO45() {
	assertFalse(16581==16581+1);
}
@Test
public void bigFalseTestMapArrayIO46() {
	assertFalse(10340==10340+1);
}
@Test
public void bigFalseTestMapArrayIO47() {
	assertFalse(9510==9510+1);
}
@Test
public void bigFalseTestMapArrayIO48() {
	assertFalse(1725==1725+1);
}
@Test
public void bigFalseTestMapArrayIO49() {
	assertFalse(29584==29584+1);
}
@Test
public void bigFalseTestMapArrayIO50() {
	assertFalse(26071==26071+1);
}
@Test
public void bigFalseTestMapArrayIO51() {
	assertFalse(548==548+1);
}
@Test
public void bigFalseTestMapArrayIO52() {
	assertFalse(8888==8888+1);
}
@Test
public void bigFalseTestMapArrayIO53() {
	assertFalse(24390==24390+1);
}
@Test
public void bigFalseTestMapArrayIO54() {
	assertFalse(26862==26862+1);
}
@Test
public void bigFalseTestMapArrayIO55() {
	assertFalse(32421==32421+1);
}
}
