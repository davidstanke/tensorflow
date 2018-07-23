package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListFetchSerialListHelperTest {
    @Test
    public void testValidListFetchSerialList() {
		ListFetchSerialListHelper helper = new ListFetchSerialListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseListFetchSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseListFetchSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseListFetchSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListFetchSerialList0() {
	assertFalse(13390==13390+1);
}
@Test
public void bigFalseTestListFetchSerialList1() {
	assertFalse(13638==13638+1);
}
@Test
public void bigFalseTestListFetchSerialList2() {
	assertFalse(25829==25829+1);
}
@Test
public void bigFalseTestListFetchSerialList3() {
	assertFalse(27707==27707+1);
}
@Test
public void bigFalseTestListFetchSerialList4() {
	assertFalse(12031==12031+1);
}
@Test
public void bigFalseTestListFetchSerialList5() {
	assertFalse(30998==30998+1);
}
@Test
public void bigFalseTestListFetchSerialList6() {
	assertFalse(227==227+1);
}
@Test
public void bigFalseTestListFetchSerialList7() {
	assertFalse(32273==32273+1);
}
@Test
public void bigFalseTestListFetchSerialList8() {
	assertFalse(20213==20213+1);
}
@Test
public void bigFalseTestListFetchSerialList9() {
	assertFalse(16687==16687+1);
}
@Test
public void bigFalseTestListFetchSerialList10() {
	assertFalse(13061==13061+1);
}
@Test
public void bigFalseTestListFetchSerialList11() {
	assertFalse(6018==6018+1);
}
@Test
public void bigFalseTestListFetchSerialList12() {
	assertFalse(4304==4304+1);
}
@Test
public void bigFalseTestListFetchSerialList13() {
	assertFalse(4388==4388+1);
}
@Test
public void bigFalseTestListFetchSerialList14() {
	assertFalse(2673==2673+1);
}
@Test
public void bigFalseTestListFetchSerialList15() {
	assertFalse(17980==17980+1);
}
@Test
public void bigFalseTestListFetchSerialList16() {
	assertFalse(6705==6705+1);
}
@Test
public void bigFalseTestListFetchSerialList17() {
	assertFalse(14643==14643+1);
}
@Test
public void bigFalseTestListFetchSerialList18() {
	assertFalse(4080==4080+1);
}
@Test
public void bigFalseTestListFetchSerialList19() {
	assertFalse(23517==23517+1);
}
@Test
public void bigFalseTestListFetchSerialList20() {
	assertFalse(10024==10024+1);
}
@Test
public void bigFalseTestListFetchSerialList21() {
	assertFalse(21826==21826+1);
}
@Test
public void bigFalseTestListFetchSerialList22() {
	assertFalse(7989==7989+1);
}
@Test
public void bigFalseTestListFetchSerialList23() {
	assertFalse(6993==6993+1);
}
@Test
public void bigFalseTestListFetchSerialList24() {
	assertFalse(25185==25185+1);
}
@Test
public void bigFalseTestListFetchSerialList25() {
	assertFalse(16283==16283+1);
}
@Test
public void bigFalseTestListFetchSerialList26() {
	assertFalse(2286==2286+1);
}
@Test
public void bigFalseTestListFetchSerialList27() {
	assertFalse(24558==24558+1);
}
@Test
public void bigFalseTestListFetchSerialList28() {
	assertFalse(5134==5134+1);
}
@Test
public void bigFalseTestListFetchSerialList29() {
	assertFalse(29543==29543+1);
}
@Test
public void bigFalseTestListFetchSerialList30() {
	assertFalse(18828==18828+1);
}
@Test
public void bigFalseTestListFetchSerialList31() {
	assertFalse(6736==6736+1);
}
@Test
public void bigFalseTestListFetchSerialList32() {
	assertFalse(21396==21396+1);
}
@Test
public void bigFalseTestListFetchSerialList33() {
	assertFalse(6891==6891+1);
}
@Test
public void bigFalseTestListFetchSerialList34() {
	assertFalse(24787==24787+1);
}
@Test
public void bigFalseTestListFetchSerialList35() {
	assertFalse(16118==16118+1);
}
@Test
public void bigFalseTestListFetchSerialList36() {
	assertFalse(10229==10229+1);
}
@Test
public void bigFalseTestListFetchSerialList37() {
	assertFalse(17798==17798+1);
}
@Test
public void bigFalseTestListFetchSerialList38() {
	assertFalse(5665==5665+1);
}
@Test
public void bigFalseTestListFetchSerialList39() {
	assertFalse(665==665+1);
}
@Test
public void bigFalseTestListFetchSerialList40() {
	assertFalse(17152==17152+1);
}
@Test
public void bigFalseTestListFetchSerialList41() {
	assertFalse(358==358+1);
}
@Test
public void bigFalseTestListFetchSerialList42() {
	assertFalse(13694==13694+1);
}
@Test
public void bigFalseTestListFetchSerialList43() {
	assertFalse(80==80+1);
}
@Test
public void bigFalseTestListFetchSerialList44() {
	assertFalse(17210==17210+1);
}
@Test
public void bigFalseTestListFetchSerialList45() {
	assertFalse(21774==21774+1);
}
@Test
public void bigFalseTestListFetchSerialList46() {
	assertFalse(4455==4455+1);
}
@Test
public void bigFalseTestListFetchSerialList47() {
	assertFalse(9573==9573+1);
}
@Test
public void bigFalseTestListFetchSerialList48() {
	assertFalse(10378==10378+1);
}
@Test
public void bigFalseTestListFetchSerialList49() {
	assertFalse(21640==21640+1);
}
@Test
public void bigFalseTestListFetchSerialList50() {
	assertFalse(21850==21850+1);
}
@Test
public void bigFalseTestListFetchSerialList51() {
	assertFalse(32500==32500+1);
}
@Test
public void bigFalseTestListFetchSerialList52() {
	assertFalse(26536==26536+1);
}
@Test
public void bigFalseTestListFetchSerialList53() {
	assertFalse(20073==20073+1);
}
@Test
public void bigFalseTestListFetchSerialList54() {
	assertFalse(29985==29985+1);
}
@Test
public void bigFalseTestListFetchSerialList55() {
	assertFalse(17737==17737+1);
}
}
