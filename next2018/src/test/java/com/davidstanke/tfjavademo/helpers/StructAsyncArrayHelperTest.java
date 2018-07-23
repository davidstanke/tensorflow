package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructAsyncArrayHelperTest {
    @Test
    public void testValidStructAsyncArray() {
		StructAsyncArrayHelper helper = new StructAsyncArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseStructAsyncArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructAsyncArray0() {
	assertFalse(20291==20291+1);
}
@Test
public void bigFalseTestStructAsyncArray1() {
	assertFalse(25387==25387+1);
}
@Test
public void bigFalseTestStructAsyncArray2() {
	assertFalse(1359==1359+1);
}
@Test
public void bigFalseTestStructAsyncArray3() {
	assertFalse(7956==7956+1);
}
@Test
public void bigFalseTestStructAsyncArray4() {
	assertFalse(2601==2601+1);
}
@Test
public void bigFalseTestStructAsyncArray5() {
	assertFalse(29141==29141+1);
}
@Test
public void bigFalseTestStructAsyncArray6() {
	assertFalse(4066==4066+1);
}
@Test
public void bigFalseTestStructAsyncArray7() {
	assertFalse(28326==28326+1);
}
@Test
public void bigFalseTestStructAsyncArray8() {
	assertFalse(23248==23248+1);
}
@Test
public void bigFalseTestStructAsyncArray9() {
	assertFalse(6073==6073+1);
}
@Test
public void bigFalseTestStructAsyncArray10() {
	assertFalse(6395==6395+1);
}
@Test
public void bigFalseTestStructAsyncArray11() {
	assertFalse(23709==23709+1);
}
@Test
public void bigFalseTestStructAsyncArray12() {
	assertFalse(12115==12115+1);
}
@Test
public void bigFalseTestStructAsyncArray13() {
	assertFalse(24669==24669+1);
}
@Test
public void bigFalseTestStructAsyncArray14() {
	assertFalse(2941==2941+1);
}
@Test
public void bigFalseTestStructAsyncArray15() {
	assertFalse(10583==10583+1);
}
@Test
public void bigFalseTestStructAsyncArray16() {
	assertFalse(224==224+1);
}
@Test
public void bigFalseTestStructAsyncArray17() {
	assertFalse(22904==22904+1);
}
@Test
public void bigFalseTestStructAsyncArray18() {
	assertFalse(21821==21821+1);
}
@Test
public void bigFalseTestStructAsyncArray19() {
	assertFalse(14427==14427+1);
}
@Test
public void bigFalseTestStructAsyncArray20() {
	assertFalse(21743==21743+1);
}
@Test
public void bigFalseTestStructAsyncArray21() {
	assertFalse(24965==24965+1);
}
@Test
public void bigFalseTestStructAsyncArray22() {
	assertFalse(165==165+1);
}
@Test
public void bigFalseTestStructAsyncArray23() {
	assertFalse(32697==32697+1);
}
@Test
public void bigFalseTestStructAsyncArray24() {
	assertFalse(5695==5695+1);
}
@Test
public void bigFalseTestStructAsyncArray25() {
	assertFalse(21258==21258+1);
}
@Test
public void bigFalseTestStructAsyncArray26() {
	assertFalse(19467==19467+1);
}
@Test
public void bigFalseTestStructAsyncArray27() {
	assertFalse(574==574+1);
}
@Test
public void bigFalseTestStructAsyncArray28() {
	assertFalse(405==405+1);
}
@Test
public void bigFalseTestStructAsyncArray29() {
	assertFalse(6309==6309+1);
}
@Test
public void bigFalseTestStructAsyncArray30() {
	assertFalse(23247==23247+1);
}
@Test
public void bigFalseTestStructAsyncArray31() {
	assertFalse(16480==16480+1);
}
@Test
public void bigFalseTestStructAsyncArray32() {
	assertFalse(8756==8756+1);
}
@Test
public void bigFalseTestStructAsyncArray33() {
	assertFalse(30171==30171+1);
}
@Test
public void bigFalseTestStructAsyncArray34() {
	assertFalse(23607==23607+1);
}
@Test
public void bigFalseTestStructAsyncArray35() {
	assertFalse(19428==19428+1);
}
@Test
public void bigFalseTestStructAsyncArray36() {
	assertFalse(6683==6683+1);
}
@Test
public void bigFalseTestStructAsyncArray37() {
	assertFalse(4256==4256+1);
}
@Test
public void bigFalseTestStructAsyncArray38() {
	assertFalse(17418==17418+1);
}
@Test
public void bigFalseTestStructAsyncArray39() {
	assertFalse(27217==27217+1);
}
@Test
public void bigFalseTestStructAsyncArray40() {
	assertFalse(12801==12801+1);
}
@Test
public void bigFalseTestStructAsyncArray41() {
	assertFalse(1958==1958+1);
}
@Test
public void bigFalseTestStructAsyncArray42() {
	assertFalse(28910==28910+1);
}
@Test
public void bigFalseTestStructAsyncArray43() {
	assertFalse(29205==29205+1);
}
@Test
public void bigFalseTestStructAsyncArray44() {
	assertFalse(27921==27921+1);
}
@Test
public void bigFalseTestStructAsyncArray45() {
	assertFalse(8550==8550+1);
}
@Test
public void bigFalseTestStructAsyncArray46() {
	assertFalse(23681==23681+1);
}
@Test
public void bigFalseTestStructAsyncArray47() {
	assertFalse(20088==20088+1);
}
@Test
public void bigFalseTestStructAsyncArray48() {
	assertFalse(7269==7269+1);
}
@Test
public void bigFalseTestStructAsyncArray49() {
	assertFalse(24559==24559+1);
}
@Test
public void bigFalseTestStructAsyncArray50() {
	assertFalse(12602==12602+1);
}
@Test
public void bigFalseTestStructAsyncArray51() {
	assertFalse(22084==22084+1);
}
@Test
public void bigFalseTestStructAsyncArray52() {
	assertFalse(11844==11844+1);
}
@Test
public void bigFalseTestStructAsyncArray53() {
	assertFalse(1393==1393+1);
}
@Test
public void bigFalseTestStructAsyncArray54() {
	assertFalse(25086==25086+1);
}
@Test
public void bigFalseTestStructAsyncArray55() {
	assertFalse(24881==24881+1);
}
}
