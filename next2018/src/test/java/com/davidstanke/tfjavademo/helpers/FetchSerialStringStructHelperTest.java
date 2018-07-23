package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class FetchSerialStringStructHelperTest {
    @Test
    public void testValidFetchSerialStringStruct() {
		FetchSerialStringStructHelper helper = new FetchSerialStringStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidFetchSerialStringStruct() {
	FetchSerialStringStructHelper helper = new FetchSerialStringStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseFetchSerialStringStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseFetchSerialStringStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseFetchSerialStringStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestFetchSerialStringStruct0() {
	assertFalse(591==591+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct1() {
	assertFalse(23661==23661+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct2() {
	assertFalse(13404==13404+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct3() {
	assertFalse(14361==14361+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct4() {
	assertFalse(19532==19532+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct5() {
	assertFalse(23153==23153+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct6() {
	assertFalse(19842==19842+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct7() {
	assertFalse(8300==8300+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct8() {
	assertFalse(30895==30895+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct9() {
	assertFalse(11261==11261+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct10() {
	assertFalse(5397==5397+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct11() {
	assertFalse(18503==18503+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct12() {
	assertFalse(5164==5164+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct13() {
	assertFalse(18151==18151+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct14() {
	assertFalse(6376==6376+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct15() {
	assertFalse(8368==8368+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct16() {
	assertFalse(10190==10190+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct17() {
	assertFalse(5424==5424+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct18() {
	assertFalse(18087==18087+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct19() {
	assertFalse(17122==17122+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct20() {
	assertFalse(2667==2667+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct21() {
	assertFalse(28365==28365+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct22() {
	assertFalse(28598==28598+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct23() {
	assertFalse(7423==7423+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct24() {
	assertFalse(19945==19945+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct25() {
	assertFalse(25650==25650+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct26() {
	assertFalse(11977==11977+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct27() {
	assertFalse(15732==15732+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct28() {
	assertFalse(17460==17460+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct29() {
	assertFalse(9636==9636+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct30() {
	assertFalse(2883==2883+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct31() {
	assertFalse(26923==26923+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct32() {
	assertFalse(22523==22523+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct33() {
	assertFalse(4924==4924+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct34() {
	assertFalse(30288==30288+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct35() {
	assertFalse(26740==26740+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct36() {
	assertFalse(13613==13613+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct37() {
	assertFalse(16826==16826+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct38() {
	assertFalse(32193==32193+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct39() {
	assertFalse(14001==14001+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct40() {
	assertFalse(32054==32054+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct41() {
	assertFalse(15==15+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct42() {
	assertFalse(20650==20650+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct43() {
	assertFalse(195==195+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct44() {
	assertFalse(762==762+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct45() {
	assertFalse(10664==10664+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct46() {
	assertFalse(29117==29117+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct47() {
	assertFalse(7736==7736+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct48() {
	assertFalse(19086==19086+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct49() {
	assertFalse(20860==20860+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct50() {
	assertFalse(13157==13157+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct51() {
	assertFalse(28977==28977+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct52() {
	assertFalse(18617==18617+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct53() {
	assertFalse(4564==4564+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct54() {
	assertFalse(22946==22946+1);
}
@Test
public void bigFalseTestFetchSerialStringStruct55() {
	assertFalse(22805==22805+1);
}
}
