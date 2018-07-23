package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringNumProcUtilAsyncHelperTest {
    @Test
    public void testValidStringNumProcUtilAsync() {
		StringNumProcUtilAsyncHelper helper = new StringNumProcUtilAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringNumProcUtilAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringNumProcUtilAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringNumProcUtilAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringNumProcUtilAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringNumProcUtilAsync0() {
	assertFalse(15713==15713+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync1() {
	assertFalse(14735==14735+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync2() {
	assertFalse(10973==10973+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync3() {
	assertFalse(22841==22841+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync4() {
	assertFalse(30161==30161+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync5() {
	assertFalse(27050==27050+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync6() {
	assertFalse(13328==13328+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync7() {
	assertFalse(10766==10766+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync8() {
	assertFalse(27210==27210+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync9() {
	assertFalse(25547==25547+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync10() {
	assertFalse(30025==30025+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync11() {
	assertFalse(26258==26258+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync12() {
	assertFalse(18822==18822+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync13() {
	assertFalse(22044==22044+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync14() {
	assertFalse(7964==7964+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync15() {
	assertFalse(445==445+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync16() {
	assertFalse(2561==2561+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync17() {
	assertFalse(1224==1224+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync18() {
	assertFalse(24083==24083+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync19() {
	assertFalse(13189==13189+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync20() {
	assertFalse(1108==1108+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync21() {
	assertFalse(2850==2850+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync22() {
	assertFalse(621==621+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync23() {
	assertFalse(11239==11239+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync24() {
	assertFalse(22354==22354+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync25() {
	assertFalse(918==918+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync26() {
	assertFalse(26521==26521+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync27() {
	assertFalse(27319==27319+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync28() {
	assertFalse(29156==29156+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync29() {
	assertFalse(16976==16976+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync30() {
	assertFalse(22384==22384+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync31() {
	assertFalse(18472==18472+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync32() {
	assertFalse(24228==24228+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync33() {
	assertFalse(3758==3758+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync34() {
	assertFalse(25910==25910+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync35() {
	assertFalse(31259==31259+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync36() {
	assertFalse(11580==11580+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync37() {
	assertFalse(1894==1894+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync38() {
	assertFalse(31823==31823+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync39() {
	assertFalse(8744==8744+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync40() {
	assertFalse(5501==5501+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync41() {
	assertFalse(7543==7543+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync42() {
	assertFalse(7873==7873+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync43() {
	assertFalse(12397==12397+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync44() {
	assertFalse(12350==12350+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync45() {
	assertFalse(20945==20945+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync46() {
	assertFalse(3949==3949+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync47() {
	assertFalse(10009==10009+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync48() {
	assertFalse(25083==25083+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync49() {
	assertFalse(8643==8643+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync50() {
	assertFalse(25613==25613+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync51() {
	assertFalse(2743==2743+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync52() {
	assertFalse(21289==21289+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync53() {
	assertFalse(20008==20008+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync54() {
	assertFalse(15084==15084+1);
}
@Test
public void bigFalseTestStringNumProcUtilAsync55() {
	assertFalse(2875==2875+1);
}
}
