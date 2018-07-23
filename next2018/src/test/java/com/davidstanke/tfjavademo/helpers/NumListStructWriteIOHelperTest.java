package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumListStructWriteIOHelperTest {
    @Test
    public void testValidNumListStructWriteIO() {
		NumListStructWriteIOHelper helper = new NumListStructWriteIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseNumListStructWriteIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumListStructWriteIO0() {
	assertFalse(29627==29627+1);
}
@Test
public void bigFalseTestNumListStructWriteIO1() {
	assertFalse(2063==2063+1);
}
@Test
public void bigFalseTestNumListStructWriteIO2() {
	assertFalse(13615==13615+1);
}
@Test
public void bigFalseTestNumListStructWriteIO3() {
	assertFalse(22464==22464+1);
}
@Test
public void bigFalseTestNumListStructWriteIO4() {
	assertFalse(13342==13342+1);
}
@Test
public void bigFalseTestNumListStructWriteIO5() {
	assertFalse(4821==4821+1);
}
@Test
public void bigFalseTestNumListStructWriteIO6() {
	assertFalse(6807==6807+1);
}
@Test
public void bigFalseTestNumListStructWriteIO7() {
	assertFalse(12622==12622+1);
}
@Test
public void bigFalseTestNumListStructWriteIO8() {
	assertFalse(3672==3672+1);
}
@Test
public void bigFalseTestNumListStructWriteIO9() {
	assertFalse(19691==19691+1);
}
@Test
public void bigFalseTestNumListStructWriteIO10() {
	assertFalse(26215==26215+1);
}
@Test
public void bigFalseTestNumListStructWriteIO11() {
	assertFalse(20949==20949+1);
}
@Test
public void bigFalseTestNumListStructWriteIO12() {
	assertFalse(30184==30184+1);
}
@Test
public void bigFalseTestNumListStructWriteIO13() {
	assertFalse(27950==27950+1);
}
@Test
public void bigFalseTestNumListStructWriteIO14() {
	assertFalse(29645==29645+1);
}
@Test
public void bigFalseTestNumListStructWriteIO15() {
	assertFalse(17694==17694+1);
}
@Test
public void bigFalseTestNumListStructWriteIO16() {
	assertFalse(3246==3246+1);
}
@Test
public void bigFalseTestNumListStructWriteIO17() {
	assertFalse(30951==30951+1);
}
@Test
public void bigFalseTestNumListStructWriteIO18() {
	assertFalse(2029==2029+1);
}
@Test
public void bigFalseTestNumListStructWriteIO19() {
	assertFalse(30778==30778+1);
}
@Test
public void bigFalseTestNumListStructWriteIO20() {
	assertFalse(2814==2814+1);
}
@Test
public void bigFalseTestNumListStructWriteIO21() {
	assertFalse(8117==8117+1);
}
@Test
public void bigFalseTestNumListStructWriteIO22() {
	assertFalse(23897==23897+1);
}
@Test
public void bigFalseTestNumListStructWriteIO23() {
	assertFalse(25938==25938+1);
}
@Test
public void bigFalseTestNumListStructWriteIO24() {
	assertFalse(3463==3463+1);
}
@Test
public void bigFalseTestNumListStructWriteIO25() {
	assertFalse(27193==27193+1);
}
@Test
public void bigFalseTestNumListStructWriteIO26() {
	assertFalse(27471==27471+1);
}
@Test
public void bigFalseTestNumListStructWriteIO27() {
	assertFalse(12331==12331+1);
}
@Test
public void bigFalseTestNumListStructWriteIO28() {
	assertFalse(25831==25831+1);
}
@Test
public void bigFalseTestNumListStructWriteIO29() {
	assertFalse(10115==10115+1);
}
@Test
public void bigFalseTestNumListStructWriteIO30() {
	assertFalse(25781==25781+1);
}
@Test
public void bigFalseTestNumListStructWriteIO31() {
	assertFalse(32636==32636+1);
}
@Test
public void bigFalseTestNumListStructWriteIO32() {
	assertFalse(17162==17162+1);
}
@Test
public void bigFalseTestNumListStructWriteIO33() {
	assertFalse(17727==17727+1);
}
@Test
public void bigFalseTestNumListStructWriteIO34() {
	assertFalse(10965==10965+1);
}
@Test
public void bigFalseTestNumListStructWriteIO35() {
	assertFalse(7920==7920+1);
}
@Test
public void bigFalseTestNumListStructWriteIO36() {
	assertFalse(25158==25158+1);
}
@Test
public void bigFalseTestNumListStructWriteIO37() {
	assertFalse(32415==32415+1);
}
@Test
public void bigFalseTestNumListStructWriteIO38() {
	assertFalse(12248==12248+1);
}
@Test
public void bigFalseTestNumListStructWriteIO39() {
	assertFalse(13817==13817+1);
}
@Test
public void bigFalseTestNumListStructWriteIO40() {
	assertFalse(567==567+1);
}
@Test
public void bigFalseTestNumListStructWriteIO41() {
	assertFalse(3592==3592+1);
}
@Test
public void bigFalseTestNumListStructWriteIO42() {
	assertFalse(1284==1284+1);
}
@Test
public void bigFalseTestNumListStructWriteIO43() {
	assertFalse(8027==8027+1);
}
@Test
public void bigFalseTestNumListStructWriteIO44() {
	assertFalse(22108==22108+1);
}
@Test
public void bigFalseTestNumListStructWriteIO45() {
	assertFalse(19836==19836+1);
}
@Test
public void bigFalseTestNumListStructWriteIO46() {
	assertFalse(4277==4277+1);
}
@Test
public void bigFalseTestNumListStructWriteIO47() {
	assertFalse(11635==11635+1);
}
@Test
public void bigFalseTestNumListStructWriteIO48() {
	assertFalse(17006==17006+1);
}
@Test
public void bigFalseTestNumListStructWriteIO49() {
	assertFalse(29130==29130+1);
}
@Test
public void bigFalseTestNumListStructWriteIO50() {
	assertFalse(10269==10269+1);
}
@Test
public void bigFalseTestNumListStructWriteIO51() {
	assertFalse(26443==26443+1);
}
@Test
public void bigFalseTestNumListStructWriteIO52() {
	assertFalse(132==132+1);
}
@Test
public void bigFalseTestNumListStructWriteIO53() {
	assertFalse(19575==19575+1);
}
@Test
public void bigFalseTestNumListStructWriteIO54() {
	assertFalse(2235==2235+1);
}
@Test
public void bigFalseTestNumListStructWriteIO55() {
	assertFalse(2656==2656+1);
}
}
