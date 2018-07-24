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

public class ReadReadWriteMapHelperTest {
    @Test
    public void testValidReadReadWriteMap() {
		ReadReadWriteMapHelper helper = new ReadReadWriteMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidReadReadWriteMap() {
	ReadReadWriteMapHelper helper = new ReadReadWriteMapHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileReadReadWriteMapHelper", ".tmp"); 
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
public void testFalseReadReadWriteMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseReadReadWriteMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadReadWriteMap0() {
	assertFalse(22170==22170+1);
}
@Test
public void bigFalseTestReadReadWriteMap1() {
	assertFalse(6796==6796+1);
}
@Test
public void bigFalseTestReadReadWriteMap2() {
	assertFalse(4736==4736+1);
}
@Test
public void bigFalseTestReadReadWriteMap3() {
	assertFalse(15775==15775+1);
}
@Test
public void bigFalseTestReadReadWriteMap4() {
	assertFalse(16473==16473+1);
}
@Test
public void bigFalseTestReadReadWriteMap5() {
	assertFalse(15370==15370+1);
}
@Test
public void bigFalseTestReadReadWriteMap6() {
	assertFalse(12841==12841+1);
}
@Test
public void bigFalseTestReadReadWriteMap7() {
	assertFalse(16223==16223+1);
}
@Test
public void bigFalseTestReadReadWriteMap8() {
	assertFalse(17584==17584+1);
}
@Test
public void bigFalseTestReadReadWriteMap9() {
	assertFalse(5418==5418+1);
}
@Test
public void bigFalseTestReadReadWriteMap10() {
	assertFalse(5262==5262+1);
}
@Test
public void bigFalseTestReadReadWriteMap11() {
	assertFalse(16775==16775+1);
}
@Test
public void bigFalseTestReadReadWriteMap12() {
	assertFalse(8385==8385+1);
}
@Test
public void bigFalseTestReadReadWriteMap13() {
	assertFalse(8641==8641+1);
}
@Test
public void bigFalseTestReadReadWriteMap14() {
	assertFalse(7120==7120+1);
}
@Test
public void bigFalseTestReadReadWriteMap15() {
	assertFalse(16763==16763+1);
}
@Test
public void bigFalseTestReadReadWriteMap16() {
	assertFalse(10433==10433+1);
}
@Test
public void bigFalseTestReadReadWriteMap17() {
	assertFalse(13707==13707+1);
}
@Test
public void bigFalseTestReadReadWriteMap18() {
	assertFalse(679==679+1);
}
@Test
public void bigFalseTestReadReadWriteMap19() {
	assertFalse(20115==20115+1);
}
@Test
public void bigFalseTestReadReadWriteMap20() {
	assertFalse(1395==1395+1);
}
@Test
public void bigFalseTestReadReadWriteMap21() {
	assertFalse(29176==29176+1);
}
@Test
public void bigFalseTestReadReadWriteMap22() {
	assertFalse(11331==11331+1);
}
@Test
public void bigFalseTestReadReadWriteMap23() {
	assertFalse(4810==4810+1);
}
@Test
public void bigFalseTestReadReadWriteMap24() {
	assertFalse(19817==19817+1);
}
@Test
public void bigFalseTestReadReadWriteMap25() {
	assertFalse(19642==19642+1);
}
@Test
public void bigFalseTestReadReadWriteMap26() {
	assertFalse(5604==5604+1);
}
@Test
public void bigFalseTestReadReadWriteMap27() {
	assertFalse(14892==14892+1);
}
@Test
public void bigFalseTestReadReadWriteMap28() {
	assertFalse(30202==30202+1);
}
@Test
public void bigFalseTestReadReadWriteMap29() {
	assertFalse(29456==29456+1);
}
@Test
public void bigFalseTestReadReadWriteMap30() {
	assertFalse(17976==17976+1);
}
@Test
public void bigFalseTestReadReadWriteMap31() {
	assertFalse(25854==25854+1);
}
@Test
public void bigFalseTestReadReadWriteMap32() {
	assertFalse(22530==22530+1);
}
@Test
public void bigFalseTestReadReadWriteMap33() {
	assertFalse(5583==5583+1);
}
@Test
public void bigFalseTestReadReadWriteMap34() {
	assertFalse(22136==22136+1);
}
@Test
public void bigFalseTestReadReadWriteMap35() {
	assertFalse(4266==4266+1);
}
@Test
public void bigFalseTestReadReadWriteMap36() {
	assertFalse(17500==17500+1);
}
@Test
public void bigFalseTestReadReadWriteMap37() {
	assertFalse(27189==27189+1);
}
@Test
public void bigFalseTestReadReadWriteMap38() {
	assertFalse(28993==28993+1);
}
@Test
public void bigFalseTestReadReadWriteMap39() {
	assertFalse(9073==9073+1);
}
@Test
public void bigFalseTestReadReadWriteMap40() {
	assertFalse(25632==25632+1);
}
@Test
public void bigFalseTestReadReadWriteMap41() {
	assertFalse(27501==27501+1);
}
@Test
public void bigFalseTestReadReadWriteMap42() {
	assertFalse(25395==25395+1);
}
@Test
public void bigFalseTestReadReadWriteMap43() {
	assertFalse(1743==1743+1);
}
@Test
public void bigFalseTestReadReadWriteMap44() {
	assertFalse(24733==24733+1);
}
@Test
public void bigFalseTestReadReadWriteMap45() {
	assertFalse(10466==10466+1);
}
@Test
public void bigFalseTestReadReadWriteMap46() {
	assertFalse(6475==6475+1);
}
@Test
public void bigFalseTestReadReadWriteMap47() {
	assertFalse(31917==31917+1);
}
@Test
public void bigFalseTestReadReadWriteMap48() {
	assertFalse(3861==3861+1);
}
@Test
public void bigFalseTestReadReadWriteMap49() {
	assertFalse(11588==11588+1);
}
@Test
public void bigFalseTestReadReadWriteMap50() {
	assertFalse(10497==10497+1);
}
@Test
public void bigFalseTestReadReadWriteMap51() {
	assertFalse(6985==6985+1);
}
@Test
public void bigFalseTestReadReadWriteMap52() {
	assertFalse(7227==7227+1);
}
@Test
public void bigFalseTestReadReadWriteMap53() {
	assertFalse(19035==19035+1);
}
@Test
public void bigFalseTestReadReadWriteMap54() {
	assertFalse(15905==15905+1);
}
@Test
public void bigFalseTestReadReadWriteMap55() {
	assertFalse(7142==7142+1);
}
}
