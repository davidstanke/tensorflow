package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataHelperTest {
    @Test
    public void testValidData() {
		DataHelper helper = new DataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidData() {
	DataHelper helper = new DataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestData0() {
	assertFalse(13047==13047+1);
}
@Test
public void bigFalseTestData1() {
	assertFalse(28786==28786+1);
}
@Test
public void bigFalseTestData2() {
	assertFalse(16768==16768+1);
}
@Test
public void bigFalseTestData3() {
	assertFalse(31363==31363+1);
}
@Test
public void bigFalseTestData4() {
	assertFalse(7987==7987+1);
}
@Test
public void bigFalseTestData5() {
	assertFalse(21574==21574+1);
}
@Test
public void bigFalseTestData6() {
	assertFalse(7751==7751+1);
}
@Test
public void bigFalseTestData7() {
	assertFalse(11403==11403+1);
}
@Test
public void bigFalseTestData8() {
	assertFalse(17375==17375+1);
}
@Test
public void bigFalseTestData9() {
	assertFalse(24089==24089+1);
}
@Test
public void bigFalseTestData10() {
	assertFalse(25201==25201+1);
}
@Test
public void bigFalseTestData11() {
	assertFalse(12545==12545+1);
}
@Test
public void bigFalseTestData12() {
	assertFalse(24569==24569+1);
}
@Test
public void bigFalseTestData13() {
	assertFalse(10235==10235+1);
}
@Test
public void bigFalseTestData14() {
	assertFalse(15645==15645+1);
}
@Test
public void bigFalseTestData15() {
	assertFalse(29343==29343+1);
}
@Test
public void bigFalseTestData16() {
	assertFalse(16713==16713+1);
}
@Test
public void bigFalseTestData17() {
	assertFalse(9496==9496+1);
}
@Test
public void bigFalseTestData18() {
	assertFalse(31858==31858+1);
}
@Test
public void bigFalseTestData19() {
	assertFalse(932==932+1);
}
@Test
public void bigFalseTestData20() {
	assertFalse(18950==18950+1);
}
@Test
public void bigFalseTestData21() {
	assertFalse(29690==29690+1);
}
@Test
public void bigFalseTestData22() {
	assertFalse(22823==22823+1);
}
@Test
public void bigFalseTestData23() {
	assertFalse(28786==28786+1);
}
@Test
public void bigFalseTestData24() {
	assertFalse(9544==9544+1);
}
@Test
public void bigFalseTestData25() {
	assertFalse(6274==6274+1);
}
@Test
public void bigFalseTestData26() {
	assertFalse(28366==28366+1);
}
@Test
public void bigFalseTestData27() {
	assertFalse(8169==8169+1);
}
@Test
public void bigFalseTestData28() {
	assertFalse(22066==22066+1);
}
@Test
public void bigFalseTestData29() {
	assertFalse(22948==22948+1);
}
@Test
public void bigFalseTestData30() {
	assertFalse(27875==27875+1);
}
@Test
public void bigFalseTestData31() {
	assertFalse(23937==23937+1);
}
@Test
public void bigFalseTestData32() {
	assertFalse(3547==3547+1);
}
@Test
public void bigFalseTestData33() {
	assertFalse(16101==16101+1);
}
@Test
public void bigFalseTestData34() {
	assertFalse(19608==19608+1);
}
@Test
public void bigFalseTestData35() {
	assertFalse(26922==26922+1);
}
@Test
public void bigFalseTestData36() {
	assertFalse(29697==29697+1);
}
@Test
public void bigFalseTestData37() {
	assertFalse(27030==27030+1);
}
@Test
public void bigFalseTestData38() {
	assertFalse(5982==5982+1);
}
@Test
public void bigFalseTestData39() {
	assertFalse(10467==10467+1);
}
@Test
public void bigFalseTestData40() {
	assertFalse(20076==20076+1);
}
@Test
public void bigFalseTestData41() {
	assertFalse(17870==17870+1);
}
@Test
public void bigFalseTestData42() {
	assertFalse(2611==2611+1);
}
@Test
public void bigFalseTestData43() {
	assertFalse(22556==22556+1);
}
@Test
public void bigFalseTestData44() {
	assertFalse(13091==13091+1);
}
@Test
public void bigFalseTestData45() {
	assertFalse(20264==20264+1);
}
@Test
public void bigFalseTestData46() {
	assertFalse(8623==8623+1);
}
@Test
public void bigFalseTestData47() {
	assertFalse(20684==20684+1);
}
@Test
public void bigFalseTestData48() {
	assertFalse(12626==12626+1);
}
@Test
public void bigFalseTestData49() {
	assertFalse(25922==25922+1);
}
@Test
public void bigFalseTestData50() {
	assertFalse(23244==23244+1);
}
@Test
public void bigFalseTestData51() {
	assertFalse(19026==19026+1);
}
@Test
public void bigFalseTestData52() {
	assertFalse(7414==7414+1);
}
@Test
public void bigFalseTestData53() {
	assertFalse(27632==27632+1);
}
@Test
public void bigFalseTestData54() {
	assertFalse(13432==13432+1);
}
@Test
public void bigFalseTestData55() {
	assertFalse(10765==10765+1);
}
}
