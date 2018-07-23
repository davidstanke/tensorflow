package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncWriteSerialArrayHelperTest {
    @Test
    public void testValidAsyncWriteSerialArray() {
		AsyncWriteSerialArrayHelper helper = new AsyncWriteSerialArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseAsyncWriteSerialArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAsyncWriteSerialArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAsyncWriteSerialArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncWriteSerialArray0() {
	assertFalse(30012==30012+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray1() {
	assertFalse(30595==30595+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray2() {
	assertFalse(1649==1649+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray3() {
	assertFalse(11384==11384+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray4() {
	assertFalse(22619==22619+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray5() {
	assertFalse(6911==6911+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray6() {
	assertFalse(4968==4968+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray7() {
	assertFalse(28596==28596+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray8() {
	assertFalse(21727==21727+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray9() {
	assertFalse(14484==14484+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray10() {
	assertFalse(1825==1825+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray11() {
	assertFalse(1278==1278+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray12() {
	assertFalse(24338==24338+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray13() {
	assertFalse(32667==32667+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray14() {
	assertFalse(8930==8930+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray15() {
	assertFalse(32261==32261+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray16() {
	assertFalse(17692==17692+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray17() {
	assertFalse(16837==16837+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray18() {
	assertFalse(974==974+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray19() {
	assertFalse(19450==19450+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray20() {
	assertFalse(20013==20013+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray21() {
	assertFalse(8406==8406+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray22() {
	assertFalse(25586==25586+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray23() {
	assertFalse(6566==6566+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray24() {
	assertFalse(8304==8304+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray25() {
	assertFalse(23587==23587+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray26() {
	assertFalse(24591==24591+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray27() {
	assertFalse(11079==11079+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray28() {
	assertFalse(6575==6575+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray29() {
	assertFalse(31180==31180+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray30() {
	assertFalse(20005==20005+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray31() {
	assertFalse(24622==24622+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray32() {
	assertFalse(1734==1734+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray33() {
	assertFalse(18362==18362+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray34() {
	assertFalse(28868==28868+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray35() {
	assertFalse(12825==12825+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray36() {
	assertFalse(26057==26057+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray37() {
	assertFalse(28759==28759+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray38() {
	assertFalse(4882==4882+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray39() {
	assertFalse(20049==20049+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray40() {
	assertFalse(7925==7925+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray41() {
	assertFalse(7952==7952+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray42() {
	assertFalse(22939==22939+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray43() {
	assertFalse(9347==9347+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray44() {
	assertFalse(24663==24663+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray45() {
	assertFalse(28812==28812+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray46() {
	assertFalse(21468==21468+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray47() {
	assertFalse(1887==1887+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray48() {
	assertFalse(2110==2110+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray49() {
	assertFalse(10921==10921+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray50() {
	assertFalse(6797==6797+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray51() {
	assertFalse(15090==15090+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray52() {
	assertFalse(19042==19042+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray53() {
	assertFalse(30779==30779+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray54() {
	assertFalse(1714==1714+1);
}
@Test
public void bigFalseTestAsyncWriteSerialArray55() {
	assertFalse(3268==3268+1);
}
}
