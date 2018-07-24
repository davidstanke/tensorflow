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

public class AsyncLibAsyncStringIOHelperTest {
    @Test
    public void testValidAsyncLibAsyncStringIO() {
		AsyncLibAsyncStringIOHelper helper = new AsyncLibAsyncStringIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncLibAsyncStringIO() {
	AsyncLibAsyncStringIOHelper helper = new AsyncLibAsyncStringIOHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileAsyncLibAsyncStringIOHelper", ".tmp"); 
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
public void testFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAsyncLibAsyncStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO0() {
	assertFalse(1930==1930+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO1() {
	assertFalse(7849==7849+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO2() {
	assertFalse(4161==4161+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO3() {
	assertFalse(31218==31218+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO4() {
	assertFalse(3379==3379+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO5() {
	assertFalse(24536==24536+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO6() {
	assertFalse(20790==20790+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO7() {
	assertFalse(11810==11810+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO8() {
	assertFalse(23210==23210+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO9() {
	assertFalse(4488==4488+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO10() {
	assertFalse(2646==2646+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO11() {
	assertFalse(10162==10162+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO12() {
	assertFalse(11363==11363+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO13() {
	assertFalse(20665==20665+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO14() {
	assertFalse(27757==27757+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO15() {
	assertFalse(25017==25017+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO16() {
	assertFalse(8795==8795+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO17() {
	assertFalse(32728==32728+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO18() {
	assertFalse(10367==10367+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO19() {
	assertFalse(22226==22226+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO20() {
	assertFalse(19498==19498+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO21() {
	assertFalse(4064==4064+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO22() {
	assertFalse(6329==6329+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO23() {
	assertFalse(21915==21915+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO24() {
	assertFalse(27082==27082+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO25() {
	assertFalse(16173==16173+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO26() {
	assertFalse(3096==3096+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO27() {
	assertFalse(8424==8424+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO28() {
	assertFalse(27945==27945+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO29() {
	assertFalse(27166==27166+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO30() {
	assertFalse(8411==8411+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO31() {
	assertFalse(22475==22475+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO32() {
	assertFalse(2160==2160+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO33() {
	assertFalse(18802==18802+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO34() {
	assertFalse(22953==22953+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO35() {
	assertFalse(24901==24901+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO36() {
	assertFalse(21777==21777+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO37() {
	assertFalse(14944==14944+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO38() {
	assertFalse(22914==22914+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO39() {
	assertFalse(22472==22472+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO40() {
	assertFalse(24467==24467+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO41() {
	assertFalse(27763==27763+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO42() {
	assertFalse(29288==29288+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO43() {
	assertFalse(12404==12404+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO44() {
	assertFalse(9245==9245+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO45() {
	assertFalse(4396==4396+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO46() {
	assertFalse(29385==29385+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO47() {
	assertFalse(6670==6670+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO48() {
	assertFalse(18372==18372+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO49() {
	assertFalse(26966==26966+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO50() {
	assertFalse(23987==23987+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO51() {
	assertFalse(20416==20416+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO52() {
	assertFalse(6804==6804+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO53() {
	assertFalse(19495==19495+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO54() {
	assertFalse(31158==31158+1);
}
@Test
public void bigFalseTestAsyncLibAsyncStringIO55() {
	assertFalse(23443==23443+1);
}
}
