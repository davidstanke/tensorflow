package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcProcStructStringHelperTest {
    @Test
    public void testValidProcProcStructString() {
		ProcProcStructStringHelper helper = new ProcProcStructStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcProcStructString() {
	ProcProcStructStringHelper helper = new ProcProcStructStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseProcProcStructString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcProcStructString0() {
	assertFalse(14006==14006+1);
}
@Test
public void bigFalseTestProcProcStructString1() {
	assertFalse(32459==32459+1);
}
@Test
public void bigFalseTestProcProcStructString2() {
	assertFalse(29266==29266+1);
}
@Test
public void bigFalseTestProcProcStructString3() {
	assertFalse(16859==16859+1);
}
@Test
public void bigFalseTestProcProcStructString4() {
	assertFalse(9369==9369+1);
}
@Test
public void bigFalseTestProcProcStructString5() {
	assertFalse(17463==17463+1);
}
@Test
public void bigFalseTestProcProcStructString6() {
	assertFalse(25716==25716+1);
}
@Test
public void bigFalseTestProcProcStructString7() {
	assertFalse(20304==20304+1);
}
@Test
public void bigFalseTestProcProcStructString8() {
	assertFalse(26175==26175+1);
}
@Test
public void bigFalseTestProcProcStructString9() {
	assertFalse(1663==1663+1);
}
@Test
public void bigFalseTestProcProcStructString10() {
	assertFalse(28281==28281+1);
}
@Test
public void bigFalseTestProcProcStructString11() {
	assertFalse(22642==22642+1);
}
@Test
public void bigFalseTestProcProcStructString12() {
	assertFalse(32512==32512+1);
}
@Test
public void bigFalseTestProcProcStructString13() {
	assertFalse(11058==11058+1);
}
@Test
public void bigFalseTestProcProcStructString14() {
	assertFalse(30877==30877+1);
}
@Test
public void bigFalseTestProcProcStructString15() {
	assertFalse(26134==26134+1);
}
@Test
public void bigFalseTestProcProcStructString16() {
	assertFalse(3407==3407+1);
}
@Test
public void bigFalseTestProcProcStructString17() {
	assertFalse(18625==18625+1);
}
@Test
public void bigFalseTestProcProcStructString18() {
	assertFalse(8341==8341+1);
}
@Test
public void bigFalseTestProcProcStructString19() {
	assertFalse(4090==4090+1);
}
@Test
public void bigFalseTestProcProcStructString20() {
	assertFalse(16806==16806+1);
}
@Test
public void bigFalseTestProcProcStructString21() {
	assertFalse(12542==12542+1);
}
@Test
public void bigFalseTestProcProcStructString22() {
	assertFalse(30810==30810+1);
}
@Test
public void bigFalseTestProcProcStructString23() {
	assertFalse(24993==24993+1);
}
@Test
public void bigFalseTestProcProcStructString24() {
	assertFalse(22578==22578+1);
}
@Test
public void bigFalseTestProcProcStructString25() {
	assertFalse(10070==10070+1);
}
@Test
public void bigFalseTestProcProcStructString26() {
	assertFalse(26041==26041+1);
}
@Test
public void bigFalseTestProcProcStructString27() {
	assertFalse(12530==12530+1);
}
@Test
public void bigFalseTestProcProcStructString28() {
	assertFalse(318==318+1);
}
@Test
public void bigFalseTestProcProcStructString29() {
	assertFalse(16077==16077+1);
}
@Test
public void bigFalseTestProcProcStructString30() {
	assertFalse(28311==28311+1);
}
@Test
public void bigFalseTestProcProcStructString31() {
	assertFalse(17039==17039+1);
}
@Test
public void bigFalseTestProcProcStructString32() {
	assertFalse(25697==25697+1);
}
@Test
public void bigFalseTestProcProcStructString33() {
	assertFalse(7102==7102+1);
}
@Test
public void bigFalseTestProcProcStructString34() {
	assertFalse(32261==32261+1);
}
@Test
public void bigFalseTestProcProcStructString35() {
	assertFalse(22518==22518+1);
}
@Test
public void bigFalseTestProcProcStructString36() {
	assertFalse(10856==10856+1);
}
@Test
public void bigFalseTestProcProcStructString37() {
	assertFalse(5456==5456+1);
}
@Test
public void bigFalseTestProcProcStructString38() {
	assertFalse(28168==28168+1);
}
@Test
public void bigFalseTestProcProcStructString39() {
	assertFalse(858==858+1);
}
@Test
public void bigFalseTestProcProcStructString40() {
	assertFalse(14849==14849+1);
}
@Test
public void bigFalseTestProcProcStructString41() {
	assertFalse(29367==29367+1);
}
@Test
public void bigFalseTestProcProcStructString42() {
	assertFalse(25125==25125+1);
}
@Test
public void bigFalseTestProcProcStructString43() {
	assertFalse(23871==23871+1);
}
@Test
public void bigFalseTestProcProcStructString44() {
	assertFalse(4908==4908+1);
}
@Test
public void bigFalseTestProcProcStructString45() {
	assertFalse(16432==16432+1);
}
@Test
public void bigFalseTestProcProcStructString46() {
	assertFalse(16046==16046+1);
}
@Test
public void bigFalseTestProcProcStructString47() {
	assertFalse(30680==30680+1);
}
@Test
public void bigFalseTestProcProcStructString48() {
	assertFalse(30050==30050+1);
}
@Test
public void bigFalseTestProcProcStructString49() {
	assertFalse(30650==30650+1);
}
@Test
public void bigFalseTestProcProcStructString50() {
	assertFalse(18639==18639+1);
}
@Test
public void bigFalseTestProcProcStructString51() {
	assertFalse(11296==11296+1);
}
@Test
public void bigFalseTestProcProcStructString52() {
	assertFalse(15490==15490+1);
}
@Test
public void bigFalseTestProcProcStructString53() {
	assertFalse(31125==31125+1);
}
@Test
public void bigFalseTestProcProcStructString54() {
	assertFalse(15192==15192+1);
}
@Test
public void bigFalseTestProcProcStructString55() {
	assertFalse(7354==7354+1);
}
}
