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

public class FetchUtilWriteMapStructHelperTest {
    @Test
    public void testValidFetchUtilWriteMapStruct() {
		FetchUtilWriteMapStructHelper helper = new FetchUtilWriteMapStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidFetchUtilWriteMapStruct() {
	FetchUtilWriteMapStructHelper helper = new FetchUtilWriteMapStructHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileFetchUtilWriteMapStructHelper", ".tmp"); 
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
public void testFalseFetchUtilWriteMapStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseFetchUtilWriteMapStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseFetchUtilWriteMapStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct0() {
	assertFalse(24911==24911+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct1() {
	assertFalse(29531==29531+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct2() {
	assertFalse(29854==29854+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct3() {
	assertFalse(26133==26133+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct4() {
	assertFalse(3234==3234+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct5() {
	assertFalse(24251==24251+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct6() {
	assertFalse(4103==4103+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct7() {
	assertFalse(31244==31244+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct8() {
	assertFalse(1400==1400+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct9() {
	assertFalse(8376==8376+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct10() {
	assertFalse(5483==5483+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct11() {
	assertFalse(5878==5878+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct12() {
	assertFalse(3848==3848+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct13() {
	assertFalse(17840==17840+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct14() {
	assertFalse(11809==11809+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct15() {
	assertFalse(25149==25149+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct16() {
	assertFalse(28592==28592+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct17() {
	assertFalse(20080==20080+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct18() {
	assertFalse(14414==14414+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct19() {
	assertFalse(11619==11619+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct20() {
	assertFalse(23473==23473+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct21() {
	assertFalse(27198==27198+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct22() {
	assertFalse(9728==9728+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct23() {
	assertFalse(31987==31987+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct24() {
	assertFalse(20396==20396+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct25() {
	assertFalse(17826==17826+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct26() {
	assertFalse(12811==12811+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct27() {
	assertFalse(4648==4648+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct28() {
	assertFalse(5856==5856+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct29() {
	assertFalse(31225==31225+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct30() {
	assertFalse(1700==1700+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct31() {
	assertFalse(25438==25438+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct32() {
	assertFalse(31009==31009+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct33() {
	assertFalse(27063==27063+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct34() {
	assertFalse(12734==12734+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct35() {
	assertFalse(12092==12092+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct36() {
	assertFalse(19607==19607+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct37() {
	assertFalse(5503==5503+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct38() {
	assertFalse(808==808+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct39() {
	assertFalse(5791==5791+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct40() {
	assertFalse(26428==26428+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct41() {
	assertFalse(13796==13796+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct42() {
	assertFalse(12387==12387+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct43() {
	assertFalse(26949==26949+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct44() {
	assertFalse(11283==11283+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct45() {
	assertFalse(9725==9725+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct46() {
	assertFalse(23108==23108+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct47() {
	assertFalse(4414==4414+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct48() {
	assertFalse(12329==12329+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct49() {
	assertFalse(27307==27307+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct50() {
	assertFalse(20558==20558+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct51() {
	assertFalse(18707==18707+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct52() {
	assertFalse(13133==13133+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct53() {
	assertFalse(25257==25257+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct54() {
	assertFalse(11725==11725+1);
}
@Test
public void bigFalseTestFetchUtilWriteMapStruct55() {
	assertFalse(2227==2227+1);
}
}
