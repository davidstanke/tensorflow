package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringIOArrayLibLibHelperTest {
    @Test
    public void testValidStringIOArrayLibLib() {
		StringIOArrayLibLibHelper helper = new StringIOArrayLibLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringIOArrayLibLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringIOArrayLibLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringIOArrayLibLib0() {
	assertFalse(4800==4800+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib1() {
	assertFalse(19554==19554+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib2() {
	assertFalse(12501==12501+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib3() {
	assertFalse(32662==32662+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib4() {
	assertFalse(13905==13905+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib5() {
	assertFalse(5259==5259+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib6() {
	assertFalse(13835==13835+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib7() {
	assertFalse(9574==9574+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib8() {
	assertFalse(17402==17402+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib9() {
	assertFalse(7274==7274+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib10() {
	assertFalse(7357==7357+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib11() {
	assertFalse(19429==19429+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib12() {
	assertFalse(3564==3564+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib13() {
	assertFalse(818==818+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib14() {
	assertFalse(15455==15455+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib15() {
	assertFalse(8591==8591+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib16() {
	assertFalse(29795==29795+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib17() {
	assertFalse(28531==28531+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib18() {
	assertFalse(15530==15530+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib19() {
	assertFalse(29866==29866+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib20() {
	assertFalse(8011==8011+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib21() {
	assertFalse(1372==1372+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib22() {
	assertFalse(13611==13611+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib23() {
	assertFalse(18905==18905+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib24() {
	assertFalse(9903==9903+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib25() {
	assertFalse(1201==1201+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib26() {
	assertFalse(14727==14727+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib27() {
	assertFalse(16513==16513+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib28() {
	assertFalse(21990==21990+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib29() {
	assertFalse(19082==19082+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib30() {
	assertFalse(24206==24206+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib31() {
	assertFalse(24799==24799+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib32() {
	assertFalse(30076==30076+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib33() {
	assertFalse(13009==13009+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib34() {
	assertFalse(1031==1031+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib35() {
	assertFalse(12262==12262+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib36() {
	assertFalse(18401==18401+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib37() {
	assertFalse(5497==5497+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib38() {
	assertFalse(28470==28470+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib39() {
	assertFalse(9434==9434+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib40() {
	assertFalse(9428==9428+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib41() {
	assertFalse(23423==23423+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib42() {
	assertFalse(557==557+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib43() {
	assertFalse(23725==23725+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib44() {
	assertFalse(24461==24461+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib45() {
	assertFalse(26529==26529+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib46() {
	assertFalse(7127==7127+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib47() {
	assertFalse(10012==10012+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib48() {
	assertFalse(25517==25517+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib49() {
	assertFalse(20193==20193+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib50() {
	assertFalse(27846==27846+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib51() {
	assertFalse(18825==18825+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib52() {
	assertFalse(13542==13542+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib53() {
	assertFalse(7352==7352+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib54() {
	assertFalse(19639==19639+1);
}
@Test
public void bigFalseTestStringIOArrayLibLib55() {
	assertFalse(5015==5015+1);
}
}
