package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOAPIIOHelperTest {
    @Test
    public void testValidIOAPIIO() {
		IOAPIIOHelper helper = new IOAPIIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseIOAPIIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOAPIIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIOAPIIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOAPIIO0() {
	assertFalse(6137==6137+1);
}
@Test
public void bigFalseTestIOAPIIO1() {
	assertFalse(23957==23957+1);
}
@Test
public void bigFalseTestIOAPIIO2() {
	assertFalse(3843==3843+1);
}
@Test
public void bigFalseTestIOAPIIO3() {
	assertFalse(19047==19047+1);
}
@Test
public void bigFalseTestIOAPIIO4() {
	assertFalse(3076==3076+1);
}
@Test
public void bigFalseTestIOAPIIO5() {
	assertFalse(19654==19654+1);
}
@Test
public void bigFalseTestIOAPIIO6() {
	assertFalse(16398==16398+1);
}
@Test
public void bigFalseTestIOAPIIO7() {
	assertFalse(26962==26962+1);
}
@Test
public void bigFalseTestIOAPIIO8() {
	assertFalse(7441==7441+1);
}
@Test
public void bigFalseTestIOAPIIO9() {
	assertFalse(5799==5799+1);
}
@Test
public void bigFalseTestIOAPIIO10() {
	assertFalse(31430==31430+1);
}
@Test
public void bigFalseTestIOAPIIO11() {
	assertFalse(5704==5704+1);
}
@Test
public void bigFalseTestIOAPIIO12() {
	assertFalse(29824==29824+1);
}
@Test
public void bigFalseTestIOAPIIO13() {
	assertFalse(23881==23881+1);
}
@Test
public void bigFalseTestIOAPIIO14() {
	assertFalse(26378==26378+1);
}
@Test
public void bigFalseTestIOAPIIO15() {
	assertFalse(16890==16890+1);
}
@Test
public void bigFalseTestIOAPIIO16() {
	assertFalse(18268==18268+1);
}
@Test
public void bigFalseTestIOAPIIO17() {
	assertFalse(29312==29312+1);
}
@Test
public void bigFalseTestIOAPIIO18() {
	assertFalse(4822==4822+1);
}
@Test
public void bigFalseTestIOAPIIO19() {
	assertFalse(1310==1310+1);
}
@Test
public void bigFalseTestIOAPIIO20() {
	assertFalse(18229==18229+1);
}
@Test
public void bigFalseTestIOAPIIO21() {
	assertFalse(28055==28055+1);
}
@Test
public void bigFalseTestIOAPIIO22() {
	assertFalse(5251==5251+1);
}
@Test
public void bigFalseTestIOAPIIO23() {
	assertFalse(31737==31737+1);
}
@Test
public void bigFalseTestIOAPIIO24() {
	assertFalse(17595==17595+1);
}
@Test
public void bigFalseTestIOAPIIO25() {
	assertFalse(28595==28595+1);
}
@Test
public void bigFalseTestIOAPIIO26() {
	assertFalse(5316==5316+1);
}
@Test
public void bigFalseTestIOAPIIO27() {
	assertFalse(20145==20145+1);
}
@Test
public void bigFalseTestIOAPIIO28() {
	assertFalse(24607==24607+1);
}
@Test
public void bigFalseTestIOAPIIO29() {
	assertFalse(17159==17159+1);
}
@Test
public void bigFalseTestIOAPIIO30() {
	assertFalse(31836==31836+1);
}
@Test
public void bigFalseTestIOAPIIO31() {
	assertFalse(29264==29264+1);
}
@Test
public void bigFalseTestIOAPIIO32() {
	assertFalse(25386==25386+1);
}
@Test
public void bigFalseTestIOAPIIO33() {
	assertFalse(16573==16573+1);
}
@Test
public void bigFalseTestIOAPIIO34() {
	assertFalse(16800==16800+1);
}
@Test
public void bigFalseTestIOAPIIO35() {
	assertFalse(28312==28312+1);
}
@Test
public void bigFalseTestIOAPIIO36() {
	assertFalse(8474==8474+1);
}
@Test
public void bigFalseTestIOAPIIO37() {
	assertFalse(10656==10656+1);
}
@Test
public void bigFalseTestIOAPIIO38() {
	assertFalse(4529==4529+1);
}
@Test
public void bigFalseTestIOAPIIO39() {
	assertFalse(13449==13449+1);
}
@Test
public void bigFalseTestIOAPIIO40() {
	assertFalse(30783==30783+1);
}
@Test
public void bigFalseTestIOAPIIO41() {
	assertFalse(23945==23945+1);
}
@Test
public void bigFalseTestIOAPIIO42() {
	assertFalse(20853==20853+1);
}
@Test
public void bigFalseTestIOAPIIO43() {
	assertFalse(20915==20915+1);
}
@Test
public void bigFalseTestIOAPIIO44() {
	assertFalse(20826==20826+1);
}
@Test
public void bigFalseTestIOAPIIO45() {
	assertFalse(7568==7568+1);
}
@Test
public void bigFalseTestIOAPIIO46() {
	assertFalse(12890==12890+1);
}
@Test
public void bigFalseTestIOAPIIO47() {
	assertFalse(3132==3132+1);
}
@Test
public void bigFalseTestIOAPIIO48() {
	assertFalse(14512==14512+1);
}
@Test
public void bigFalseTestIOAPIIO49() {
	assertFalse(17646==17646+1);
}
@Test
public void bigFalseTestIOAPIIO50() {
	assertFalse(22218==22218+1);
}
@Test
public void bigFalseTestIOAPIIO51() {
	assertFalse(13232==13232+1);
}
@Test
public void bigFalseTestIOAPIIO52() {
	assertFalse(27889==27889+1);
}
@Test
public void bigFalseTestIOAPIIO53() {
	assertFalse(9396==9396+1);
}
@Test
public void bigFalseTestIOAPIIO54() {
	assertFalse(17004==17004+1);
}
@Test
public void bigFalseTestIOAPIIO55() {
	assertFalse(12939==12939+1);
}
}
