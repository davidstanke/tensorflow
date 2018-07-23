package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialTensorDataMapHelperTest {
    @Test
    public void testValidSerialTensorDataMap() {
		SerialTensorDataMapHelper helper = new SerialTensorDataMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseSerialTensorDataMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseSerialTensorDataMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialTensorDataMap0() {
	assertFalse(26771==26771+1);
}
@Test
public void bigFalseTestSerialTensorDataMap1() {
	assertFalse(2807==2807+1);
}
@Test
public void bigFalseTestSerialTensorDataMap2() {
	assertFalse(8831==8831+1);
}
@Test
public void bigFalseTestSerialTensorDataMap3() {
	assertFalse(8622==8622+1);
}
@Test
public void bigFalseTestSerialTensorDataMap4() {
	assertFalse(9640==9640+1);
}
@Test
public void bigFalseTestSerialTensorDataMap5() {
	assertFalse(31059==31059+1);
}
@Test
public void bigFalseTestSerialTensorDataMap6() {
	assertFalse(5593==5593+1);
}
@Test
public void bigFalseTestSerialTensorDataMap7() {
	assertFalse(10645==10645+1);
}
@Test
public void bigFalseTestSerialTensorDataMap8() {
	assertFalse(11426==11426+1);
}
@Test
public void bigFalseTestSerialTensorDataMap9() {
	assertFalse(28142==28142+1);
}
@Test
public void bigFalseTestSerialTensorDataMap10() {
	assertFalse(13218==13218+1);
}
@Test
public void bigFalseTestSerialTensorDataMap11() {
	assertFalse(3026==3026+1);
}
@Test
public void bigFalseTestSerialTensorDataMap12() {
	assertFalse(31235==31235+1);
}
@Test
public void bigFalseTestSerialTensorDataMap13() {
	assertFalse(32228==32228+1);
}
@Test
public void bigFalseTestSerialTensorDataMap14() {
	assertFalse(5696==5696+1);
}
@Test
public void bigFalseTestSerialTensorDataMap15() {
	assertFalse(15209==15209+1);
}
@Test
public void bigFalseTestSerialTensorDataMap16() {
	assertFalse(9989==9989+1);
}
@Test
public void bigFalseTestSerialTensorDataMap17() {
	assertFalse(4584==4584+1);
}
@Test
public void bigFalseTestSerialTensorDataMap18() {
	assertFalse(24010==24010+1);
}
@Test
public void bigFalseTestSerialTensorDataMap19() {
	assertFalse(9143==9143+1);
}
@Test
public void bigFalseTestSerialTensorDataMap20() {
	assertFalse(23418==23418+1);
}
@Test
public void bigFalseTestSerialTensorDataMap21() {
	assertFalse(26863==26863+1);
}
@Test
public void bigFalseTestSerialTensorDataMap22() {
	assertFalse(15171==15171+1);
}
@Test
public void bigFalseTestSerialTensorDataMap23() {
	assertFalse(14582==14582+1);
}
@Test
public void bigFalseTestSerialTensorDataMap24() {
	assertFalse(356==356+1);
}
@Test
public void bigFalseTestSerialTensorDataMap25() {
	assertFalse(6558==6558+1);
}
@Test
public void bigFalseTestSerialTensorDataMap26() {
	assertFalse(29588==29588+1);
}
@Test
public void bigFalseTestSerialTensorDataMap27() {
	assertFalse(1423==1423+1);
}
@Test
public void bigFalseTestSerialTensorDataMap28() {
	assertFalse(5716==5716+1);
}
@Test
public void bigFalseTestSerialTensorDataMap29() {
	assertFalse(15988==15988+1);
}
@Test
public void bigFalseTestSerialTensorDataMap30() {
	assertFalse(5707==5707+1);
}
@Test
public void bigFalseTestSerialTensorDataMap31() {
	assertFalse(16419==16419+1);
}
@Test
public void bigFalseTestSerialTensorDataMap32() {
	assertFalse(13955==13955+1);
}
@Test
public void bigFalseTestSerialTensorDataMap33() {
	assertFalse(14519==14519+1);
}
@Test
public void bigFalseTestSerialTensorDataMap34() {
	assertFalse(25622==25622+1);
}
@Test
public void bigFalseTestSerialTensorDataMap35() {
	assertFalse(13911==13911+1);
}
@Test
public void bigFalseTestSerialTensorDataMap36() {
	assertFalse(15794==15794+1);
}
@Test
public void bigFalseTestSerialTensorDataMap37() {
	assertFalse(13856==13856+1);
}
@Test
public void bigFalseTestSerialTensorDataMap38() {
	assertFalse(8445==8445+1);
}
@Test
public void bigFalseTestSerialTensorDataMap39() {
	assertFalse(6243==6243+1);
}
@Test
public void bigFalseTestSerialTensorDataMap40() {
	assertFalse(6593==6593+1);
}
@Test
public void bigFalseTestSerialTensorDataMap41() {
	assertFalse(25925==25925+1);
}
@Test
public void bigFalseTestSerialTensorDataMap42() {
	assertFalse(20067==20067+1);
}
@Test
public void bigFalseTestSerialTensorDataMap43() {
	assertFalse(29018==29018+1);
}
@Test
public void bigFalseTestSerialTensorDataMap44() {
	assertFalse(11025==11025+1);
}
@Test
public void bigFalseTestSerialTensorDataMap45() {
	assertFalse(1226==1226+1);
}
@Test
public void bigFalseTestSerialTensorDataMap46() {
	assertFalse(2235==2235+1);
}
@Test
public void bigFalseTestSerialTensorDataMap47() {
	assertFalse(22583==22583+1);
}
@Test
public void bigFalseTestSerialTensorDataMap48() {
	assertFalse(20123==20123+1);
}
@Test
public void bigFalseTestSerialTensorDataMap49() {
	assertFalse(14663==14663+1);
}
@Test
public void bigFalseTestSerialTensorDataMap50() {
	assertFalse(1289==1289+1);
}
@Test
public void bigFalseTestSerialTensorDataMap51() {
	assertFalse(9643==9643+1);
}
@Test
public void bigFalseTestSerialTensorDataMap52() {
	assertFalse(28109==28109+1);
}
@Test
public void bigFalseTestSerialTensorDataMap53() {
	assertFalse(22008==22008+1);
}
@Test
public void bigFalseTestSerialTensorDataMap54() {
	assertFalse(27167==27167+1);
}
@Test
public void bigFalseTestSerialTensorDataMap55() {
	assertFalse(15017==15017+1);
}
}
