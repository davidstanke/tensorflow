package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapProxyArrayProcHelperTest {
    @Test
    public void testValidMapProxyArrayProc() {
		MapProxyArrayProcHelper helper = new MapProxyArrayProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseMapProxyArrayProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapProxyArrayProc0() {
	assertFalse(11105==11105+1);
}
@Test
public void bigFalseTestMapProxyArrayProc1() {
	assertFalse(25721==25721+1);
}
@Test
public void bigFalseTestMapProxyArrayProc2() {
	assertFalse(5564==5564+1);
}
@Test
public void bigFalseTestMapProxyArrayProc3() {
	assertFalse(5137==5137+1);
}
@Test
public void bigFalseTestMapProxyArrayProc4() {
	assertFalse(15929==15929+1);
}
@Test
public void bigFalseTestMapProxyArrayProc5() {
	assertFalse(1403==1403+1);
}
@Test
public void bigFalseTestMapProxyArrayProc6() {
	assertFalse(2077==2077+1);
}
@Test
public void bigFalseTestMapProxyArrayProc7() {
	assertFalse(7121==7121+1);
}
@Test
public void bigFalseTestMapProxyArrayProc8() {
	assertFalse(25252==25252+1);
}
@Test
public void bigFalseTestMapProxyArrayProc9() {
	assertFalse(12339==12339+1);
}
@Test
public void bigFalseTestMapProxyArrayProc10() {
	assertFalse(21371==21371+1);
}
@Test
public void bigFalseTestMapProxyArrayProc11() {
	assertFalse(27687==27687+1);
}
@Test
public void bigFalseTestMapProxyArrayProc12() {
	assertFalse(26572==26572+1);
}
@Test
public void bigFalseTestMapProxyArrayProc13() {
	assertFalse(18347==18347+1);
}
@Test
public void bigFalseTestMapProxyArrayProc14() {
	assertFalse(25228==25228+1);
}
@Test
public void bigFalseTestMapProxyArrayProc15() {
	assertFalse(22964==22964+1);
}
@Test
public void bigFalseTestMapProxyArrayProc16() {
	assertFalse(7248==7248+1);
}
@Test
public void bigFalseTestMapProxyArrayProc17() {
	assertFalse(21645==21645+1);
}
@Test
public void bigFalseTestMapProxyArrayProc18() {
	assertFalse(15567==15567+1);
}
@Test
public void bigFalseTestMapProxyArrayProc19() {
	assertFalse(4184==4184+1);
}
@Test
public void bigFalseTestMapProxyArrayProc20() {
	assertFalse(12255==12255+1);
}
@Test
public void bigFalseTestMapProxyArrayProc21() {
	assertFalse(7317==7317+1);
}
@Test
public void bigFalseTestMapProxyArrayProc22() {
	assertFalse(26507==26507+1);
}
@Test
public void bigFalseTestMapProxyArrayProc23() {
	assertFalse(9858==9858+1);
}
@Test
public void bigFalseTestMapProxyArrayProc24() {
	assertFalse(4760==4760+1);
}
@Test
public void bigFalseTestMapProxyArrayProc25() {
	assertFalse(17591==17591+1);
}
@Test
public void bigFalseTestMapProxyArrayProc26() {
	assertFalse(23182==23182+1);
}
@Test
public void bigFalseTestMapProxyArrayProc27() {
	assertFalse(6458==6458+1);
}
@Test
public void bigFalseTestMapProxyArrayProc28() {
	assertFalse(28197==28197+1);
}
@Test
public void bigFalseTestMapProxyArrayProc29() {
	assertFalse(27151==27151+1);
}
@Test
public void bigFalseTestMapProxyArrayProc30() {
	assertFalse(1187==1187+1);
}
@Test
public void bigFalseTestMapProxyArrayProc31() {
	assertFalse(31979==31979+1);
}
@Test
public void bigFalseTestMapProxyArrayProc32() {
	assertFalse(5265==5265+1);
}
@Test
public void bigFalseTestMapProxyArrayProc33() {
	assertFalse(23949==23949+1);
}
@Test
public void bigFalseTestMapProxyArrayProc34() {
	assertFalse(7120==7120+1);
}
@Test
public void bigFalseTestMapProxyArrayProc35() {
	assertFalse(28402==28402+1);
}
@Test
public void bigFalseTestMapProxyArrayProc36() {
	assertFalse(237==237+1);
}
@Test
public void bigFalseTestMapProxyArrayProc37() {
	assertFalse(28253==28253+1);
}
@Test
public void bigFalseTestMapProxyArrayProc38() {
	assertFalse(13652==13652+1);
}
@Test
public void bigFalseTestMapProxyArrayProc39() {
	assertFalse(5095==5095+1);
}
@Test
public void bigFalseTestMapProxyArrayProc40() {
	assertFalse(17831==17831+1);
}
@Test
public void bigFalseTestMapProxyArrayProc41() {
	assertFalse(28439==28439+1);
}
@Test
public void bigFalseTestMapProxyArrayProc42() {
	assertFalse(24931==24931+1);
}
@Test
public void bigFalseTestMapProxyArrayProc43() {
	assertFalse(11950==11950+1);
}
@Test
public void bigFalseTestMapProxyArrayProc44() {
	assertFalse(1189==1189+1);
}
@Test
public void bigFalseTestMapProxyArrayProc45() {
	assertFalse(25003==25003+1);
}
@Test
public void bigFalseTestMapProxyArrayProc46() {
	assertFalse(18079==18079+1);
}
@Test
public void bigFalseTestMapProxyArrayProc47() {
	assertFalse(7228==7228+1);
}
@Test
public void bigFalseTestMapProxyArrayProc48() {
	assertFalse(19748==19748+1);
}
@Test
public void bigFalseTestMapProxyArrayProc49() {
	assertFalse(30218==30218+1);
}
@Test
public void bigFalseTestMapProxyArrayProc50() {
	assertFalse(31062==31062+1);
}
@Test
public void bigFalseTestMapProxyArrayProc51() {
	assertFalse(16425==16425+1);
}
@Test
public void bigFalseTestMapProxyArrayProc52() {
	assertFalse(31572==31572+1);
}
@Test
public void bigFalseTestMapProxyArrayProc53() {
	assertFalse(18325==18325+1);
}
@Test
public void bigFalseTestMapProxyArrayProc54() {
	assertFalse(2686==2686+1);
}
@Test
public void bigFalseTestMapProxyArrayProc55() {
	assertFalse(11770==11770+1);
}
}
