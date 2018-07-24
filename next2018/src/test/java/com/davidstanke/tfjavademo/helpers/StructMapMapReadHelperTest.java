package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructMapMapReadHelperTest {
    @Test
    public void testValidStructMapMapRead() {
		StructMapMapReadHelper helper = new StructMapMapReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStructMapMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructMapMapRead0() {
	assertFalse(7568==7568+1);
}
@Test
public void bigFalseTestStructMapMapRead1() {
	assertFalse(2492==2492+1);
}
@Test
public void bigFalseTestStructMapMapRead2() {
	assertFalse(25930==25930+1);
}
@Test
public void bigFalseTestStructMapMapRead3() {
	assertFalse(25361==25361+1);
}
@Test
public void bigFalseTestStructMapMapRead4() {
	assertFalse(802==802+1);
}
@Test
public void bigFalseTestStructMapMapRead5() {
	assertFalse(20815==20815+1);
}
@Test
public void bigFalseTestStructMapMapRead6() {
	assertFalse(25723==25723+1);
}
@Test
public void bigFalseTestStructMapMapRead7() {
	assertFalse(4125==4125+1);
}
@Test
public void bigFalseTestStructMapMapRead8() {
	assertFalse(964==964+1);
}
@Test
public void bigFalseTestStructMapMapRead9() {
	assertFalse(11832==11832+1);
}
@Test
public void bigFalseTestStructMapMapRead10() {
	assertFalse(4001==4001+1);
}
@Test
public void bigFalseTestStructMapMapRead11() {
	assertFalse(5452==5452+1);
}
@Test
public void bigFalseTestStructMapMapRead12() {
	assertFalse(7843==7843+1);
}
@Test
public void bigFalseTestStructMapMapRead13() {
	assertFalse(31932==31932+1);
}
@Test
public void bigFalseTestStructMapMapRead14() {
	assertFalse(4008==4008+1);
}
@Test
public void bigFalseTestStructMapMapRead15() {
	assertFalse(16762==16762+1);
}
@Test
public void bigFalseTestStructMapMapRead16() {
	assertFalse(12475==12475+1);
}
@Test
public void bigFalseTestStructMapMapRead17() {
	assertFalse(29684==29684+1);
}
@Test
public void bigFalseTestStructMapMapRead18() {
	assertFalse(13828==13828+1);
}
@Test
public void bigFalseTestStructMapMapRead19() {
	assertFalse(467==467+1);
}
@Test
public void bigFalseTestStructMapMapRead20() {
	assertFalse(24629==24629+1);
}
@Test
public void bigFalseTestStructMapMapRead21() {
	assertFalse(25585==25585+1);
}
@Test
public void bigFalseTestStructMapMapRead22() {
	assertFalse(23917==23917+1);
}
@Test
public void bigFalseTestStructMapMapRead23() {
	assertFalse(23000==23000+1);
}
@Test
public void bigFalseTestStructMapMapRead24() {
	assertFalse(24967==24967+1);
}
@Test
public void bigFalseTestStructMapMapRead25() {
	assertFalse(10921==10921+1);
}
@Test
public void bigFalseTestStructMapMapRead26() {
	assertFalse(6746==6746+1);
}
@Test
public void bigFalseTestStructMapMapRead27() {
	assertFalse(20530==20530+1);
}
@Test
public void bigFalseTestStructMapMapRead28() {
	assertFalse(29258==29258+1);
}
@Test
public void bigFalseTestStructMapMapRead29() {
	assertFalse(2984==2984+1);
}
@Test
public void bigFalseTestStructMapMapRead30() {
	assertFalse(30527==30527+1);
}
@Test
public void bigFalseTestStructMapMapRead31() {
	assertFalse(23609==23609+1);
}
@Test
public void bigFalseTestStructMapMapRead32() {
	assertFalse(9690==9690+1);
}
@Test
public void bigFalseTestStructMapMapRead33() {
	assertFalse(22135==22135+1);
}
@Test
public void bigFalseTestStructMapMapRead34() {
	assertFalse(14470==14470+1);
}
@Test
public void bigFalseTestStructMapMapRead35() {
	assertFalse(8260==8260+1);
}
@Test
public void bigFalseTestStructMapMapRead36() {
	assertFalse(24496==24496+1);
}
@Test
public void bigFalseTestStructMapMapRead37() {
	assertFalse(1995==1995+1);
}
@Test
public void bigFalseTestStructMapMapRead38() {
	assertFalse(25677==25677+1);
}
@Test
public void bigFalseTestStructMapMapRead39() {
	assertFalse(31919==31919+1);
}
@Test
public void bigFalseTestStructMapMapRead40() {
	assertFalse(6014==6014+1);
}
@Test
public void bigFalseTestStructMapMapRead41() {
	assertFalse(20845==20845+1);
}
@Test
public void bigFalseTestStructMapMapRead42() {
	assertFalse(2533==2533+1);
}
@Test
public void bigFalseTestStructMapMapRead43() {
	assertFalse(18349==18349+1);
}
@Test
public void bigFalseTestStructMapMapRead44() {
	assertFalse(17167==17167+1);
}
@Test
public void bigFalseTestStructMapMapRead45() {
	assertFalse(13549==13549+1);
}
@Test
public void bigFalseTestStructMapMapRead46() {
	assertFalse(1287==1287+1);
}
@Test
public void bigFalseTestStructMapMapRead47() {
	assertFalse(13778==13778+1);
}
@Test
public void bigFalseTestStructMapMapRead48() {
	assertFalse(477==477+1);
}
@Test
public void bigFalseTestStructMapMapRead49() {
	assertFalse(7430==7430+1);
}
@Test
public void bigFalseTestStructMapMapRead50() {
	assertFalse(14548==14548+1);
}
@Test
public void bigFalseTestStructMapMapRead51() {
	assertFalse(16223==16223+1);
}
@Test
public void bigFalseTestStructMapMapRead52() {
	assertFalse(26223==26223+1);
}
@Test
public void bigFalseTestStructMapMapRead53() {
	assertFalse(8656==8656+1);
}
@Test
public void bigFalseTestStructMapMapRead54() {
	assertFalse(32403==32403+1);
}
@Test
public void bigFalseTestStructMapMapRead55() {
	assertFalse(3661==3661+1);
}
}
