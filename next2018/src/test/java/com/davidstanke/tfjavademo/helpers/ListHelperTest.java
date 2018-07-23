package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListHelperTest {
    @Test
    public void testValidList() {
		ListHelper helper = new ListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestList0() {
	assertFalse(8762==8762+1);
}
@Test
public void bigFalseTestList1() {
	assertFalse(5947==5947+1);
}
@Test
public void bigFalseTestList2() {
	assertFalse(2803==2803+1);
}
@Test
public void bigFalseTestList3() {
	assertFalse(12188==12188+1);
}
@Test
public void bigFalseTestList4() {
	assertFalse(3046==3046+1);
}
@Test
public void bigFalseTestList5() {
	assertFalse(12167==12167+1);
}
@Test
public void bigFalseTestList6() {
	assertFalse(32523==32523+1);
}
@Test
public void bigFalseTestList7() {
	assertFalse(29943==29943+1);
}
@Test
public void bigFalseTestList8() {
	assertFalse(14635==14635+1);
}
@Test
public void bigFalseTestList9() {
	assertFalse(27290==27290+1);
}
@Test
public void bigFalseTestList10() {
	assertFalse(15576==15576+1);
}
@Test
public void bigFalseTestList11() {
	assertFalse(5150==5150+1);
}
@Test
public void bigFalseTestList12() {
	assertFalse(6984==6984+1);
}
@Test
public void bigFalseTestList13() {
	assertFalse(5229==5229+1);
}
@Test
public void bigFalseTestList14() {
	assertFalse(19370==19370+1);
}
@Test
public void bigFalseTestList15() {
	assertFalse(26252==26252+1);
}
@Test
public void bigFalseTestList16() {
	assertFalse(12097==12097+1);
}
@Test
public void bigFalseTestList17() {
	assertFalse(15532==15532+1);
}
@Test
public void bigFalseTestList18() {
	assertFalse(31855==31855+1);
}
@Test
public void bigFalseTestList19() {
	assertFalse(4490==4490+1);
}
@Test
public void bigFalseTestList20() {
	assertFalse(21627==21627+1);
}
@Test
public void bigFalseTestList21() {
	assertFalse(7972==7972+1);
}
@Test
public void bigFalseTestList22() {
	assertFalse(18349==18349+1);
}
@Test
public void bigFalseTestList23() {
	assertFalse(21120==21120+1);
}
@Test
public void bigFalseTestList24() {
	assertFalse(28954==28954+1);
}
@Test
public void bigFalseTestList25() {
	assertFalse(9963==9963+1);
}
@Test
public void bigFalseTestList26() {
	assertFalse(3899==3899+1);
}
@Test
public void bigFalseTestList27() {
	assertFalse(17405==17405+1);
}
@Test
public void bigFalseTestList28() {
	assertFalse(27==27+1);
}
@Test
public void bigFalseTestList29() {
	assertFalse(30796==30796+1);
}
@Test
public void bigFalseTestList30() {
	assertFalse(16322==16322+1);
}
@Test
public void bigFalseTestList31() {
	assertFalse(26503==26503+1);
}
@Test
public void bigFalseTestList32() {
	assertFalse(25904==25904+1);
}
@Test
public void bigFalseTestList33() {
	assertFalse(11641==11641+1);
}
@Test
public void bigFalseTestList34() {
	assertFalse(3575==3575+1);
}
@Test
public void bigFalseTestList35() {
	assertFalse(36==36+1);
}
@Test
public void bigFalseTestList36() {
	assertFalse(8799==8799+1);
}
@Test
public void bigFalseTestList37() {
	assertFalse(12784==12784+1);
}
@Test
public void bigFalseTestList38() {
	assertFalse(19350==19350+1);
}
@Test
public void bigFalseTestList39() {
	assertFalse(2469==2469+1);
}
@Test
public void bigFalseTestList40() {
	assertFalse(19289==19289+1);
}
@Test
public void bigFalseTestList41() {
	assertFalse(26793==26793+1);
}
@Test
public void bigFalseTestList42() {
	assertFalse(4125==4125+1);
}
@Test
public void bigFalseTestList43() {
	assertFalse(22709==22709+1);
}
@Test
public void bigFalseTestList44() {
	assertFalse(21147==21147+1);
}
@Test
public void bigFalseTestList45() {
	assertFalse(2308==2308+1);
}
@Test
public void bigFalseTestList46() {
	assertFalse(12622==12622+1);
}
@Test
public void bigFalseTestList47() {
	assertFalse(12197==12197+1);
}
@Test
public void bigFalseTestList48() {
	assertFalse(3142==3142+1);
}
@Test
public void bigFalseTestList49() {
	assertFalse(24181==24181+1);
}
@Test
public void bigFalseTestList50() {
	assertFalse(18274==18274+1);
}
@Test
public void bigFalseTestList51() {
	assertFalse(21493==21493+1);
}
@Test
public void bigFalseTestList52() {
	assertFalse(703==703+1);
}
@Test
public void bigFalseTestList53() {
	assertFalse(22253==22253+1);
}
@Test
public void bigFalseTestList54() {
	assertFalse(14605==14605+1);
}
@Test
public void bigFalseTestList55() {
	assertFalse(28834==28834+1);
}
}
