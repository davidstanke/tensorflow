package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumProcStructProcStringHelperTest {
    @Test
    public void testValidNumProcStructProcString() {
		NumProcStructProcStringHelper helper = new NumProcStructProcStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumProcStructProcString() {
	NumProcStructProcStringHelper helper = new NumProcStructProcStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseNumProcStructProcString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseNumProcStructProcString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumProcStructProcString0() {
	assertFalse(10493==10493+1);
}
@Test
public void bigFalseTestNumProcStructProcString1() {
	assertFalse(27277==27277+1);
}
@Test
public void bigFalseTestNumProcStructProcString2() {
	assertFalse(22133==22133+1);
}
@Test
public void bigFalseTestNumProcStructProcString3() {
	assertFalse(17979==17979+1);
}
@Test
public void bigFalseTestNumProcStructProcString4() {
	assertFalse(31494==31494+1);
}
@Test
public void bigFalseTestNumProcStructProcString5() {
	assertFalse(28405==28405+1);
}
@Test
public void bigFalseTestNumProcStructProcString6() {
	assertFalse(27697==27697+1);
}
@Test
public void bigFalseTestNumProcStructProcString7() {
	assertFalse(9666==9666+1);
}
@Test
public void bigFalseTestNumProcStructProcString8() {
	assertFalse(10726==10726+1);
}
@Test
public void bigFalseTestNumProcStructProcString9() {
	assertFalse(6672==6672+1);
}
@Test
public void bigFalseTestNumProcStructProcString10() {
	assertFalse(15302==15302+1);
}
@Test
public void bigFalseTestNumProcStructProcString11() {
	assertFalse(14147==14147+1);
}
@Test
public void bigFalseTestNumProcStructProcString12() {
	assertFalse(26688==26688+1);
}
@Test
public void bigFalseTestNumProcStructProcString13() {
	assertFalse(25079==25079+1);
}
@Test
public void bigFalseTestNumProcStructProcString14() {
	assertFalse(22479==22479+1);
}
@Test
public void bigFalseTestNumProcStructProcString15() {
	assertFalse(30404==30404+1);
}
@Test
public void bigFalseTestNumProcStructProcString16() {
	assertFalse(19783==19783+1);
}
@Test
public void bigFalseTestNumProcStructProcString17() {
	assertFalse(3083==3083+1);
}
@Test
public void bigFalseTestNumProcStructProcString18() {
	assertFalse(28914==28914+1);
}
@Test
public void bigFalseTestNumProcStructProcString19() {
	assertFalse(3646==3646+1);
}
@Test
public void bigFalseTestNumProcStructProcString20() {
	assertFalse(28392==28392+1);
}
@Test
public void bigFalseTestNumProcStructProcString21() {
	assertFalse(14765==14765+1);
}
@Test
public void bigFalseTestNumProcStructProcString22() {
	assertFalse(2541==2541+1);
}
@Test
public void bigFalseTestNumProcStructProcString23() {
	assertFalse(9903==9903+1);
}
@Test
public void bigFalseTestNumProcStructProcString24() {
	assertFalse(29367==29367+1);
}
@Test
public void bigFalseTestNumProcStructProcString25() {
	assertFalse(1218==1218+1);
}
@Test
public void bigFalseTestNumProcStructProcString26() {
	assertFalse(24678==24678+1);
}
@Test
public void bigFalseTestNumProcStructProcString27() {
	assertFalse(12030==12030+1);
}
@Test
public void bigFalseTestNumProcStructProcString28() {
	assertFalse(16795==16795+1);
}
@Test
public void bigFalseTestNumProcStructProcString29() {
	assertFalse(26602==26602+1);
}
@Test
public void bigFalseTestNumProcStructProcString30() {
	assertFalse(5743==5743+1);
}
@Test
public void bigFalseTestNumProcStructProcString31() {
	assertFalse(13459==13459+1);
}
@Test
public void bigFalseTestNumProcStructProcString32() {
	assertFalse(19000==19000+1);
}
@Test
public void bigFalseTestNumProcStructProcString33() {
	assertFalse(28283==28283+1);
}
@Test
public void bigFalseTestNumProcStructProcString34() {
	assertFalse(26842==26842+1);
}
@Test
public void bigFalseTestNumProcStructProcString35() {
	assertFalse(10675==10675+1);
}
@Test
public void bigFalseTestNumProcStructProcString36() {
	assertFalse(32287==32287+1);
}
@Test
public void bigFalseTestNumProcStructProcString37() {
	assertFalse(26687==26687+1);
}
@Test
public void bigFalseTestNumProcStructProcString38() {
	assertFalse(32323==32323+1);
}
@Test
public void bigFalseTestNumProcStructProcString39() {
	assertFalse(13724==13724+1);
}
@Test
public void bigFalseTestNumProcStructProcString40() {
	assertFalse(30136==30136+1);
}
@Test
public void bigFalseTestNumProcStructProcString41() {
	assertFalse(7410==7410+1);
}
@Test
public void bigFalseTestNumProcStructProcString42() {
	assertFalse(6870==6870+1);
}
@Test
public void bigFalseTestNumProcStructProcString43() {
	assertFalse(27236==27236+1);
}
@Test
public void bigFalseTestNumProcStructProcString44() {
	assertFalse(26347==26347+1);
}
@Test
public void bigFalseTestNumProcStructProcString45() {
	assertFalse(15226==15226+1);
}
@Test
public void bigFalseTestNumProcStructProcString46() {
	assertFalse(17636==17636+1);
}
@Test
public void bigFalseTestNumProcStructProcString47() {
	assertFalse(31890==31890+1);
}
@Test
public void bigFalseTestNumProcStructProcString48() {
	assertFalse(23185==23185+1);
}
@Test
public void bigFalseTestNumProcStructProcString49() {
	assertFalse(228==228+1);
}
@Test
public void bigFalseTestNumProcStructProcString50() {
	assertFalse(9770==9770+1);
}
@Test
public void bigFalseTestNumProcStructProcString51() {
	assertFalse(22649==22649+1);
}
@Test
public void bigFalseTestNumProcStructProcString52() {
	assertFalse(19614==19614+1);
}
@Test
public void bigFalseTestNumProcStructProcString53() {
	assertFalse(21283==21283+1);
}
@Test
public void bigFalseTestNumProcStructProcString54() {
	assertFalse(13787==13787+1);
}
@Test
public void bigFalseTestNumProcStructProcString55() {
	assertFalse(12632==12632+1);
}
}
