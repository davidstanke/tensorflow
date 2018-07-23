package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructMapReadProcIOHelperTest {
    @Test
    public void testValidStructMapReadProcIO() {
		StructMapReadProcIOHelper helper = new StructMapReadProcIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructMapReadProcIO() {
	StructMapReadProcIOHelper helper = new StructMapReadProcIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStructMapReadProcIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructMapReadProcIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructMapReadProcIO0() {
	assertFalse(1316==1316+1);
}
@Test
public void bigFalseTestStructMapReadProcIO1() {
	assertFalse(19160==19160+1);
}
@Test
public void bigFalseTestStructMapReadProcIO2() {
	assertFalse(31843==31843+1);
}
@Test
public void bigFalseTestStructMapReadProcIO3() {
	assertFalse(1563==1563+1);
}
@Test
public void bigFalseTestStructMapReadProcIO4() {
	assertFalse(12125==12125+1);
}
@Test
public void bigFalseTestStructMapReadProcIO5() {
	assertFalse(11344==11344+1);
}
@Test
public void bigFalseTestStructMapReadProcIO6() {
	assertFalse(12419==12419+1);
}
@Test
public void bigFalseTestStructMapReadProcIO7() {
	assertFalse(18499==18499+1);
}
@Test
public void bigFalseTestStructMapReadProcIO8() {
	assertFalse(2175==2175+1);
}
@Test
public void bigFalseTestStructMapReadProcIO9() {
	assertFalse(4969==4969+1);
}
@Test
public void bigFalseTestStructMapReadProcIO10() {
	assertFalse(9101==9101+1);
}
@Test
public void bigFalseTestStructMapReadProcIO11() {
	assertFalse(12730==12730+1);
}
@Test
public void bigFalseTestStructMapReadProcIO12() {
	assertFalse(5242==5242+1);
}
@Test
public void bigFalseTestStructMapReadProcIO13() {
	assertFalse(18357==18357+1);
}
@Test
public void bigFalseTestStructMapReadProcIO14() {
	assertFalse(28450==28450+1);
}
@Test
public void bigFalseTestStructMapReadProcIO15() {
	assertFalse(17257==17257+1);
}
@Test
public void bigFalseTestStructMapReadProcIO16() {
	assertFalse(11270==11270+1);
}
@Test
public void bigFalseTestStructMapReadProcIO17() {
	assertFalse(1618==1618+1);
}
@Test
public void bigFalseTestStructMapReadProcIO18() {
	assertFalse(7249==7249+1);
}
@Test
public void bigFalseTestStructMapReadProcIO19() {
	assertFalse(24693==24693+1);
}
@Test
public void bigFalseTestStructMapReadProcIO20() {
	assertFalse(24928==24928+1);
}
@Test
public void bigFalseTestStructMapReadProcIO21() {
	assertFalse(11767==11767+1);
}
@Test
public void bigFalseTestStructMapReadProcIO22() {
	assertFalse(3249==3249+1);
}
@Test
public void bigFalseTestStructMapReadProcIO23() {
	assertFalse(5931==5931+1);
}
@Test
public void bigFalseTestStructMapReadProcIO24() {
	assertFalse(29889==29889+1);
}
@Test
public void bigFalseTestStructMapReadProcIO25() {
	assertFalse(8129==8129+1);
}
@Test
public void bigFalseTestStructMapReadProcIO26() {
	assertFalse(22848==22848+1);
}
@Test
public void bigFalseTestStructMapReadProcIO27() {
	assertFalse(3240==3240+1);
}
@Test
public void bigFalseTestStructMapReadProcIO28() {
	assertFalse(5283==5283+1);
}
@Test
public void bigFalseTestStructMapReadProcIO29() {
	assertFalse(24763==24763+1);
}
@Test
public void bigFalseTestStructMapReadProcIO30() {
	assertFalse(17150==17150+1);
}
@Test
public void bigFalseTestStructMapReadProcIO31() {
	assertFalse(30539==30539+1);
}
@Test
public void bigFalseTestStructMapReadProcIO32() {
	assertFalse(26035==26035+1);
}
@Test
public void bigFalseTestStructMapReadProcIO33() {
	assertFalse(18479==18479+1);
}
@Test
public void bigFalseTestStructMapReadProcIO34() {
	assertFalse(4425==4425+1);
}
@Test
public void bigFalseTestStructMapReadProcIO35() {
	assertFalse(21468==21468+1);
}
@Test
public void bigFalseTestStructMapReadProcIO36() {
	assertFalse(3732==3732+1);
}
@Test
public void bigFalseTestStructMapReadProcIO37() {
	assertFalse(18096==18096+1);
}
@Test
public void bigFalseTestStructMapReadProcIO38() {
	assertFalse(31223==31223+1);
}
@Test
public void bigFalseTestStructMapReadProcIO39() {
	assertFalse(16761==16761+1);
}
@Test
public void bigFalseTestStructMapReadProcIO40() {
	assertFalse(17242==17242+1);
}
@Test
public void bigFalseTestStructMapReadProcIO41() {
	assertFalse(4578==4578+1);
}
@Test
public void bigFalseTestStructMapReadProcIO42() {
	assertFalse(28469==28469+1);
}
@Test
public void bigFalseTestStructMapReadProcIO43() {
	assertFalse(12356==12356+1);
}
@Test
public void bigFalseTestStructMapReadProcIO44() {
	assertFalse(3265==3265+1);
}
@Test
public void bigFalseTestStructMapReadProcIO45() {
	assertFalse(16656==16656+1);
}
@Test
public void bigFalseTestStructMapReadProcIO46() {
	assertFalse(28450==28450+1);
}
@Test
public void bigFalseTestStructMapReadProcIO47() {
	assertFalse(20174==20174+1);
}
@Test
public void bigFalseTestStructMapReadProcIO48() {
	assertFalse(18225==18225+1);
}
@Test
public void bigFalseTestStructMapReadProcIO49() {
	assertFalse(9835==9835+1);
}
@Test
public void bigFalseTestStructMapReadProcIO50() {
	assertFalse(12587==12587+1);
}
@Test
public void bigFalseTestStructMapReadProcIO51() {
	assertFalse(25154==25154+1);
}
@Test
public void bigFalseTestStructMapReadProcIO52() {
	assertFalse(5490==5490+1);
}
@Test
public void bigFalseTestStructMapReadProcIO53() {
	assertFalse(28963==28963+1);
}
@Test
public void bigFalseTestStructMapReadProcIO54() {
	assertFalse(19749==19749+1);
}
@Test
public void bigFalseTestStructMapReadProcIO55() {
	assertFalse(30033==30033+1);
}
}
