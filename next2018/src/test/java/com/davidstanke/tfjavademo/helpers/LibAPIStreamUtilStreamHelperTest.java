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

public class LibAPIStreamUtilStreamHelperTest {
    @Test
    public void testValidLibAPIStreamUtilStream() {
		LibAPIStreamUtilStreamHelper helper = new LibAPIStreamUtilStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibAPIStreamUtilStream() {
	LibAPIStreamUtilStreamHelper helper = new LibAPIStreamUtilStreamHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileLibAPIStreamUtilStreamHelper", ".tmp"); 
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
public void testOtherFalseLibAPIStreamUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLibAPIStreamUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream0() {
	assertFalse(30696==30696+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream1() {
	assertFalse(13311==13311+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream2() {
	assertFalse(7148==7148+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream3() {
	assertFalse(30604==30604+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream4() {
	assertFalse(28851==28851+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream5() {
	assertFalse(14065==14065+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream6() {
	assertFalse(29309==29309+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream7() {
	assertFalse(6588==6588+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream8() {
	assertFalse(31633==31633+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream9() {
	assertFalse(15911==15911+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream10() {
	assertFalse(19539==19539+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream11() {
	assertFalse(17973==17973+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream12() {
	assertFalse(10899==10899+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream13() {
	assertFalse(17144==17144+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream14() {
	assertFalse(1550==1550+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream15() {
	assertFalse(24714==24714+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream16() {
	assertFalse(27871==27871+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream17() {
	assertFalse(13074==13074+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream18() {
	assertFalse(9551==9551+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream19() {
	assertFalse(6393==6393+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream20() {
	assertFalse(11070==11070+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream21() {
	assertFalse(16403==16403+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream22() {
	assertFalse(17958==17958+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream23() {
	assertFalse(27496==27496+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream24() {
	assertFalse(8547==8547+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream25() {
	assertFalse(3303==3303+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream26() {
	assertFalse(29503==29503+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream27() {
	assertFalse(4641==4641+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream28() {
	assertFalse(32764==32764+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream29() {
	assertFalse(21732==21732+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream30() {
	assertFalse(21708==21708+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream31() {
	assertFalse(26701==26701+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream32() {
	assertFalse(9082==9082+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream33() {
	assertFalse(26790==26790+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream34() {
	assertFalse(25138==25138+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream35() {
	assertFalse(30769==30769+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream36() {
	assertFalse(27553==27553+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream37() {
	assertFalse(7340==7340+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream38() {
	assertFalse(627==627+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream39() {
	assertFalse(12588==12588+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream40() {
	assertFalse(32719==32719+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream41() {
	assertFalse(1455==1455+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream42() {
	assertFalse(18270==18270+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream43() {
	assertFalse(364==364+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream44() {
	assertFalse(3084==3084+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream45() {
	assertFalse(7878==7878+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream46() {
	assertFalse(12152==12152+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream47() {
	assertFalse(20340==20340+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream48() {
	assertFalse(17109==17109+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream49() {
	assertFalse(13627==13627+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream50() {
	assertFalse(6824==6824+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream51() {
	assertFalse(3918==3918+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream52() {
	assertFalse(12200==12200+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream53() {
	assertFalse(13866==13866+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream54() {
	assertFalse(23974==23974+1);
}
@Test
public void bigFalseTestLibAPIStreamUtilStream55() {
	assertFalse(28559==28559+1);
}
}
