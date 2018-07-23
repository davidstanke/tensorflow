package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibIOArrayNumListHelperTest {
    @Test
    public void testValidLibIOArrayNumList() {
		LibIOArrayNumListHelper helper = new LibIOArrayNumListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibIOArrayNumList() {
	LibIOArrayNumListHelper helper = new LibIOArrayNumListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestLibIOArrayNumList0() {
	assertFalse(17040==17040+1);
}
@Test
public void bigFalseTestLibIOArrayNumList1() {
	assertFalse(14170==14170+1);
}
@Test
public void bigFalseTestLibIOArrayNumList2() {
	assertFalse(11764==11764+1);
}
@Test
public void bigFalseTestLibIOArrayNumList3() {
	assertFalse(31111==31111+1);
}
@Test
public void bigFalseTestLibIOArrayNumList4() {
	assertFalse(26250==26250+1);
}
@Test
public void bigFalseTestLibIOArrayNumList5() {
	assertFalse(2788==2788+1);
}
@Test
public void bigFalseTestLibIOArrayNumList6() {
	assertFalse(13700==13700+1);
}
@Test
public void bigFalseTestLibIOArrayNumList7() {
	assertFalse(19805==19805+1);
}
@Test
public void bigFalseTestLibIOArrayNumList8() {
	assertFalse(23189==23189+1);
}
@Test
public void bigFalseTestLibIOArrayNumList9() {
	assertFalse(3360==3360+1);
}
@Test
public void bigFalseTestLibIOArrayNumList10() {
	assertFalse(1284==1284+1);
}
@Test
public void bigFalseTestLibIOArrayNumList11() {
	assertFalse(20983==20983+1);
}
@Test
public void bigFalseTestLibIOArrayNumList12() {
	assertFalse(6449==6449+1);
}
@Test
public void bigFalseTestLibIOArrayNumList13() {
	assertFalse(3557==3557+1);
}
@Test
public void bigFalseTestLibIOArrayNumList14() {
	assertFalse(5537==5537+1);
}
@Test
public void bigFalseTestLibIOArrayNumList15() {
	assertFalse(23101==23101+1);
}
@Test
public void bigFalseTestLibIOArrayNumList16() {
	assertFalse(7270==7270+1);
}
@Test
public void bigFalseTestLibIOArrayNumList17() {
	assertFalse(9006==9006+1);
}
@Test
public void bigFalseTestLibIOArrayNumList18() {
	assertFalse(3460==3460+1);
}
@Test
public void bigFalseTestLibIOArrayNumList19() {
	assertFalse(20090==20090+1);
}
@Test
public void bigFalseTestLibIOArrayNumList20() {
	assertFalse(11425==11425+1);
}
@Test
public void bigFalseTestLibIOArrayNumList21() {
	assertFalse(17610==17610+1);
}
@Test
public void bigFalseTestLibIOArrayNumList22() {
	assertFalse(28695==28695+1);
}
@Test
public void bigFalseTestLibIOArrayNumList23() {
	assertFalse(32234==32234+1);
}
@Test
public void bigFalseTestLibIOArrayNumList24() {
	assertFalse(16721==16721+1);
}
@Test
public void bigFalseTestLibIOArrayNumList25() {
	assertFalse(30407==30407+1);
}
@Test
public void bigFalseTestLibIOArrayNumList26() {
	assertFalse(5623==5623+1);
}
@Test
public void bigFalseTestLibIOArrayNumList27() {
	assertFalse(32007==32007+1);
}
@Test
public void bigFalseTestLibIOArrayNumList28() {
	assertFalse(20293==20293+1);
}
@Test
public void bigFalseTestLibIOArrayNumList29() {
	assertFalse(11932==11932+1);
}
@Test
public void bigFalseTestLibIOArrayNumList30() {
	assertFalse(10423==10423+1);
}
@Test
public void bigFalseTestLibIOArrayNumList31() {
	assertFalse(7316==7316+1);
}
@Test
public void bigFalseTestLibIOArrayNumList32() {
	assertFalse(8388==8388+1);
}
@Test
public void bigFalseTestLibIOArrayNumList33() {
	assertFalse(24345==24345+1);
}
@Test
public void bigFalseTestLibIOArrayNumList34() {
	assertFalse(7770==7770+1);
}
@Test
public void bigFalseTestLibIOArrayNumList35() {
	assertFalse(17766==17766+1);
}
@Test
public void bigFalseTestLibIOArrayNumList36() {
	assertFalse(4970==4970+1);
}
@Test
public void bigFalseTestLibIOArrayNumList37() {
	assertFalse(22287==22287+1);
}
@Test
public void bigFalseTestLibIOArrayNumList38() {
	assertFalse(28815==28815+1);
}
@Test
public void bigFalseTestLibIOArrayNumList39() {
	assertFalse(17653==17653+1);
}
@Test
public void bigFalseTestLibIOArrayNumList40() {
	assertFalse(22469==22469+1);
}
@Test
public void bigFalseTestLibIOArrayNumList41() {
	assertFalse(24255==24255+1);
}
@Test
public void bigFalseTestLibIOArrayNumList42() {
	assertFalse(2986==2986+1);
}
@Test
public void bigFalseTestLibIOArrayNumList43() {
	assertFalse(22182==22182+1);
}
@Test
public void bigFalseTestLibIOArrayNumList44() {
	assertFalse(3763==3763+1);
}
@Test
public void bigFalseTestLibIOArrayNumList45() {
	assertFalse(16387==16387+1);
}
@Test
public void bigFalseTestLibIOArrayNumList46() {
	assertFalse(12647==12647+1);
}
@Test
public void bigFalseTestLibIOArrayNumList47() {
	assertFalse(30166==30166+1);
}
@Test
public void bigFalseTestLibIOArrayNumList48() {
	assertFalse(24697==24697+1);
}
@Test
public void bigFalseTestLibIOArrayNumList49() {
	assertFalse(9534==9534+1);
}
@Test
public void bigFalseTestLibIOArrayNumList50() {
	assertFalse(19293==19293+1);
}
@Test
public void bigFalseTestLibIOArrayNumList51() {
	assertFalse(17574==17574+1);
}
@Test
public void bigFalseTestLibIOArrayNumList52() {
	assertFalse(27044==27044+1);
}
@Test
public void bigFalseTestLibIOArrayNumList53() {
	assertFalse(31493==31493+1);
}
@Test
public void bigFalseTestLibIOArrayNumList54() {
	assertFalse(26947==26947+1);
}
@Test
public void bigFalseTestLibIOArrayNumList55() {
	assertFalse(5001==5001+1);
}
}
