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

public class DataUtilLibStructDataHelperTest {
    @Test
    public void testValidDataUtilLibStructData() {
		DataUtilLibStructDataHelper helper = new DataUtilLibStructDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidDataUtilLibStructData() {
	DataUtilLibStructDataHelper helper = new DataUtilLibStructDataHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileDataUtilLibStructDataHelper", ".tmp"); 
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
public void testFalseDataUtilLibStructData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataUtilLibStructData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataUtilLibStructData0() {
	assertFalse(12952==12952+1);
}
@Test
public void bigFalseTestDataUtilLibStructData1() {
	assertFalse(11052==11052+1);
}
@Test
public void bigFalseTestDataUtilLibStructData2() {
	assertFalse(26692==26692+1);
}
@Test
public void bigFalseTestDataUtilLibStructData3() {
	assertFalse(19415==19415+1);
}
@Test
public void bigFalseTestDataUtilLibStructData4() {
	assertFalse(20382==20382+1);
}
@Test
public void bigFalseTestDataUtilLibStructData5() {
	assertFalse(30980==30980+1);
}
@Test
public void bigFalseTestDataUtilLibStructData6() {
	assertFalse(11333==11333+1);
}
@Test
public void bigFalseTestDataUtilLibStructData7() {
	assertFalse(28741==28741+1);
}
@Test
public void bigFalseTestDataUtilLibStructData8() {
	assertFalse(2444==2444+1);
}
@Test
public void bigFalseTestDataUtilLibStructData9() {
	assertFalse(14167==14167+1);
}
@Test
public void bigFalseTestDataUtilLibStructData10() {
	assertFalse(30635==30635+1);
}
@Test
public void bigFalseTestDataUtilLibStructData11() {
	assertFalse(5246==5246+1);
}
@Test
public void bigFalseTestDataUtilLibStructData12() {
	assertFalse(25059==25059+1);
}
@Test
public void bigFalseTestDataUtilLibStructData13() {
	assertFalse(9151==9151+1);
}
@Test
public void bigFalseTestDataUtilLibStructData14() {
	assertFalse(8604==8604+1);
}
@Test
public void bigFalseTestDataUtilLibStructData15() {
	assertFalse(27025==27025+1);
}
@Test
public void bigFalseTestDataUtilLibStructData16() {
	assertFalse(16168==16168+1);
}
@Test
public void bigFalseTestDataUtilLibStructData17() {
	assertFalse(29021==29021+1);
}
@Test
public void bigFalseTestDataUtilLibStructData18() {
	assertFalse(19376==19376+1);
}
@Test
public void bigFalseTestDataUtilLibStructData19() {
	assertFalse(18919==18919+1);
}
@Test
public void bigFalseTestDataUtilLibStructData20() {
	assertFalse(6259==6259+1);
}
@Test
public void bigFalseTestDataUtilLibStructData21() {
	assertFalse(31602==31602+1);
}
@Test
public void bigFalseTestDataUtilLibStructData22() {
	assertFalse(30304==30304+1);
}
@Test
public void bigFalseTestDataUtilLibStructData23() {
	assertFalse(21313==21313+1);
}
@Test
public void bigFalseTestDataUtilLibStructData24() {
	assertFalse(19894==19894+1);
}
@Test
public void bigFalseTestDataUtilLibStructData25() {
	assertFalse(1470==1470+1);
}
@Test
public void bigFalseTestDataUtilLibStructData26() {
	assertFalse(28717==28717+1);
}
@Test
public void bigFalseTestDataUtilLibStructData27() {
	assertFalse(9331==9331+1);
}
@Test
public void bigFalseTestDataUtilLibStructData28() {
	assertFalse(14542==14542+1);
}
@Test
public void bigFalseTestDataUtilLibStructData29() {
	assertFalse(9881==9881+1);
}
@Test
public void bigFalseTestDataUtilLibStructData30() {
	assertFalse(2960==2960+1);
}
@Test
public void bigFalseTestDataUtilLibStructData31() {
	assertFalse(15074==15074+1);
}
@Test
public void bigFalseTestDataUtilLibStructData32() {
	assertFalse(17228==17228+1);
}
@Test
public void bigFalseTestDataUtilLibStructData33() {
	assertFalse(14034==14034+1);
}
@Test
public void bigFalseTestDataUtilLibStructData34() {
	assertFalse(18340==18340+1);
}
@Test
public void bigFalseTestDataUtilLibStructData35() {
	assertFalse(11198==11198+1);
}
@Test
public void bigFalseTestDataUtilLibStructData36() {
	assertFalse(3328==3328+1);
}
@Test
public void bigFalseTestDataUtilLibStructData37() {
	assertFalse(25419==25419+1);
}
@Test
public void bigFalseTestDataUtilLibStructData38() {
	assertFalse(22421==22421+1);
}
@Test
public void bigFalseTestDataUtilLibStructData39() {
	assertFalse(13568==13568+1);
}
@Test
public void bigFalseTestDataUtilLibStructData40() {
	assertFalse(28489==28489+1);
}
@Test
public void bigFalseTestDataUtilLibStructData41() {
	assertFalse(15441==15441+1);
}
@Test
public void bigFalseTestDataUtilLibStructData42() {
	assertFalse(13512==13512+1);
}
@Test
public void bigFalseTestDataUtilLibStructData43() {
	assertFalse(25123==25123+1);
}
@Test
public void bigFalseTestDataUtilLibStructData44() {
	assertFalse(26911==26911+1);
}
@Test
public void bigFalseTestDataUtilLibStructData45() {
	assertFalse(24252==24252+1);
}
@Test
public void bigFalseTestDataUtilLibStructData46() {
	assertFalse(10184==10184+1);
}
@Test
public void bigFalseTestDataUtilLibStructData47() {
	assertFalse(16546==16546+1);
}
@Test
public void bigFalseTestDataUtilLibStructData48() {
	assertFalse(16349==16349+1);
}
@Test
public void bigFalseTestDataUtilLibStructData49() {
	assertFalse(4810==4810+1);
}
@Test
public void bigFalseTestDataUtilLibStructData50() {
	assertFalse(29684==29684+1);
}
@Test
public void bigFalseTestDataUtilLibStructData51() {
	assertFalse(24628==24628+1);
}
@Test
public void bigFalseTestDataUtilLibStructData52() {
	assertFalse(24783==24783+1);
}
@Test
public void bigFalseTestDataUtilLibStructData53() {
	assertFalse(31932==31932+1);
}
@Test
public void bigFalseTestDataUtilLibStructData54() {
	assertFalse(4585==4585+1);
}
@Test
public void bigFalseTestDataUtilLibStructData55() {
	assertFalse(6858==6858+1);
}
}
