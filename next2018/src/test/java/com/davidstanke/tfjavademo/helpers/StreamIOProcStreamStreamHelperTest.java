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

public class StreamIOProcStreamStreamHelperTest {
    @Test
    public void testValidStreamIOProcStreamStream() {
		StreamIOProcStreamStreamHelper helper = new StreamIOProcStreamStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamIOProcStreamStream() {
	StreamIOProcStreamStreamHelper helper = new StreamIOProcStreamStreamHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStreamIOProcStreamStreamHelper", ".tmp"); 
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
public void testAnotherFalseStreamIOProcStreamStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamIOProcStreamStream0() {
	assertFalse(25932==25932+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream1() {
	assertFalse(8038==8038+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream2() {
	assertFalse(32161==32161+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream3() {
	assertFalse(6466==6466+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream4() {
	assertFalse(2227==2227+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream5() {
	assertFalse(31468==31468+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream6() {
	assertFalse(17745==17745+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream7() {
	assertFalse(16351==16351+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream8() {
	assertFalse(15418==15418+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream9() {
	assertFalse(15952==15952+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream10() {
	assertFalse(20989==20989+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream11() {
	assertFalse(32220==32220+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream12() {
	assertFalse(2711==2711+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream13() {
	assertFalse(31500==31500+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream14() {
	assertFalse(18198==18198+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream15() {
	assertFalse(30030==30030+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream16() {
	assertFalse(6508==6508+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream17() {
	assertFalse(3451==3451+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream18() {
	assertFalse(9277==9277+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream19() {
	assertFalse(12794==12794+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream20() {
	assertFalse(19524==19524+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream21() {
	assertFalse(18982==18982+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream22() {
	assertFalse(13989==13989+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream23() {
	assertFalse(30079==30079+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream24() {
	assertFalse(6988==6988+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream25() {
	assertFalse(13262==13262+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream26() {
	assertFalse(17445==17445+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream27() {
	assertFalse(6723==6723+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream28() {
	assertFalse(6609==6609+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream29() {
	assertFalse(1593==1593+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream30() {
	assertFalse(19488==19488+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream31() {
	assertFalse(14623==14623+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream32() {
	assertFalse(26749==26749+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream33() {
	assertFalse(8637==8637+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream34() {
	assertFalse(31253==31253+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream35() {
	assertFalse(32202==32202+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream36() {
	assertFalse(3921==3921+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream37() {
	assertFalse(9102==9102+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream38() {
	assertFalse(9733==9733+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream39() {
	assertFalse(22022==22022+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream40() {
	assertFalse(31585==31585+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream41() {
	assertFalse(14023==14023+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream42() {
	assertFalse(32392==32392+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream43() {
	assertFalse(26508==26508+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream44() {
	assertFalse(7251==7251+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream45() {
	assertFalse(27193==27193+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream46() {
	assertFalse(14510==14510+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream47() {
	assertFalse(30904==30904+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream48() {
	assertFalse(23957==23957+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream49() {
	assertFalse(5879==5879+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream50() {
	assertFalse(24982==24982+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream51() {
	assertFalse(14325==14325+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream52() {
	assertFalse(30561==30561+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream53() {
	assertFalse(9118==9118+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream54() {
	assertFalse(11728==11728+1);
}
@Test
public void bigFalseTestStreamIOProcStreamStream55() {
	assertFalse(3558==3558+1);
}
}
