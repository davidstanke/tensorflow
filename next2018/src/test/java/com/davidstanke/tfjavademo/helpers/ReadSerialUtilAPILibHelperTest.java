package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadSerialUtilAPILibHelperTest {
    @Test
    public void testValidReadSerialUtilAPILib() {
		ReadSerialUtilAPILibHelper helper = new ReadSerialUtilAPILibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseReadSerialUtilAPILib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseReadSerialUtilAPILib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadSerialUtilAPILib0() {
	assertFalse(22352==22352+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib1() {
	assertFalse(28460==28460+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib2() {
	assertFalse(12486==12486+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib3() {
	assertFalse(6691==6691+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib4() {
	assertFalse(9677==9677+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib5() {
	assertFalse(28858==28858+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib6() {
	assertFalse(32629==32629+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib7() {
	assertFalse(20330==20330+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib8() {
	assertFalse(4762==4762+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib9() {
	assertFalse(9773==9773+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib10() {
	assertFalse(11828==11828+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib11() {
	assertFalse(14998==14998+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib12() {
	assertFalse(8382==8382+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib13() {
	assertFalse(10101==10101+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib14() {
	assertFalse(12971==12971+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib15() {
	assertFalse(24350==24350+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib16() {
	assertFalse(870==870+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib17() {
	assertFalse(10734==10734+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib18() {
	assertFalse(11341==11341+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib19() {
	assertFalse(15768==15768+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib20() {
	assertFalse(22693==22693+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib21() {
	assertFalse(19053==19053+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib22() {
	assertFalse(4985==4985+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib23() {
	assertFalse(27291==27291+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib24() {
	assertFalse(21483==21483+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib25() {
	assertFalse(27660==27660+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib26() {
	assertFalse(15955==15955+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib27() {
	assertFalse(10357==10357+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib28() {
	assertFalse(5191==5191+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib29() {
	assertFalse(14262==14262+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib30() {
	assertFalse(22369==22369+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib31() {
	assertFalse(28562==28562+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib32() {
	assertFalse(8797==8797+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib33() {
	assertFalse(2161==2161+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib34() {
	assertFalse(8677==8677+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib35() {
	assertFalse(4519==4519+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib36() {
	assertFalse(21029==21029+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib37() {
	assertFalse(20590==20590+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib38() {
	assertFalse(10236==10236+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib39() {
	assertFalse(25505==25505+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib40() {
	assertFalse(1128==1128+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib41() {
	assertFalse(17106==17106+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib42() {
	assertFalse(11899==11899+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib43() {
	assertFalse(6737==6737+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib44() {
	assertFalse(1019==1019+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib45() {
	assertFalse(20034==20034+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib46() {
	assertFalse(2693==2693+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib47() {
	assertFalse(17876==17876+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib48() {
	assertFalse(31418==31418+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib49() {
	assertFalse(13361==13361+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib50() {
	assertFalse(13548==13548+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib51() {
	assertFalse(6083==6083+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib52() {
	assertFalse(14916==14916+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib53() {
	assertFalse(18665==18665+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib54() {
	assertFalse(14157==14157+1);
}
@Test
public void bigFalseTestReadSerialUtilAPILib55() {
	assertFalse(24608==24608+1);
}
}
