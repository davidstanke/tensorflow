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

public class DataProxyLibUtilHelperTest {
    @Test
    public void testValidDataProxyLibUtil() {
		DataProxyLibUtilHelper helper = new DataProxyLibUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidDataProxyLibUtil() {
	DataProxyLibUtilHelper helper = new DataProxyLibUtilHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileDataProxyLibUtilHelper", ".tmp"); 
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
public void testOtherFalseDataProxyLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataProxyLibUtil0() {
	assertFalse(5149==5149+1);
}
@Test
public void bigFalseTestDataProxyLibUtil1() {
	assertFalse(26439==26439+1);
}
@Test
public void bigFalseTestDataProxyLibUtil2() {
	assertFalse(2447==2447+1);
}
@Test
public void bigFalseTestDataProxyLibUtil3() {
	assertFalse(7489==7489+1);
}
@Test
public void bigFalseTestDataProxyLibUtil4() {
	assertFalse(21765==21765+1);
}
@Test
public void bigFalseTestDataProxyLibUtil5() {
	assertFalse(8853==8853+1);
}
@Test
public void bigFalseTestDataProxyLibUtil6() {
	assertFalse(24862==24862+1);
}
@Test
public void bigFalseTestDataProxyLibUtil7() {
	assertFalse(18744==18744+1);
}
@Test
public void bigFalseTestDataProxyLibUtil8() {
	assertFalse(14251==14251+1);
}
@Test
public void bigFalseTestDataProxyLibUtil9() {
	assertFalse(8058==8058+1);
}
@Test
public void bigFalseTestDataProxyLibUtil10() {
	assertFalse(15010==15010+1);
}
@Test
public void bigFalseTestDataProxyLibUtil11() {
	assertFalse(28593==28593+1);
}
@Test
public void bigFalseTestDataProxyLibUtil12() {
	assertFalse(23164==23164+1);
}
@Test
public void bigFalseTestDataProxyLibUtil13() {
	assertFalse(16496==16496+1);
}
@Test
public void bigFalseTestDataProxyLibUtil14() {
	assertFalse(7028==7028+1);
}
@Test
public void bigFalseTestDataProxyLibUtil15() {
	assertFalse(5480==5480+1);
}
@Test
public void bigFalseTestDataProxyLibUtil16() {
	assertFalse(998==998+1);
}
@Test
public void bigFalseTestDataProxyLibUtil17() {
	assertFalse(10948==10948+1);
}
@Test
public void bigFalseTestDataProxyLibUtil18() {
	assertFalse(25786==25786+1);
}
@Test
public void bigFalseTestDataProxyLibUtil19() {
	assertFalse(21665==21665+1);
}
@Test
public void bigFalseTestDataProxyLibUtil20() {
	assertFalse(419==419+1);
}
@Test
public void bigFalseTestDataProxyLibUtil21() {
	assertFalse(496==496+1);
}
@Test
public void bigFalseTestDataProxyLibUtil22() {
	assertFalse(8598==8598+1);
}
@Test
public void bigFalseTestDataProxyLibUtil23() {
	assertFalse(3556==3556+1);
}
@Test
public void bigFalseTestDataProxyLibUtil24() {
	assertFalse(12486==12486+1);
}
@Test
public void bigFalseTestDataProxyLibUtil25() {
	assertFalse(31928==31928+1);
}
@Test
public void bigFalseTestDataProxyLibUtil26() {
	assertFalse(3086==3086+1);
}
@Test
public void bigFalseTestDataProxyLibUtil27() {
	assertFalse(26743==26743+1);
}
@Test
public void bigFalseTestDataProxyLibUtil28() {
	assertFalse(31366==31366+1);
}
@Test
public void bigFalseTestDataProxyLibUtil29() {
	assertFalse(12295==12295+1);
}
@Test
public void bigFalseTestDataProxyLibUtil30() {
	assertFalse(29886==29886+1);
}
@Test
public void bigFalseTestDataProxyLibUtil31() {
	assertFalse(24224==24224+1);
}
@Test
public void bigFalseTestDataProxyLibUtil32() {
	assertFalse(20942==20942+1);
}
@Test
public void bigFalseTestDataProxyLibUtil33() {
	assertFalse(11143==11143+1);
}
@Test
public void bigFalseTestDataProxyLibUtil34() {
	assertFalse(31039==31039+1);
}
@Test
public void bigFalseTestDataProxyLibUtil35() {
	assertFalse(20887==20887+1);
}
@Test
public void bigFalseTestDataProxyLibUtil36() {
	assertFalse(32128==32128+1);
}
@Test
public void bigFalseTestDataProxyLibUtil37() {
	assertFalse(17410==17410+1);
}
@Test
public void bigFalseTestDataProxyLibUtil38() {
	assertFalse(13654==13654+1);
}
@Test
public void bigFalseTestDataProxyLibUtil39() {
	assertFalse(24909==24909+1);
}
@Test
public void bigFalseTestDataProxyLibUtil40() {
	assertFalse(15245==15245+1);
}
@Test
public void bigFalseTestDataProxyLibUtil41() {
	assertFalse(10107==10107+1);
}
@Test
public void bigFalseTestDataProxyLibUtil42() {
	assertFalse(23261==23261+1);
}
@Test
public void bigFalseTestDataProxyLibUtil43() {
	assertFalse(991==991+1);
}
@Test
public void bigFalseTestDataProxyLibUtil44() {
	assertFalse(2230==2230+1);
}
@Test
public void bigFalseTestDataProxyLibUtil45() {
	assertFalse(5899==5899+1);
}
@Test
public void bigFalseTestDataProxyLibUtil46() {
	assertFalse(23666==23666+1);
}
@Test
public void bigFalseTestDataProxyLibUtil47() {
	assertFalse(6361==6361+1);
}
@Test
public void bigFalseTestDataProxyLibUtil48() {
	assertFalse(6431==6431+1);
}
@Test
public void bigFalseTestDataProxyLibUtil49() {
	assertFalse(25213==25213+1);
}
@Test
public void bigFalseTestDataProxyLibUtil50() {
	assertFalse(5857==5857+1);
}
@Test
public void bigFalseTestDataProxyLibUtil51() {
	assertFalse(29739==29739+1);
}
@Test
public void bigFalseTestDataProxyLibUtil52() {
	assertFalse(19864==19864+1);
}
@Test
public void bigFalseTestDataProxyLibUtil53() {
	assertFalse(425==425+1);
}
@Test
public void bigFalseTestDataProxyLibUtil54() {
	assertFalse(9553==9553+1);
}
@Test
public void bigFalseTestDataProxyLibUtil55() {
	assertFalse(7403==7403+1);
}
}
