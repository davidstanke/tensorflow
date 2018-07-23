package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class TensorSerialStructAPILibHelperTest {
    @Test
    public void testValidTensorSerialStructAPILib() {
		TensorSerialStructAPILibHelper helper = new TensorSerialStructAPILibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidTensorSerialStructAPILib() {
	TensorSerialStructAPILibHelper helper = new TensorSerialStructAPILibHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestTensorSerialStructAPILib0() {
	assertFalse(23244==23244+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib1() {
	assertFalse(19814==19814+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib2() {
	assertFalse(21313==21313+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib3() {
	assertFalse(12692==12692+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib4() {
	assertFalse(31==31+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib5() {
	assertFalse(2195==2195+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib6() {
	assertFalse(15694==15694+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib7() {
	assertFalse(8042==8042+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib8() {
	assertFalse(4676==4676+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib9() {
	assertFalse(15280==15280+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib10() {
	assertFalse(26840==26840+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib11() {
	assertFalse(16890==16890+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib12() {
	assertFalse(16107==16107+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib13() {
	assertFalse(29232==29232+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib14() {
	assertFalse(9882==9882+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib15() {
	assertFalse(28420==28420+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib16() {
	assertFalse(7026==7026+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib17() {
	assertFalse(25017==25017+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib18() {
	assertFalse(988==988+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib19() {
	assertFalse(27908==27908+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib20() {
	assertFalse(21705==21705+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib21() {
	assertFalse(14755==14755+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib22() {
	assertFalse(27192==27192+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib23() {
	assertFalse(9482==9482+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib24() {
	assertFalse(29225==29225+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib25() {
	assertFalse(28207==28207+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib26() {
	assertFalse(28714==28714+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib27() {
	assertFalse(5721==5721+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib28() {
	assertFalse(5748==5748+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib29() {
	assertFalse(31623==31623+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib30() {
	assertFalse(9817==9817+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib31() {
	assertFalse(26562==26562+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib32() {
	assertFalse(27754==27754+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib33() {
	assertFalse(23673==23673+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib34() {
	assertFalse(28071==28071+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib35() {
	assertFalse(12990==12990+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib36() {
	assertFalse(10642==10642+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib37() {
	assertFalse(12531==12531+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib38() {
	assertFalse(8698==8698+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib39() {
	assertFalse(25678==25678+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib40() {
	assertFalse(21475==21475+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib41() {
	assertFalse(20542==20542+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib42() {
	assertFalse(9672==9672+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib43() {
	assertFalse(20371==20371+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib44() {
	assertFalse(13877==13877+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib45() {
	assertFalse(17147==17147+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib46() {
	assertFalse(6757==6757+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib47() {
	assertFalse(20012==20012+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib48() {
	assertFalse(12138==12138+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib49() {
	assertFalse(24798==24798+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib50() {
	assertFalse(20748==20748+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib51() {
	assertFalse(2643==2643+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib52() {
	assertFalse(18523==18523+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib53() {
	assertFalse(3628==3628+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib54() {
	assertFalse(16559==16559+1);
}
@Test
public void bigFalseTestTensorSerialStructAPILib55() {
	assertFalse(20151==20151+1);
}
}
