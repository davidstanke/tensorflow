package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteNumWriteUtilIOHelperTest {
    @Test
    public void testValidWriteNumWriteUtilIO() {
		WriteNumWriteUtilIOHelper helper = new WriteNumWriteUtilIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidWriteNumWriteUtilIO() {
	WriteNumWriteUtilIOHelper helper = new WriteNumWriteUtilIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseWriteNumWriteUtilIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO0() {
	assertFalse(12552==12552+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO1() {
	assertFalse(20104==20104+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO2() {
	assertFalse(29154==29154+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO3() {
	assertFalse(16644==16644+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO4() {
	assertFalse(11724==11724+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO5() {
	assertFalse(10584==10584+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO6() {
	assertFalse(11743==11743+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO7() {
	assertFalse(4853==4853+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO8() {
	assertFalse(20438==20438+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO9() {
	assertFalse(29591==29591+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO10() {
	assertFalse(21893==21893+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO11() {
	assertFalse(23044==23044+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO12() {
	assertFalse(30261==30261+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO13() {
	assertFalse(6863==6863+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO14() {
	assertFalse(6773==6773+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO15() {
	assertFalse(21434==21434+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO16() {
	assertFalse(6333==6333+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO17() {
	assertFalse(22845==22845+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO18() {
	assertFalse(19694==19694+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO19() {
	assertFalse(14961==14961+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO20() {
	assertFalse(28323==28323+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO21() {
	assertFalse(11837==11837+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO22() {
	assertFalse(2500==2500+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO23() {
	assertFalse(8608==8608+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO24() {
	assertFalse(25306==25306+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO25() {
	assertFalse(29044==29044+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO26() {
	assertFalse(19487==19487+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO27() {
	assertFalse(19177==19177+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO28() {
	assertFalse(29233==29233+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO29() {
	assertFalse(27839==27839+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO30() {
	assertFalse(24313==24313+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO31() {
	assertFalse(16351==16351+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO32() {
	assertFalse(20265==20265+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO33() {
	assertFalse(10463==10463+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO34() {
	assertFalse(27221==27221+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO35() {
	assertFalse(15513==15513+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO36() {
	assertFalse(26519==26519+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO37() {
	assertFalse(22753==22753+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO38() {
	assertFalse(6208==6208+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO39() {
	assertFalse(14072==14072+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO40() {
	assertFalse(10238==10238+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO41() {
	assertFalse(4174==4174+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO42() {
	assertFalse(3465==3465+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO43() {
	assertFalse(3767==3767+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO44() {
	assertFalse(6314==6314+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO45() {
	assertFalse(12311==12311+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO46() {
	assertFalse(12864==12864+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO47() {
	assertFalse(12855==12855+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO48() {
	assertFalse(12428==12428+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO49() {
	assertFalse(13887==13887+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO50() {
	assertFalse(1519==1519+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO51() {
	assertFalse(17416==17416+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO52() {
	assertFalse(31193==31193+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO53() {
	assertFalse(23622==23622+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO54() {
	assertFalse(31643==31643+1);
}
@Test
public void bigFalseTestWriteNumWriteUtilIO55() {
	assertFalse(3383==3383+1);
}
}
