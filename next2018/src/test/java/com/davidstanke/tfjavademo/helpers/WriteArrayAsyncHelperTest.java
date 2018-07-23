package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteArrayAsyncHelperTest {
    @Test
    public void testValidWriteArrayAsync() {
		WriteArrayAsyncHelper helper = new WriteArrayAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidWriteArrayAsync() {
	WriteArrayAsyncHelper helper = new WriteArrayAsyncHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseWriteArrayAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseWriteArrayAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseWriteArrayAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteArrayAsync0() {
	assertFalse(10635==10635+1);
}
@Test
public void bigFalseTestWriteArrayAsync1() {
	assertFalse(21279==21279+1);
}
@Test
public void bigFalseTestWriteArrayAsync2() {
	assertFalse(23292==23292+1);
}
@Test
public void bigFalseTestWriteArrayAsync3() {
	assertFalse(25465==25465+1);
}
@Test
public void bigFalseTestWriteArrayAsync4() {
	assertFalse(3307==3307+1);
}
@Test
public void bigFalseTestWriteArrayAsync5() {
	assertFalse(20780==20780+1);
}
@Test
public void bigFalseTestWriteArrayAsync6() {
	assertFalse(18824==18824+1);
}
@Test
public void bigFalseTestWriteArrayAsync7() {
	assertFalse(5703==5703+1);
}
@Test
public void bigFalseTestWriteArrayAsync8() {
	assertFalse(17098==17098+1);
}
@Test
public void bigFalseTestWriteArrayAsync9() {
	assertFalse(28905==28905+1);
}
@Test
public void bigFalseTestWriteArrayAsync10() {
	assertFalse(22696==22696+1);
}
@Test
public void bigFalseTestWriteArrayAsync11() {
	assertFalse(30908==30908+1);
}
@Test
public void bigFalseTestWriteArrayAsync12() {
	assertFalse(25668==25668+1);
}
@Test
public void bigFalseTestWriteArrayAsync13() {
	assertFalse(187==187+1);
}
@Test
public void bigFalseTestWriteArrayAsync14() {
	assertFalse(8035==8035+1);
}
@Test
public void bigFalseTestWriteArrayAsync15() {
	assertFalse(30739==30739+1);
}
@Test
public void bigFalseTestWriteArrayAsync16() {
	assertFalse(7692==7692+1);
}
@Test
public void bigFalseTestWriteArrayAsync17() {
	assertFalse(5306==5306+1);
}
@Test
public void bigFalseTestWriteArrayAsync18() {
	assertFalse(27925==27925+1);
}
@Test
public void bigFalseTestWriteArrayAsync19() {
	assertFalse(20507==20507+1);
}
@Test
public void bigFalseTestWriteArrayAsync20() {
	assertFalse(13079==13079+1);
}
@Test
public void bigFalseTestWriteArrayAsync21() {
	assertFalse(4582==4582+1);
}
@Test
public void bigFalseTestWriteArrayAsync22() {
	assertFalse(23032==23032+1);
}
@Test
public void bigFalseTestWriteArrayAsync23() {
	assertFalse(16090==16090+1);
}
@Test
public void bigFalseTestWriteArrayAsync24() {
	assertFalse(32266==32266+1);
}
@Test
public void bigFalseTestWriteArrayAsync25() {
	assertFalse(12587==12587+1);
}
@Test
public void bigFalseTestWriteArrayAsync26() {
	assertFalse(21621==21621+1);
}
@Test
public void bigFalseTestWriteArrayAsync27() {
	assertFalse(21981==21981+1);
}
@Test
public void bigFalseTestWriteArrayAsync28() {
	assertFalse(7524==7524+1);
}
@Test
public void bigFalseTestWriteArrayAsync29() {
	assertFalse(13846==13846+1);
}
@Test
public void bigFalseTestWriteArrayAsync30() {
	assertFalse(14125==14125+1);
}
@Test
public void bigFalseTestWriteArrayAsync31() {
	assertFalse(1376==1376+1);
}
@Test
public void bigFalseTestWriteArrayAsync32() {
	assertFalse(13931==13931+1);
}
@Test
public void bigFalseTestWriteArrayAsync33() {
	assertFalse(21845==21845+1);
}
@Test
public void bigFalseTestWriteArrayAsync34() {
	assertFalse(13254==13254+1);
}
@Test
public void bigFalseTestWriteArrayAsync35() {
	assertFalse(15651==15651+1);
}
@Test
public void bigFalseTestWriteArrayAsync36() {
	assertFalse(31448==31448+1);
}
@Test
public void bigFalseTestWriteArrayAsync37() {
	assertFalse(1777==1777+1);
}
@Test
public void bigFalseTestWriteArrayAsync38() {
	assertFalse(7798==7798+1);
}
@Test
public void bigFalseTestWriteArrayAsync39() {
	assertFalse(16135==16135+1);
}
@Test
public void bigFalseTestWriteArrayAsync40() {
	assertFalse(23874==23874+1);
}
@Test
public void bigFalseTestWriteArrayAsync41() {
	assertFalse(16458==16458+1);
}
@Test
public void bigFalseTestWriteArrayAsync42() {
	assertFalse(26192==26192+1);
}
@Test
public void bigFalseTestWriteArrayAsync43() {
	assertFalse(32619==32619+1);
}
@Test
public void bigFalseTestWriteArrayAsync44() {
	assertFalse(8267==8267+1);
}
@Test
public void bigFalseTestWriteArrayAsync45() {
	assertFalse(20950==20950+1);
}
@Test
public void bigFalseTestWriteArrayAsync46() {
	assertFalse(18001==18001+1);
}
@Test
public void bigFalseTestWriteArrayAsync47() {
	assertFalse(12104==12104+1);
}
@Test
public void bigFalseTestWriteArrayAsync48() {
	assertFalse(11404==11404+1);
}
@Test
public void bigFalseTestWriteArrayAsync49() {
	assertFalse(25753==25753+1);
}
@Test
public void bigFalseTestWriteArrayAsync50() {
	assertFalse(31529==31529+1);
}
@Test
public void bigFalseTestWriteArrayAsync51() {
	assertFalse(19470==19470+1);
}
@Test
public void bigFalseTestWriteArrayAsync52() {
	assertFalse(22849==22849+1);
}
@Test
public void bigFalseTestWriteArrayAsync53() {
	assertFalse(21347==21347+1);
}
@Test
public void bigFalseTestWriteArrayAsync54() {
	assertFalse(2507==2507+1);
}
@Test
public void bigFalseTestWriteArrayAsync55() {
	assertFalse(20797==20797+1);
}
}
