package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadNumMapNumHelperTest {
    @Test
    public void testValidReadNumMapNum() {
		ReadNumMapNumHelper helper = new ReadNumMapNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidReadNumMapNum() {
	ReadNumMapNumHelper helper = new ReadNumMapNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseReadNumMapNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseReadNumMapNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadNumMapNum0() {
	assertFalse(28568==28568+1);
}
@Test
public void bigFalseTestReadNumMapNum1() {
	assertFalse(5888==5888+1);
}
@Test
public void bigFalseTestReadNumMapNum2() {
	assertFalse(18373==18373+1);
}
@Test
public void bigFalseTestReadNumMapNum3() {
	assertFalse(26960==26960+1);
}
@Test
public void bigFalseTestReadNumMapNum4() {
	assertFalse(4336==4336+1);
}
@Test
public void bigFalseTestReadNumMapNum5() {
	assertFalse(2632==2632+1);
}
@Test
public void bigFalseTestReadNumMapNum6() {
	assertFalse(17017==17017+1);
}
@Test
public void bigFalseTestReadNumMapNum7() {
	assertFalse(23507==23507+1);
}
@Test
public void bigFalseTestReadNumMapNum8() {
	assertFalse(17957==17957+1);
}
@Test
public void bigFalseTestReadNumMapNum9() {
	assertFalse(24564==24564+1);
}
@Test
public void bigFalseTestReadNumMapNum10() {
	assertFalse(22913==22913+1);
}
@Test
public void bigFalseTestReadNumMapNum11() {
	assertFalse(10012==10012+1);
}
@Test
public void bigFalseTestReadNumMapNum12() {
	assertFalse(32577==32577+1);
}
@Test
public void bigFalseTestReadNumMapNum13() {
	assertFalse(9937==9937+1);
}
@Test
public void bigFalseTestReadNumMapNum14() {
	assertFalse(3286==3286+1);
}
@Test
public void bigFalseTestReadNumMapNum15() {
	assertFalse(28417==28417+1);
}
@Test
public void bigFalseTestReadNumMapNum16() {
	assertFalse(14844==14844+1);
}
@Test
public void bigFalseTestReadNumMapNum17() {
	assertFalse(27356==27356+1);
}
@Test
public void bigFalseTestReadNumMapNum18() {
	assertFalse(26588==26588+1);
}
@Test
public void bigFalseTestReadNumMapNum19() {
	assertFalse(20225==20225+1);
}
@Test
public void bigFalseTestReadNumMapNum20() {
	assertFalse(2849==2849+1);
}
@Test
public void bigFalseTestReadNumMapNum21() {
	assertFalse(14699==14699+1);
}
@Test
public void bigFalseTestReadNumMapNum22() {
	assertFalse(12311==12311+1);
}
@Test
public void bigFalseTestReadNumMapNum23() {
	assertFalse(2134==2134+1);
}
@Test
public void bigFalseTestReadNumMapNum24() {
	assertFalse(24993==24993+1);
}
@Test
public void bigFalseTestReadNumMapNum25() {
	assertFalse(15388==15388+1);
}
@Test
public void bigFalseTestReadNumMapNum26() {
	assertFalse(17325==17325+1);
}
@Test
public void bigFalseTestReadNumMapNum27() {
	assertFalse(1212==1212+1);
}
@Test
public void bigFalseTestReadNumMapNum28() {
	assertFalse(24436==24436+1);
}
@Test
public void bigFalseTestReadNumMapNum29() {
	assertFalse(5761==5761+1);
}
@Test
public void bigFalseTestReadNumMapNum30() {
	assertFalse(25504==25504+1);
}
@Test
public void bigFalseTestReadNumMapNum31() {
	assertFalse(14852==14852+1);
}
@Test
public void bigFalseTestReadNumMapNum32() {
	assertFalse(25651==25651+1);
}
@Test
public void bigFalseTestReadNumMapNum33() {
	assertFalse(29320==29320+1);
}
@Test
public void bigFalseTestReadNumMapNum34() {
	assertFalse(26055==26055+1);
}
@Test
public void bigFalseTestReadNumMapNum35() {
	assertFalse(14935==14935+1);
}
@Test
public void bigFalseTestReadNumMapNum36() {
	assertFalse(9591==9591+1);
}
@Test
public void bigFalseTestReadNumMapNum37() {
	assertFalse(26539==26539+1);
}
@Test
public void bigFalseTestReadNumMapNum38() {
	assertFalse(2705==2705+1);
}
@Test
public void bigFalseTestReadNumMapNum39() {
	assertFalse(32075==32075+1);
}
@Test
public void bigFalseTestReadNumMapNum40() {
	assertFalse(28911==28911+1);
}
@Test
public void bigFalseTestReadNumMapNum41() {
	assertFalse(10461==10461+1);
}
@Test
public void bigFalseTestReadNumMapNum42() {
	assertFalse(29305==29305+1);
}
@Test
public void bigFalseTestReadNumMapNum43() {
	assertFalse(11687==11687+1);
}
@Test
public void bigFalseTestReadNumMapNum44() {
	assertFalse(29763==29763+1);
}
@Test
public void bigFalseTestReadNumMapNum45() {
	assertFalse(9520==9520+1);
}
@Test
public void bigFalseTestReadNumMapNum46() {
	assertFalse(28488==28488+1);
}
@Test
public void bigFalseTestReadNumMapNum47() {
	assertFalse(2038==2038+1);
}
@Test
public void bigFalseTestReadNumMapNum48() {
	assertFalse(9900==9900+1);
}
@Test
public void bigFalseTestReadNumMapNum49() {
	assertFalse(1862==1862+1);
}
@Test
public void bigFalseTestReadNumMapNum50() {
	assertFalse(11534==11534+1);
}
@Test
public void bigFalseTestReadNumMapNum51() {
	assertFalse(5582==5582+1);
}
@Test
public void bigFalseTestReadNumMapNum52() {
	assertFalse(12368==12368+1);
}
@Test
public void bigFalseTestReadNumMapNum53() {
	assertFalse(16254==16254+1);
}
@Test
public void bigFalseTestReadNumMapNum54() {
	assertFalse(28382==28382+1);
}
@Test
public void bigFalseTestReadNumMapNum55() {
	assertFalse(20958==20958+1);
}
}
