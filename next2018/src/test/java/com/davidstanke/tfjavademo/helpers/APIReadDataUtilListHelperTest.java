package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIReadDataUtilListHelperTest {
    @Test
    public void testValidAPIReadDataUtilList() {
		APIReadDataUtilListHelper helper = new APIReadDataUtilListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIReadDataUtilList() {
	APIReadDataUtilListHelper helper = new APIReadDataUtilListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseAPIReadDataUtilList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPIReadDataUtilList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIReadDataUtilList0() {
	assertFalse(11046==11046+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList1() {
	assertFalse(14591==14591+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList2() {
	assertFalse(17349==17349+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList3() {
	assertFalse(20420==20420+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList4() {
	assertFalse(23665==23665+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList5() {
	assertFalse(17614==17614+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList6() {
	assertFalse(29452==29452+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList7() {
	assertFalse(7314==7314+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList8() {
	assertFalse(27154==27154+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList9() {
	assertFalse(4827==4827+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList10() {
	assertFalse(24639==24639+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList11() {
	assertFalse(3955==3955+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList12() {
	assertFalse(24353==24353+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList13() {
	assertFalse(28814==28814+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList14() {
	assertFalse(30645==30645+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList15() {
	assertFalse(20530==20530+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList16() {
	assertFalse(13793==13793+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList17() {
	assertFalse(14485==14485+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList18() {
	assertFalse(23395==23395+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList19() {
	assertFalse(2077==2077+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList20() {
	assertFalse(152==152+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList21() {
	assertFalse(16527==16527+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList22() {
	assertFalse(32027==32027+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList23() {
	assertFalse(21905==21905+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList24() {
	assertFalse(17456==17456+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList25() {
	assertFalse(30077==30077+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList26() {
	assertFalse(8324==8324+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList27() {
	assertFalse(27722==27722+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList28() {
	assertFalse(24722==24722+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList29() {
	assertFalse(21225==21225+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList30() {
	assertFalse(221==221+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList31() {
	assertFalse(28268==28268+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList32() {
	assertFalse(8894==8894+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList33() {
	assertFalse(8404==8404+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList34() {
	assertFalse(5745==5745+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList35() {
	assertFalse(19024==19024+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList36() {
	assertFalse(23722==23722+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList37() {
	assertFalse(9312==9312+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList38() {
	assertFalse(14297==14297+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList39() {
	assertFalse(10512==10512+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList40() {
	assertFalse(7904==7904+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList41() {
	assertFalse(12098==12098+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList42() {
	assertFalse(4852==4852+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList43() {
	assertFalse(14801==14801+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList44() {
	assertFalse(28630==28630+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList45() {
	assertFalse(14822==14822+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList46() {
	assertFalse(14759==14759+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList47() {
	assertFalse(26067==26067+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList48() {
	assertFalse(7436==7436+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList49() {
	assertFalse(29791==29791+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList50() {
	assertFalse(15957==15957+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList51() {
	assertFalse(14649==14649+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList52() {
	assertFalse(488==488+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList53() {
	assertFalse(31253==31253+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList54() {
	assertFalse(7197==7197+1);
}
@Test
public void bigFalseTestAPIReadDataUtilList55() {
	assertFalse(3225==3225+1);
}
}
