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

public class StringProxyAPIFetchAPIHelperTest {
    @Test
    public void testValidStringProxyAPIFetchAPI() {
		StringProxyAPIFetchAPIHelper helper = new StringProxyAPIFetchAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringProxyAPIFetchAPI() {
	StringProxyAPIFetchAPIHelper helper = new StringProxyAPIFetchAPIHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStringProxyAPIFetchAPIHelper", ".tmp"); 
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
public void testFalseStringProxyAPIFetchAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringProxyAPIFetchAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringProxyAPIFetchAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI0() {
	assertFalse(5860==5860+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI1() {
	assertFalse(15500==15500+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI2() {
	assertFalse(20537==20537+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI3() {
	assertFalse(14252==14252+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI4() {
	assertFalse(833==833+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI5() {
	assertFalse(8547==8547+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI6() {
	assertFalse(30716==30716+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI7() {
	assertFalse(24832==24832+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI8() {
	assertFalse(32191==32191+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI9() {
	assertFalse(8405==8405+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI10() {
	assertFalse(20900==20900+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI11() {
	assertFalse(31689==31689+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI12() {
	assertFalse(6356==6356+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI13() {
	assertFalse(26057==26057+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI14() {
	assertFalse(27220==27220+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI15() {
	assertFalse(3167==3167+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI16() {
	assertFalse(22240==22240+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI17() {
	assertFalse(18586==18586+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI18() {
	assertFalse(28150==28150+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI19() {
	assertFalse(23824==23824+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI20() {
	assertFalse(7706==7706+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI21() {
	assertFalse(4755==4755+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI22() {
	assertFalse(11016==11016+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI23() {
	assertFalse(17408==17408+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI24() {
	assertFalse(32572==32572+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI25() {
	assertFalse(32041==32041+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI26() {
	assertFalse(1833==1833+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI27() {
	assertFalse(27334==27334+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI28() {
	assertFalse(15086==15086+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI29() {
	assertFalse(26875==26875+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI30() {
	assertFalse(12391==12391+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI31() {
	assertFalse(29640==29640+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI32() {
	assertFalse(12788==12788+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI33() {
	assertFalse(2186==2186+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI34() {
	assertFalse(5958==5958+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI35() {
	assertFalse(6482==6482+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI36() {
	assertFalse(11286==11286+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI37() {
	assertFalse(31416==31416+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI38() {
	assertFalse(32143==32143+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI39() {
	assertFalse(8825==8825+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI40() {
	assertFalse(8659==8659+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI41() {
	assertFalse(4354==4354+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI42() {
	assertFalse(9695==9695+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI43() {
	assertFalse(18866==18866+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI44() {
	assertFalse(29892==29892+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI45() {
	assertFalse(15741==15741+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI46() {
	assertFalse(28651==28651+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI47() {
	assertFalse(28977==28977+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI48() {
	assertFalse(17106==17106+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI49() {
	assertFalse(25745==25745+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI50() {
	assertFalse(28052==28052+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI51() {
	assertFalse(16643==16643+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI52() {
	assertFalse(16407==16407+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI53() {
	assertFalse(3704==3704+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI54() {
	assertFalse(15534==15534+1);
}
@Test
public void bigFalseTestStringProxyAPIFetchAPI55() {
	assertFalse(2794==2794+1);
}
}
