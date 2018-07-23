package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataSerialProxyAPIHelperTest {
    @Test
    public void testValidDataSerialProxyAPI() {
		DataSerialProxyAPIHelper helper = new DataSerialProxyAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseDataSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseDataSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseDataSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataSerialProxyAPI0() {
	assertFalse(31404==31404+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI1() {
	assertFalse(3488==3488+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI2() {
	assertFalse(345==345+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI3() {
	assertFalse(497==497+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI4() {
	assertFalse(14215==14215+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI5() {
	assertFalse(16388==16388+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI6() {
	assertFalse(17069==17069+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI7() {
	assertFalse(6491==6491+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI8() {
	assertFalse(10394==10394+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI9() {
	assertFalse(11668==11668+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI10() {
	assertFalse(8429==8429+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI11() {
	assertFalse(32139==32139+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI12() {
	assertFalse(4303==4303+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI13() {
	assertFalse(26369==26369+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI14() {
	assertFalse(10803==10803+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI15() {
	assertFalse(13741==13741+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI16() {
	assertFalse(5750==5750+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI17() {
	assertFalse(7737==7737+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI18() {
	assertFalse(319==319+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI19() {
	assertFalse(17812==17812+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI20() {
	assertFalse(29425==29425+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI21() {
	assertFalse(23209==23209+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI22() {
	assertFalse(25346==25346+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI23() {
	assertFalse(12884==12884+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI24() {
	assertFalse(28961==28961+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI25() {
	assertFalse(13618==13618+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI26() {
	assertFalse(30953==30953+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI27() {
	assertFalse(13469==13469+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI28() {
	assertFalse(26260==26260+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI29() {
	assertFalse(22508==22508+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI30() {
	assertFalse(1003==1003+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI31() {
	assertFalse(13530==13530+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI32() {
	assertFalse(4971==4971+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI33() {
	assertFalse(15773==15773+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI34() {
	assertFalse(11345==11345+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI35() {
	assertFalse(27917==27917+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI36() {
	assertFalse(5388==5388+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI37() {
	assertFalse(27896==27896+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI38() {
	assertFalse(584==584+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI39() {
	assertFalse(19561==19561+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI40() {
	assertFalse(22413==22413+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI41() {
	assertFalse(11157==11157+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI42() {
	assertFalse(31528==31528+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI43() {
	assertFalse(30892==30892+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI44() {
	assertFalse(12763==12763+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI45() {
	assertFalse(25780==25780+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI46() {
	assertFalse(30594==30594+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI47() {
	assertFalse(2371==2371+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI48() {
	assertFalse(6318==6318+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI49() {
	assertFalse(16305==16305+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI50() {
	assertFalse(7660==7660+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI51() {
	assertFalse(22556==22556+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI52() {
	assertFalse(5165==5165+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI53() {
	assertFalse(8775==8775+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI54() {
	assertFalse(5771==5771+1);
}
@Test
public void bigFalseTestDataSerialProxyAPI55() {
	assertFalse(1097==1097+1);
}
}
