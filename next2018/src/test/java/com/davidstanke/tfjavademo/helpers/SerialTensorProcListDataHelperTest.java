package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialTensorProcListDataHelperTest {
    @Test
    public void testValidSerialTensorProcListData() {
		SerialTensorProcListDataHelper helper = new SerialTensorProcListDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseSerialTensorProcListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseSerialTensorProcListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialTensorProcListData0() {
	assertFalse(6207==6207+1);
}
@Test
public void bigFalseTestSerialTensorProcListData1() {
	assertFalse(4758==4758+1);
}
@Test
public void bigFalseTestSerialTensorProcListData2() {
	assertFalse(1118==1118+1);
}
@Test
public void bigFalseTestSerialTensorProcListData3() {
	assertFalse(6371==6371+1);
}
@Test
public void bigFalseTestSerialTensorProcListData4() {
	assertFalse(5998==5998+1);
}
@Test
public void bigFalseTestSerialTensorProcListData5() {
	assertFalse(2822==2822+1);
}
@Test
public void bigFalseTestSerialTensorProcListData6() {
	assertFalse(22269==22269+1);
}
@Test
public void bigFalseTestSerialTensorProcListData7() {
	assertFalse(376==376+1);
}
@Test
public void bigFalseTestSerialTensorProcListData8() {
	assertFalse(21852==21852+1);
}
@Test
public void bigFalseTestSerialTensorProcListData9() {
	assertFalse(84==84+1);
}
@Test
public void bigFalseTestSerialTensorProcListData10() {
	assertFalse(14529==14529+1);
}
@Test
public void bigFalseTestSerialTensorProcListData11() {
	assertFalse(12827==12827+1);
}
@Test
public void bigFalseTestSerialTensorProcListData12() {
	assertFalse(4621==4621+1);
}
@Test
public void bigFalseTestSerialTensorProcListData13() {
	assertFalse(25079==25079+1);
}
@Test
public void bigFalseTestSerialTensorProcListData14() {
	assertFalse(10340==10340+1);
}
@Test
public void bigFalseTestSerialTensorProcListData15() {
	assertFalse(20668==20668+1);
}
@Test
public void bigFalseTestSerialTensorProcListData16() {
	assertFalse(24670==24670+1);
}
@Test
public void bigFalseTestSerialTensorProcListData17() {
	assertFalse(16027==16027+1);
}
@Test
public void bigFalseTestSerialTensorProcListData18() {
	assertFalse(7534==7534+1);
}
@Test
public void bigFalseTestSerialTensorProcListData19() {
	assertFalse(16448==16448+1);
}
@Test
public void bigFalseTestSerialTensorProcListData20() {
	assertFalse(23009==23009+1);
}
@Test
public void bigFalseTestSerialTensorProcListData21() {
	assertFalse(24785==24785+1);
}
@Test
public void bigFalseTestSerialTensorProcListData22() {
	assertFalse(9588==9588+1);
}
@Test
public void bigFalseTestSerialTensorProcListData23() {
	assertFalse(23308==23308+1);
}
@Test
public void bigFalseTestSerialTensorProcListData24() {
	assertFalse(13435==13435+1);
}
@Test
public void bigFalseTestSerialTensorProcListData25() {
	assertFalse(2677==2677+1);
}
@Test
public void bigFalseTestSerialTensorProcListData26() {
	assertFalse(6417==6417+1);
}
@Test
public void bigFalseTestSerialTensorProcListData27() {
	assertFalse(19026==19026+1);
}
@Test
public void bigFalseTestSerialTensorProcListData28() {
	assertFalse(5567==5567+1);
}
@Test
public void bigFalseTestSerialTensorProcListData29() {
	assertFalse(31459==31459+1);
}
@Test
public void bigFalseTestSerialTensorProcListData30() {
	assertFalse(9382==9382+1);
}
@Test
public void bigFalseTestSerialTensorProcListData31() {
	assertFalse(1566==1566+1);
}
@Test
public void bigFalseTestSerialTensorProcListData32() {
	assertFalse(16393==16393+1);
}
@Test
public void bigFalseTestSerialTensorProcListData33() {
	assertFalse(11225==11225+1);
}
@Test
public void bigFalseTestSerialTensorProcListData34() {
	assertFalse(8401==8401+1);
}
@Test
public void bigFalseTestSerialTensorProcListData35() {
	assertFalse(18975==18975+1);
}
@Test
public void bigFalseTestSerialTensorProcListData36() {
	assertFalse(30042==30042+1);
}
@Test
public void bigFalseTestSerialTensorProcListData37() {
	assertFalse(28970==28970+1);
}
@Test
public void bigFalseTestSerialTensorProcListData38() {
	assertFalse(30382==30382+1);
}
@Test
public void bigFalseTestSerialTensorProcListData39() {
	assertFalse(2870==2870+1);
}
@Test
public void bigFalseTestSerialTensorProcListData40() {
	assertFalse(11255==11255+1);
}
@Test
public void bigFalseTestSerialTensorProcListData41() {
	assertFalse(26408==26408+1);
}
@Test
public void bigFalseTestSerialTensorProcListData42() {
	assertFalse(3024==3024+1);
}
@Test
public void bigFalseTestSerialTensorProcListData43() {
	assertFalse(14784==14784+1);
}
@Test
public void bigFalseTestSerialTensorProcListData44() {
	assertFalse(28864==28864+1);
}
@Test
public void bigFalseTestSerialTensorProcListData45() {
	assertFalse(23503==23503+1);
}
@Test
public void bigFalseTestSerialTensorProcListData46() {
	assertFalse(29182==29182+1);
}
@Test
public void bigFalseTestSerialTensorProcListData47() {
	assertFalse(23716==23716+1);
}
@Test
public void bigFalseTestSerialTensorProcListData48() {
	assertFalse(4945==4945+1);
}
@Test
public void bigFalseTestSerialTensorProcListData49() {
	assertFalse(7857==7857+1);
}
@Test
public void bigFalseTestSerialTensorProcListData50() {
	assertFalse(22189==22189+1);
}
@Test
public void bigFalseTestSerialTensorProcListData51() {
	assertFalse(20763==20763+1);
}
@Test
public void bigFalseTestSerialTensorProcListData52() {
	assertFalse(30682==30682+1);
}
@Test
public void bigFalseTestSerialTensorProcListData53() {
	assertFalse(25509==25509+1);
}
@Test
public void bigFalseTestSerialTensorProcListData54() {
	assertFalse(28225==28225+1);
}
@Test
public void bigFalseTestSerialTensorProcListData55() {
	assertFalse(15170==15170+1);
}
}
