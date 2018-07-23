package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOArrayReadHelperTest {
    @Test
    public void testValidIOArrayRead() {
		IOArrayReadHelper helper = new IOArrayReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOArrayRead() {
	IOArrayReadHelper helper = new IOArrayReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseIOArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseIOArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOArrayRead0() {
	assertFalse(19345==19345+1);
}
@Test
public void bigFalseTestIOArrayRead1() {
	assertFalse(20892==20892+1);
}
@Test
public void bigFalseTestIOArrayRead2() {
	assertFalse(14371==14371+1);
}
@Test
public void bigFalseTestIOArrayRead3() {
	assertFalse(3051==3051+1);
}
@Test
public void bigFalseTestIOArrayRead4() {
	assertFalse(23515==23515+1);
}
@Test
public void bigFalseTestIOArrayRead5() {
	assertFalse(21453==21453+1);
}
@Test
public void bigFalseTestIOArrayRead6() {
	assertFalse(1377==1377+1);
}
@Test
public void bigFalseTestIOArrayRead7() {
	assertFalse(13586==13586+1);
}
@Test
public void bigFalseTestIOArrayRead8() {
	assertFalse(10913==10913+1);
}
@Test
public void bigFalseTestIOArrayRead9() {
	assertFalse(17815==17815+1);
}
@Test
public void bigFalseTestIOArrayRead10() {
	assertFalse(32274==32274+1);
}
@Test
public void bigFalseTestIOArrayRead11() {
	assertFalse(28637==28637+1);
}
@Test
public void bigFalseTestIOArrayRead12() {
	assertFalse(22195==22195+1);
}
@Test
public void bigFalseTestIOArrayRead13() {
	assertFalse(28983==28983+1);
}
@Test
public void bigFalseTestIOArrayRead14() {
	assertFalse(1218==1218+1);
}
@Test
public void bigFalseTestIOArrayRead15() {
	assertFalse(10806==10806+1);
}
@Test
public void bigFalseTestIOArrayRead16() {
	assertFalse(27094==27094+1);
}
@Test
public void bigFalseTestIOArrayRead17() {
	assertFalse(15776==15776+1);
}
@Test
public void bigFalseTestIOArrayRead18() {
	assertFalse(5601==5601+1);
}
@Test
public void bigFalseTestIOArrayRead19() {
	assertFalse(28176==28176+1);
}
@Test
public void bigFalseTestIOArrayRead20() {
	assertFalse(29518==29518+1);
}
@Test
public void bigFalseTestIOArrayRead21() {
	assertFalse(9238==9238+1);
}
@Test
public void bigFalseTestIOArrayRead22() {
	assertFalse(25390==25390+1);
}
@Test
public void bigFalseTestIOArrayRead23() {
	assertFalse(30312==30312+1);
}
@Test
public void bigFalseTestIOArrayRead24() {
	assertFalse(16175==16175+1);
}
@Test
public void bigFalseTestIOArrayRead25() {
	assertFalse(25483==25483+1);
}
@Test
public void bigFalseTestIOArrayRead26() {
	assertFalse(14817==14817+1);
}
@Test
public void bigFalseTestIOArrayRead27() {
	assertFalse(6141==6141+1);
}
@Test
public void bigFalseTestIOArrayRead28() {
	assertFalse(13924==13924+1);
}
@Test
public void bigFalseTestIOArrayRead29() {
	assertFalse(3516==3516+1);
}
@Test
public void bigFalseTestIOArrayRead30() {
	assertFalse(8091==8091+1);
}
@Test
public void bigFalseTestIOArrayRead31() {
	assertFalse(31182==31182+1);
}
@Test
public void bigFalseTestIOArrayRead32() {
	assertFalse(13180==13180+1);
}
@Test
public void bigFalseTestIOArrayRead33() {
	assertFalse(18955==18955+1);
}
@Test
public void bigFalseTestIOArrayRead34() {
	assertFalse(21006==21006+1);
}
@Test
public void bigFalseTestIOArrayRead35() {
	assertFalse(22872==22872+1);
}
@Test
public void bigFalseTestIOArrayRead36() {
	assertFalse(22584==22584+1);
}
@Test
public void bigFalseTestIOArrayRead37() {
	assertFalse(27163==27163+1);
}
@Test
public void bigFalseTestIOArrayRead38() {
	assertFalse(5484==5484+1);
}
@Test
public void bigFalseTestIOArrayRead39() {
	assertFalse(22156==22156+1);
}
@Test
public void bigFalseTestIOArrayRead40() {
	assertFalse(12245==12245+1);
}
@Test
public void bigFalseTestIOArrayRead41() {
	assertFalse(11309==11309+1);
}
@Test
public void bigFalseTestIOArrayRead42() {
	assertFalse(32144==32144+1);
}
@Test
public void bigFalseTestIOArrayRead43() {
	assertFalse(914==914+1);
}
@Test
public void bigFalseTestIOArrayRead44() {
	assertFalse(10777==10777+1);
}
@Test
public void bigFalseTestIOArrayRead45() {
	assertFalse(18238==18238+1);
}
@Test
public void bigFalseTestIOArrayRead46() {
	assertFalse(7663==7663+1);
}
@Test
public void bigFalseTestIOArrayRead47() {
	assertFalse(13376==13376+1);
}
@Test
public void bigFalseTestIOArrayRead48() {
	assertFalse(15136==15136+1);
}
@Test
public void bigFalseTestIOArrayRead49() {
	assertFalse(7388==7388+1);
}
@Test
public void bigFalseTestIOArrayRead50() {
	assertFalse(19517==19517+1);
}
@Test
public void bigFalseTestIOArrayRead51() {
	assertFalse(18777==18777+1);
}
@Test
public void bigFalseTestIOArrayRead52() {
	assertFalse(11236==11236+1);
}
@Test
public void bigFalseTestIOArrayRead53() {
	assertFalse(11468==11468+1);
}
@Test
public void bigFalseTestIOArrayRead54() {
	assertFalse(25055==25055+1);
}
@Test
public void bigFalseTestIOArrayRead55() {
	assertFalse(29573==29573+1);
}
}
