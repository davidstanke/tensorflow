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

public class TensorStructTensorProxyHelperTest {
    @Test
    public void testValidTensorStructTensorProxy() {
		TensorStructTensorProxyHelper helper = new TensorStructTensorProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidTensorStructTensorProxy() {
	TensorStructTensorProxyHelper helper = new TensorStructTensorProxyHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileTensorStructTensorProxyHelper", ".tmp"); 
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
public void testFalseTensorStructTensorProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseTensorStructTensorProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseTensorStructTensorProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseTensorStructTensorProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestTensorStructTensorProxy0() {
	assertFalse(28396==28396+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy1() {
	assertFalse(1103==1103+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy2() {
	assertFalse(15876==15876+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy3() {
	assertFalse(31239==31239+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy4() {
	assertFalse(25690==25690+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy5() {
	assertFalse(4580==4580+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy6() {
	assertFalse(19242==19242+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy7() {
	assertFalse(22099==22099+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy8() {
	assertFalse(14100==14100+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy9() {
	assertFalse(19537==19537+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy10() {
	assertFalse(16440==16440+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy11() {
	assertFalse(19819==19819+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy12() {
	assertFalse(5722==5722+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy13() {
	assertFalse(7270==7270+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy14() {
	assertFalse(4993==4993+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy15() {
	assertFalse(20917==20917+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy16() {
	assertFalse(20570==20570+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy17() {
	assertFalse(32395==32395+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy18() {
	assertFalse(27725==27725+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy19() {
	assertFalse(23844==23844+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy20() {
	assertFalse(14325==14325+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy21() {
	assertFalse(671==671+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy22() {
	assertFalse(7047==7047+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy23() {
	assertFalse(14970==14970+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy24() {
	assertFalse(6988==6988+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy25() {
	assertFalse(28052==28052+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy26() {
	assertFalse(29483==29483+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy27() {
	assertFalse(9790==9790+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy28() {
	assertFalse(5900==5900+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy29() {
	assertFalse(22727==22727+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy30() {
	assertFalse(10350==10350+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy31() {
	assertFalse(893==893+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy32() {
	assertFalse(21118==21118+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy33() {
	assertFalse(27424==27424+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy34() {
	assertFalse(11434==11434+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy35() {
	assertFalse(8256==8256+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy36() {
	assertFalse(28750==28750+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy37() {
	assertFalse(2030==2030+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy38() {
	assertFalse(10512==10512+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy39() {
	assertFalse(17872==17872+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy40() {
	assertFalse(16406==16406+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy41() {
	assertFalse(3967==3967+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy42() {
	assertFalse(2316==2316+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy43() {
	assertFalse(4268==4268+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy44() {
	assertFalse(31922==31922+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy45() {
	assertFalse(3458==3458+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy46() {
	assertFalse(16247==16247+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy47() {
	assertFalse(19527==19527+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy48() {
	assertFalse(9027==9027+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy49() {
	assertFalse(28957==28957+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy50() {
	assertFalse(12927==12927+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy51() {
	assertFalse(20098==20098+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy52() {
	assertFalse(12031==12031+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy53() {
	assertFalse(10958==10958+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy54() {
	assertFalse(31318==31318+1);
}
@Test
public void bigFalseTestTensorStructTensorProxy55() {
	assertFalse(3820==3820+1);
}
}
