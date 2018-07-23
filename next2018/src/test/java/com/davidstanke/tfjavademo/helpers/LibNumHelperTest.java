package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibNumHelperTest {
    @Test
    public void testValidLibNum() {
		LibNumHelper helper = new LibNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseLibNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibNum0() {
	assertFalse(3140==3140+1);
}
@Test
public void bigFalseTestLibNum1() {
	assertFalse(31491==31491+1);
}
@Test
public void bigFalseTestLibNum2() {
	assertFalse(30263==30263+1);
}
@Test
public void bigFalseTestLibNum3() {
	assertFalse(31590==31590+1);
}
@Test
public void bigFalseTestLibNum4() {
	assertFalse(18255==18255+1);
}
@Test
public void bigFalseTestLibNum5() {
	assertFalse(17960==17960+1);
}
@Test
public void bigFalseTestLibNum6() {
	assertFalse(32188==32188+1);
}
@Test
public void bigFalseTestLibNum7() {
	assertFalse(4641==4641+1);
}
@Test
public void bigFalseTestLibNum8() {
	assertFalse(4674==4674+1);
}
@Test
public void bigFalseTestLibNum9() {
	assertFalse(17174==17174+1);
}
@Test
public void bigFalseTestLibNum10() {
	assertFalse(22862==22862+1);
}
@Test
public void bigFalseTestLibNum11() {
	assertFalse(28819==28819+1);
}
@Test
public void bigFalseTestLibNum12() {
	assertFalse(21509==21509+1);
}
@Test
public void bigFalseTestLibNum13() {
	assertFalse(2063==2063+1);
}
@Test
public void bigFalseTestLibNum14() {
	assertFalse(16541==16541+1);
}
@Test
public void bigFalseTestLibNum15() {
	assertFalse(21809==21809+1);
}
@Test
public void bigFalseTestLibNum16() {
	assertFalse(6102==6102+1);
}
@Test
public void bigFalseTestLibNum17() {
	assertFalse(4806==4806+1);
}
@Test
public void bigFalseTestLibNum18() {
	assertFalse(625==625+1);
}
@Test
public void bigFalseTestLibNum19() {
	assertFalse(9418==9418+1);
}
@Test
public void bigFalseTestLibNum20() {
	assertFalse(23544==23544+1);
}
@Test
public void bigFalseTestLibNum21() {
	assertFalse(12185==12185+1);
}
@Test
public void bigFalseTestLibNum22() {
	assertFalse(16689==16689+1);
}
@Test
public void bigFalseTestLibNum23() {
	assertFalse(23068==23068+1);
}
@Test
public void bigFalseTestLibNum24() {
	assertFalse(7962==7962+1);
}
@Test
public void bigFalseTestLibNum25() {
	assertFalse(6286==6286+1);
}
@Test
public void bigFalseTestLibNum26() {
	assertFalse(27698==27698+1);
}
@Test
public void bigFalseTestLibNum27() {
	assertFalse(21299==21299+1);
}
@Test
public void bigFalseTestLibNum28() {
	assertFalse(22664==22664+1);
}
@Test
public void bigFalseTestLibNum29() {
	assertFalse(2063==2063+1);
}
@Test
public void bigFalseTestLibNum30() {
	assertFalse(449==449+1);
}
@Test
public void bigFalseTestLibNum31() {
	assertFalse(6277==6277+1);
}
@Test
public void bigFalseTestLibNum32() {
	assertFalse(18195==18195+1);
}
@Test
public void bigFalseTestLibNum33() {
	assertFalse(15206==15206+1);
}
@Test
public void bigFalseTestLibNum34() {
	assertFalse(26095==26095+1);
}
@Test
public void bigFalseTestLibNum35() {
	assertFalse(31183==31183+1);
}
@Test
public void bigFalseTestLibNum36() {
	assertFalse(17089==17089+1);
}
@Test
public void bigFalseTestLibNum37() {
	assertFalse(8439==8439+1);
}
@Test
public void bigFalseTestLibNum38() {
	assertFalse(23071==23071+1);
}
@Test
public void bigFalseTestLibNum39() {
	assertFalse(7341==7341+1);
}
@Test
public void bigFalseTestLibNum40() {
	assertFalse(32053==32053+1);
}
@Test
public void bigFalseTestLibNum41() {
	assertFalse(11839==11839+1);
}
@Test
public void bigFalseTestLibNum42() {
	assertFalse(24912==24912+1);
}
@Test
public void bigFalseTestLibNum43() {
	assertFalse(22780==22780+1);
}
@Test
public void bigFalseTestLibNum44() {
	assertFalse(23773==23773+1);
}
@Test
public void bigFalseTestLibNum45() {
	assertFalse(6544==6544+1);
}
@Test
public void bigFalseTestLibNum46() {
	assertFalse(7467==7467+1);
}
@Test
public void bigFalseTestLibNum47() {
	assertFalse(32496==32496+1);
}
@Test
public void bigFalseTestLibNum48() {
	assertFalse(24286==24286+1);
}
@Test
public void bigFalseTestLibNum49() {
	assertFalse(29577==29577+1);
}
@Test
public void bigFalseTestLibNum50() {
	assertFalse(28620==28620+1);
}
@Test
public void bigFalseTestLibNum51() {
	assertFalse(25332==25332+1);
}
@Test
public void bigFalseTestLibNum52() {
	assertFalse(11199==11199+1);
}
@Test
public void bigFalseTestLibNum53() {
	assertFalse(23639==23639+1);
}
@Test
public void bigFalseTestLibNum54() {
	assertFalse(28240==28240+1);
}
@Test
public void bigFalseTestLibNum55() {
	assertFalse(19269==19269+1);
}
}
