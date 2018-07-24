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

public class StreamMapSerialWriteHelperTest {
    @Test
    public void testValidStreamMapSerialWrite() {
		StreamMapSerialWriteHelper helper = new StreamMapSerialWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamMapSerialWrite() {
	StreamMapSerialWriteHelper helper = new StreamMapSerialWriteHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStreamMapSerialWriteHelper", ".tmp"); 
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
public void testFalseStreamMapSerialWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStreamMapSerialWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStreamMapSerialWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamMapSerialWrite0() {
	assertFalse(8498==8498+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite1() {
	assertFalse(4839==4839+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite2() {
	assertFalse(4731==4731+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite3() {
	assertFalse(5233==5233+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite4() {
	assertFalse(16020==16020+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite5() {
	assertFalse(30481==30481+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite6() {
	assertFalse(9362==9362+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite7() {
	assertFalse(17399==17399+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite8() {
	assertFalse(21701==21701+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite9() {
	assertFalse(3489==3489+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite10() {
	assertFalse(29051==29051+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite11() {
	assertFalse(14758==14758+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite12() {
	assertFalse(6184==6184+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite13() {
	assertFalse(29495==29495+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite14() {
	assertFalse(21978==21978+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite15() {
	assertFalse(14846==14846+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite16() {
	assertFalse(11964==11964+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite17() {
	assertFalse(26284==26284+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite18() {
	assertFalse(4893==4893+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite19() {
	assertFalse(14925==14925+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite20() {
	assertFalse(3370==3370+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite21() {
	assertFalse(3895==3895+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite22() {
	assertFalse(12648==12648+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite23() {
	assertFalse(31286==31286+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite24() {
	assertFalse(6286==6286+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite25() {
	assertFalse(2114==2114+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite26() {
	assertFalse(5188==5188+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite27() {
	assertFalse(14563==14563+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite28() {
	assertFalse(6405==6405+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite29() {
	assertFalse(20234==20234+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite30() {
	assertFalse(11784==11784+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite31() {
	assertFalse(522==522+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite32() {
	assertFalse(18683==18683+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite33() {
	assertFalse(28153==28153+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite34() {
	assertFalse(32259==32259+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite35() {
	assertFalse(20129==20129+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite36() {
	assertFalse(3377==3377+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite37() {
	assertFalse(451==451+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite38() {
	assertFalse(17775==17775+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite39() {
	assertFalse(30048==30048+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite40() {
	assertFalse(8593==8593+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite41() {
	assertFalse(29762==29762+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite42() {
	assertFalse(7957==7957+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite43() {
	assertFalse(9979==9979+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite44() {
	assertFalse(18098==18098+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite45() {
	assertFalse(2322==2322+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite46() {
	assertFalse(26047==26047+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite47() {
	assertFalse(29212==29212+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite48() {
	assertFalse(15401==15401+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite49() {
	assertFalse(6124==6124+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite50() {
	assertFalse(5474==5474+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite51() {
	assertFalse(2850==2850+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite52() {
	assertFalse(5013==5013+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite53() {
	assertFalse(4291==4291+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite54() {
	assertFalse(4872==4872+1);
}
@Test
public void bigFalseTestStreamMapSerialWrite55() {
	assertFalse(21404==21404+1);
}
}
