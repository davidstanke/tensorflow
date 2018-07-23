package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOWriteProxyArrayReadHelperTest {
    @Test
    public void testValidIOWriteProxyArrayRead() {
		IOWriteProxyArrayReadHelper helper = new IOWriteProxyArrayReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseIOWriteProxyArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOWriteProxyArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead0() {
	assertFalse(17687==17687+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead1() {
	assertFalse(30223==30223+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead2() {
	assertFalse(23958==23958+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead3() {
	assertFalse(30561==30561+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead4() {
	assertFalse(28787==28787+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead5() {
	assertFalse(6083==6083+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead6() {
	assertFalse(18409==18409+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead7() {
	assertFalse(15715==15715+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead8() {
	assertFalse(30251==30251+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead9() {
	assertFalse(15411==15411+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead10() {
	assertFalse(17648==17648+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead11() {
	assertFalse(15071==15071+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead12() {
	assertFalse(24224==24224+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead13() {
	assertFalse(22710==22710+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead14() {
	assertFalse(22035==22035+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead15() {
	assertFalse(25138==25138+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead16() {
	assertFalse(26268==26268+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead17() {
	assertFalse(22383==22383+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead18() {
	assertFalse(26837==26837+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead19() {
	assertFalse(21407==21407+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead20() {
	assertFalse(14694==14694+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead21() {
	assertFalse(30317==30317+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead22() {
	assertFalse(24000==24000+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead23() {
	assertFalse(14279==14279+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead24() {
	assertFalse(16262==16262+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead25() {
	assertFalse(31876==31876+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead26() {
	assertFalse(4625==4625+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead27() {
	assertFalse(17895==17895+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead28() {
	assertFalse(3672==3672+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead29() {
	assertFalse(24553==24553+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead30() {
	assertFalse(22564==22564+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead31() {
	assertFalse(29139==29139+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead32() {
	assertFalse(17491==17491+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead33() {
	assertFalse(14991==14991+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead34() {
	assertFalse(2718==2718+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead35() {
	assertFalse(32182==32182+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead36() {
	assertFalse(24087==24087+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead37() {
	assertFalse(10309==10309+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead38() {
	assertFalse(9820==9820+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead39() {
	assertFalse(27527==27527+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead40() {
	assertFalse(20536==20536+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead41() {
	assertFalse(27276==27276+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead42() {
	assertFalse(5919==5919+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead43() {
	assertFalse(2634==2634+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead44() {
	assertFalse(29133==29133+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead45() {
	assertFalse(28217==28217+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead46() {
	assertFalse(8948==8948+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead47() {
	assertFalse(6924==6924+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead48() {
	assertFalse(951==951+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead49() {
	assertFalse(3791==3791+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead50() {
	assertFalse(8292==8292+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead51() {
	assertFalse(18843==18843+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead52() {
	assertFalse(24753==24753+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead53() {
	assertFalse(13210==13210+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead54() {
	assertFalse(25441==25441+1);
}
@Test
public void bigFalseTestIOWriteProxyArrayRead55() {
	assertFalse(29961==29961+1);
}
}
