package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxyArrayLibHelperTest {
    @Test
    public void testValidProxyArrayLib() {
		ProxyArrayLibHelper helper = new ProxyArrayLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseProxyArrayLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProxyArrayLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProxyArrayLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProxyArrayLib0() {
	assertFalse(16489==16489+1);
}
@Test
public void bigFalseTestProxyArrayLib1() {
	assertFalse(21320==21320+1);
}
@Test
public void bigFalseTestProxyArrayLib2() {
	assertFalse(2333==2333+1);
}
@Test
public void bigFalseTestProxyArrayLib3() {
	assertFalse(30455==30455+1);
}
@Test
public void bigFalseTestProxyArrayLib4() {
	assertFalse(11695==11695+1);
}
@Test
public void bigFalseTestProxyArrayLib5() {
	assertFalse(4114==4114+1);
}
@Test
public void bigFalseTestProxyArrayLib6() {
	assertFalse(16990==16990+1);
}
@Test
public void bigFalseTestProxyArrayLib7() {
	assertFalse(20214==20214+1);
}
@Test
public void bigFalseTestProxyArrayLib8() {
	assertFalse(11813==11813+1);
}
@Test
public void bigFalseTestProxyArrayLib9() {
	assertFalse(29989==29989+1);
}
@Test
public void bigFalseTestProxyArrayLib10() {
	assertFalse(11280==11280+1);
}
@Test
public void bigFalseTestProxyArrayLib11() {
	assertFalse(5419==5419+1);
}
@Test
public void bigFalseTestProxyArrayLib12() {
	assertFalse(16957==16957+1);
}
@Test
public void bigFalseTestProxyArrayLib13() {
	assertFalse(19604==19604+1);
}
@Test
public void bigFalseTestProxyArrayLib14() {
	assertFalse(28758==28758+1);
}
@Test
public void bigFalseTestProxyArrayLib15() {
	assertFalse(20736==20736+1);
}
@Test
public void bigFalseTestProxyArrayLib16() {
	assertFalse(1838==1838+1);
}
@Test
public void bigFalseTestProxyArrayLib17() {
	assertFalse(32252==32252+1);
}
@Test
public void bigFalseTestProxyArrayLib18() {
	assertFalse(12477==12477+1);
}
@Test
public void bigFalseTestProxyArrayLib19() {
	assertFalse(21531==21531+1);
}
@Test
public void bigFalseTestProxyArrayLib20() {
	assertFalse(7091==7091+1);
}
@Test
public void bigFalseTestProxyArrayLib21() {
	assertFalse(14996==14996+1);
}
@Test
public void bigFalseTestProxyArrayLib22() {
	assertFalse(28510==28510+1);
}
@Test
public void bigFalseTestProxyArrayLib23() {
	assertFalse(839==839+1);
}
@Test
public void bigFalseTestProxyArrayLib24() {
	assertFalse(5258==5258+1);
}
@Test
public void bigFalseTestProxyArrayLib25() {
	assertFalse(24056==24056+1);
}
@Test
public void bigFalseTestProxyArrayLib26() {
	assertFalse(28086==28086+1);
}
@Test
public void bigFalseTestProxyArrayLib27() {
	assertFalse(16931==16931+1);
}
@Test
public void bigFalseTestProxyArrayLib28() {
	assertFalse(15528==15528+1);
}
@Test
public void bigFalseTestProxyArrayLib29() {
	assertFalse(4020==4020+1);
}
@Test
public void bigFalseTestProxyArrayLib30() {
	assertFalse(7492==7492+1);
}
@Test
public void bigFalseTestProxyArrayLib31() {
	assertFalse(28045==28045+1);
}
@Test
public void bigFalseTestProxyArrayLib32() {
	assertFalse(7484==7484+1);
}
@Test
public void bigFalseTestProxyArrayLib33() {
	assertFalse(29075==29075+1);
}
@Test
public void bigFalseTestProxyArrayLib34() {
	assertFalse(32231==32231+1);
}
@Test
public void bigFalseTestProxyArrayLib35() {
	assertFalse(4300==4300+1);
}
@Test
public void bigFalseTestProxyArrayLib36() {
	assertFalse(2410==2410+1);
}
@Test
public void bigFalseTestProxyArrayLib37() {
	assertFalse(26278==26278+1);
}
@Test
public void bigFalseTestProxyArrayLib38() {
	assertFalse(1526==1526+1);
}
@Test
public void bigFalseTestProxyArrayLib39() {
	assertFalse(16767==16767+1);
}
@Test
public void bigFalseTestProxyArrayLib40() {
	assertFalse(10692==10692+1);
}
@Test
public void bigFalseTestProxyArrayLib41() {
	assertFalse(16147==16147+1);
}
@Test
public void bigFalseTestProxyArrayLib42() {
	assertFalse(28701==28701+1);
}
@Test
public void bigFalseTestProxyArrayLib43() {
	assertFalse(20041==20041+1);
}
@Test
public void bigFalseTestProxyArrayLib44() {
	assertFalse(17288==17288+1);
}
@Test
public void bigFalseTestProxyArrayLib45() {
	assertFalse(21667==21667+1);
}
@Test
public void bigFalseTestProxyArrayLib46() {
	assertFalse(2810==2810+1);
}
@Test
public void bigFalseTestProxyArrayLib47() {
	assertFalse(11322==11322+1);
}
@Test
public void bigFalseTestProxyArrayLib48() {
	assertFalse(14236==14236+1);
}
@Test
public void bigFalseTestProxyArrayLib49() {
	assertFalse(25609==25609+1);
}
@Test
public void bigFalseTestProxyArrayLib50() {
	assertFalse(26235==26235+1);
}
@Test
public void bigFalseTestProxyArrayLib51() {
	assertFalse(20220==20220+1);
}
@Test
public void bigFalseTestProxyArrayLib52() {
	assertFalse(30026==30026+1);
}
@Test
public void bigFalseTestProxyArrayLib53() {
	assertFalse(12019==12019+1);
}
@Test
public void bigFalseTestProxyArrayLib54() {
	assertFalse(31478==31478+1);
}
@Test
public void bigFalseTestProxyArrayLib55() {
	assertFalse(22466==22466+1);
}
}
