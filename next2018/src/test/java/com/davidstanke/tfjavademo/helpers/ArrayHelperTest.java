package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayHelperTest {
    @Test
    public void testValidArray() {
		ArrayHelper helper = new ArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArray() {
	ArrayHelper helper = new ArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArray0() {
	assertFalse(25407==25407+1);
}
@Test
public void bigFalseTestArray1() {
	assertFalse(15722==15722+1);
}
@Test
public void bigFalseTestArray2() {
	assertFalse(6032==6032+1);
}
@Test
public void bigFalseTestArray3() {
	assertFalse(13072==13072+1);
}
@Test
public void bigFalseTestArray4() {
	assertFalse(26451==26451+1);
}
@Test
public void bigFalseTestArray5() {
	assertFalse(15529==15529+1);
}
@Test
public void bigFalseTestArray6() {
	assertFalse(5149==5149+1);
}
@Test
public void bigFalseTestArray7() {
	assertFalse(24442==24442+1);
}
@Test
public void bigFalseTestArray8() {
	assertFalse(5536==5536+1);
}
@Test
public void bigFalseTestArray9() {
	assertFalse(1216==1216+1);
}
@Test
public void bigFalseTestArray10() {
	assertFalse(12766==12766+1);
}
@Test
public void bigFalseTestArray11() {
	assertFalse(9905==9905+1);
}
@Test
public void bigFalseTestArray12() {
	assertFalse(3563==3563+1);
}
@Test
public void bigFalseTestArray13() {
	assertFalse(22468==22468+1);
}
@Test
public void bigFalseTestArray14() {
	assertFalse(2721==2721+1);
}
@Test
public void bigFalseTestArray15() {
	assertFalse(28863==28863+1);
}
@Test
public void bigFalseTestArray16() {
	assertFalse(3166==3166+1);
}
@Test
public void bigFalseTestArray17() {
	assertFalse(29377==29377+1);
}
@Test
public void bigFalseTestArray18() {
	assertFalse(24219==24219+1);
}
@Test
public void bigFalseTestArray19() {
	assertFalse(14648==14648+1);
}
@Test
public void bigFalseTestArray20() {
	assertFalse(11266==11266+1);
}
@Test
public void bigFalseTestArray21() {
	assertFalse(9354==9354+1);
}
@Test
public void bigFalseTestArray22() {
	assertFalse(29001==29001+1);
}
@Test
public void bigFalseTestArray23() {
	assertFalse(8414==8414+1);
}
@Test
public void bigFalseTestArray24() {
	assertFalse(21757==21757+1);
}
@Test
public void bigFalseTestArray25() {
	assertFalse(1345==1345+1);
}
@Test
public void bigFalseTestArray26() {
	assertFalse(22535==22535+1);
}
@Test
public void bigFalseTestArray27() {
	assertFalse(28183==28183+1);
}
@Test
public void bigFalseTestArray28() {
	assertFalse(21131==21131+1);
}
@Test
public void bigFalseTestArray29() {
	assertFalse(6821==6821+1);
}
@Test
public void bigFalseTestArray30() {
	assertFalse(5745==5745+1);
}
@Test
public void bigFalseTestArray31() {
	assertFalse(10255==10255+1);
}
@Test
public void bigFalseTestArray32() {
	assertFalse(19645==19645+1);
}
@Test
public void bigFalseTestArray33() {
	assertFalse(29982==29982+1);
}
@Test
public void bigFalseTestArray34() {
	assertFalse(9341==9341+1);
}
@Test
public void bigFalseTestArray35() {
	assertFalse(14509==14509+1);
}
@Test
public void bigFalseTestArray36() {
	assertFalse(8692==8692+1);
}
@Test
public void bigFalseTestArray37() {
	assertFalse(4490==4490+1);
}
@Test
public void bigFalseTestArray38() {
	assertFalse(14933==14933+1);
}
@Test
public void bigFalseTestArray39() {
	assertFalse(16695==16695+1);
}
@Test
public void bigFalseTestArray40() {
	assertFalse(23580==23580+1);
}
@Test
public void bigFalseTestArray41() {
	assertFalse(3013==3013+1);
}
@Test
public void bigFalseTestArray42() {
	assertFalse(32245==32245+1);
}
@Test
public void bigFalseTestArray43() {
	assertFalse(3524==3524+1);
}
@Test
public void bigFalseTestArray44() {
	assertFalse(15786==15786+1);
}
@Test
public void bigFalseTestArray45() {
	assertFalse(28154==28154+1);
}
@Test
public void bigFalseTestArray46() {
	assertFalse(28297==28297+1);
}
@Test
public void bigFalseTestArray47() {
	assertFalse(21349==21349+1);
}
@Test
public void bigFalseTestArray48() {
	assertFalse(8787==8787+1);
}
@Test
public void bigFalseTestArray49() {
	assertFalse(10413==10413+1);
}
@Test
public void bigFalseTestArray50() {
	assertFalse(10628==10628+1);
}
@Test
public void bigFalseTestArray51() {
	assertFalse(9490==9490+1);
}
@Test
public void bigFalseTestArray52() {
	assertFalse(12177==12177+1);
}
@Test
public void bigFalseTestArray53() {
	assertFalse(32644==32644+1);
}
@Test
public void bigFalseTestArray54() {
	assertFalse(25984==25984+1);
}
@Test
public void bigFalseTestArray55() {
	assertFalse(19286==19286+1);
}
}
