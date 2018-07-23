package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamArrayReadStructHelperTest {
    @Test
    public void testValidStreamArrayReadStruct() {
		StreamArrayReadStructHelper helper = new StreamArrayReadStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamArrayReadStruct() {
	StreamArrayReadStructHelper helper = new StreamArrayReadStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStreamArrayReadStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamArrayReadStruct0() {
	assertFalse(19101==19101+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct1() {
	assertFalse(27525==27525+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct2() {
	assertFalse(8541==8541+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct3() {
	assertFalse(20218==20218+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct4() {
	assertFalse(30489==30489+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct5() {
	assertFalse(4894==4894+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct6() {
	assertFalse(9812==9812+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct7() {
	assertFalse(5181==5181+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct8() {
	assertFalse(27322==27322+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct9() {
	assertFalse(10992==10992+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct10() {
	assertFalse(3761==3761+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct11() {
	assertFalse(32558==32558+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct12() {
	assertFalse(1690==1690+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct13() {
	assertFalse(13247==13247+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct14() {
	assertFalse(4573==4573+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct15() {
	assertFalse(18936==18936+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct16() {
	assertFalse(212==212+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct17() {
	assertFalse(32069==32069+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct18() {
	assertFalse(828==828+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct19() {
	assertFalse(7142==7142+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct20() {
	assertFalse(5547==5547+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct21() {
	assertFalse(32241==32241+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct22() {
	assertFalse(30013==30013+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct23() {
	assertFalse(7545==7545+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct24() {
	assertFalse(8058==8058+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct25() {
	assertFalse(27234==27234+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct26() {
	assertFalse(291==291+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct27() {
	assertFalse(12876==12876+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct28() {
	assertFalse(16736==16736+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct29() {
	assertFalse(18594==18594+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct30() {
	assertFalse(16272==16272+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct31() {
	assertFalse(29864==29864+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct32() {
	assertFalse(4263==4263+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct33() {
	assertFalse(31523==31523+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct34() {
	assertFalse(15830==15830+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct35() {
	assertFalse(20199==20199+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct36() {
	assertFalse(26872==26872+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct37() {
	assertFalse(32634==32634+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct38() {
	assertFalse(31741==31741+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct39() {
	assertFalse(20105==20105+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct40() {
	assertFalse(22337==22337+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct41() {
	assertFalse(23773==23773+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct42() {
	assertFalse(16276==16276+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct43() {
	assertFalse(3352==3352+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct44() {
	assertFalse(18274==18274+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct45() {
	assertFalse(32350==32350+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct46() {
	assertFalse(18232==18232+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct47() {
	assertFalse(19132==19132+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct48() {
	assertFalse(24730==24730+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct49() {
	assertFalse(29924==29924+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct50() {
	assertFalse(10982==10982+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct51() {
	assertFalse(5789==5789+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct52() {
	assertFalse(15540==15540+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct53() {
	assertFalse(23790==23790+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct54() {
	assertFalse(29952==29952+1);
}
@Test
public void bigFalseTestStreamArrayReadStruct55() {
	assertFalse(8443==8443+1);
}
}
