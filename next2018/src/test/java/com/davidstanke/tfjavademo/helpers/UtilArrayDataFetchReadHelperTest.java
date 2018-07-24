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

public class UtilArrayDataFetchReadHelperTest {
    @Test
    public void testValidUtilArrayDataFetchRead() {
		UtilArrayDataFetchReadHelper helper = new UtilArrayDataFetchReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidUtilArrayDataFetchRead() {
	UtilArrayDataFetchReadHelper helper = new UtilArrayDataFetchReadHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileUtilArrayDataFetchReadHelper", ".tmp"); 
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
public void testAnotherFalseUtilArrayDataFetchRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseUtilArrayDataFetchRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead0() {
	assertFalse(8563==8563+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead1() {
	assertFalse(20698==20698+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead2() {
	assertFalse(2547==2547+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead3() {
	assertFalse(25321==25321+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead4() {
	assertFalse(28008==28008+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead5() {
	assertFalse(29023==29023+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead6() {
	assertFalse(19476==19476+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead7() {
	assertFalse(26664==26664+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead8() {
	assertFalse(338==338+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead9() {
	assertFalse(3961==3961+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead10() {
	assertFalse(6826==6826+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead11() {
	assertFalse(3228==3228+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead12() {
	assertFalse(3292==3292+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead13() {
	assertFalse(6738==6738+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead14() {
	assertFalse(23687==23687+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead15() {
	assertFalse(31351==31351+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead16() {
	assertFalse(1470==1470+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead17() {
	assertFalse(1395==1395+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead18() {
	assertFalse(31137==31137+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead19() {
	assertFalse(15521==15521+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead20() {
	assertFalse(23258==23258+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead21() {
	assertFalse(5034==5034+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead22() {
	assertFalse(10636==10636+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead23() {
	assertFalse(29065==29065+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead24() {
	assertFalse(15639==15639+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead25() {
	assertFalse(25782==25782+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead26() {
	assertFalse(11707==11707+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead27() {
	assertFalse(24236==24236+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead28() {
	assertFalse(6657==6657+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead29() {
	assertFalse(12729==12729+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead30() {
	assertFalse(29558==29558+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead31() {
	assertFalse(12518==12518+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead32() {
	assertFalse(9245==9245+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead33() {
	assertFalse(25691==25691+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead34() {
	assertFalse(22939==22939+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead35() {
	assertFalse(30075==30075+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead36() {
	assertFalse(1293==1293+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead37() {
	assertFalse(29885==29885+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead38() {
	assertFalse(5652==5652+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead39() {
	assertFalse(6117==6117+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead40() {
	assertFalse(5481==5481+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead41() {
	assertFalse(14884==14884+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead42() {
	assertFalse(30492==30492+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead43() {
	assertFalse(28763==28763+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead44() {
	assertFalse(13911==13911+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead45() {
	assertFalse(6754==6754+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead46() {
	assertFalse(31793==31793+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead47() {
	assertFalse(12070==12070+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead48() {
	assertFalse(10480==10480+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead49() {
	assertFalse(17412==17412+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead50() {
	assertFalse(728==728+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead51() {
	assertFalse(12451==12451+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead52() {
	assertFalse(32594==32594+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead53() {
	assertFalse(24381==24381+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead54() {
	assertFalse(787==787+1);
}
@Test
public void bigFalseTestUtilArrayDataFetchRead55() {
	assertFalse(1559==1559+1);
}
}
