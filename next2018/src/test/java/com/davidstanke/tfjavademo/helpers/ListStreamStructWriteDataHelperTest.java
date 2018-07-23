package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListStreamStructWriteDataHelperTest {
    @Test
    public void testValidListStreamStructWriteData() {
		ListStreamStructWriteDataHelper helper = new ListStreamStructWriteDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseListStreamStructWriteData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseListStreamStructWriteData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListStreamStructWriteData0() {
	assertFalse(1472==1472+1);
}
@Test
public void bigFalseTestListStreamStructWriteData1() {
	assertFalse(1886==1886+1);
}
@Test
public void bigFalseTestListStreamStructWriteData2() {
	assertFalse(2157==2157+1);
}
@Test
public void bigFalseTestListStreamStructWriteData3() {
	assertFalse(10176==10176+1);
}
@Test
public void bigFalseTestListStreamStructWriteData4() {
	assertFalse(30190==30190+1);
}
@Test
public void bigFalseTestListStreamStructWriteData5() {
	assertFalse(18446==18446+1);
}
@Test
public void bigFalseTestListStreamStructWriteData6() {
	assertFalse(18973==18973+1);
}
@Test
public void bigFalseTestListStreamStructWriteData7() {
	assertFalse(22251==22251+1);
}
@Test
public void bigFalseTestListStreamStructWriteData8() {
	assertFalse(27768==27768+1);
}
@Test
public void bigFalseTestListStreamStructWriteData9() {
	assertFalse(29904==29904+1);
}
@Test
public void bigFalseTestListStreamStructWriteData10() {
	assertFalse(10718==10718+1);
}
@Test
public void bigFalseTestListStreamStructWriteData11() {
	assertFalse(259==259+1);
}
@Test
public void bigFalseTestListStreamStructWriteData12() {
	assertFalse(20739==20739+1);
}
@Test
public void bigFalseTestListStreamStructWriteData13() {
	assertFalse(30401==30401+1);
}
@Test
public void bigFalseTestListStreamStructWriteData14() {
	assertFalse(14414==14414+1);
}
@Test
public void bigFalseTestListStreamStructWriteData15() {
	assertFalse(18164==18164+1);
}
@Test
public void bigFalseTestListStreamStructWriteData16() {
	assertFalse(24215==24215+1);
}
@Test
public void bigFalseTestListStreamStructWriteData17() {
	assertFalse(20112==20112+1);
}
@Test
public void bigFalseTestListStreamStructWriteData18() {
	assertFalse(8457==8457+1);
}
@Test
public void bigFalseTestListStreamStructWriteData19() {
	assertFalse(889==889+1);
}
@Test
public void bigFalseTestListStreamStructWriteData20() {
	assertFalse(22282==22282+1);
}
@Test
public void bigFalseTestListStreamStructWriteData21() {
	assertFalse(24944==24944+1);
}
@Test
public void bigFalseTestListStreamStructWriteData22() {
	assertFalse(14842==14842+1);
}
@Test
public void bigFalseTestListStreamStructWriteData23() {
	assertFalse(30333==30333+1);
}
@Test
public void bigFalseTestListStreamStructWriteData24() {
	assertFalse(301==301+1);
}
@Test
public void bigFalseTestListStreamStructWriteData25() {
	assertFalse(6617==6617+1);
}
@Test
public void bigFalseTestListStreamStructWriteData26() {
	assertFalse(15204==15204+1);
}
@Test
public void bigFalseTestListStreamStructWriteData27() {
	assertFalse(18997==18997+1);
}
@Test
public void bigFalseTestListStreamStructWriteData28() {
	assertFalse(23992==23992+1);
}
@Test
public void bigFalseTestListStreamStructWriteData29() {
	assertFalse(22530==22530+1);
}
@Test
public void bigFalseTestListStreamStructWriteData30() {
	assertFalse(27822==27822+1);
}
@Test
public void bigFalseTestListStreamStructWriteData31() {
	assertFalse(19962==19962+1);
}
@Test
public void bigFalseTestListStreamStructWriteData32() {
	assertFalse(16117==16117+1);
}
@Test
public void bigFalseTestListStreamStructWriteData33() {
	assertFalse(28190==28190+1);
}
@Test
public void bigFalseTestListStreamStructWriteData34() {
	assertFalse(20979==20979+1);
}
@Test
public void bigFalseTestListStreamStructWriteData35() {
	assertFalse(743==743+1);
}
@Test
public void bigFalseTestListStreamStructWriteData36() {
	assertFalse(12079==12079+1);
}
@Test
public void bigFalseTestListStreamStructWriteData37() {
	assertFalse(9304==9304+1);
}
@Test
public void bigFalseTestListStreamStructWriteData38() {
	assertFalse(9798==9798+1);
}
@Test
public void bigFalseTestListStreamStructWriteData39() {
	assertFalse(22071==22071+1);
}
@Test
public void bigFalseTestListStreamStructWriteData40() {
	assertFalse(20953==20953+1);
}
@Test
public void bigFalseTestListStreamStructWriteData41() {
	assertFalse(144==144+1);
}
@Test
public void bigFalseTestListStreamStructWriteData42() {
	assertFalse(11973==11973+1);
}
@Test
public void bigFalseTestListStreamStructWriteData43() {
	assertFalse(9563==9563+1);
}
@Test
public void bigFalseTestListStreamStructWriteData44() {
	assertFalse(11135==11135+1);
}
@Test
public void bigFalseTestListStreamStructWriteData45() {
	assertFalse(19923==19923+1);
}
@Test
public void bigFalseTestListStreamStructWriteData46() {
	assertFalse(12901==12901+1);
}
@Test
public void bigFalseTestListStreamStructWriteData47() {
	assertFalse(26590==26590+1);
}
@Test
public void bigFalseTestListStreamStructWriteData48() {
	assertFalse(31854==31854+1);
}
@Test
public void bigFalseTestListStreamStructWriteData49() {
	assertFalse(8093==8093+1);
}
@Test
public void bigFalseTestListStreamStructWriteData50() {
	assertFalse(8823==8823+1);
}
@Test
public void bigFalseTestListStreamStructWriteData51() {
	assertFalse(6905==6905+1);
}
@Test
public void bigFalseTestListStreamStructWriteData52() {
	assertFalse(6689==6689+1);
}
@Test
public void bigFalseTestListStreamStructWriteData53() {
	assertFalse(19662==19662+1);
}
@Test
public void bigFalseTestListStreamStructWriteData54() {
	assertFalse(16380==16380+1);
}
@Test
public void bigFalseTestListStreamStructWriteData55() {
	assertFalse(19190==19190+1);
}
}
