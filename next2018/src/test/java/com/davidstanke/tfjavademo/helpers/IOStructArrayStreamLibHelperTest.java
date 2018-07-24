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

public class IOStructArrayStreamLibHelperTest {
    @Test
    public void testValidIOStructArrayStreamLib() {
		IOStructArrayStreamLibHelper helper = new IOStructArrayStreamLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIOStructArrayStreamLib() {
	IOStructArrayStreamLibHelper helper = new IOStructArrayStreamLibHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileIOStructArrayStreamLibHelper", ".tmp"); 
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
public void testFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOStructArrayStreamLib0() {
	assertFalse(1608==1608+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib1() {
	assertFalse(18994==18994+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib2() {
	assertFalse(24287==24287+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib3() {
	assertFalse(30479==30479+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib4() {
	assertFalse(19334==19334+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib5() {
	assertFalse(6429==6429+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib6() {
	assertFalse(6937==6937+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib7() {
	assertFalse(20360==20360+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib8() {
	assertFalse(13480==13480+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib9() {
	assertFalse(24063==24063+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib10() {
	assertFalse(17298==17298+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib11() {
	assertFalse(22474==22474+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib12() {
	assertFalse(3225==3225+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib13() {
	assertFalse(20728==20728+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib14() {
	assertFalse(26959==26959+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib15() {
	assertFalse(4520==4520+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib16() {
	assertFalse(4133==4133+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib17() {
	assertFalse(8539==8539+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib18() {
	assertFalse(1541==1541+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib19() {
	assertFalse(20443==20443+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib20() {
	assertFalse(2883==2883+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib21() {
	assertFalse(5897==5897+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib22() {
	assertFalse(14404==14404+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib23() {
	assertFalse(15553==15553+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib24() {
	assertFalse(32550==32550+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib25() {
	assertFalse(28044==28044+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib26() {
	assertFalse(5728==5728+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib27() {
	assertFalse(4311==4311+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib28() {
	assertFalse(7426==7426+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib29() {
	assertFalse(17651==17651+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib30() {
	assertFalse(17442==17442+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib31() {
	assertFalse(13560==13560+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib32() {
	assertFalse(8607==8607+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib33() {
	assertFalse(17520==17520+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib34() {
	assertFalse(14131==14131+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib35() {
	assertFalse(19539==19539+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib36() {
	assertFalse(23967==23967+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib37() {
	assertFalse(19122==19122+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib38() {
	assertFalse(22084==22084+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib39() {
	assertFalse(25133==25133+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib40() {
	assertFalse(30350==30350+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib41() {
	assertFalse(18435==18435+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib42() {
	assertFalse(24318==24318+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib43() {
	assertFalse(14172==14172+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib44() {
	assertFalse(11438==11438+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib45() {
	assertFalse(7714==7714+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib46() {
	assertFalse(16045==16045+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib47() {
	assertFalse(27519==27519+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib48() {
	assertFalse(12672==12672+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib49() {
	assertFalse(8670==8670+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib50() {
	assertFalse(18860==18860+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib51() {
	assertFalse(32254==32254+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib52() {
	assertFalse(23314==23314+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib53() {
	assertFalse(6775==6775+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib54() {
	assertFalse(32142==32142+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib55() {
	assertFalse(25285==25285+1);
}
}
