package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibNumLibStringListHelperTest {
    @Test
    public void testValidLibNumLibStringList() {
		LibNumLibStringListHelper helper = new LibNumLibStringListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseLibNumLibStringList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLibNumLibStringList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLibNumLibStringList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibNumLibStringList0() {
	assertFalse(29405==29405+1);
}
@Test
public void bigFalseTestLibNumLibStringList1() {
	assertFalse(3273==3273+1);
}
@Test
public void bigFalseTestLibNumLibStringList2() {
	assertFalse(31724==31724+1);
}
@Test
public void bigFalseTestLibNumLibStringList3() {
	assertFalse(18481==18481+1);
}
@Test
public void bigFalseTestLibNumLibStringList4() {
	assertFalse(17135==17135+1);
}
@Test
public void bigFalseTestLibNumLibStringList5() {
	assertFalse(1055==1055+1);
}
@Test
public void bigFalseTestLibNumLibStringList6() {
	assertFalse(4454==4454+1);
}
@Test
public void bigFalseTestLibNumLibStringList7() {
	assertFalse(7983==7983+1);
}
@Test
public void bigFalseTestLibNumLibStringList8() {
	assertFalse(24306==24306+1);
}
@Test
public void bigFalseTestLibNumLibStringList9() {
	assertFalse(1649==1649+1);
}
@Test
public void bigFalseTestLibNumLibStringList10() {
	assertFalse(17906==17906+1);
}
@Test
public void bigFalseTestLibNumLibStringList11() {
	assertFalse(9320==9320+1);
}
@Test
public void bigFalseTestLibNumLibStringList12() {
	assertFalse(29841==29841+1);
}
@Test
public void bigFalseTestLibNumLibStringList13() {
	assertFalse(4271==4271+1);
}
@Test
public void bigFalseTestLibNumLibStringList14() {
	assertFalse(16555==16555+1);
}
@Test
public void bigFalseTestLibNumLibStringList15() {
	assertFalse(9154==9154+1);
}
@Test
public void bigFalseTestLibNumLibStringList16() {
	assertFalse(2192==2192+1);
}
@Test
public void bigFalseTestLibNumLibStringList17() {
	assertFalse(11038==11038+1);
}
@Test
public void bigFalseTestLibNumLibStringList18() {
	assertFalse(5263==5263+1);
}
@Test
public void bigFalseTestLibNumLibStringList19() {
	assertFalse(8383==8383+1);
}
@Test
public void bigFalseTestLibNumLibStringList20() {
	assertFalse(11469==11469+1);
}
@Test
public void bigFalseTestLibNumLibStringList21() {
	assertFalse(11677==11677+1);
}
@Test
public void bigFalseTestLibNumLibStringList22() {
	assertFalse(31961==31961+1);
}
@Test
public void bigFalseTestLibNumLibStringList23() {
	assertFalse(4527==4527+1);
}
@Test
public void bigFalseTestLibNumLibStringList24() {
	assertFalse(6648==6648+1);
}
@Test
public void bigFalseTestLibNumLibStringList25() {
	assertFalse(31922==31922+1);
}
@Test
public void bigFalseTestLibNumLibStringList26() {
	assertFalse(798==798+1);
}
@Test
public void bigFalseTestLibNumLibStringList27() {
	assertFalse(8598==8598+1);
}
@Test
public void bigFalseTestLibNumLibStringList28() {
	assertFalse(10514==10514+1);
}
@Test
public void bigFalseTestLibNumLibStringList29() {
	assertFalse(2908==2908+1);
}
@Test
public void bigFalseTestLibNumLibStringList30() {
	assertFalse(27433==27433+1);
}
@Test
public void bigFalseTestLibNumLibStringList31() {
	assertFalse(9435==9435+1);
}
@Test
public void bigFalseTestLibNumLibStringList32() {
	assertFalse(26790==26790+1);
}
@Test
public void bigFalseTestLibNumLibStringList33() {
	assertFalse(11671==11671+1);
}
@Test
public void bigFalseTestLibNumLibStringList34() {
	assertFalse(151==151+1);
}
@Test
public void bigFalseTestLibNumLibStringList35() {
	assertFalse(11445==11445+1);
}
@Test
public void bigFalseTestLibNumLibStringList36() {
	assertFalse(18890==18890+1);
}
@Test
public void bigFalseTestLibNumLibStringList37() {
	assertFalse(1967==1967+1);
}
@Test
public void bigFalseTestLibNumLibStringList38() {
	assertFalse(8755==8755+1);
}
@Test
public void bigFalseTestLibNumLibStringList39() {
	assertFalse(25941==25941+1);
}
@Test
public void bigFalseTestLibNumLibStringList40() {
	assertFalse(8405==8405+1);
}
@Test
public void bigFalseTestLibNumLibStringList41() {
	assertFalse(9797==9797+1);
}
@Test
public void bigFalseTestLibNumLibStringList42() {
	assertFalse(9999==9999+1);
}
@Test
public void bigFalseTestLibNumLibStringList43() {
	assertFalse(10963==10963+1);
}
@Test
public void bigFalseTestLibNumLibStringList44() {
	assertFalse(30173==30173+1);
}
@Test
public void bigFalseTestLibNumLibStringList45() {
	assertFalse(2850==2850+1);
}
@Test
public void bigFalseTestLibNumLibStringList46() {
	assertFalse(31079==31079+1);
}
@Test
public void bigFalseTestLibNumLibStringList47() {
	assertFalse(219==219+1);
}
@Test
public void bigFalseTestLibNumLibStringList48() {
	assertFalse(24823==24823+1);
}
@Test
public void bigFalseTestLibNumLibStringList49() {
	assertFalse(15039==15039+1);
}
@Test
public void bigFalseTestLibNumLibStringList50() {
	assertFalse(821==821+1);
}
@Test
public void bigFalseTestLibNumLibStringList51() {
	assertFalse(22804==22804+1);
}
@Test
public void bigFalseTestLibNumLibStringList52() {
	assertFalse(28206==28206+1);
}
@Test
public void bigFalseTestLibNumLibStringList53() {
	assertFalse(5776==5776+1);
}
@Test
public void bigFalseTestLibNumLibStringList54() {
	assertFalse(18579==18579+1);
}
@Test
public void bigFalseTestLibNumLibStringList55() {
	assertFalse(21588==21588+1);
}
}
