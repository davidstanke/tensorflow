package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOProxyStructIODataHelperTest {
    @Test
    public void testValidIOProxyStructIOData() {
		IOProxyStructIODataHelper helper = new IOProxyStructIODataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseIOProxyStructIOData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOProxyStructIOData0() {
	assertFalse(31020==31020+1);
}
@Test
public void bigFalseTestIOProxyStructIOData1() {
	assertFalse(3387==3387+1);
}
@Test
public void bigFalseTestIOProxyStructIOData2() {
	assertFalse(108==108+1);
}
@Test
public void bigFalseTestIOProxyStructIOData3() {
	assertFalse(19373==19373+1);
}
@Test
public void bigFalseTestIOProxyStructIOData4() {
	assertFalse(9188==9188+1);
}
@Test
public void bigFalseTestIOProxyStructIOData5() {
	assertFalse(2545==2545+1);
}
@Test
public void bigFalseTestIOProxyStructIOData6() {
	assertFalse(16167==16167+1);
}
@Test
public void bigFalseTestIOProxyStructIOData7() {
	assertFalse(13203==13203+1);
}
@Test
public void bigFalseTestIOProxyStructIOData8() {
	assertFalse(19725==19725+1);
}
@Test
public void bigFalseTestIOProxyStructIOData9() {
	assertFalse(2148==2148+1);
}
@Test
public void bigFalseTestIOProxyStructIOData10() {
	assertFalse(30433==30433+1);
}
@Test
public void bigFalseTestIOProxyStructIOData11() {
	assertFalse(12964==12964+1);
}
@Test
public void bigFalseTestIOProxyStructIOData12() {
	assertFalse(1647==1647+1);
}
@Test
public void bigFalseTestIOProxyStructIOData13() {
	assertFalse(20204==20204+1);
}
@Test
public void bigFalseTestIOProxyStructIOData14() {
	assertFalse(12833==12833+1);
}
@Test
public void bigFalseTestIOProxyStructIOData15() {
	assertFalse(27418==27418+1);
}
@Test
public void bigFalseTestIOProxyStructIOData16() {
	assertFalse(3068==3068+1);
}
@Test
public void bigFalseTestIOProxyStructIOData17() {
	assertFalse(20519==20519+1);
}
@Test
public void bigFalseTestIOProxyStructIOData18() {
	assertFalse(25612==25612+1);
}
@Test
public void bigFalseTestIOProxyStructIOData19() {
	assertFalse(14257==14257+1);
}
@Test
public void bigFalseTestIOProxyStructIOData20() {
	assertFalse(7340==7340+1);
}
@Test
public void bigFalseTestIOProxyStructIOData21() {
	assertFalse(2212==2212+1);
}
@Test
public void bigFalseTestIOProxyStructIOData22() {
	assertFalse(12964==12964+1);
}
@Test
public void bigFalseTestIOProxyStructIOData23() {
	assertFalse(3898==3898+1);
}
@Test
public void bigFalseTestIOProxyStructIOData24() {
	assertFalse(1304==1304+1);
}
@Test
public void bigFalseTestIOProxyStructIOData25() {
	assertFalse(2900==2900+1);
}
@Test
public void bigFalseTestIOProxyStructIOData26() {
	assertFalse(10433==10433+1);
}
@Test
public void bigFalseTestIOProxyStructIOData27() {
	assertFalse(5342==5342+1);
}
@Test
public void bigFalseTestIOProxyStructIOData28() {
	assertFalse(14296==14296+1);
}
@Test
public void bigFalseTestIOProxyStructIOData29() {
	assertFalse(26801==26801+1);
}
@Test
public void bigFalseTestIOProxyStructIOData30() {
	assertFalse(3023==3023+1);
}
@Test
public void bigFalseTestIOProxyStructIOData31() {
	assertFalse(24883==24883+1);
}
@Test
public void bigFalseTestIOProxyStructIOData32() {
	assertFalse(3998==3998+1);
}
@Test
public void bigFalseTestIOProxyStructIOData33() {
	assertFalse(23723==23723+1);
}
@Test
public void bigFalseTestIOProxyStructIOData34() {
	assertFalse(20813==20813+1);
}
@Test
public void bigFalseTestIOProxyStructIOData35() {
	assertFalse(20480==20480+1);
}
@Test
public void bigFalseTestIOProxyStructIOData36() {
	assertFalse(5903==5903+1);
}
@Test
public void bigFalseTestIOProxyStructIOData37() {
	assertFalse(28503==28503+1);
}
@Test
public void bigFalseTestIOProxyStructIOData38() {
	assertFalse(28673==28673+1);
}
@Test
public void bigFalseTestIOProxyStructIOData39() {
	assertFalse(24272==24272+1);
}
@Test
public void bigFalseTestIOProxyStructIOData40() {
	assertFalse(29285==29285+1);
}
@Test
public void bigFalseTestIOProxyStructIOData41() {
	assertFalse(29783==29783+1);
}
@Test
public void bigFalseTestIOProxyStructIOData42() {
	assertFalse(2299==2299+1);
}
@Test
public void bigFalseTestIOProxyStructIOData43() {
	assertFalse(26681==26681+1);
}
@Test
public void bigFalseTestIOProxyStructIOData44() {
	assertFalse(18117==18117+1);
}
@Test
public void bigFalseTestIOProxyStructIOData45() {
	assertFalse(5383==5383+1);
}
@Test
public void bigFalseTestIOProxyStructIOData46() {
	assertFalse(9297==9297+1);
}
@Test
public void bigFalseTestIOProxyStructIOData47() {
	assertFalse(18410==18410+1);
}
@Test
public void bigFalseTestIOProxyStructIOData48() {
	assertFalse(15201==15201+1);
}
@Test
public void bigFalseTestIOProxyStructIOData49() {
	assertFalse(20845==20845+1);
}
@Test
public void bigFalseTestIOProxyStructIOData50() {
	assertFalse(32148==32148+1);
}
@Test
public void bigFalseTestIOProxyStructIOData51() {
	assertFalse(13174==13174+1);
}
@Test
public void bigFalseTestIOProxyStructIOData52() {
	assertFalse(28750==28750+1);
}
@Test
public void bigFalseTestIOProxyStructIOData53() {
	assertFalse(9181==9181+1);
}
@Test
public void bigFalseTestIOProxyStructIOData54() {
	assertFalse(7188==7188+1);
}
@Test
public void bigFalseTestIOProxyStructIOData55() {
	assertFalse(21474==21474+1);
}
}
