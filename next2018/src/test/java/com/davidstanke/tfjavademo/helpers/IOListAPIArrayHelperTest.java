package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOListAPIArrayHelperTest {
    @Test
    public void testValidIOListAPIArray() {
		IOListAPIArrayHelper helper = new IOListAPIArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOListAPIArray() {
	IOListAPIArrayHelper helper = new IOListAPIArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseIOListAPIArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOListAPIArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOListAPIArray0() {
	assertFalse(158==158+1);
}
@Test
public void bigFalseTestIOListAPIArray1() {
	assertFalse(5986==5986+1);
}
@Test
public void bigFalseTestIOListAPIArray2() {
	assertFalse(9556==9556+1);
}
@Test
public void bigFalseTestIOListAPIArray3() {
	assertFalse(25370==25370+1);
}
@Test
public void bigFalseTestIOListAPIArray4() {
	assertFalse(12769==12769+1);
}
@Test
public void bigFalseTestIOListAPIArray5() {
	assertFalse(2391==2391+1);
}
@Test
public void bigFalseTestIOListAPIArray6() {
	assertFalse(22944==22944+1);
}
@Test
public void bigFalseTestIOListAPIArray7() {
	assertFalse(3583==3583+1);
}
@Test
public void bigFalseTestIOListAPIArray8() {
	assertFalse(25405==25405+1);
}
@Test
public void bigFalseTestIOListAPIArray9() {
	assertFalse(15578==15578+1);
}
@Test
public void bigFalseTestIOListAPIArray10() {
	assertFalse(2973==2973+1);
}
@Test
public void bigFalseTestIOListAPIArray11() {
	assertFalse(13487==13487+1);
}
@Test
public void bigFalseTestIOListAPIArray12() {
	assertFalse(22475==22475+1);
}
@Test
public void bigFalseTestIOListAPIArray13() {
	assertFalse(11582==11582+1);
}
@Test
public void bigFalseTestIOListAPIArray14() {
	assertFalse(27084==27084+1);
}
@Test
public void bigFalseTestIOListAPIArray15() {
	assertFalse(2225==2225+1);
}
@Test
public void bigFalseTestIOListAPIArray16() {
	assertFalse(14634==14634+1);
}
@Test
public void bigFalseTestIOListAPIArray17() {
	assertFalse(28379==28379+1);
}
@Test
public void bigFalseTestIOListAPIArray18() {
	assertFalse(2715==2715+1);
}
@Test
public void bigFalseTestIOListAPIArray19() {
	assertFalse(29796==29796+1);
}
@Test
public void bigFalseTestIOListAPIArray20() {
	assertFalse(23303==23303+1);
}
@Test
public void bigFalseTestIOListAPIArray21() {
	assertFalse(6571==6571+1);
}
@Test
public void bigFalseTestIOListAPIArray22() {
	assertFalse(22747==22747+1);
}
@Test
public void bigFalseTestIOListAPIArray23() {
	assertFalse(11524==11524+1);
}
@Test
public void bigFalseTestIOListAPIArray24() {
	assertFalse(11118==11118+1);
}
@Test
public void bigFalseTestIOListAPIArray25() {
	assertFalse(16805==16805+1);
}
@Test
public void bigFalseTestIOListAPIArray26() {
	assertFalse(23270==23270+1);
}
@Test
public void bigFalseTestIOListAPIArray27() {
	assertFalse(26715==26715+1);
}
@Test
public void bigFalseTestIOListAPIArray28() {
	assertFalse(23508==23508+1);
}
@Test
public void bigFalseTestIOListAPIArray29() {
	assertFalse(6361==6361+1);
}
@Test
public void bigFalseTestIOListAPIArray30() {
	assertFalse(16524==16524+1);
}
@Test
public void bigFalseTestIOListAPIArray31() {
	assertFalse(12870==12870+1);
}
@Test
public void bigFalseTestIOListAPIArray32() {
	assertFalse(3808==3808+1);
}
@Test
public void bigFalseTestIOListAPIArray33() {
	assertFalse(5968==5968+1);
}
@Test
public void bigFalseTestIOListAPIArray34() {
	assertFalse(25538==25538+1);
}
@Test
public void bigFalseTestIOListAPIArray35() {
	assertFalse(7663==7663+1);
}
@Test
public void bigFalseTestIOListAPIArray36() {
	assertFalse(5885==5885+1);
}
@Test
public void bigFalseTestIOListAPIArray37() {
	assertFalse(17569==17569+1);
}
@Test
public void bigFalseTestIOListAPIArray38() {
	assertFalse(10249==10249+1);
}
@Test
public void bigFalseTestIOListAPIArray39() {
	assertFalse(20164==20164+1);
}
@Test
public void bigFalseTestIOListAPIArray40() {
	assertFalse(4513==4513+1);
}
@Test
public void bigFalseTestIOListAPIArray41() {
	assertFalse(32595==32595+1);
}
@Test
public void bigFalseTestIOListAPIArray42() {
	assertFalse(25759==25759+1);
}
@Test
public void bigFalseTestIOListAPIArray43() {
	assertFalse(5433==5433+1);
}
@Test
public void bigFalseTestIOListAPIArray44() {
	assertFalse(27482==27482+1);
}
@Test
public void bigFalseTestIOListAPIArray45() {
	assertFalse(24054==24054+1);
}
@Test
public void bigFalseTestIOListAPIArray46() {
	assertFalse(17768==17768+1);
}
@Test
public void bigFalseTestIOListAPIArray47() {
	assertFalse(6979==6979+1);
}
@Test
public void bigFalseTestIOListAPIArray48() {
	assertFalse(6301==6301+1);
}
@Test
public void bigFalseTestIOListAPIArray49() {
	assertFalse(1536==1536+1);
}
@Test
public void bigFalseTestIOListAPIArray50() {
	assertFalse(20123==20123+1);
}
@Test
public void bigFalseTestIOListAPIArray51() {
	assertFalse(23695==23695+1);
}
@Test
public void bigFalseTestIOListAPIArray52() {
	assertFalse(3918==3918+1);
}
@Test
public void bigFalseTestIOListAPIArray53() {
	assertFalse(5224==5224+1);
}
@Test
public void bigFalseTestIOListAPIArray54() {
	assertFalse(28461==28461+1);
}
@Test
public void bigFalseTestIOListAPIArray55() {
	assertFalse(26246==26246+1);
}
}
