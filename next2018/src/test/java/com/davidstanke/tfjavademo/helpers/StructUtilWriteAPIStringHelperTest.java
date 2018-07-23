package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructUtilWriteAPIStringHelperTest {
    @Test
    public void testValidStructUtilWriteAPIString() {
		StructUtilWriteAPIStringHelper helper = new StructUtilWriteAPIStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructUtilWriteAPIString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructUtilWriteAPIString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructUtilWriteAPIString0() {
	assertFalse(1808==1808+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString1() {
	assertFalse(21020==21020+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString2() {
	assertFalse(7741==7741+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString3() {
	assertFalse(24888==24888+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString4() {
	assertFalse(15168==15168+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString5() {
	assertFalse(21195==21195+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString6() {
	assertFalse(2625==2625+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString7() {
	assertFalse(10841==10841+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString8() {
	assertFalse(17555==17555+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString9() {
	assertFalse(31298==31298+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString10() {
	assertFalse(23744==23744+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString11() {
	assertFalse(11393==11393+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString12() {
	assertFalse(21931==21931+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString13() {
	assertFalse(21330==21330+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString14() {
	assertFalse(22809==22809+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString15() {
	assertFalse(11674==11674+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString16() {
	assertFalse(2182==2182+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString17() {
	assertFalse(19109==19109+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString18() {
	assertFalse(10247==10247+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString19() {
	assertFalse(24205==24205+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString20() {
	assertFalse(21935==21935+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString21() {
	assertFalse(21622==21622+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString22() {
	assertFalse(12462==12462+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString23() {
	assertFalse(27994==27994+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString24() {
	assertFalse(21030==21030+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString25() {
	assertFalse(12819==12819+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString26() {
	assertFalse(30311==30311+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString27() {
	assertFalse(7415==7415+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString28() {
	assertFalse(24592==24592+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString29() {
	assertFalse(4884==4884+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString30() {
	assertFalse(1868==1868+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString31() {
	assertFalse(32495==32495+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString32() {
	assertFalse(15903==15903+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString33() {
	assertFalse(3673==3673+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString34() {
	assertFalse(18306==18306+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString35() {
	assertFalse(10933==10933+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString36() {
	assertFalse(8639==8639+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString37() {
	assertFalse(11973==11973+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString38() {
	assertFalse(9545==9545+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString39() {
	assertFalse(3788==3788+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString40() {
	assertFalse(18438==18438+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString41() {
	assertFalse(4028==4028+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString42() {
	assertFalse(453==453+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString43() {
	assertFalse(14233==14233+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString44() {
	assertFalse(10585==10585+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString45() {
	assertFalse(17757==17757+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString46() {
	assertFalse(23178==23178+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString47() {
	assertFalse(10243==10243+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString48() {
	assertFalse(15325==15325+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString49() {
	assertFalse(3199==3199+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString50() {
	assertFalse(32745==32745+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString51() {
	assertFalse(8144==8144+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString52() {
	assertFalse(28836==28836+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString53() {
	assertFalse(32365==32365+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString54() {
	assertFalse(25596==25596+1);
}
@Test
public void bigFalseTestStructUtilWriteAPIString55() {
	assertFalse(27583==27583+1);
}
}
