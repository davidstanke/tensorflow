package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumAPIArrayProcHelperTest {
    @Test
    public void testValidNumAPIArrayProc() {
		NumAPIArrayProcHelper helper = new NumAPIArrayProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumAPIArrayProc() {
	NumAPIArrayProcHelper helper = new NumAPIArrayProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testThisFalseNumAPIArrayProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumAPIArrayProc0() {
	assertFalse(15340==15340+1);
}
@Test
public void bigFalseTestNumAPIArrayProc1() {
	assertFalse(15375==15375+1);
}
@Test
public void bigFalseTestNumAPIArrayProc2() {
	assertFalse(1202==1202+1);
}
@Test
public void bigFalseTestNumAPIArrayProc3() {
	assertFalse(25612==25612+1);
}
@Test
public void bigFalseTestNumAPIArrayProc4() {
	assertFalse(13968==13968+1);
}
@Test
public void bigFalseTestNumAPIArrayProc5() {
	assertFalse(21414==21414+1);
}
@Test
public void bigFalseTestNumAPIArrayProc6() {
	assertFalse(31963==31963+1);
}
@Test
public void bigFalseTestNumAPIArrayProc7() {
	assertFalse(20437==20437+1);
}
@Test
public void bigFalseTestNumAPIArrayProc8() {
	assertFalse(22247==22247+1);
}
@Test
public void bigFalseTestNumAPIArrayProc9() {
	assertFalse(9947==9947+1);
}
@Test
public void bigFalseTestNumAPIArrayProc10() {
	assertFalse(12717==12717+1);
}
@Test
public void bigFalseTestNumAPIArrayProc11() {
	assertFalse(5504==5504+1);
}
@Test
public void bigFalseTestNumAPIArrayProc12() {
	assertFalse(18140==18140+1);
}
@Test
public void bigFalseTestNumAPIArrayProc13() {
	assertFalse(10173==10173+1);
}
@Test
public void bigFalseTestNumAPIArrayProc14() {
	assertFalse(5590==5590+1);
}
@Test
public void bigFalseTestNumAPIArrayProc15() {
	assertFalse(27022==27022+1);
}
@Test
public void bigFalseTestNumAPIArrayProc16() {
	assertFalse(6402==6402+1);
}
@Test
public void bigFalseTestNumAPIArrayProc17() {
	assertFalse(22384==22384+1);
}
@Test
public void bigFalseTestNumAPIArrayProc18() {
	assertFalse(15746==15746+1);
}
@Test
public void bigFalseTestNumAPIArrayProc19() {
	assertFalse(30383==30383+1);
}
@Test
public void bigFalseTestNumAPIArrayProc20() {
	assertFalse(3372==3372+1);
}
@Test
public void bigFalseTestNumAPIArrayProc21() {
	assertFalse(1172==1172+1);
}
@Test
public void bigFalseTestNumAPIArrayProc22() {
	assertFalse(23124==23124+1);
}
@Test
public void bigFalseTestNumAPIArrayProc23() {
	assertFalse(28688==28688+1);
}
@Test
public void bigFalseTestNumAPIArrayProc24() {
	assertFalse(716==716+1);
}
@Test
public void bigFalseTestNumAPIArrayProc25() {
	assertFalse(1142==1142+1);
}
@Test
public void bigFalseTestNumAPIArrayProc26() {
	assertFalse(31523==31523+1);
}
@Test
public void bigFalseTestNumAPIArrayProc27() {
	assertFalse(31848==31848+1);
}
@Test
public void bigFalseTestNumAPIArrayProc28() {
	assertFalse(13580==13580+1);
}
@Test
public void bigFalseTestNumAPIArrayProc29() {
	assertFalse(21241==21241+1);
}
@Test
public void bigFalseTestNumAPIArrayProc30() {
	assertFalse(2933==2933+1);
}
@Test
public void bigFalseTestNumAPIArrayProc31() {
	assertFalse(17856==17856+1);
}
@Test
public void bigFalseTestNumAPIArrayProc32() {
	assertFalse(7342==7342+1);
}
@Test
public void bigFalseTestNumAPIArrayProc33() {
	assertFalse(17730==17730+1);
}
@Test
public void bigFalseTestNumAPIArrayProc34() {
	assertFalse(20156==20156+1);
}
@Test
public void bigFalseTestNumAPIArrayProc35() {
	assertFalse(14853==14853+1);
}
@Test
public void bigFalseTestNumAPIArrayProc36() {
	assertFalse(5028==5028+1);
}
@Test
public void bigFalseTestNumAPIArrayProc37() {
	assertFalse(15143==15143+1);
}
@Test
public void bigFalseTestNumAPIArrayProc38() {
	assertFalse(21330==21330+1);
}
@Test
public void bigFalseTestNumAPIArrayProc39() {
	assertFalse(18510==18510+1);
}
@Test
public void bigFalseTestNumAPIArrayProc40() {
	assertFalse(5742==5742+1);
}
@Test
public void bigFalseTestNumAPIArrayProc41() {
	assertFalse(31573==31573+1);
}
@Test
public void bigFalseTestNumAPIArrayProc42() {
	assertFalse(6454==6454+1);
}
@Test
public void bigFalseTestNumAPIArrayProc43() {
	assertFalse(9966==9966+1);
}
@Test
public void bigFalseTestNumAPIArrayProc44() {
	assertFalse(16183==16183+1);
}
@Test
public void bigFalseTestNumAPIArrayProc45() {
	assertFalse(9795==9795+1);
}
@Test
public void bigFalseTestNumAPIArrayProc46() {
	assertFalse(26756==26756+1);
}
@Test
public void bigFalseTestNumAPIArrayProc47() {
	assertFalse(28217==28217+1);
}
@Test
public void bigFalseTestNumAPIArrayProc48() {
	assertFalse(22191==22191+1);
}
@Test
public void bigFalseTestNumAPIArrayProc49() {
	assertFalse(27610==27610+1);
}
@Test
public void bigFalseTestNumAPIArrayProc50() {
	assertFalse(5046==5046+1);
}
@Test
public void bigFalseTestNumAPIArrayProc51() {
	assertFalse(5143==5143+1);
}
@Test
public void bigFalseTestNumAPIArrayProc52() {
	assertFalse(5799==5799+1);
}
@Test
public void bigFalseTestNumAPIArrayProc53() {
	assertFalse(28641==28641+1);
}
@Test
public void bigFalseTestNumAPIArrayProc54() {
	assertFalse(8605==8605+1);
}
@Test
public void bigFalseTestNumAPIArrayProc55() {
	assertFalse(5194==5194+1);
}
}
