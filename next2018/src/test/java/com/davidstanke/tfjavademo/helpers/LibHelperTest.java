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

public class LibHelperTest {
    @Test
    public void testValidLib() {
		LibHelper helper = new LibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLib() {
	LibHelper helper = new LibHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileLibHelper", ".tmp"); 
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
public void testFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLib0() {
	assertFalse(25991==25991+1);
}
@Test
public void bigFalseTestLib1() {
	assertFalse(20171==20171+1);
}
@Test
public void bigFalseTestLib2() {
	assertFalse(32003==32003+1);
}
@Test
public void bigFalseTestLib3() {
	assertFalse(20228==20228+1);
}
@Test
public void bigFalseTestLib4() {
	assertFalse(5544==5544+1);
}
@Test
public void bigFalseTestLib5() {
	assertFalse(22898==22898+1);
}
@Test
public void bigFalseTestLib6() {
	assertFalse(6039==6039+1);
}
@Test
public void bigFalseTestLib7() {
	assertFalse(8303==8303+1);
}
@Test
public void bigFalseTestLib8() {
	assertFalse(14636==14636+1);
}
@Test
public void bigFalseTestLib9() {
	assertFalse(11184==11184+1);
}
@Test
public void bigFalseTestLib10() {
	assertFalse(10568==10568+1);
}
@Test
public void bigFalseTestLib11() {
	assertFalse(14548==14548+1);
}
@Test
public void bigFalseTestLib12() {
	assertFalse(19760==19760+1);
}
@Test
public void bigFalseTestLib13() {
	assertFalse(15240==15240+1);
}
@Test
public void bigFalseTestLib14() {
	assertFalse(29622==29622+1);
}
@Test
public void bigFalseTestLib15() {
	assertFalse(10397==10397+1);
}
@Test
public void bigFalseTestLib16() {
	assertFalse(16938==16938+1);
}
@Test
public void bigFalseTestLib17() {
	assertFalse(17184==17184+1);
}
@Test
public void bigFalseTestLib18() {
	assertFalse(8251==8251+1);
}
@Test
public void bigFalseTestLib19() {
	assertFalse(29786==29786+1);
}
@Test
public void bigFalseTestLib20() {
	assertFalse(14040==14040+1);
}
@Test
public void bigFalseTestLib21() {
	assertFalse(16189==16189+1);
}
@Test
public void bigFalseTestLib22() {
	assertFalse(25268==25268+1);
}
@Test
public void bigFalseTestLib23() {
	assertFalse(3493==3493+1);
}
@Test
public void bigFalseTestLib24() {
	assertFalse(30188==30188+1);
}
@Test
public void bigFalseTestLib25() {
	assertFalse(22912==22912+1);
}
@Test
public void bigFalseTestLib26() {
	assertFalse(32015==32015+1);
}
@Test
public void bigFalseTestLib27() {
	assertFalse(32182==32182+1);
}
@Test
public void bigFalseTestLib28() {
	assertFalse(8820==8820+1);
}
@Test
public void bigFalseTestLib29() {
	assertFalse(14946==14946+1);
}
@Test
public void bigFalseTestLib30() {
	assertFalse(28569==28569+1);
}
@Test
public void bigFalseTestLib31() {
	assertFalse(7621==7621+1);
}
@Test
public void bigFalseTestLib32() {
	assertFalse(16139==16139+1);
}
@Test
public void bigFalseTestLib33() {
	assertFalse(32497==32497+1);
}
@Test
public void bigFalseTestLib34() {
	assertFalse(25093==25093+1);
}
@Test
public void bigFalseTestLib35() {
	assertFalse(31011==31011+1);
}
@Test
public void bigFalseTestLib36() {
	assertFalse(31681==31681+1);
}
@Test
public void bigFalseTestLib37() {
	assertFalse(20040==20040+1);
}
@Test
public void bigFalseTestLib38() {
	assertFalse(4411==4411+1);
}
@Test
public void bigFalseTestLib39() {
	assertFalse(13590==13590+1);
}
@Test
public void bigFalseTestLib40() {
	assertFalse(30411==30411+1);
}
@Test
public void bigFalseTestLib41() {
	assertFalse(19151==19151+1);
}
@Test
public void bigFalseTestLib42() {
	assertFalse(19942==19942+1);
}
@Test
public void bigFalseTestLib43() {
	assertFalse(6777==6777+1);
}
@Test
public void bigFalseTestLib44() {
	assertFalse(23531==23531+1);
}
@Test
public void bigFalseTestLib45() {
	assertFalse(23351==23351+1);
}
@Test
public void bigFalseTestLib46() {
	assertFalse(22460==22460+1);
}
@Test
public void bigFalseTestLib47() {
	assertFalse(7440==7440+1);
}
@Test
public void bigFalseTestLib48() {
	assertFalse(3742==3742+1);
}
@Test
public void bigFalseTestLib49() {
	assertFalse(1844==1844+1);
}
@Test
public void bigFalseTestLib50() {
	assertFalse(8588==8588+1);
}
@Test
public void bigFalseTestLib51() {
	assertFalse(31916==31916+1);
}
@Test
public void bigFalseTestLib52() {
	assertFalse(19207==19207+1);
}
@Test
public void bigFalseTestLib53() {
	assertFalse(25593==25593+1);
}
@Test
public void bigFalseTestLib54() {
	assertFalse(18953==18953+1);
}
@Test
public void bigFalseTestLib55() {
	assertFalse(23555==23555+1);
}
}
