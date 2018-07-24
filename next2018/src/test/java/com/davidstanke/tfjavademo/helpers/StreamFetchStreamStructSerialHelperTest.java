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

public class StreamFetchStreamStructSerialHelperTest {
    @Test
    public void testValidStreamFetchStreamStructSerial() {
		StreamFetchStreamStructSerialHelper helper = new StreamFetchStreamStructSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamFetchStreamStructSerial() {
	StreamFetchStreamStructSerialHelper helper = new StreamFetchStreamStructSerialHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStreamFetchStreamStructSerialHelper", ".tmp"); 
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
public void testAnotherFalseStreamFetchStreamStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial0() {
	assertFalse(3895==3895+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial1() {
	assertFalse(5543==5543+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial2() {
	assertFalse(503==503+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial3() {
	assertFalse(8823==8823+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial4() {
	assertFalse(27205==27205+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial5() {
	assertFalse(817==817+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial6() {
	assertFalse(14816==14816+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial7() {
	assertFalse(16429==16429+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial8() {
	assertFalse(32181==32181+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial9() {
	assertFalse(28189==28189+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial10() {
	assertFalse(27045==27045+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial11() {
	assertFalse(5205==5205+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial12() {
	assertFalse(10293==10293+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial13() {
	assertFalse(20951==20951+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial14() {
	assertFalse(19791==19791+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial15() {
	assertFalse(3676==3676+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial16() {
	assertFalse(23770==23770+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial17() {
	assertFalse(4945==4945+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial18() {
	assertFalse(7625==7625+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial19() {
	assertFalse(30070==30070+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial20() {
	assertFalse(24576==24576+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial21() {
	assertFalse(29359==29359+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial22() {
	assertFalse(24344==24344+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial23() {
	assertFalse(35==35+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial24() {
	assertFalse(30181==30181+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial25() {
	assertFalse(27573==27573+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial26() {
	assertFalse(22104==22104+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial27() {
	assertFalse(22659==22659+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial28() {
	assertFalse(24324==24324+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial29() {
	assertFalse(12528==12528+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial30() {
	assertFalse(25466==25466+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial31() {
	assertFalse(6495==6495+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial32() {
	assertFalse(15923==15923+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial33() {
	assertFalse(11687==11687+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial34() {
	assertFalse(15039==15039+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial35() {
	assertFalse(4083==4083+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial36() {
	assertFalse(17532==17532+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial37() {
	assertFalse(14977==14977+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial38() {
	assertFalse(14835==14835+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial39() {
	assertFalse(20093==20093+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial40() {
	assertFalse(16059==16059+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial41() {
	assertFalse(28915==28915+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial42() {
	assertFalse(21866==21866+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial43() {
	assertFalse(23430==23430+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial44() {
	assertFalse(24827==24827+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial45() {
	assertFalse(18799==18799+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial46() {
	assertFalse(22716==22716+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial47() {
	assertFalse(2547==2547+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial48() {
	assertFalse(27537==27537+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial49() {
	assertFalse(28750==28750+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial50() {
	assertFalse(30527==30527+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial51() {
	assertFalse(17867==17867+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial52() {
	assertFalse(1526==1526+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial53() {
	assertFalse(32121==32121+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial54() {
	assertFalse(26697==26697+1);
}
@Test
public void bigFalseTestStreamFetchStreamStructSerial55() {
	assertFalse(25029==25029+1);
}
}
