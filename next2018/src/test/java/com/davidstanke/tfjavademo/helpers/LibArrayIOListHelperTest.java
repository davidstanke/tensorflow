package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibArrayIOListHelperTest {
    @Test
    public void testValidLibArrayIOList() {
		LibArrayIOListHelper helper = new LibArrayIOListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseLibArrayIOList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLibArrayIOList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLibArrayIOList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibArrayIOList0() {
	assertFalse(25928==25928+1);
}
@Test
public void bigFalseTestLibArrayIOList1() {
	assertFalse(24159==24159+1);
}
@Test
public void bigFalseTestLibArrayIOList2() {
	assertFalse(17628==17628+1);
}
@Test
public void bigFalseTestLibArrayIOList3() {
	assertFalse(1134==1134+1);
}
@Test
public void bigFalseTestLibArrayIOList4() {
	assertFalse(25114==25114+1);
}
@Test
public void bigFalseTestLibArrayIOList5() {
	assertFalse(1009==1009+1);
}
@Test
public void bigFalseTestLibArrayIOList6() {
	assertFalse(30733==30733+1);
}
@Test
public void bigFalseTestLibArrayIOList7() {
	assertFalse(19097==19097+1);
}
@Test
public void bigFalseTestLibArrayIOList8() {
	assertFalse(23015==23015+1);
}
@Test
public void bigFalseTestLibArrayIOList9() {
	assertFalse(1584==1584+1);
}
@Test
public void bigFalseTestLibArrayIOList10() {
	assertFalse(11106==11106+1);
}
@Test
public void bigFalseTestLibArrayIOList11() {
	assertFalse(14464==14464+1);
}
@Test
public void bigFalseTestLibArrayIOList12() {
	assertFalse(8616==8616+1);
}
@Test
public void bigFalseTestLibArrayIOList13() {
	assertFalse(21769==21769+1);
}
@Test
public void bigFalseTestLibArrayIOList14() {
	assertFalse(4080==4080+1);
}
@Test
public void bigFalseTestLibArrayIOList15() {
	assertFalse(5972==5972+1);
}
@Test
public void bigFalseTestLibArrayIOList16() {
	assertFalse(463==463+1);
}
@Test
public void bigFalseTestLibArrayIOList17() {
	assertFalse(14457==14457+1);
}
@Test
public void bigFalseTestLibArrayIOList18() {
	assertFalse(8702==8702+1);
}
@Test
public void bigFalseTestLibArrayIOList19() {
	assertFalse(18491==18491+1);
}
@Test
public void bigFalseTestLibArrayIOList20() {
	assertFalse(22256==22256+1);
}
@Test
public void bigFalseTestLibArrayIOList21() {
	assertFalse(8647==8647+1);
}
@Test
public void bigFalseTestLibArrayIOList22() {
	assertFalse(1942==1942+1);
}
@Test
public void bigFalseTestLibArrayIOList23() {
	assertFalse(11760==11760+1);
}
@Test
public void bigFalseTestLibArrayIOList24() {
	assertFalse(4396==4396+1);
}
@Test
public void bigFalseTestLibArrayIOList25() {
	assertFalse(21637==21637+1);
}
@Test
public void bigFalseTestLibArrayIOList26() {
	assertFalse(19407==19407+1);
}
@Test
public void bigFalseTestLibArrayIOList27() {
	assertFalse(5143==5143+1);
}
@Test
public void bigFalseTestLibArrayIOList28() {
	assertFalse(15969==15969+1);
}
@Test
public void bigFalseTestLibArrayIOList29() {
	assertFalse(9028==9028+1);
}
@Test
public void bigFalseTestLibArrayIOList30() {
	assertFalse(728==728+1);
}
@Test
public void bigFalseTestLibArrayIOList31() {
	assertFalse(12385==12385+1);
}
@Test
public void bigFalseTestLibArrayIOList32() {
	assertFalse(2834==2834+1);
}
@Test
public void bigFalseTestLibArrayIOList33() {
	assertFalse(15386==15386+1);
}
@Test
public void bigFalseTestLibArrayIOList34() {
	assertFalse(8901==8901+1);
}
@Test
public void bigFalseTestLibArrayIOList35() {
	assertFalse(6500==6500+1);
}
@Test
public void bigFalseTestLibArrayIOList36() {
	assertFalse(26136==26136+1);
}
@Test
public void bigFalseTestLibArrayIOList37() {
	assertFalse(16597==16597+1);
}
@Test
public void bigFalseTestLibArrayIOList38() {
	assertFalse(7449==7449+1);
}
@Test
public void bigFalseTestLibArrayIOList39() {
	assertFalse(20279==20279+1);
}
@Test
public void bigFalseTestLibArrayIOList40() {
	assertFalse(13062==13062+1);
}
@Test
public void bigFalseTestLibArrayIOList41() {
	assertFalse(9980==9980+1);
}
@Test
public void bigFalseTestLibArrayIOList42() {
	assertFalse(1303==1303+1);
}
@Test
public void bigFalseTestLibArrayIOList43() {
	assertFalse(12753==12753+1);
}
@Test
public void bigFalseTestLibArrayIOList44() {
	assertFalse(14173==14173+1);
}
@Test
public void bigFalseTestLibArrayIOList45() {
	assertFalse(7049==7049+1);
}
@Test
public void bigFalseTestLibArrayIOList46() {
	assertFalse(20169==20169+1);
}
@Test
public void bigFalseTestLibArrayIOList47() {
	assertFalse(287==287+1);
}
@Test
public void bigFalseTestLibArrayIOList48() {
	assertFalse(11892==11892+1);
}
@Test
public void bigFalseTestLibArrayIOList49() {
	assertFalse(26217==26217+1);
}
@Test
public void bigFalseTestLibArrayIOList50() {
	assertFalse(29389==29389+1);
}
@Test
public void bigFalseTestLibArrayIOList51() {
	assertFalse(17127==17127+1);
}
@Test
public void bigFalseTestLibArrayIOList52() {
	assertFalse(12326==12326+1);
}
@Test
public void bigFalseTestLibArrayIOList53() {
	assertFalse(2479==2479+1);
}
@Test
public void bigFalseTestLibArrayIOList54() {
	assertFalse(739==739+1);
}
@Test
public void bigFalseTestLibArrayIOList55() {
	assertFalse(10847==10847+1);
}
}
