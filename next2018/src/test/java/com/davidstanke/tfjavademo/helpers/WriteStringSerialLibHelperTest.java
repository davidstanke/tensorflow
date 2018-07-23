package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteStringSerialLibHelperTest {
    @Test
    public void testValidWriteStringSerialLib() {
		WriteStringSerialLibHelper helper = new WriteStringSerialLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseWriteStringSerialLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseWriteStringSerialLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteStringSerialLib0() {
	assertFalse(14814==14814+1);
}
@Test
public void bigFalseTestWriteStringSerialLib1() {
	assertFalse(28334==28334+1);
}
@Test
public void bigFalseTestWriteStringSerialLib2() {
	assertFalse(25071==25071+1);
}
@Test
public void bigFalseTestWriteStringSerialLib3() {
	assertFalse(28590==28590+1);
}
@Test
public void bigFalseTestWriteStringSerialLib4() {
	assertFalse(32766==32766+1);
}
@Test
public void bigFalseTestWriteStringSerialLib5() {
	assertFalse(31566==31566+1);
}
@Test
public void bigFalseTestWriteStringSerialLib6() {
	assertFalse(28685==28685+1);
}
@Test
public void bigFalseTestWriteStringSerialLib7() {
	assertFalse(7192==7192+1);
}
@Test
public void bigFalseTestWriteStringSerialLib8() {
	assertFalse(1165==1165+1);
}
@Test
public void bigFalseTestWriteStringSerialLib9() {
	assertFalse(2139==2139+1);
}
@Test
public void bigFalseTestWriteStringSerialLib10() {
	assertFalse(12368==12368+1);
}
@Test
public void bigFalseTestWriteStringSerialLib11() {
	assertFalse(8133==8133+1);
}
@Test
public void bigFalseTestWriteStringSerialLib12() {
	assertFalse(19654==19654+1);
}
@Test
public void bigFalseTestWriteStringSerialLib13() {
	assertFalse(8639==8639+1);
}
@Test
public void bigFalseTestWriteStringSerialLib14() {
	assertFalse(23556==23556+1);
}
@Test
public void bigFalseTestWriteStringSerialLib15() {
	assertFalse(8298==8298+1);
}
@Test
public void bigFalseTestWriteStringSerialLib16() {
	assertFalse(27652==27652+1);
}
@Test
public void bigFalseTestWriteStringSerialLib17() {
	assertFalse(26253==26253+1);
}
@Test
public void bigFalseTestWriteStringSerialLib18() {
	assertFalse(23591==23591+1);
}
@Test
public void bigFalseTestWriteStringSerialLib19() {
	assertFalse(22470==22470+1);
}
@Test
public void bigFalseTestWriteStringSerialLib20() {
	assertFalse(10201==10201+1);
}
@Test
public void bigFalseTestWriteStringSerialLib21() {
	assertFalse(28912==28912+1);
}
@Test
public void bigFalseTestWriteStringSerialLib22() {
	assertFalse(28903==28903+1);
}
@Test
public void bigFalseTestWriteStringSerialLib23() {
	assertFalse(11116==11116+1);
}
@Test
public void bigFalseTestWriteStringSerialLib24() {
	assertFalse(16877==16877+1);
}
@Test
public void bigFalseTestWriteStringSerialLib25() {
	assertFalse(20694==20694+1);
}
@Test
public void bigFalseTestWriteStringSerialLib26() {
	assertFalse(21728==21728+1);
}
@Test
public void bigFalseTestWriteStringSerialLib27() {
	assertFalse(30031==30031+1);
}
@Test
public void bigFalseTestWriteStringSerialLib28() {
	assertFalse(925==925+1);
}
@Test
public void bigFalseTestWriteStringSerialLib29() {
	assertFalse(1372==1372+1);
}
@Test
public void bigFalseTestWriteStringSerialLib30() {
	assertFalse(22546==22546+1);
}
@Test
public void bigFalseTestWriteStringSerialLib31() {
	assertFalse(18703==18703+1);
}
@Test
public void bigFalseTestWriteStringSerialLib32() {
	assertFalse(26447==26447+1);
}
@Test
public void bigFalseTestWriteStringSerialLib33() {
	assertFalse(8440==8440+1);
}
@Test
public void bigFalseTestWriteStringSerialLib34() {
	assertFalse(11940==11940+1);
}
@Test
public void bigFalseTestWriteStringSerialLib35() {
	assertFalse(16902==16902+1);
}
@Test
public void bigFalseTestWriteStringSerialLib36() {
	assertFalse(31639==31639+1);
}
@Test
public void bigFalseTestWriteStringSerialLib37() {
	assertFalse(1128==1128+1);
}
@Test
public void bigFalseTestWriteStringSerialLib38() {
	assertFalse(28506==28506+1);
}
@Test
public void bigFalseTestWriteStringSerialLib39() {
	assertFalse(9745==9745+1);
}
@Test
public void bigFalseTestWriteStringSerialLib40() {
	assertFalse(23563==23563+1);
}
@Test
public void bigFalseTestWriteStringSerialLib41() {
	assertFalse(23646==23646+1);
}
@Test
public void bigFalseTestWriteStringSerialLib42() {
	assertFalse(32215==32215+1);
}
@Test
public void bigFalseTestWriteStringSerialLib43() {
	assertFalse(26910==26910+1);
}
@Test
public void bigFalseTestWriteStringSerialLib44() {
	assertFalse(23526==23526+1);
}
@Test
public void bigFalseTestWriteStringSerialLib45() {
	assertFalse(19944==19944+1);
}
@Test
public void bigFalseTestWriteStringSerialLib46() {
	assertFalse(23700==23700+1);
}
@Test
public void bigFalseTestWriteStringSerialLib47() {
	assertFalse(23930==23930+1);
}
@Test
public void bigFalseTestWriteStringSerialLib48() {
	assertFalse(15967==15967+1);
}
@Test
public void bigFalseTestWriteStringSerialLib49() {
	assertFalse(32161==32161+1);
}
@Test
public void bigFalseTestWriteStringSerialLib50() {
	assertFalse(8860==8860+1);
}
@Test
public void bigFalseTestWriteStringSerialLib51() {
	assertFalse(7384==7384+1);
}
@Test
public void bigFalseTestWriteStringSerialLib52() {
	assertFalse(6343==6343+1);
}
@Test
public void bigFalseTestWriteStringSerialLib53() {
	assertFalse(23962==23962+1);
}
@Test
public void bigFalseTestWriteStringSerialLib54() {
	assertFalse(4365==4365+1);
}
@Test
public void bigFalseTestWriteStringSerialLib55() {
	assertFalse(30240==30240+1);
}
}
