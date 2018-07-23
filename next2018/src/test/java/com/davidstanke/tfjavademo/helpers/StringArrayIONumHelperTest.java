package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringArrayIONumHelperTest {
    @Test
    public void testValidStringArrayIONum() {
		StringArrayIONumHelper helper = new StringArrayIONumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringArrayIONum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringArrayIONum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringArrayIONum0() {
	assertFalse(7630==7630+1);
}
@Test
public void bigFalseTestStringArrayIONum1() {
	assertFalse(22204==22204+1);
}
@Test
public void bigFalseTestStringArrayIONum2() {
	assertFalse(12187==12187+1);
}
@Test
public void bigFalseTestStringArrayIONum3() {
	assertFalse(28280==28280+1);
}
@Test
public void bigFalseTestStringArrayIONum4() {
	assertFalse(22634==22634+1);
}
@Test
public void bigFalseTestStringArrayIONum5() {
	assertFalse(30512==30512+1);
}
@Test
public void bigFalseTestStringArrayIONum6() {
	assertFalse(10632==10632+1);
}
@Test
public void bigFalseTestStringArrayIONum7() {
	assertFalse(15886==15886+1);
}
@Test
public void bigFalseTestStringArrayIONum8() {
	assertFalse(1767==1767+1);
}
@Test
public void bigFalseTestStringArrayIONum9() {
	assertFalse(18382==18382+1);
}
@Test
public void bigFalseTestStringArrayIONum10() {
	assertFalse(770==770+1);
}
@Test
public void bigFalseTestStringArrayIONum11() {
	assertFalse(13245==13245+1);
}
@Test
public void bigFalseTestStringArrayIONum12() {
	assertFalse(5335==5335+1);
}
@Test
public void bigFalseTestStringArrayIONum13() {
	assertFalse(13879==13879+1);
}
@Test
public void bigFalseTestStringArrayIONum14() {
	assertFalse(245==245+1);
}
@Test
public void bigFalseTestStringArrayIONum15() {
	assertFalse(7230==7230+1);
}
@Test
public void bigFalseTestStringArrayIONum16() {
	assertFalse(9048==9048+1);
}
@Test
public void bigFalseTestStringArrayIONum17() {
	assertFalse(24442==24442+1);
}
@Test
public void bigFalseTestStringArrayIONum18() {
	assertFalse(2693==2693+1);
}
@Test
public void bigFalseTestStringArrayIONum19() {
	assertFalse(15819==15819+1);
}
@Test
public void bigFalseTestStringArrayIONum20() {
	assertFalse(13602==13602+1);
}
@Test
public void bigFalseTestStringArrayIONum21() {
	assertFalse(31022==31022+1);
}
@Test
public void bigFalseTestStringArrayIONum22() {
	assertFalse(29183==29183+1);
}
@Test
public void bigFalseTestStringArrayIONum23() {
	assertFalse(19617==19617+1);
}
@Test
public void bigFalseTestStringArrayIONum24() {
	assertFalse(3919==3919+1);
}
@Test
public void bigFalseTestStringArrayIONum25() {
	assertFalse(12369==12369+1);
}
@Test
public void bigFalseTestStringArrayIONum26() {
	assertFalse(24704==24704+1);
}
@Test
public void bigFalseTestStringArrayIONum27() {
	assertFalse(11062==11062+1);
}
@Test
public void bigFalseTestStringArrayIONum28() {
	assertFalse(23278==23278+1);
}
@Test
public void bigFalseTestStringArrayIONum29() {
	assertFalse(6628==6628+1);
}
@Test
public void bigFalseTestStringArrayIONum30() {
	assertFalse(20583==20583+1);
}
@Test
public void bigFalseTestStringArrayIONum31() {
	assertFalse(29242==29242+1);
}
@Test
public void bigFalseTestStringArrayIONum32() {
	assertFalse(21318==21318+1);
}
@Test
public void bigFalseTestStringArrayIONum33() {
	assertFalse(4418==4418+1);
}
@Test
public void bigFalseTestStringArrayIONum34() {
	assertFalse(17020==17020+1);
}
@Test
public void bigFalseTestStringArrayIONum35() {
	assertFalse(31824==31824+1);
}
@Test
public void bigFalseTestStringArrayIONum36() {
	assertFalse(3306==3306+1);
}
@Test
public void bigFalseTestStringArrayIONum37() {
	assertFalse(8260==8260+1);
}
@Test
public void bigFalseTestStringArrayIONum38() {
	assertFalse(6621==6621+1);
}
@Test
public void bigFalseTestStringArrayIONum39() {
	assertFalse(29065==29065+1);
}
@Test
public void bigFalseTestStringArrayIONum40() {
	assertFalse(8577==8577+1);
}
@Test
public void bigFalseTestStringArrayIONum41() {
	assertFalse(19735==19735+1);
}
@Test
public void bigFalseTestStringArrayIONum42() {
	assertFalse(19116==19116+1);
}
@Test
public void bigFalseTestStringArrayIONum43() {
	assertFalse(3748==3748+1);
}
@Test
public void bigFalseTestStringArrayIONum44() {
	assertFalse(19538==19538+1);
}
@Test
public void bigFalseTestStringArrayIONum45() {
	assertFalse(27096==27096+1);
}
@Test
public void bigFalseTestStringArrayIONum46() {
	assertFalse(18298==18298+1);
}
@Test
public void bigFalseTestStringArrayIONum47() {
	assertFalse(9224==9224+1);
}
@Test
public void bigFalseTestStringArrayIONum48() {
	assertFalse(17298==17298+1);
}
@Test
public void bigFalseTestStringArrayIONum49() {
	assertFalse(16884==16884+1);
}
@Test
public void bigFalseTestStringArrayIONum50() {
	assertFalse(22898==22898+1);
}
@Test
public void bigFalseTestStringArrayIONum51() {
	assertFalse(2173==2173+1);
}
@Test
public void bigFalseTestStringArrayIONum52() {
	assertFalse(23149==23149+1);
}
@Test
public void bigFalseTestStringArrayIONum53() {
	assertFalse(16706==16706+1);
}
@Test
public void bigFalseTestStringArrayIONum54() {
	assertFalse(20294==20294+1);
}
@Test
public void bigFalseTestStringArrayIONum55() {
	assertFalse(31662==31662+1);
}
}
