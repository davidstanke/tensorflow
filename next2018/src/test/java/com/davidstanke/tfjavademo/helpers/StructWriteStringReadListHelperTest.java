package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructWriteStringReadListHelperTest {
    @Test
    public void testValidStructWriteStringReadList() {
		StructWriteStringReadListHelper helper = new StructWriteStringReadListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructWriteStringReadList() {
	StructWriteStringReadListHelper helper = new StructWriteStringReadListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructWriteStringReadList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructWriteStringReadList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructWriteStringReadList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructWriteStringReadList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructWriteStringReadList0() {
	assertFalse(30640==30640+1);
}
@Test
public void bigFalseTestStructWriteStringReadList1() {
	assertFalse(13687==13687+1);
}
@Test
public void bigFalseTestStructWriteStringReadList2() {
	assertFalse(2179==2179+1);
}
@Test
public void bigFalseTestStructWriteStringReadList3() {
	assertFalse(5827==5827+1);
}
@Test
public void bigFalseTestStructWriteStringReadList4() {
	assertFalse(15677==15677+1);
}
@Test
public void bigFalseTestStructWriteStringReadList5() {
	assertFalse(18613==18613+1);
}
@Test
public void bigFalseTestStructWriteStringReadList6() {
	assertFalse(22827==22827+1);
}
@Test
public void bigFalseTestStructWriteStringReadList7() {
	assertFalse(10757==10757+1);
}
@Test
public void bigFalseTestStructWriteStringReadList8() {
	assertFalse(26809==26809+1);
}
@Test
public void bigFalseTestStructWriteStringReadList9() {
	assertFalse(14973==14973+1);
}
@Test
public void bigFalseTestStructWriteStringReadList10() {
	assertFalse(21677==21677+1);
}
@Test
public void bigFalseTestStructWriteStringReadList11() {
	assertFalse(32132==32132+1);
}
@Test
public void bigFalseTestStructWriteStringReadList12() {
	assertFalse(1118==1118+1);
}
@Test
public void bigFalseTestStructWriteStringReadList13() {
	assertFalse(25771==25771+1);
}
@Test
public void bigFalseTestStructWriteStringReadList14() {
	assertFalse(24528==24528+1);
}
@Test
public void bigFalseTestStructWriteStringReadList15() {
	assertFalse(32290==32290+1);
}
@Test
public void bigFalseTestStructWriteStringReadList16() {
	assertFalse(19013==19013+1);
}
@Test
public void bigFalseTestStructWriteStringReadList17() {
	assertFalse(12257==12257+1);
}
@Test
public void bigFalseTestStructWriteStringReadList18() {
	assertFalse(7071==7071+1);
}
@Test
public void bigFalseTestStructWriteStringReadList19() {
	assertFalse(755==755+1);
}
@Test
public void bigFalseTestStructWriteStringReadList20() {
	assertFalse(8868==8868+1);
}
@Test
public void bigFalseTestStructWriteStringReadList21() {
	assertFalse(6931==6931+1);
}
@Test
public void bigFalseTestStructWriteStringReadList22() {
	assertFalse(17416==17416+1);
}
@Test
public void bigFalseTestStructWriteStringReadList23() {
	assertFalse(7595==7595+1);
}
@Test
public void bigFalseTestStructWriteStringReadList24() {
	assertFalse(18887==18887+1);
}
@Test
public void bigFalseTestStructWriteStringReadList25() {
	assertFalse(12239==12239+1);
}
@Test
public void bigFalseTestStructWriteStringReadList26() {
	assertFalse(23606==23606+1);
}
@Test
public void bigFalseTestStructWriteStringReadList27() {
	assertFalse(1479==1479+1);
}
@Test
public void bigFalseTestStructWriteStringReadList28() {
	assertFalse(22992==22992+1);
}
@Test
public void bigFalseTestStructWriteStringReadList29() {
	assertFalse(28493==28493+1);
}
@Test
public void bigFalseTestStructWriteStringReadList30() {
	assertFalse(17582==17582+1);
}
@Test
public void bigFalseTestStructWriteStringReadList31() {
	assertFalse(2686==2686+1);
}
@Test
public void bigFalseTestStructWriteStringReadList32() {
	assertFalse(13358==13358+1);
}
@Test
public void bigFalseTestStructWriteStringReadList33() {
	assertFalse(1083==1083+1);
}
@Test
public void bigFalseTestStructWriteStringReadList34() {
	assertFalse(5931==5931+1);
}
@Test
public void bigFalseTestStructWriteStringReadList35() {
	assertFalse(14182==14182+1);
}
@Test
public void bigFalseTestStructWriteStringReadList36() {
	assertFalse(1758==1758+1);
}
@Test
public void bigFalseTestStructWriteStringReadList37() {
	assertFalse(17733==17733+1);
}
@Test
public void bigFalseTestStructWriteStringReadList38() {
	assertFalse(25658==25658+1);
}
@Test
public void bigFalseTestStructWriteStringReadList39() {
	assertFalse(6119==6119+1);
}
@Test
public void bigFalseTestStructWriteStringReadList40() {
	assertFalse(26980==26980+1);
}
@Test
public void bigFalseTestStructWriteStringReadList41() {
	assertFalse(21606==21606+1);
}
@Test
public void bigFalseTestStructWriteStringReadList42() {
	assertFalse(11926==11926+1);
}
@Test
public void bigFalseTestStructWriteStringReadList43() {
	assertFalse(17760==17760+1);
}
@Test
public void bigFalseTestStructWriteStringReadList44() {
	assertFalse(19848==19848+1);
}
@Test
public void bigFalseTestStructWriteStringReadList45() {
	assertFalse(26353==26353+1);
}
@Test
public void bigFalseTestStructWriteStringReadList46() {
	assertFalse(16449==16449+1);
}
@Test
public void bigFalseTestStructWriteStringReadList47() {
	assertFalse(11291==11291+1);
}
@Test
public void bigFalseTestStructWriteStringReadList48() {
	assertFalse(16337==16337+1);
}
@Test
public void bigFalseTestStructWriteStringReadList49() {
	assertFalse(606==606+1);
}
@Test
public void bigFalseTestStructWriteStringReadList50() {
	assertFalse(13670==13670+1);
}
@Test
public void bigFalseTestStructWriteStringReadList51() {
	assertFalse(13041==13041+1);
}
@Test
public void bigFalseTestStructWriteStringReadList52() {
	assertFalse(13251==13251+1);
}
@Test
public void bigFalseTestStructWriteStringReadList53() {
	assertFalse(14805==14805+1);
}
@Test
public void bigFalseTestStructWriteStringReadList54() {
	assertFalse(22770==22770+1);
}
@Test
public void bigFalseTestStructWriteStringReadList55() {
	assertFalse(12732==12732+1);
}
}
