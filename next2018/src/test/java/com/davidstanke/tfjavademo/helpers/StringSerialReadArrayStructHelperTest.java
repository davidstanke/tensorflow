package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringSerialReadArrayStructHelperTest {
    @Test
    public void testValidStringSerialReadArrayStruct() {
		StringSerialReadArrayStructHelper helper = new StringSerialReadArrayStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringSerialReadArrayStruct() {
	StringSerialReadArrayStructHelper helper = new StringSerialReadArrayStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringSerialReadArrayStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringSerialReadArrayStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringSerialReadArrayStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct0() {
	assertFalse(25975==25975+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct1() {
	assertFalse(25663==25663+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct2() {
	assertFalse(9164==9164+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct3() {
	assertFalse(10809==10809+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct4() {
	assertFalse(8825==8825+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct5() {
	assertFalse(19110==19110+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct6() {
	assertFalse(1435==1435+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct7() {
	assertFalse(4409==4409+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct8() {
	assertFalse(3594==3594+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct9() {
	assertFalse(24205==24205+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct10() {
	assertFalse(2345==2345+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct11() {
	assertFalse(2939==2939+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct12() {
	assertFalse(24447==24447+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct13() {
	assertFalse(17116==17116+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct14() {
	assertFalse(25236==25236+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct15() {
	assertFalse(13524==13524+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct16() {
	assertFalse(23369==23369+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct17() {
	assertFalse(14465==14465+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct18() {
	assertFalse(2208==2208+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct19() {
	assertFalse(22679==22679+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct20() {
	assertFalse(27577==27577+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct21() {
	assertFalse(21843==21843+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct22() {
	assertFalse(6244==6244+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct23() {
	assertFalse(18899==18899+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct24() {
	assertFalse(31382==31382+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct25() {
	assertFalse(19626==19626+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct26() {
	assertFalse(18356==18356+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct27() {
	assertFalse(847==847+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct28() {
	assertFalse(22369==22369+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct29() {
	assertFalse(9658==9658+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct30() {
	assertFalse(4690==4690+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct31() {
	assertFalse(19270==19270+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct32() {
	assertFalse(13923==13923+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct33() {
	assertFalse(31668==31668+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct34() {
	assertFalse(3540==3540+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct35() {
	assertFalse(22243==22243+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct36() {
	assertFalse(5243==5243+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct37() {
	assertFalse(9115==9115+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct38() {
	assertFalse(4179==4179+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct39() {
	assertFalse(10619==10619+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct40() {
	assertFalse(2985==2985+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct41() {
	assertFalse(21479==21479+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct42() {
	assertFalse(5592==5592+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct43() {
	assertFalse(11149==11149+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct44() {
	assertFalse(25689==25689+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct45() {
	assertFalse(10715==10715+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct46() {
	assertFalse(4231==4231+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct47() {
	assertFalse(13690==13690+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct48() {
	assertFalse(28528==28528+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct49() {
	assertFalse(10406==10406+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct50() {
	assertFalse(3977==3977+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct51() {
	assertFalse(2563==2563+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct52() {
	assertFalse(29976==29976+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct53() {
	assertFalse(3644==3644+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct54() {
	assertFalse(26811==26811+1);
}
@Test
public void bigFalseTestStringSerialReadArrayStruct55() {
	assertFalse(31879==31879+1);
}
}
