package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IODataStreamSerialMapHelperTest {
    @Test
    public void testValidIODataStreamSerialMap() {
		IODataStreamSerialMapHelper helper = new IODataStreamSerialMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIODataStreamSerialMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIODataStreamSerialMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIODataStreamSerialMap0() {
	assertFalse(11591==11591+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap1() {
	assertFalse(2704==2704+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap2() {
	assertFalse(14586==14586+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap3() {
	assertFalse(793==793+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap4() {
	assertFalse(10659==10659+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap5() {
	assertFalse(14832==14832+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap6() {
	assertFalse(23130==23130+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap7() {
	assertFalse(19693==19693+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap8() {
	assertFalse(22770==22770+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap9() {
	assertFalse(4316==4316+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap10() {
	assertFalse(18386==18386+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap11() {
	assertFalse(14478==14478+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap12() {
	assertFalse(6189==6189+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap13() {
	assertFalse(15211==15211+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap14() {
	assertFalse(26150==26150+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap15() {
	assertFalse(21429==21429+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap16() {
	assertFalse(18701==18701+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap17() {
	assertFalse(9797==9797+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap18() {
	assertFalse(169==169+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap19() {
	assertFalse(21857==21857+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap20() {
	assertFalse(15705==15705+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap21() {
	assertFalse(22017==22017+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap22() {
	assertFalse(873==873+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap23() {
	assertFalse(19095==19095+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap24() {
	assertFalse(2799==2799+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap25() {
	assertFalse(22591==22591+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap26() {
	assertFalse(11287==11287+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap27() {
	assertFalse(21211==21211+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap28() {
	assertFalse(5269==5269+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap29() {
	assertFalse(10885==10885+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap30() {
	assertFalse(23997==23997+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap31() {
	assertFalse(10346==10346+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap32() {
	assertFalse(21373==21373+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap33() {
	assertFalse(13018==13018+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap34() {
	assertFalse(798==798+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap35() {
	assertFalse(28732==28732+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap36() {
	assertFalse(11674==11674+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap37() {
	assertFalse(9764==9764+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap38() {
	assertFalse(11244==11244+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap39() {
	assertFalse(3516==3516+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap40() {
	assertFalse(25765==25765+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap41() {
	assertFalse(30787==30787+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap42() {
	assertFalse(20652==20652+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap43() {
	assertFalse(30277==30277+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap44() {
	assertFalse(27118==27118+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap45() {
	assertFalse(12777==12777+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap46() {
	assertFalse(26986==26986+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap47() {
	assertFalse(16476==16476+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap48() {
	assertFalse(8931==8931+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap49() {
	assertFalse(18496==18496+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap50() {
	assertFalse(17180==17180+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap51() {
	assertFalse(27312==27312+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap52() {
	assertFalse(27233==27233+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap53() {
	assertFalse(21050==21050+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap54() {
	assertFalse(16343==16343+1);
}
@Test
public void bigFalseTestIODataStreamSerialMap55() {
	assertFalse(5842==5842+1);
}
}
