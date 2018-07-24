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

public class ArrayWriteAPIDataArrayHelperTest {
    @Test
    public void testValidArrayWriteAPIDataArray() {
		ArrayWriteAPIDataArrayHelper helper = new ArrayWriteAPIDataArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayWriteAPIDataArray() {
	ArrayWriteAPIDataArrayHelper helper = new ArrayWriteAPIDataArrayHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileArrayWriteAPIDataArrayHelper", ".tmp"); 
		//Get tempropary file path
		String absolutePath = temp.getAbsolutePath();
		String tempFilePath = absolutePath.
		    substring(0,absolutePath.lastIndexOf(File.separator));

		//System.out.println("Temp file path : " + tempFilePath);
	
    //write it
	    BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
	    for(int i=0; i<2999999; i++) {
			bw.write(i + "\n");
		}
	    bw.close();
		
		// read it
		byte[] myBytes = Files.readAllBytes(temp.toPath());
		
		// randomize it
		List<Byte> myBytesList = new ArrayList<>();
		for(int i = 1; i<myBytes.length; i++) {
			myBytesList.add(myBytes[i]);
		}
		Collections.shuffle(myBytesList);
		
		
		
	}catch(IOException e){
	
	    e.printStackTrace();
	
	}
	
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseArrayWriteAPIDataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayWriteAPIDataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseArrayWriteAPIDataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray0() {
	assertFalse(13270==13270+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray1() {
	assertFalse(23772==23772+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray2() {
	assertFalse(26368==26368+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray3() {
	assertFalse(12007==12007+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray4() {
	assertFalse(1448==1448+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray5() {
	assertFalse(27804==27804+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray6() {
	assertFalse(5699==5699+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray7() {
	assertFalse(3813==3813+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray8() {
	assertFalse(29421==29421+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray9() {
	assertFalse(2062==2062+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray10() {
	assertFalse(19787==19787+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray11() {
	assertFalse(12537==12537+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray12() {
	assertFalse(24789==24789+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray13() {
	assertFalse(16652==16652+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray14() {
	assertFalse(18940==18940+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray15() {
	assertFalse(1072==1072+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray16() {
	assertFalse(31790==31790+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray17() {
	assertFalse(6976==6976+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray18() {
	assertFalse(23197==23197+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray19() {
	assertFalse(14774==14774+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray20() {
	assertFalse(30558==30558+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray21() {
	assertFalse(14450==14450+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray22() {
	assertFalse(25137==25137+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray23() {
	assertFalse(10240==10240+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray24() {
	assertFalse(11292==11292+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray25() {
	assertFalse(32146==32146+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray26() {
	assertFalse(18069==18069+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray27() {
	assertFalse(13499==13499+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray28() {
	assertFalse(7409==7409+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray29() {
	assertFalse(31877==31877+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray30() {
	assertFalse(9307==9307+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray31() {
	assertFalse(29047==29047+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray32() {
	assertFalse(4722==4722+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray33() {
	assertFalse(11952==11952+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray34() {
	assertFalse(25704==25704+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray35() {
	assertFalse(22291==22291+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray36() {
	assertFalse(20538==20538+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray37() {
	assertFalse(19525==19525+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray38() {
	assertFalse(3919==3919+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray39() {
	assertFalse(19431==19431+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray40() {
	assertFalse(7594==7594+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray41() {
	assertFalse(19536==19536+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray42() {
	assertFalse(31340==31340+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray43() {
	assertFalse(24756==24756+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray44() {
	assertFalse(7776==7776+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray45() {
	assertFalse(22912==22912+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray46() {
	assertFalse(10945==10945+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray47() {
	assertFalse(28748==28748+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray48() {
	assertFalse(13944==13944+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray49() {
	assertFalse(18358==18358+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray50() {
	assertFalse(2448==2448+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray51() {
	assertFalse(3585==3585+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray52() {
	assertFalse(30341==30341+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray53() {
	assertFalse(22095==22095+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray54() {
	assertFalse(18108==18108+1);
}
@Test
public void bigFalseTestArrayWriteAPIDataArray55() {
	assertFalse(28367==28367+1);
}
}
