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

public class StructSerialProxyAPIHelperTest {
    @Test
    public void testValidStructSerialProxyAPI() {
		StructSerialProxyAPIHelper helper = new StructSerialProxyAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialProxyAPI() {
	StructSerialProxyAPIHelper helper = new StructSerialProxyAPIHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStructSerialProxyAPIHelper", ".tmp"); 
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
public void testFalseStructSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialProxyAPI0() {
	assertFalse(26855==26855+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI1() {
	assertFalse(28449==28449+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI2() {
	assertFalse(27822==27822+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI3() {
	assertFalse(16961==16961+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI4() {
	assertFalse(27983==27983+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI5() {
	assertFalse(26376==26376+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI6() {
	assertFalse(27306==27306+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI7() {
	assertFalse(13613==13613+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI8() {
	assertFalse(4804==4804+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI9() {
	assertFalse(3807==3807+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI10() {
	assertFalse(17297==17297+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI11() {
	assertFalse(18723==18723+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI12() {
	assertFalse(17072==17072+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI13() {
	assertFalse(5798==5798+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI14() {
	assertFalse(17358==17358+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI15() {
	assertFalse(2904==2904+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI16() {
	assertFalse(4400==4400+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI17() {
	assertFalse(21243==21243+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI18() {
	assertFalse(17050==17050+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI19() {
	assertFalse(15970==15970+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI20() {
	assertFalse(5504==5504+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI21() {
	assertFalse(19219==19219+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI22() {
	assertFalse(24140==24140+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI23() {
	assertFalse(11923==11923+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI24() {
	assertFalse(23844==23844+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI25() {
	assertFalse(10871==10871+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI26() {
	assertFalse(12646==12646+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI27() {
	assertFalse(28696==28696+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI28() {
	assertFalse(26076==26076+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI29() {
	assertFalse(4735==4735+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI30() {
	assertFalse(19547==19547+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI31() {
	assertFalse(25302==25302+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI32() {
	assertFalse(19013==19013+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI33() {
	assertFalse(1935==1935+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI34() {
	assertFalse(33==33+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI35() {
	assertFalse(6144==6144+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI36() {
	assertFalse(3407==3407+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI37() {
	assertFalse(30228==30228+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI38() {
	assertFalse(17787==17787+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI39() {
	assertFalse(30072==30072+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI40() {
	assertFalse(12386==12386+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI41() {
	assertFalse(2878==2878+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI42() {
	assertFalse(19716==19716+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI43() {
	assertFalse(13035==13035+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI44() {
	assertFalse(79==79+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI45() {
	assertFalse(23931==23931+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI46() {
	assertFalse(1018==1018+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI47() {
	assertFalse(3243==3243+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI48() {
	assertFalse(17657==17657+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI49() {
	assertFalse(8375==8375+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI50() {
	assertFalse(6608==6608+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI51() {
	assertFalse(18507==18507+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI52() {
	assertFalse(16320==16320+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI53() {
	assertFalse(25172==25172+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI54() {
	assertFalse(21106==21106+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI55() {
	assertFalse(26364==26364+1);
}
}
