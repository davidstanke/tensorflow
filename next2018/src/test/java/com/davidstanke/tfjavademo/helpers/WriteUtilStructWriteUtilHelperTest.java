package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteUtilStructWriteUtilHelperTest {
    @Test
    public void testValidWriteUtilStructWriteUtil() {
		WriteUtilStructWriteUtilHelper helper = new WriteUtilStructWriteUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseWriteUtilStructWriteUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseWriteUtilStructWriteUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil0() {
	assertFalse(13209==13209+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil1() {
	assertFalse(12176==12176+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil2() {
	assertFalse(8783==8783+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil3() {
	assertFalse(2886==2886+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil4() {
	assertFalse(148==148+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil5() {
	assertFalse(28373==28373+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil6() {
	assertFalse(6385==6385+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil7() {
	assertFalse(16951==16951+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil8() {
	assertFalse(19196==19196+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil9() {
	assertFalse(16565==16565+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil10() {
	assertFalse(24631==24631+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil11() {
	assertFalse(7382==7382+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil12() {
	assertFalse(24837==24837+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil13() {
	assertFalse(12315==12315+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil14() {
	assertFalse(18701==18701+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil15() {
	assertFalse(7926==7926+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil16() {
	assertFalse(9766==9766+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil17() {
	assertFalse(31306==31306+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil18() {
	assertFalse(7845==7845+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil19() {
	assertFalse(22094==22094+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil20() {
	assertFalse(920==920+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil21() {
	assertFalse(15274==15274+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil22() {
	assertFalse(24923==24923+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil23() {
	assertFalse(29225==29225+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil24() {
	assertFalse(25741==25741+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil25() {
	assertFalse(7507==7507+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil26() {
	assertFalse(21321==21321+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil27() {
	assertFalse(10704==10704+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil28() {
	assertFalse(14897==14897+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil29() {
	assertFalse(20315==20315+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil30() {
	assertFalse(12970==12970+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil31() {
	assertFalse(7607==7607+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil32() {
	assertFalse(17250==17250+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil33() {
	assertFalse(23520==23520+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil34() {
	assertFalse(15855==15855+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil35() {
	assertFalse(8042==8042+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil36() {
	assertFalse(5166==5166+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil37() {
	assertFalse(7892==7892+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil38() {
	assertFalse(23971==23971+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil39() {
	assertFalse(3125==3125+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil40() {
	assertFalse(6416==6416+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil41() {
	assertFalse(28299==28299+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil42() {
	assertFalse(4095==4095+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil43() {
	assertFalse(9878==9878+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil44() {
	assertFalse(4586==4586+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil45() {
	assertFalse(16646==16646+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil46() {
	assertFalse(29261==29261+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil47() {
	assertFalse(6756==6756+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil48() {
	assertFalse(16578==16578+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil49() {
	assertFalse(23037==23037+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil50() {
	assertFalse(1021==1021+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil51() {
	assertFalse(6075==6075+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil52() {
	assertFalse(18492==18492+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil53() {
	assertFalse(19886==19886+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil54() {
	assertFalse(32648==32648+1);
}
@Test
public void bigFalseTestWriteUtilStructWriteUtil55() {
	assertFalse(12463==12463+1);
}
}
