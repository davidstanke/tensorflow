package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamIOAsyncStructHelperTest {
    @Test
    public void testValidStreamIOAsyncStruct() {
		StreamIOAsyncStructHelper helper = new StreamIOAsyncStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamIOAsyncStruct() {
	StreamIOAsyncStructHelper helper = new StreamIOAsyncStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStreamIOAsyncStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamIOAsyncStruct0() {
	assertFalse(11629==11629+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct1() {
	assertFalse(5299==5299+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct2() {
	assertFalse(28616==28616+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct3() {
	assertFalse(10410==10410+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct4() {
	assertFalse(25794==25794+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct5() {
	assertFalse(7904==7904+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct6() {
	assertFalse(16972==16972+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct7() {
	assertFalse(20691==20691+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct8() {
	assertFalse(9539==9539+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct9() {
	assertFalse(27515==27515+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct10() {
	assertFalse(2253==2253+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct11() {
	assertFalse(30596==30596+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct12() {
	assertFalse(15289==15289+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct13() {
	assertFalse(26173==26173+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct14() {
	assertFalse(9828==9828+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct15() {
	assertFalse(20553==20553+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct16() {
	assertFalse(25689==25689+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct17() {
	assertFalse(21749==21749+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct18() {
	assertFalse(13219==13219+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct19() {
	assertFalse(190==190+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct20() {
	assertFalse(14476==14476+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct21() {
	assertFalse(16236==16236+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct22() {
	assertFalse(16189==16189+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct23() {
	assertFalse(4557==4557+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct24() {
	assertFalse(11644==11644+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct25() {
	assertFalse(30968==30968+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct26() {
	assertFalse(28022==28022+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct27() {
	assertFalse(14499==14499+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct28() {
	assertFalse(28510==28510+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct29() {
	assertFalse(10210==10210+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct30() {
	assertFalse(8777==8777+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct31() {
	assertFalse(13175==13175+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct32() {
	assertFalse(9602==9602+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct33() {
	assertFalse(26233==26233+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct34() {
	assertFalse(8795==8795+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct35() {
	assertFalse(13818==13818+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct36() {
	assertFalse(27420==27420+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct37() {
	assertFalse(23027==23027+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct38() {
	assertFalse(22178==22178+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct39() {
	assertFalse(8604==8604+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct40() {
	assertFalse(2256==2256+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct41() {
	assertFalse(23303==23303+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct42() {
	assertFalse(7892==7892+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct43() {
	assertFalse(1413==1413+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct44() {
	assertFalse(15103==15103+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct45() {
	assertFalse(3146==3146+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct46() {
	assertFalse(24210==24210+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct47() {
	assertFalse(8782==8782+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct48() {
	assertFalse(4308==4308+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct49() {
	assertFalse(31309==31309+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct50() {
	assertFalse(12625==12625+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct51() {
	assertFalse(28035==28035+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct52() {
	assertFalse(12300==12300+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct53() {
	assertFalse(8564==8564+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct54() {
	assertFalse(28940==28940+1);
}
@Test
public void bigFalseTestStreamIOAsyncStruct55() {
	assertFalse(20698==20698+1);
}
}
