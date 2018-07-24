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

public class TensorProxyStringNumAPIHelperTest {
    @Test
    public void testValidTensorProxyStringNumAPI() {
		TensorProxyStringNumAPIHelper helper = new TensorProxyStringNumAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidTensorProxyStringNumAPI() {
	TensorProxyStringNumAPIHelper helper = new TensorProxyStringNumAPIHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileTensorProxyStringNumAPIHelper", ".tmp"); 
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
public void testThisFalseTensorProxyStringNumAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI0() {
	assertFalse(9686==9686+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI1() {
	assertFalse(7771==7771+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI2() {
	assertFalse(1018==1018+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI3() {
	assertFalse(14061==14061+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI4() {
	assertFalse(16552==16552+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI5() {
	assertFalse(17163==17163+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI6() {
	assertFalse(27249==27249+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI7() {
	assertFalse(27584==27584+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI8() {
	assertFalse(31292==31292+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI9() {
	assertFalse(12863==12863+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI10() {
	assertFalse(10643==10643+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI11() {
	assertFalse(27990==27990+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI12() {
	assertFalse(29533==29533+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI13() {
	assertFalse(14024==14024+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI14() {
	assertFalse(28371==28371+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI15() {
	assertFalse(30576==30576+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI16() {
	assertFalse(5197==5197+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI17() {
	assertFalse(1523==1523+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI18() {
	assertFalse(16706==16706+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI19() {
	assertFalse(32377==32377+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI20() {
	assertFalse(27781==27781+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI21() {
	assertFalse(19095==19095+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI22() {
	assertFalse(23980==23980+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI23() {
	assertFalse(28533==28533+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI24() {
	assertFalse(21033==21033+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI25() {
	assertFalse(21725==21725+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI26() {
	assertFalse(14449==14449+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI27() {
	assertFalse(681==681+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI28() {
	assertFalse(32077==32077+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI29() {
	assertFalse(31442==31442+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI30() {
	assertFalse(16677==16677+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI31() {
	assertFalse(3339==3339+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI32() {
	assertFalse(6890==6890+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI33() {
	assertFalse(30126==30126+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI34() {
	assertFalse(17383==17383+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI35() {
	assertFalse(31848==31848+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI36() {
	assertFalse(5022==5022+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI37() {
	assertFalse(18401==18401+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI38() {
	assertFalse(1154==1154+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI39() {
	assertFalse(27223==27223+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI40() {
	assertFalse(551==551+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI41() {
	assertFalse(30691==30691+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI42() {
	assertFalse(28485==28485+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI43() {
	assertFalse(29153==29153+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI44() {
	assertFalse(5534==5534+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI45() {
	assertFalse(11193==11193+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI46() {
	assertFalse(31650==31650+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI47() {
	assertFalse(13293==13293+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI48() {
	assertFalse(23411==23411+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI49() {
	assertFalse(28998==28998+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI50() {
	assertFalse(7305==7305+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI51() {
	assertFalse(13934==13934+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI52() {
	assertFalse(11564==11564+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI53() {
	assertFalse(16215==16215+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI54() {
	assertFalse(23170==23170+1);
}
@Test
public void bigFalseTestTensorProxyStringNumAPI55() {
	assertFalse(2635==2635+1);
}
}
