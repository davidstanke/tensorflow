package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcDataLibStringHelperTest {
    @Test
    public void testValidProcDataLibString() {
		ProcDataLibStringHelper helper = new ProcDataLibStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcDataLibString() {
	ProcDataLibStringHelper helper = new ProcDataLibStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProcDataLibString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcDataLibString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcDataLibString0() {
	assertFalse(8714==8714+1);
}
@Test
public void bigFalseTestProcDataLibString1() {
	assertFalse(31618==31618+1);
}
@Test
public void bigFalseTestProcDataLibString2() {
	assertFalse(15823==15823+1);
}
@Test
public void bigFalseTestProcDataLibString3() {
	assertFalse(1315==1315+1);
}
@Test
public void bigFalseTestProcDataLibString4() {
	assertFalse(23090==23090+1);
}
@Test
public void bigFalseTestProcDataLibString5() {
	assertFalse(10641==10641+1);
}
@Test
public void bigFalseTestProcDataLibString6() {
	assertFalse(7855==7855+1);
}
@Test
public void bigFalseTestProcDataLibString7() {
	assertFalse(16010==16010+1);
}
@Test
public void bigFalseTestProcDataLibString8() {
	assertFalse(7905==7905+1);
}
@Test
public void bigFalseTestProcDataLibString9() {
	assertFalse(5403==5403+1);
}
@Test
public void bigFalseTestProcDataLibString10() {
	assertFalse(23184==23184+1);
}
@Test
public void bigFalseTestProcDataLibString11() {
	assertFalse(3147==3147+1);
}
@Test
public void bigFalseTestProcDataLibString12() {
	assertFalse(30867==30867+1);
}
@Test
public void bigFalseTestProcDataLibString13() {
	assertFalse(16354==16354+1);
}
@Test
public void bigFalseTestProcDataLibString14() {
	assertFalse(9879==9879+1);
}
@Test
public void bigFalseTestProcDataLibString15() {
	assertFalse(20363==20363+1);
}
@Test
public void bigFalseTestProcDataLibString16() {
	assertFalse(4518==4518+1);
}
@Test
public void bigFalseTestProcDataLibString17() {
	assertFalse(24908==24908+1);
}
@Test
public void bigFalseTestProcDataLibString18() {
	assertFalse(27395==27395+1);
}
@Test
public void bigFalseTestProcDataLibString19() {
	assertFalse(26376==26376+1);
}
@Test
public void bigFalseTestProcDataLibString20() {
	assertFalse(21174==21174+1);
}
@Test
public void bigFalseTestProcDataLibString21() {
	assertFalse(389==389+1);
}
@Test
public void bigFalseTestProcDataLibString22() {
	assertFalse(15586==15586+1);
}
@Test
public void bigFalseTestProcDataLibString23() {
	assertFalse(19499==19499+1);
}
@Test
public void bigFalseTestProcDataLibString24() {
	assertFalse(26806==26806+1);
}
@Test
public void bigFalseTestProcDataLibString25() {
	assertFalse(7028==7028+1);
}
@Test
public void bigFalseTestProcDataLibString26() {
	assertFalse(14230==14230+1);
}
@Test
public void bigFalseTestProcDataLibString27() {
	assertFalse(29903==29903+1);
}
@Test
public void bigFalseTestProcDataLibString28() {
	assertFalse(4307==4307+1);
}
@Test
public void bigFalseTestProcDataLibString29() {
	assertFalse(29023==29023+1);
}
@Test
public void bigFalseTestProcDataLibString30() {
	assertFalse(29195==29195+1);
}
@Test
public void bigFalseTestProcDataLibString31() {
	assertFalse(1492==1492+1);
}
@Test
public void bigFalseTestProcDataLibString32() {
	assertFalse(17929==17929+1);
}
@Test
public void bigFalseTestProcDataLibString33() {
	assertFalse(93==93+1);
}
@Test
public void bigFalseTestProcDataLibString34() {
	assertFalse(2997==2997+1);
}
@Test
public void bigFalseTestProcDataLibString35() {
	assertFalse(8802==8802+1);
}
@Test
public void bigFalseTestProcDataLibString36() {
	assertFalse(11393==11393+1);
}
@Test
public void bigFalseTestProcDataLibString37() {
	assertFalse(15999==15999+1);
}
@Test
public void bigFalseTestProcDataLibString38() {
	assertFalse(3404==3404+1);
}
@Test
public void bigFalseTestProcDataLibString39() {
	assertFalse(25597==25597+1);
}
@Test
public void bigFalseTestProcDataLibString40() {
	assertFalse(22193==22193+1);
}
@Test
public void bigFalseTestProcDataLibString41() {
	assertFalse(4029==4029+1);
}
@Test
public void bigFalseTestProcDataLibString42() {
	assertFalse(6471==6471+1);
}
@Test
public void bigFalseTestProcDataLibString43() {
	assertFalse(18253==18253+1);
}
@Test
public void bigFalseTestProcDataLibString44() {
	assertFalse(16434==16434+1);
}
@Test
public void bigFalseTestProcDataLibString45() {
	assertFalse(7586==7586+1);
}
@Test
public void bigFalseTestProcDataLibString46() {
	assertFalse(10266==10266+1);
}
@Test
public void bigFalseTestProcDataLibString47() {
	assertFalse(6571==6571+1);
}
@Test
public void bigFalseTestProcDataLibString48() {
	assertFalse(6752==6752+1);
}
@Test
public void bigFalseTestProcDataLibString49() {
	assertFalse(32183==32183+1);
}
@Test
public void bigFalseTestProcDataLibString50() {
	assertFalse(19502==19502+1);
}
@Test
public void bigFalseTestProcDataLibString51() {
	assertFalse(13163==13163+1);
}
@Test
public void bigFalseTestProcDataLibString52() {
	assertFalse(18099==18099+1);
}
@Test
public void bigFalseTestProcDataLibString53() {
	assertFalse(21169==21169+1);
}
@Test
public void bigFalseTestProcDataLibString54() {
	assertFalse(14756==14756+1);
}
@Test
public void bigFalseTestProcDataLibString55() {
	assertFalse(2796==2796+1);
}
}
