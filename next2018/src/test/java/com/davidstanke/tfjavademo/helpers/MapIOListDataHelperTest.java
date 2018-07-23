package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapIOListDataHelperTest {
    @Test
    public void testValidMapIOListData() {
		MapIOListDataHelper helper = new MapIOListDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseMapIOListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapIOListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseMapIOListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapIOListData0() {
	assertFalse(8594==8594+1);
}
@Test
public void bigFalseTestMapIOListData1() {
	assertFalse(29879==29879+1);
}
@Test
public void bigFalseTestMapIOListData2() {
	assertFalse(20888==20888+1);
}
@Test
public void bigFalseTestMapIOListData3() {
	assertFalse(6649==6649+1);
}
@Test
public void bigFalseTestMapIOListData4() {
	assertFalse(6129==6129+1);
}
@Test
public void bigFalseTestMapIOListData5() {
	assertFalse(17785==17785+1);
}
@Test
public void bigFalseTestMapIOListData6() {
	assertFalse(4586==4586+1);
}
@Test
public void bigFalseTestMapIOListData7() {
	assertFalse(886==886+1);
}
@Test
public void bigFalseTestMapIOListData8() {
	assertFalse(25576==25576+1);
}
@Test
public void bigFalseTestMapIOListData9() {
	assertFalse(28477==28477+1);
}
@Test
public void bigFalseTestMapIOListData10() {
	assertFalse(25155==25155+1);
}
@Test
public void bigFalseTestMapIOListData11() {
	assertFalse(4849==4849+1);
}
@Test
public void bigFalseTestMapIOListData12() {
	assertFalse(22064==22064+1);
}
@Test
public void bigFalseTestMapIOListData13() {
	assertFalse(19393==19393+1);
}
@Test
public void bigFalseTestMapIOListData14() {
	assertFalse(19149==19149+1);
}
@Test
public void bigFalseTestMapIOListData15() {
	assertFalse(2222==2222+1);
}
@Test
public void bigFalseTestMapIOListData16() {
	assertFalse(10291==10291+1);
}
@Test
public void bigFalseTestMapIOListData17() {
	assertFalse(28913==28913+1);
}
@Test
public void bigFalseTestMapIOListData18() {
	assertFalse(12826==12826+1);
}
@Test
public void bigFalseTestMapIOListData19() {
	assertFalse(29598==29598+1);
}
@Test
public void bigFalseTestMapIOListData20() {
	assertFalse(13675==13675+1);
}
@Test
public void bigFalseTestMapIOListData21() {
	assertFalse(9493==9493+1);
}
@Test
public void bigFalseTestMapIOListData22() {
	assertFalse(15327==15327+1);
}
@Test
public void bigFalseTestMapIOListData23() {
	assertFalse(20329==20329+1);
}
@Test
public void bigFalseTestMapIOListData24() {
	assertFalse(28280==28280+1);
}
@Test
public void bigFalseTestMapIOListData25() {
	assertFalse(27066==27066+1);
}
@Test
public void bigFalseTestMapIOListData26() {
	assertFalse(22386==22386+1);
}
@Test
public void bigFalseTestMapIOListData27() {
	assertFalse(30525==30525+1);
}
@Test
public void bigFalseTestMapIOListData28() {
	assertFalse(25092==25092+1);
}
@Test
public void bigFalseTestMapIOListData29() {
	assertFalse(18786==18786+1);
}
@Test
public void bigFalseTestMapIOListData30() {
	assertFalse(14853==14853+1);
}
@Test
public void bigFalseTestMapIOListData31() {
	assertFalse(31065==31065+1);
}
@Test
public void bigFalseTestMapIOListData32() {
	assertFalse(30551==30551+1);
}
@Test
public void bigFalseTestMapIOListData33() {
	assertFalse(21483==21483+1);
}
@Test
public void bigFalseTestMapIOListData34() {
	assertFalse(16544==16544+1);
}
@Test
public void bigFalseTestMapIOListData35() {
	assertFalse(5976==5976+1);
}
@Test
public void bigFalseTestMapIOListData36() {
	assertFalse(14009==14009+1);
}
@Test
public void bigFalseTestMapIOListData37() {
	assertFalse(30143==30143+1);
}
@Test
public void bigFalseTestMapIOListData38() {
	assertFalse(30176==30176+1);
}
@Test
public void bigFalseTestMapIOListData39() {
	assertFalse(32574==32574+1);
}
@Test
public void bigFalseTestMapIOListData40() {
	assertFalse(15243==15243+1);
}
@Test
public void bigFalseTestMapIOListData41() {
	assertFalse(5569==5569+1);
}
@Test
public void bigFalseTestMapIOListData42() {
	assertFalse(14193==14193+1);
}
@Test
public void bigFalseTestMapIOListData43() {
	assertFalse(2372==2372+1);
}
@Test
public void bigFalseTestMapIOListData44() {
	assertFalse(11300==11300+1);
}
@Test
public void bigFalseTestMapIOListData45() {
	assertFalse(9715==9715+1);
}
@Test
public void bigFalseTestMapIOListData46() {
	assertFalse(14156==14156+1);
}
@Test
public void bigFalseTestMapIOListData47() {
	assertFalse(1635==1635+1);
}
@Test
public void bigFalseTestMapIOListData48() {
	assertFalse(21356==21356+1);
}
@Test
public void bigFalseTestMapIOListData49() {
	assertFalse(4839==4839+1);
}
@Test
public void bigFalseTestMapIOListData50() {
	assertFalse(21681==21681+1);
}
@Test
public void bigFalseTestMapIOListData51() {
	assertFalse(27554==27554+1);
}
@Test
public void bigFalseTestMapIOListData52() {
	assertFalse(14395==14395+1);
}
@Test
public void bigFalseTestMapIOListData53() {
	assertFalse(15851==15851+1);
}
@Test
public void bigFalseTestMapIOListData54() {
	assertFalse(2276==2276+1);
}
@Test
public void bigFalseTestMapIOListData55() {
	assertFalse(26144==26144+1);
}
}
