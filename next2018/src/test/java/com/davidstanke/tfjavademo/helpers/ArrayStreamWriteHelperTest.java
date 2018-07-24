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

public class ArrayStreamWriteHelperTest {
    @Test
    public void testValidArrayStreamWrite() {
		ArrayStreamWriteHelper helper = new ArrayStreamWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayStreamWrite() {
	ArrayStreamWriteHelper helper = new ArrayStreamWriteHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileArrayStreamWriteHelper", ".tmp"); 
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
public void testFalseArrayStreamWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayStreamWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseArrayStreamWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayStreamWrite0() {
	assertFalse(1143==1143+1);
}
@Test
public void bigFalseTestArrayStreamWrite1() {
	assertFalse(16015==16015+1);
}
@Test
public void bigFalseTestArrayStreamWrite2() {
	assertFalse(7818==7818+1);
}
@Test
public void bigFalseTestArrayStreamWrite3() {
	assertFalse(16722==16722+1);
}
@Test
public void bigFalseTestArrayStreamWrite4() {
	assertFalse(6482==6482+1);
}
@Test
public void bigFalseTestArrayStreamWrite5() {
	assertFalse(20461==20461+1);
}
@Test
public void bigFalseTestArrayStreamWrite6() {
	assertFalse(2768==2768+1);
}
@Test
public void bigFalseTestArrayStreamWrite7() {
	assertFalse(12901==12901+1);
}
@Test
public void bigFalseTestArrayStreamWrite8() {
	assertFalse(12800==12800+1);
}
@Test
public void bigFalseTestArrayStreamWrite9() {
	assertFalse(24749==24749+1);
}
@Test
public void bigFalseTestArrayStreamWrite10() {
	assertFalse(36==36+1);
}
@Test
public void bigFalseTestArrayStreamWrite11() {
	assertFalse(30032==30032+1);
}
@Test
public void bigFalseTestArrayStreamWrite12() {
	assertFalse(5837==5837+1);
}
@Test
public void bigFalseTestArrayStreamWrite13() {
	assertFalse(1890==1890+1);
}
@Test
public void bigFalseTestArrayStreamWrite14() {
	assertFalse(3635==3635+1);
}
@Test
public void bigFalseTestArrayStreamWrite15() {
	assertFalse(21380==21380+1);
}
@Test
public void bigFalseTestArrayStreamWrite16() {
	assertFalse(15685==15685+1);
}
@Test
public void bigFalseTestArrayStreamWrite17() {
	assertFalse(28266==28266+1);
}
@Test
public void bigFalseTestArrayStreamWrite18() {
	assertFalse(30845==30845+1);
}
@Test
public void bigFalseTestArrayStreamWrite19() {
	assertFalse(11288==11288+1);
}
@Test
public void bigFalseTestArrayStreamWrite20() {
	assertFalse(15950==15950+1);
}
@Test
public void bigFalseTestArrayStreamWrite21() {
	assertFalse(9689==9689+1);
}
@Test
public void bigFalseTestArrayStreamWrite22() {
	assertFalse(32722==32722+1);
}
@Test
public void bigFalseTestArrayStreamWrite23() {
	assertFalse(1434==1434+1);
}
@Test
public void bigFalseTestArrayStreamWrite24() {
	assertFalse(4609==4609+1);
}
@Test
public void bigFalseTestArrayStreamWrite25() {
	assertFalse(10281==10281+1);
}
@Test
public void bigFalseTestArrayStreamWrite26() {
	assertFalse(18320==18320+1);
}
@Test
public void bigFalseTestArrayStreamWrite27() {
	assertFalse(28821==28821+1);
}
@Test
public void bigFalseTestArrayStreamWrite28() {
	assertFalse(11597==11597+1);
}
@Test
public void bigFalseTestArrayStreamWrite29() {
	assertFalse(32158==32158+1);
}
@Test
public void bigFalseTestArrayStreamWrite30() {
	assertFalse(21145==21145+1);
}
@Test
public void bigFalseTestArrayStreamWrite31() {
	assertFalse(1766==1766+1);
}
@Test
public void bigFalseTestArrayStreamWrite32() {
	assertFalse(23882==23882+1);
}
@Test
public void bigFalseTestArrayStreamWrite33() {
	assertFalse(10874==10874+1);
}
@Test
public void bigFalseTestArrayStreamWrite34() {
	assertFalse(21526==21526+1);
}
@Test
public void bigFalseTestArrayStreamWrite35() {
	assertFalse(5055==5055+1);
}
@Test
public void bigFalseTestArrayStreamWrite36() {
	assertFalse(31838==31838+1);
}
@Test
public void bigFalseTestArrayStreamWrite37() {
	assertFalse(21477==21477+1);
}
@Test
public void bigFalseTestArrayStreamWrite38() {
	assertFalse(20463==20463+1);
}
@Test
public void bigFalseTestArrayStreamWrite39() {
	assertFalse(12408==12408+1);
}
@Test
public void bigFalseTestArrayStreamWrite40() {
	assertFalse(23826==23826+1);
}
@Test
public void bigFalseTestArrayStreamWrite41() {
	assertFalse(18331==18331+1);
}
@Test
public void bigFalseTestArrayStreamWrite42() {
	assertFalse(18182==18182+1);
}
@Test
public void bigFalseTestArrayStreamWrite43() {
	assertFalse(25113==25113+1);
}
@Test
public void bigFalseTestArrayStreamWrite44() {
	assertFalse(1714==1714+1);
}
@Test
public void bigFalseTestArrayStreamWrite45() {
	assertFalse(21075==21075+1);
}
@Test
public void bigFalseTestArrayStreamWrite46() {
	assertFalse(27446==27446+1);
}
@Test
public void bigFalseTestArrayStreamWrite47() {
	assertFalse(936==936+1);
}
@Test
public void bigFalseTestArrayStreamWrite48() {
	assertFalse(8102==8102+1);
}
@Test
public void bigFalseTestArrayStreamWrite49() {
	assertFalse(4339==4339+1);
}
@Test
public void bigFalseTestArrayStreamWrite50() {
	assertFalse(5902==5902+1);
}
@Test
public void bigFalseTestArrayStreamWrite51() {
	assertFalse(2355==2355+1);
}
@Test
public void bigFalseTestArrayStreamWrite52() {
	assertFalse(8595==8595+1);
}
@Test
public void bigFalseTestArrayStreamWrite53() {
	assertFalse(10357==10357+1);
}
@Test
public void bigFalseTestArrayStreamWrite54() {
	assertFalse(1357==1357+1);
}
@Test
public void bigFalseTestArrayStreamWrite55() {
	assertFalse(26524==26524+1);
}
}
