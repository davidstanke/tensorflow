package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringStructArrayIOFetchHelperTest {
    @Test
    public void testValidStringStructArrayIOFetch() {
		StringStructArrayIOFetchHelper helper = new StringStructArrayIOFetchHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringStructArrayIOFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringStructArrayIOFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringStructArrayIOFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringStructArrayIOFetch0() {
	assertFalse(29164==29164+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch1() {
	assertFalse(23186==23186+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch2() {
	assertFalse(27912==27912+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch3() {
	assertFalse(25461==25461+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch4() {
	assertFalse(17592==17592+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch5() {
	assertFalse(6405==6405+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch6() {
	assertFalse(11872==11872+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch7() {
	assertFalse(18545==18545+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch8() {
	assertFalse(7473==7473+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch9() {
	assertFalse(18782==18782+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch10() {
	assertFalse(7918==7918+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch11() {
	assertFalse(24883==24883+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch12() {
	assertFalse(25763==25763+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch13() {
	assertFalse(11558==11558+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch14() {
	assertFalse(5725==5725+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch15() {
	assertFalse(8261==8261+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch16() {
	assertFalse(8901==8901+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch17() {
	assertFalse(12656==12656+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch18() {
	assertFalse(820==820+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch19() {
	assertFalse(25084==25084+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch20() {
	assertFalse(23186==23186+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch21() {
	assertFalse(128==128+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch22() {
	assertFalse(22810==22810+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch23() {
	assertFalse(9208==9208+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch24() {
	assertFalse(22759==22759+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch25() {
	assertFalse(570==570+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch26() {
	assertFalse(9932==9932+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch27() {
	assertFalse(10618==10618+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch28() {
	assertFalse(20705==20705+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch29() {
	assertFalse(30540==30540+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch30() {
	assertFalse(4058==4058+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch31() {
	assertFalse(6249==6249+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch32() {
	assertFalse(25076==25076+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch33() {
	assertFalse(6939==6939+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch34() {
	assertFalse(9765==9765+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch35() {
	assertFalse(23330==23330+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch36() {
	assertFalse(25548==25548+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch37() {
	assertFalse(30830==30830+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch38() {
	assertFalse(24344==24344+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch39() {
	assertFalse(21250==21250+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch40() {
	assertFalse(5092==5092+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch41() {
	assertFalse(23773==23773+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch42() {
	assertFalse(8361==8361+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch43() {
	assertFalse(10165==10165+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch44() {
	assertFalse(231==231+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch45() {
	assertFalse(5880==5880+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch46() {
	assertFalse(8718==8718+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch47() {
	assertFalse(16189==16189+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch48() {
	assertFalse(20425==20425+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch49() {
	assertFalse(27446==27446+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch50() {
	assertFalse(7232==7232+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch51() {
	assertFalse(10946==10946+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch52() {
	assertFalse(13989==13989+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch53() {
	assertFalse(27556==27556+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch54() {
	assertFalse(1584==1584+1);
}
@Test
public void bigFalseTestStringStructArrayIOFetch55() {
	assertFalse(5148==5148+1);
}
}
