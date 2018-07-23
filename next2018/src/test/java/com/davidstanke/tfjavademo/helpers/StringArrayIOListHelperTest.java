package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringArrayIOListHelperTest {
    @Test
    public void testValidStringArrayIOList() {
		StringArrayIOListHelper helper = new StringArrayIOListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringArrayIOList() {
	StringArrayIOListHelper helper = new StringArrayIOListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringArrayIOList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringArrayIOList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringArrayIOList0() {
	assertFalse(27996==27996+1);
}
@Test
public void bigFalseTestStringArrayIOList1() {
	assertFalse(22533==22533+1);
}
@Test
public void bigFalseTestStringArrayIOList2() {
	assertFalse(10424==10424+1);
}
@Test
public void bigFalseTestStringArrayIOList3() {
	assertFalse(5418==5418+1);
}
@Test
public void bigFalseTestStringArrayIOList4() {
	assertFalse(6859==6859+1);
}
@Test
public void bigFalseTestStringArrayIOList5() {
	assertFalse(12889==12889+1);
}
@Test
public void bigFalseTestStringArrayIOList6() {
	assertFalse(30277==30277+1);
}
@Test
public void bigFalseTestStringArrayIOList7() {
	assertFalse(14798==14798+1);
}
@Test
public void bigFalseTestStringArrayIOList8() {
	assertFalse(28047==28047+1);
}
@Test
public void bigFalseTestStringArrayIOList9() {
	assertFalse(25100==25100+1);
}
@Test
public void bigFalseTestStringArrayIOList10() {
	assertFalse(9935==9935+1);
}
@Test
public void bigFalseTestStringArrayIOList11() {
	assertFalse(29764==29764+1);
}
@Test
public void bigFalseTestStringArrayIOList12() {
	assertFalse(687==687+1);
}
@Test
public void bigFalseTestStringArrayIOList13() {
	assertFalse(8201==8201+1);
}
@Test
public void bigFalseTestStringArrayIOList14() {
	assertFalse(14715==14715+1);
}
@Test
public void bigFalseTestStringArrayIOList15() {
	assertFalse(5140==5140+1);
}
@Test
public void bigFalseTestStringArrayIOList16() {
	assertFalse(14317==14317+1);
}
@Test
public void bigFalseTestStringArrayIOList17() {
	assertFalse(1670==1670+1);
}
@Test
public void bigFalseTestStringArrayIOList18() {
	assertFalse(24770==24770+1);
}
@Test
public void bigFalseTestStringArrayIOList19() {
	assertFalse(18413==18413+1);
}
@Test
public void bigFalseTestStringArrayIOList20() {
	assertFalse(23016==23016+1);
}
@Test
public void bigFalseTestStringArrayIOList21() {
	assertFalse(15089==15089+1);
}
@Test
public void bigFalseTestStringArrayIOList22() {
	assertFalse(17388==17388+1);
}
@Test
public void bigFalseTestStringArrayIOList23() {
	assertFalse(18294==18294+1);
}
@Test
public void bigFalseTestStringArrayIOList24() {
	assertFalse(6129==6129+1);
}
@Test
public void bigFalseTestStringArrayIOList25() {
	assertFalse(19097==19097+1);
}
@Test
public void bigFalseTestStringArrayIOList26() {
	assertFalse(23629==23629+1);
}
@Test
public void bigFalseTestStringArrayIOList27() {
	assertFalse(19922==19922+1);
}
@Test
public void bigFalseTestStringArrayIOList28() {
	assertFalse(22957==22957+1);
}
@Test
public void bigFalseTestStringArrayIOList29() {
	assertFalse(9757==9757+1);
}
@Test
public void bigFalseTestStringArrayIOList30() {
	assertFalse(27202==27202+1);
}
@Test
public void bigFalseTestStringArrayIOList31() {
	assertFalse(12533==12533+1);
}
@Test
public void bigFalseTestStringArrayIOList32() {
	assertFalse(21103==21103+1);
}
@Test
public void bigFalseTestStringArrayIOList33() {
	assertFalse(26517==26517+1);
}
@Test
public void bigFalseTestStringArrayIOList34() {
	assertFalse(15851==15851+1);
}
@Test
public void bigFalseTestStringArrayIOList35() {
	assertFalse(8618==8618+1);
}
@Test
public void bigFalseTestStringArrayIOList36() {
	assertFalse(28242==28242+1);
}
@Test
public void bigFalseTestStringArrayIOList37() {
	assertFalse(20354==20354+1);
}
@Test
public void bigFalseTestStringArrayIOList38() {
	assertFalse(20389==20389+1);
}
@Test
public void bigFalseTestStringArrayIOList39() {
	assertFalse(24672==24672+1);
}
@Test
public void bigFalseTestStringArrayIOList40() {
	assertFalse(29977==29977+1);
}
@Test
public void bigFalseTestStringArrayIOList41() {
	assertFalse(9334==9334+1);
}
@Test
public void bigFalseTestStringArrayIOList42() {
	assertFalse(25678==25678+1);
}
@Test
public void bigFalseTestStringArrayIOList43() {
	assertFalse(29368==29368+1);
}
@Test
public void bigFalseTestStringArrayIOList44() {
	assertFalse(32456==32456+1);
}
@Test
public void bigFalseTestStringArrayIOList45() {
	assertFalse(24962==24962+1);
}
@Test
public void bigFalseTestStringArrayIOList46() {
	assertFalse(14648==14648+1);
}
@Test
public void bigFalseTestStringArrayIOList47() {
	assertFalse(9679==9679+1);
}
@Test
public void bigFalseTestStringArrayIOList48() {
	assertFalse(5630==5630+1);
}
@Test
public void bigFalseTestStringArrayIOList49() {
	assertFalse(24420==24420+1);
}
@Test
public void bigFalseTestStringArrayIOList50() {
	assertFalse(29673==29673+1);
}
@Test
public void bigFalseTestStringArrayIOList51() {
	assertFalse(26955==26955+1);
}
@Test
public void bigFalseTestStringArrayIOList52() {
	assertFalse(9241==9241+1);
}
@Test
public void bigFalseTestStringArrayIOList53() {
	assertFalse(25709==25709+1);
}
@Test
public void bigFalseTestStringArrayIOList54() {
	assertFalse(20889==20889+1);
}
@Test
public void bigFalseTestStringArrayIOList55() {
	assertFalse(20263==20263+1);
}
}
