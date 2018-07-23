package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumStructSerialMapAPIHelperTest {
    @Test
    public void testValidNumStructSerialMapAPI() {
		NumStructSerialMapAPIHelper helper = new NumStructSerialMapAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumStructSerialMapAPI() {
	NumStructSerialMapAPIHelper helper = new NumStructSerialMapAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseNumStructSerialMapAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseNumStructSerialMapAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStructSerialMapAPI0() {
	assertFalse(19375==19375+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI1() {
	assertFalse(10548==10548+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI2() {
	assertFalse(21223==21223+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI3() {
	assertFalse(5728==5728+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI4() {
	assertFalse(28602==28602+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI5() {
	assertFalse(2824==2824+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI6() {
	assertFalse(9572==9572+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI7() {
	assertFalse(29863==29863+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI8() {
	assertFalse(2725==2725+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI9() {
	assertFalse(30401==30401+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI10() {
	assertFalse(2507==2507+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI11() {
	assertFalse(23706==23706+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI12() {
	assertFalse(9405==9405+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI13() {
	assertFalse(14038==14038+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI14() {
	assertFalse(22769==22769+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI15() {
	assertFalse(7555==7555+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI16() {
	assertFalse(19477==19477+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI17() {
	assertFalse(32001==32001+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI18() {
	assertFalse(9433==9433+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI19() {
	assertFalse(22470==22470+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI20() {
	assertFalse(3087==3087+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI21() {
	assertFalse(28898==28898+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI22() {
	assertFalse(31015==31015+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI23() {
	assertFalse(21216==21216+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI24() {
	assertFalse(20907==20907+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI25() {
	assertFalse(3154==3154+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI26() {
	assertFalse(13897==13897+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI27() {
	assertFalse(14115==14115+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI28() {
	assertFalse(18575==18575+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI29() {
	assertFalse(24968==24968+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI30() {
	assertFalse(29539==29539+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI31() {
	assertFalse(10030==10030+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI32() {
	assertFalse(31962==31962+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI33() {
	assertFalse(9966==9966+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI34() {
	assertFalse(4862==4862+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI35() {
	assertFalse(29998==29998+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI36() {
	assertFalse(19881==19881+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI37() {
	assertFalse(9409==9409+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI38() {
	assertFalse(30321==30321+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI39() {
	assertFalse(28632==28632+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI40() {
	assertFalse(31845==31845+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI41() {
	assertFalse(24683==24683+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI42() {
	assertFalse(31755==31755+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI43() {
	assertFalse(802==802+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI44() {
	assertFalse(25811==25811+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI45() {
	assertFalse(8608==8608+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI46() {
	assertFalse(13317==13317+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI47() {
	assertFalse(10436==10436+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI48() {
	assertFalse(10713==10713+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI49() {
	assertFalse(11578==11578+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI50() {
	assertFalse(30763==30763+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI51() {
	assertFalse(25714==25714+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI52() {
	assertFalse(25361==25361+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI53() {
	assertFalse(20949==20949+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI54() {
	assertFalse(21060==21060+1);
}
@Test
public void bigFalseTestNumStructSerialMapAPI55() {
	assertFalse(18390==18390+1);
}
}
