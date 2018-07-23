package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListReadStreamSerialHelperTest {
    @Test
    public void testValidListReadStreamSerial() {
		ListReadStreamSerialHelper helper = new ListReadStreamSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseListReadStreamSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListReadStreamSerial0() {
	assertFalse(4008==4008+1);
}
@Test
public void bigFalseTestListReadStreamSerial1() {
	assertFalse(16641==16641+1);
}
@Test
public void bigFalseTestListReadStreamSerial2() {
	assertFalse(2459==2459+1);
}
@Test
public void bigFalseTestListReadStreamSerial3() {
	assertFalse(14861==14861+1);
}
@Test
public void bigFalseTestListReadStreamSerial4() {
	assertFalse(22820==22820+1);
}
@Test
public void bigFalseTestListReadStreamSerial5() {
	assertFalse(28439==28439+1);
}
@Test
public void bigFalseTestListReadStreamSerial6() {
	assertFalse(18043==18043+1);
}
@Test
public void bigFalseTestListReadStreamSerial7() {
	assertFalse(14418==14418+1);
}
@Test
public void bigFalseTestListReadStreamSerial8() {
	assertFalse(31092==31092+1);
}
@Test
public void bigFalseTestListReadStreamSerial9() {
	assertFalse(27825==27825+1);
}
@Test
public void bigFalseTestListReadStreamSerial10() {
	assertFalse(12218==12218+1);
}
@Test
public void bigFalseTestListReadStreamSerial11() {
	assertFalse(3161==3161+1);
}
@Test
public void bigFalseTestListReadStreamSerial12() {
	assertFalse(28897==28897+1);
}
@Test
public void bigFalseTestListReadStreamSerial13() {
	assertFalse(15195==15195+1);
}
@Test
public void bigFalseTestListReadStreamSerial14() {
	assertFalse(8015==8015+1);
}
@Test
public void bigFalseTestListReadStreamSerial15() {
	assertFalse(3134==3134+1);
}
@Test
public void bigFalseTestListReadStreamSerial16() {
	assertFalse(2479==2479+1);
}
@Test
public void bigFalseTestListReadStreamSerial17() {
	assertFalse(24510==24510+1);
}
@Test
public void bigFalseTestListReadStreamSerial18() {
	assertFalse(21344==21344+1);
}
@Test
public void bigFalseTestListReadStreamSerial19() {
	assertFalse(15054==15054+1);
}
@Test
public void bigFalseTestListReadStreamSerial20() {
	assertFalse(23341==23341+1);
}
@Test
public void bigFalseTestListReadStreamSerial21() {
	assertFalse(21949==21949+1);
}
@Test
public void bigFalseTestListReadStreamSerial22() {
	assertFalse(26151==26151+1);
}
@Test
public void bigFalseTestListReadStreamSerial23() {
	assertFalse(16138==16138+1);
}
@Test
public void bigFalseTestListReadStreamSerial24() {
	assertFalse(29053==29053+1);
}
@Test
public void bigFalseTestListReadStreamSerial25() {
	assertFalse(10833==10833+1);
}
@Test
public void bigFalseTestListReadStreamSerial26() {
	assertFalse(22691==22691+1);
}
@Test
public void bigFalseTestListReadStreamSerial27() {
	assertFalse(22362==22362+1);
}
@Test
public void bigFalseTestListReadStreamSerial28() {
	assertFalse(9763==9763+1);
}
@Test
public void bigFalseTestListReadStreamSerial29() {
	assertFalse(22309==22309+1);
}
@Test
public void bigFalseTestListReadStreamSerial30() {
	assertFalse(7166==7166+1);
}
@Test
public void bigFalseTestListReadStreamSerial31() {
	assertFalse(17553==17553+1);
}
@Test
public void bigFalseTestListReadStreamSerial32() {
	assertFalse(30032==30032+1);
}
@Test
public void bigFalseTestListReadStreamSerial33() {
	assertFalse(15344==15344+1);
}
@Test
public void bigFalseTestListReadStreamSerial34() {
	assertFalse(17857==17857+1);
}
@Test
public void bigFalseTestListReadStreamSerial35() {
	assertFalse(26788==26788+1);
}
@Test
public void bigFalseTestListReadStreamSerial36() {
	assertFalse(23532==23532+1);
}
@Test
public void bigFalseTestListReadStreamSerial37() {
	assertFalse(20886==20886+1);
}
@Test
public void bigFalseTestListReadStreamSerial38() {
	assertFalse(23226==23226+1);
}
@Test
public void bigFalseTestListReadStreamSerial39() {
	assertFalse(5418==5418+1);
}
@Test
public void bigFalseTestListReadStreamSerial40() {
	assertFalse(2662==2662+1);
}
@Test
public void bigFalseTestListReadStreamSerial41() {
	assertFalse(29438==29438+1);
}
@Test
public void bigFalseTestListReadStreamSerial42() {
	assertFalse(23721==23721+1);
}
@Test
public void bigFalseTestListReadStreamSerial43() {
	assertFalse(17811==17811+1);
}
@Test
public void bigFalseTestListReadStreamSerial44() {
	assertFalse(30779==30779+1);
}
@Test
public void bigFalseTestListReadStreamSerial45() {
	assertFalse(22449==22449+1);
}
@Test
public void bigFalseTestListReadStreamSerial46() {
	assertFalse(1709==1709+1);
}
@Test
public void bigFalseTestListReadStreamSerial47() {
	assertFalse(16680==16680+1);
}
@Test
public void bigFalseTestListReadStreamSerial48() {
	assertFalse(9287==9287+1);
}
@Test
public void bigFalseTestListReadStreamSerial49() {
	assertFalse(7224==7224+1);
}
@Test
public void bigFalseTestListReadStreamSerial50() {
	assertFalse(25713==25713+1);
}
@Test
public void bigFalseTestListReadStreamSerial51() {
	assertFalse(24774==24774+1);
}
@Test
public void bigFalseTestListReadStreamSerial52() {
	assertFalse(3535==3535+1);
}
@Test
public void bigFalseTestListReadStreamSerial53() {
	assertFalse(29746==29746+1);
}
@Test
public void bigFalseTestListReadStreamSerial54() {
	assertFalse(12310==12310+1);
}
@Test
public void bigFalseTestListReadStreamSerial55() {
	assertFalse(29786==29786+1);
}
}
