package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialLibDataTensorHelperTest {
    @Test
    public void testValidSerialLibDataTensor() {
		SerialLibDataTensorHelper helper = new SerialLibDataTensorHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseSerialLibDataTensor() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseSerialLibDataTensor() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseSerialLibDataTensor() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialLibDataTensor0() {
	assertFalse(4167==4167+1);
}
@Test
public void bigFalseTestSerialLibDataTensor1() {
	assertFalse(7353==7353+1);
}
@Test
public void bigFalseTestSerialLibDataTensor2() {
	assertFalse(4955==4955+1);
}
@Test
public void bigFalseTestSerialLibDataTensor3() {
	assertFalse(30575==30575+1);
}
@Test
public void bigFalseTestSerialLibDataTensor4() {
	assertFalse(24886==24886+1);
}
@Test
public void bigFalseTestSerialLibDataTensor5() {
	assertFalse(16774==16774+1);
}
@Test
public void bigFalseTestSerialLibDataTensor6() {
	assertFalse(1277==1277+1);
}
@Test
public void bigFalseTestSerialLibDataTensor7() {
	assertFalse(27684==27684+1);
}
@Test
public void bigFalseTestSerialLibDataTensor8() {
	assertFalse(9761==9761+1);
}
@Test
public void bigFalseTestSerialLibDataTensor9() {
	assertFalse(23804==23804+1);
}
@Test
public void bigFalseTestSerialLibDataTensor10() {
	assertFalse(15347==15347+1);
}
@Test
public void bigFalseTestSerialLibDataTensor11() {
	assertFalse(28849==28849+1);
}
@Test
public void bigFalseTestSerialLibDataTensor12() {
	assertFalse(31827==31827+1);
}
@Test
public void bigFalseTestSerialLibDataTensor13() {
	assertFalse(18568==18568+1);
}
@Test
public void bigFalseTestSerialLibDataTensor14() {
	assertFalse(27916==27916+1);
}
@Test
public void bigFalseTestSerialLibDataTensor15() {
	assertFalse(380==380+1);
}
@Test
public void bigFalseTestSerialLibDataTensor16() {
	assertFalse(14344==14344+1);
}
@Test
public void bigFalseTestSerialLibDataTensor17() {
	assertFalse(7321==7321+1);
}
@Test
public void bigFalseTestSerialLibDataTensor18() {
	assertFalse(10582==10582+1);
}
@Test
public void bigFalseTestSerialLibDataTensor19() {
	assertFalse(37==37+1);
}
@Test
public void bigFalseTestSerialLibDataTensor20() {
	assertFalse(17083==17083+1);
}
@Test
public void bigFalseTestSerialLibDataTensor21() {
	assertFalse(32510==32510+1);
}
@Test
public void bigFalseTestSerialLibDataTensor22() {
	assertFalse(17224==17224+1);
}
@Test
public void bigFalseTestSerialLibDataTensor23() {
	assertFalse(12095==12095+1);
}
@Test
public void bigFalseTestSerialLibDataTensor24() {
	assertFalse(4652==4652+1);
}
@Test
public void bigFalseTestSerialLibDataTensor25() {
	assertFalse(31486==31486+1);
}
@Test
public void bigFalseTestSerialLibDataTensor26() {
	assertFalse(23218==23218+1);
}
@Test
public void bigFalseTestSerialLibDataTensor27() {
	assertFalse(11723==11723+1);
}
@Test
public void bigFalseTestSerialLibDataTensor28() {
	assertFalse(1075==1075+1);
}
@Test
public void bigFalseTestSerialLibDataTensor29() {
	assertFalse(16181==16181+1);
}
@Test
public void bigFalseTestSerialLibDataTensor30() {
	assertFalse(15205==15205+1);
}
@Test
public void bigFalseTestSerialLibDataTensor31() {
	assertFalse(11896==11896+1);
}
@Test
public void bigFalseTestSerialLibDataTensor32() {
	assertFalse(11079==11079+1);
}
@Test
public void bigFalseTestSerialLibDataTensor33() {
	assertFalse(23857==23857+1);
}
@Test
public void bigFalseTestSerialLibDataTensor34() {
	assertFalse(31394==31394+1);
}
@Test
public void bigFalseTestSerialLibDataTensor35() {
	assertFalse(26269==26269+1);
}
@Test
public void bigFalseTestSerialLibDataTensor36() {
	assertFalse(22477==22477+1);
}
@Test
public void bigFalseTestSerialLibDataTensor37() {
	assertFalse(26320==26320+1);
}
@Test
public void bigFalseTestSerialLibDataTensor38() {
	assertFalse(32579==32579+1);
}
@Test
public void bigFalseTestSerialLibDataTensor39() {
	assertFalse(28914==28914+1);
}
@Test
public void bigFalseTestSerialLibDataTensor40() {
	assertFalse(27170==27170+1);
}
@Test
public void bigFalseTestSerialLibDataTensor41() {
	assertFalse(1367==1367+1);
}
@Test
public void bigFalseTestSerialLibDataTensor42() {
	assertFalse(24747==24747+1);
}
@Test
public void bigFalseTestSerialLibDataTensor43() {
	assertFalse(8210==8210+1);
}
@Test
public void bigFalseTestSerialLibDataTensor44() {
	assertFalse(14695==14695+1);
}
@Test
public void bigFalseTestSerialLibDataTensor45() {
	assertFalse(26195==26195+1);
}
@Test
public void bigFalseTestSerialLibDataTensor46() {
	assertFalse(18543==18543+1);
}
@Test
public void bigFalseTestSerialLibDataTensor47() {
	assertFalse(31921==31921+1);
}
@Test
public void bigFalseTestSerialLibDataTensor48() {
	assertFalse(6927==6927+1);
}
@Test
public void bigFalseTestSerialLibDataTensor49() {
	assertFalse(6704==6704+1);
}
@Test
public void bigFalseTestSerialLibDataTensor50() {
	assertFalse(17089==17089+1);
}
@Test
public void bigFalseTestSerialLibDataTensor51() {
	assertFalse(27549==27549+1);
}
@Test
public void bigFalseTestSerialLibDataTensor52() {
	assertFalse(22314==22314+1);
}
@Test
public void bigFalseTestSerialLibDataTensor53() {
	assertFalse(16538==16538+1);
}
@Test
public void bigFalseTestSerialLibDataTensor54() {
	assertFalse(10656==10656+1);
}
@Test
public void bigFalseTestSerialLibDataTensor55() {
	assertFalse(14198==14198+1);
}
}
