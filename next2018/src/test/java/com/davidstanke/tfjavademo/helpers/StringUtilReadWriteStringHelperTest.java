package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringUtilReadWriteStringHelperTest {
    @Test
    public void testValidStringUtilReadWriteString() {
		StringUtilReadWriteStringHelper helper = new StringUtilReadWriteStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringUtilReadWriteString() {
	StringUtilReadWriteStringHelper helper = new StringUtilReadWriteStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringUtilReadWriteString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringUtilReadWriteString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringUtilReadWriteString0() {
	assertFalse(6550==6550+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString1() {
	assertFalse(24052==24052+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString2() {
	assertFalse(11387==11387+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString3() {
	assertFalse(18041==18041+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString4() {
	assertFalse(20781==20781+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString5() {
	assertFalse(12303==12303+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString6() {
	assertFalse(31958==31958+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString7() {
	assertFalse(10685==10685+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString8() {
	assertFalse(28837==28837+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString9() {
	assertFalse(10383==10383+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString10() {
	assertFalse(27076==27076+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString11() {
	assertFalse(14937==14937+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString12() {
	assertFalse(10950==10950+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString13() {
	assertFalse(22652==22652+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString14() {
	assertFalse(25403==25403+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString15() {
	assertFalse(27895==27895+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString16() {
	assertFalse(5355==5355+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString17() {
	assertFalse(32730==32730+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString18() {
	assertFalse(3813==3813+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString19() {
	assertFalse(27907==27907+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString20() {
	assertFalse(7533==7533+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString21() {
	assertFalse(24996==24996+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString22() {
	assertFalse(21095==21095+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString23() {
	assertFalse(9990==9990+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString24() {
	assertFalse(31952==31952+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString25() {
	assertFalse(23431==23431+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString26() {
	assertFalse(13934==13934+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString27() {
	assertFalse(7362==7362+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString28() {
	assertFalse(3504==3504+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString29() {
	assertFalse(15715==15715+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString30() {
	assertFalse(28286==28286+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString31() {
	assertFalse(24338==24338+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString32() {
	assertFalse(14185==14185+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString33() {
	assertFalse(7298==7298+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString34() {
	assertFalse(4474==4474+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString35() {
	assertFalse(18816==18816+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString36() {
	assertFalse(22409==22409+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString37() {
	assertFalse(7830==7830+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString38() {
	assertFalse(20210==20210+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString39() {
	assertFalse(23460==23460+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString40() {
	assertFalse(22007==22007+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString41() {
	assertFalse(30837==30837+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString42() {
	assertFalse(11567==11567+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString43() {
	assertFalse(19519==19519+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString44() {
	assertFalse(20448==20448+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString45() {
	assertFalse(7315==7315+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString46() {
	assertFalse(7168==7168+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString47() {
	assertFalse(12827==12827+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString48() {
	assertFalse(1381==1381+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString49() {
	assertFalse(21827==21827+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString50() {
	assertFalse(26691==26691+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString51() {
	assertFalse(24224==24224+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString52() {
	assertFalse(30213==30213+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString53() {
	assertFalse(18093==18093+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString54() {
	assertFalse(23602==23602+1);
}
@Test
public void bigFalseTestStringUtilReadWriteString55() {
	assertFalse(17974==17974+1);
}
}
