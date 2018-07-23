package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxyArrayAPIAPIProcHelperTest {
    @Test
    public void testValidProxyArrayAPIAPIProc() {
		ProxyArrayAPIAPIProcHelper helper = new ProxyArrayAPIAPIProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProxyArrayAPIAPIProc() {
	ProxyArrayAPIAPIProcHelper helper = new ProxyArrayAPIAPIProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseProxyArrayAPIAPIProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc0() {
	assertFalse(31120==31120+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc1() {
	assertFalse(30316==30316+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc2() {
	assertFalse(25190==25190+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc3() {
	assertFalse(10350==10350+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc4() {
	assertFalse(3959==3959+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc5() {
	assertFalse(6245==6245+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc6() {
	assertFalse(5465==5465+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc7() {
	assertFalse(29761==29761+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc8() {
	assertFalse(23213==23213+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc9() {
	assertFalse(10790==10790+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc10() {
	assertFalse(15912==15912+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc11() {
	assertFalse(1614==1614+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc12() {
	assertFalse(17122==17122+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc13() {
	assertFalse(19528==19528+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc14() {
	assertFalse(17087==17087+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc15() {
	assertFalse(15594==15594+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc16() {
	assertFalse(14672==14672+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc17() {
	assertFalse(30201==30201+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc18() {
	assertFalse(27250==27250+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc19() {
	assertFalse(23175==23175+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc20() {
	assertFalse(9895==9895+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc21() {
	assertFalse(10868==10868+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc22() {
	assertFalse(27595==27595+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc23() {
	assertFalse(3468==3468+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc24() {
	assertFalse(19387==19387+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc25() {
	assertFalse(2626==2626+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc26() {
	assertFalse(2833==2833+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc27() {
	assertFalse(6641==6641+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc28() {
	assertFalse(240==240+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc29() {
	assertFalse(15410==15410+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc30() {
	assertFalse(5533==5533+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc31() {
	assertFalse(158==158+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc32() {
	assertFalse(97==97+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc33() {
	assertFalse(27161==27161+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc34() {
	assertFalse(17884==17884+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc35() {
	assertFalse(16513==16513+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc36() {
	assertFalse(9939==9939+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc37() {
	assertFalse(19786==19786+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc38() {
	assertFalse(23587==23587+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc39() {
	assertFalse(3441==3441+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc40() {
	assertFalse(22364==22364+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc41() {
	assertFalse(1748==1748+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc42() {
	assertFalse(30774==30774+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc43() {
	assertFalse(6342==6342+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc44() {
	assertFalse(28115==28115+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc45() {
	assertFalse(16254==16254+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc46() {
	assertFalse(32662==32662+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc47() {
	assertFalse(18356==18356+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc48() {
	assertFalse(27638==27638+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc49() {
	assertFalse(19331==19331+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc50() {
	assertFalse(7310==7310+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc51() {
	assertFalse(29548==29548+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc52() {
	assertFalse(19806==19806+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc53() {
	assertFalse(19982==19982+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc54() {
	assertFalse(8700==8700+1);
}
@Test
public void bigFalseTestProxyArrayAPIAPIProc55() {
	assertFalse(3825==3825+1);
}
}
