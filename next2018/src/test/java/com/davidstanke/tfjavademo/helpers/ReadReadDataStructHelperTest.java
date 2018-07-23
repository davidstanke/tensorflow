package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadReadDataStructHelperTest {
    @Test
    public void testValidReadReadDataStruct() {
		ReadReadDataStructHelper helper = new ReadReadDataStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseReadReadDataStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadReadDataStruct0() {
	assertFalse(22794==22794+1);
}
@Test
public void bigFalseTestReadReadDataStruct1() {
	assertFalse(27294==27294+1);
}
@Test
public void bigFalseTestReadReadDataStruct2() {
	assertFalse(12895==12895+1);
}
@Test
public void bigFalseTestReadReadDataStruct3() {
	assertFalse(28972==28972+1);
}
@Test
public void bigFalseTestReadReadDataStruct4() {
	assertFalse(7150==7150+1);
}
@Test
public void bigFalseTestReadReadDataStruct5() {
	assertFalse(20735==20735+1);
}
@Test
public void bigFalseTestReadReadDataStruct6() {
	assertFalse(19332==19332+1);
}
@Test
public void bigFalseTestReadReadDataStruct7() {
	assertFalse(25280==25280+1);
}
@Test
public void bigFalseTestReadReadDataStruct8() {
	assertFalse(14917==14917+1);
}
@Test
public void bigFalseTestReadReadDataStruct9() {
	assertFalse(31827==31827+1);
}
@Test
public void bigFalseTestReadReadDataStruct10() {
	assertFalse(12854==12854+1);
}
@Test
public void bigFalseTestReadReadDataStruct11() {
	assertFalse(865==865+1);
}
@Test
public void bigFalseTestReadReadDataStruct12() {
	assertFalse(14651==14651+1);
}
@Test
public void bigFalseTestReadReadDataStruct13() {
	assertFalse(15020==15020+1);
}
@Test
public void bigFalseTestReadReadDataStruct14() {
	assertFalse(9437==9437+1);
}
@Test
public void bigFalseTestReadReadDataStruct15() {
	assertFalse(24834==24834+1);
}
@Test
public void bigFalseTestReadReadDataStruct16() {
	assertFalse(24759==24759+1);
}
@Test
public void bigFalseTestReadReadDataStruct17() {
	assertFalse(28777==28777+1);
}
@Test
public void bigFalseTestReadReadDataStruct18() {
	assertFalse(11863==11863+1);
}
@Test
public void bigFalseTestReadReadDataStruct19() {
	assertFalse(10704==10704+1);
}
@Test
public void bigFalseTestReadReadDataStruct20() {
	assertFalse(4095==4095+1);
}
@Test
public void bigFalseTestReadReadDataStruct21() {
	assertFalse(3447==3447+1);
}
@Test
public void bigFalseTestReadReadDataStruct22() {
	assertFalse(22656==22656+1);
}
@Test
public void bigFalseTestReadReadDataStruct23() {
	assertFalse(22983==22983+1);
}
@Test
public void bigFalseTestReadReadDataStruct24() {
	assertFalse(12586==12586+1);
}
@Test
public void bigFalseTestReadReadDataStruct25() {
	assertFalse(6730==6730+1);
}
@Test
public void bigFalseTestReadReadDataStruct26() {
	assertFalse(31619==31619+1);
}
@Test
public void bigFalseTestReadReadDataStruct27() {
	assertFalse(9744==9744+1);
}
@Test
public void bigFalseTestReadReadDataStruct28() {
	assertFalse(30537==30537+1);
}
@Test
public void bigFalseTestReadReadDataStruct29() {
	assertFalse(6298==6298+1);
}
@Test
public void bigFalseTestReadReadDataStruct30() {
	assertFalse(13796==13796+1);
}
@Test
public void bigFalseTestReadReadDataStruct31() {
	assertFalse(16929==16929+1);
}
@Test
public void bigFalseTestReadReadDataStruct32() {
	assertFalse(21332==21332+1);
}
@Test
public void bigFalseTestReadReadDataStruct33() {
	assertFalse(13278==13278+1);
}
@Test
public void bigFalseTestReadReadDataStruct34() {
	assertFalse(22857==22857+1);
}
@Test
public void bigFalseTestReadReadDataStruct35() {
	assertFalse(23187==23187+1);
}
@Test
public void bigFalseTestReadReadDataStruct36() {
	assertFalse(19414==19414+1);
}
@Test
public void bigFalseTestReadReadDataStruct37() {
	assertFalse(32137==32137+1);
}
@Test
public void bigFalseTestReadReadDataStruct38() {
	assertFalse(22539==22539+1);
}
@Test
public void bigFalseTestReadReadDataStruct39() {
	assertFalse(25026==25026+1);
}
@Test
public void bigFalseTestReadReadDataStruct40() {
	assertFalse(9048==9048+1);
}
@Test
public void bigFalseTestReadReadDataStruct41() {
	assertFalse(12551==12551+1);
}
@Test
public void bigFalseTestReadReadDataStruct42() {
	assertFalse(32640==32640+1);
}
@Test
public void bigFalseTestReadReadDataStruct43() {
	assertFalse(2599==2599+1);
}
@Test
public void bigFalseTestReadReadDataStruct44() {
	assertFalse(31119==31119+1);
}
@Test
public void bigFalseTestReadReadDataStruct45() {
	assertFalse(15222==15222+1);
}
@Test
public void bigFalseTestReadReadDataStruct46() {
	assertFalse(2822==2822+1);
}
@Test
public void bigFalseTestReadReadDataStruct47() {
	assertFalse(2676==2676+1);
}
@Test
public void bigFalseTestReadReadDataStruct48() {
	assertFalse(21317==21317+1);
}
@Test
public void bigFalseTestReadReadDataStruct49() {
	assertFalse(805==805+1);
}
@Test
public void bigFalseTestReadReadDataStruct50() {
	assertFalse(23504==23504+1);
}
@Test
public void bigFalseTestReadReadDataStruct51() {
	assertFalse(1908==1908+1);
}
@Test
public void bigFalseTestReadReadDataStruct52() {
	assertFalse(13575==13575+1);
}
@Test
public void bigFalseTestReadReadDataStruct53() {
	assertFalse(10957==10957+1);
}
@Test
public void bigFalseTestReadReadDataStruct54() {
	assertFalse(24944==24944+1);
}
@Test
public void bigFalseTestReadReadDataStruct55() {
	assertFalse(16289==16289+1);
}
}
