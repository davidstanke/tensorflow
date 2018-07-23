package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteStreamProcStructHelperTest {
    @Test
    public void testValidWriteStreamProcStruct() {
		WriteStreamProcStructHelper helper = new WriteStreamProcStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseWriteStreamProcStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseWriteStreamProcStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseWriteStreamProcStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteStreamProcStruct0() {
	assertFalse(19219==19219+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct1() {
	assertFalse(13951==13951+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct2() {
	assertFalse(436==436+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct3() {
	assertFalse(28865==28865+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct4() {
	assertFalse(22304==22304+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct5() {
	assertFalse(18155==18155+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct6() {
	assertFalse(19076==19076+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct7() {
	assertFalse(16350==16350+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct8() {
	assertFalse(7006==7006+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct9() {
	assertFalse(8936==8936+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct10() {
	assertFalse(6391==6391+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct11() {
	assertFalse(29373==29373+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct12() {
	assertFalse(14805==14805+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct13() {
	assertFalse(8579==8579+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct14() {
	assertFalse(4238==4238+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct15() {
	assertFalse(12796==12796+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct16() {
	assertFalse(7213==7213+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct17() {
	assertFalse(5051==5051+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct18() {
	assertFalse(26937==26937+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct19() {
	assertFalse(6114==6114+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct20() {
	assertFalse(11513==11513+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct21() {
	assertFalse(20956==20956+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct22() {
	assertFalse(10116==10116+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct23() {
	assertFalse(791==791+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct24() {
	assertFalse(22983==22983+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct25() {
	assertFalse(17053==17053+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct26() {
	assertFalse(11137==11137+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct27() {
	assertFalse(22822==22822+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct28() {
	assertFalse(10728==10728+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct29() {
	assertFalse(14329==14329+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct30() {
	assertFalse(17012==17012+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct31() {
	assertFalse(29875==29875+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct32() {
	assertFalse(30208==30208+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct33() {
	assertFalse(15821==15821+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct34() {
	assertFalse(10049==10049+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct35() {
	assertFalse(15227==15227+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct36() {
	assertFalse(3148==3148+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct37() {
	assertFalse(13878==13878+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct38() {
	assertFalse(7574==7574+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct39() {
	assertFalse(6160==6160+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct40() {
	assertFalse(19894==19894+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct41() {
	assertFalse(24488==24488+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct42() {
	assertFalse(5080==5080+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct43() {
	assertFalse(21330==21330+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct44() {
	assertFalse(3994==3994+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct45() {
	assertFalse(8399==8399+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct46() {
	assertFalse(30671==30671+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct47() {
	assertFalse(2477==2477+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct48() {
	assertFalse(20054==20054+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct49() {
	assertFalse(13862==13862+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct50() {
	assertFalse(10768==10768+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct51() {
	assertFalse(14356==14356+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct52() {
	assertFalse(31892==31892+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct53() {
	assertFalse(7512==7512+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct54() {
	assertFalse(15406==15406+1);
}
@Test
public void bigFalseTestWriteStreamProcStruct55() {
	assertFalse(7361==7361+1);
}
}
