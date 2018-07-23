package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumStringMapDataListHelperTest {
    @Test
    public void testValidNumStringMapDataList() {
		NumStringMapDataListHelper helper = new NumStringMapDataListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumStringMapDataList() {
	NumStringMapDataListHelper helper = new NumStringMapDataListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseNumStringMapDataList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStringMapDataList0() {
	assertFalse(13358==13358+1);
}
@Test
public void bigFalseTestNumStringMapDataList1() {
	assertFalse(9475==9475+1);
}
@Test
public void bigFalseTestNumStringMapDataList2() {
	assertFalse(15210==15210+1);
}
@Test
public void bigFalseTestNumStringMapDataList3() {
	assertFalse(10410==10410+1);
}
@Test
public void bigFalseTestNumStringMapDataList4() {
	assertFalse(16075==16075+1);
}
@Test
public void bigFalseTestNumStringMapDataList5() {
	assertFalse(10510==10510+1);
}
@Test
public void bigFalseTestNumStringMapDataList6() {
	assertFalse(32518==32518+1);
}
@Test
public void bigFalseTestNumStringMapDataList7() {
	assertFalse(4980==4980+1);
}
@Test
public void bigFalseTestNumStringMapDataList8() {
	assertFalse(6712==6712+1);
}
@Test
public void bigFalseTestNumStringMapDataList9() {
	assertFalse(4020==4020+1);
}
@Test
public void bigFalseTestNumStringMapDataList10() {
	assertFalse(1997==1997+1);
}
@Test
public void bigFalseTestNumStringMapDataList11() {
	assertFalse(15026==15026+1);
}
@Test
public void bigFalseTestNumStringMapDataList12() {
	assertFalse(17355==17355+1);
}
@Test
public void bigFalseTestNumStringMapDataList13() {
	assertFalse(32332==32332+1);
}
@Test
public void bigFalseTestNumStringMapDataList14() {
	assertFalse(3606==3606+1);
}
@Test
public void bigFalseTestNumStringMapDataList15() {
	assertFalse(11115==11115+1);
}
@Test
public void bigFalseTestNumStringMapDataList16() {
	assertFalse(28669==28669+1);
}
@Test
public void bigFalseTestNumStringMapDataList17() {
	assertFalse(5568==5568+1);
}
@Test
public void bigFalseTestNumStringMapDataList18() {
	assertFalse(7732==7732+1);
}
@Test
public void bigFalseTestNumStringMapDataList19() {
	assertFalse(26966==26966+1);
}
@Test
public void bigFalseTestNumStringMapDataList20() {
	assertFalse(14089==14089+1);
}
@Test
public void bigFalseTestNumStringMapDataList21() {
	assertFalse(30970==30970+1);
}
@Test
public void bigFalseTestNumStringMapDataList22() {
	assertFalse(15475==15475+1);
}
@Test
public void bigFalseTestNumStringMapDataList23() {
	assertFalse(2347==2347+1);
}
@Test
public void bigFalseTestNumStringMapDataList24() {
	assertFalse(28490==28490+1);
}
@Test
public void bigFalseTestNumStringMapDataList25() {
	assertFalse(19983==19983+1);
}
@Test
public void bigFalseTestNumStringMapDataList26() {
	assertFalse(19665==19665+1);
}
@Test
public void bigFalseTestNumStringMapDataList27() {
	assertFalse(9126==9126+1);
}
@Test
public void bigFalseTestNumStringMapDataList28() {
	assertFalse(20818==20818+1);
}
@Test
public void bigFalseTestNumStringMapDataList29() {
	assertFalse(9770==9770+1);
}
@Test
public void bigFalseTestNumStringMapDataList30() {
	assertFalse(14972==14972+1);
}
@Test
public void bigFalseTestNumStringMapDataList31() {
	assertFalse(27995==27995+1);
}
@Test
public void bigFalseTestNumStringMapDataList32() {
	assertFalse(16842==16842+1);
}
@Test
public void bigFalseTestNumStringMapDataList33() {
	assertFalse(30775==30775+1);
}
@Test
public void bigFalseTestNumStringMapDataList34() {
	assertFalse(6927==6927+1);
}
@Test
public void bigFalseTestNumStringMapDataList35() {
	assertFalse(32573==32573+1);
}
@Test
public void bigFalseTestNumStringMapDataList36() {
	assertFalse(23820==23820+1);
}
@Test
public void bigFalseTestNumStringMapDataList37() {
	assertFalse(6739==6739+1);
}
@Test
public void bigFalseTestNumStringMapDataList38() {
	assertFalse(18829==18829+1);
}
@Test
public void bigFalseTestNumStringMapDataList39() {
	assertFalse(7148==7148+1);
}
@Test
public void bigFalseTestNumStringMapDataList40() {
	assertFalse(8321==8321+1);
}
@Test
public void bigFalseTestNumStringMapDataList41() {
	assertFalse(26102==26102+1);
}
@Test
public void bigFalseTestNumStringMapDataList42() {
	assertFalse(13593==13593+1);
}
@Test
public void bigFalseTestNumStringMapDataList43() {
	assertFalse(32194==32194+1);
}
@Test
public void bigFalseTestNumStringMapDataList44() {
	assertFalse(19900==19900+1);
}
@Test
public void bigFalseTestNumStringMapDataList45() {
	assertFalse(29406==29406+1);
}
@Test
public void bigFalseTestNumStringMapDataList46() {
	assertFalse(24443==24443+1);
}
@Test
public void bigFalseTestNumStringMapDataList47() {
	assertFalse(31132==31132+1);
}
@Test
public void bigFalseTestNumStringMapDataList48() {
	assertFalse(25427==25427+1);
}
@Test
public void bigFalseTestNumStringMapDataList49() {
	assertFalse(5306==5306+1);
}
@Test
public void bigFalseTestNumStringMapDataList50() {
	assertFalse(18259==18259+1);
}
@Test
public void bigFalseTestNumStringMapDataList51() {
	assertFalse(616==616+1);
}
@Test
public void bigFalseTestNumStringMapDataList52() {
	assertFalse(18305==18305+1);
}
@Test
public void bigFalseTestNumStringMapDataList53() {
	assertFalse(1948==1948+1);
}
@Test
public void bigFalseTestNumStringMapDataList54() {
	assertFalse(14875==14875+1);
}
@Test
public void bigFalseTestNumStringMapDataList55() {
	assertFalse(22899==22899+1);
}
}
