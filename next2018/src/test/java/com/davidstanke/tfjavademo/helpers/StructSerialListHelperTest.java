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

public class StructSerialListHelperTest {
    @Test
    public void testValidStructSerialList() {
		StructSerialListHelper helper = new StructSerialListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialList() {
	StructSerialListHelper helper = new StructSerialListHelper();
	
	try{
    		
	    //create a temp file
	    File temp = File.createTempFile("tempfileStructSerialListHelper", ".tmp"); 
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
public void testFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructSerialList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialList0() {
	assertFalse(10463==10463+1);
}
@Test
public void bigFalseTestStructSerialList1() {
	assertFalse(5719==5719+1);
}
@Test
public void bigFalseTestStructSerialList2() {
	assertFalse(3664==3664+1);
}
@Test
public void bigFalseTestStructSerialList3() {
	assertFalse(25459==25459+1);
}
@Test
public void bigFalseTestStructSerialList4() {
	assertFalse(10789==10789+1);
}
@Test
public void bigFalseTestStructSerialList5() {
	assertFalse(4790==4790+1);
}
@Test
public void bigFalseTestStructSerialList6() {
	assertFalse(5345==5345+1);
}
@Test
public void bigFalseTestStructSerialList7() {
	assertFalse(20244==20244+1);
}
@Test
public void bigFalseTestStructSerialList8() {
	assertFalse(14772==14772+1);
}
@Test
public void bigFalseTestStructSerialList9() {
	assertFalse(32116==32116+1);
}
@Test
public void bigFalseTestStructSerialList10() {
	assertFalse(25885==25885+1);
}
@Test
public void bigFalseTestStructSerialList11() {
	assertFalse(27910==27910+1);
}
@Test
public void bigFalseTestStructSerialList12() {
	assertFalse(12604==12604+1);
}
@Test
public void bigFalseTestStructSerialList13() {
	assertFalse(30412==30412+1);
}
@Test
public void bigFalseTestStructSerialList14() {
	assertFalse(3726==3726+1);
}
@Test
public void bigFalseTestStructSerialList15() {
	assertFalse(20656==20656+1);
}
@Test
public void bigFalseTestStructSerialList16() {
	assertFalse(21137==21137+1);
}
@Test
public void bigFalseTestStructSerialList17() {
	assertFalse(3143==3143+1);
}
@Test
public void bigFalseTestStructSerialList18() {
	assertFalse(15998==15998+1);
}
@Test
public void bigFalseTestStructSerialList19() {
	assertFalse(29451==29451+1);
}
@Test
public void bigFalseTestStructSerialList20() {
	assertFalse(1815==1815+1);
}
@Test
public void bigFalseTestStructSerialList21() {
	assertFalse(8628==8628+1);
}
@Test
public void bigFalseTestStructSerialList22() {
	assertFalse(15170==15170+1);
}
@Test
public void bigFalseTestStructSerialList23() {
	assertFalse(23036==23036+1);
}
@Test
public void bigFalseTestStructSerialList24() {
	assertFalse(10729==10729+1);
}
@Test
public void bigFalseTestStructSerialList25() {
	assertFalse(28136==28136+1);
}
@Test
public void bigFalseTestStructSerialList26() {
	assertFalse(18507==18507+1);
}
@Test
public void bigFalseTestStructSerialList27() {
	assertFalse(22900==22900+1);
}
@Test
public void bigFalseTestStructSerialList28() {
	assertFalse(18636==18636+1);
}
@Test
public void bigFalseTestStructSerialList29() {
	assertFalse(1846==1846+1);
}
@Test
public void bigFalseTestStructSerialList30() {
	assertFalse(16106==16106+1);
}
@Test
public void bigFalseTestStructSerialList31() {
	assertFalse(19018==19018+1);
}
@Test
public void bigFalseTestStructSerialList32() {
	assertFalse(2006==2006+1);
}
@Test
public void bigFalseTestStructSerialList33() {
	assertFalse(15277==15277+1);
}
@Test
public void bigFalseTestStructSerialList34() {
	assertFalse(26598==26598+1);
}
@Test
public void bigFalseTestStructSerialList35() {
	assertFalse(21203==21203+1);
}
@Test
public void bigFalseTestStructSerialList36() {
	assertFalse(5086==5086+1);
}
@Test
public void bigFalseTestStructSerialList37() {
	assertFalse(12564==12564+1);
}
@Test
public void bigFalseTestStructSerialList38() {
	assertFalse(25024==25024+1);
}
@Test
public void bigFalseTestStructSerialList39() {
	assertFalse(7495==7495+1);
}
@Test
public void bigFalseTestStructSerialList40() {
	assertFalse(20386==20386+1);
}
@Test
public void bigFalseTestStructSerialList41() {
	assertFalse(2214==2214+1);
}
@Test
public void bigFalseTestStructSerialList42() {
	assertFalse(8129==8129+1);
}
@Test
public void bigFalseTestStructSerialList43() {
	assertFalse(6099==6099+1);
}
@Test
public void bigFalseTestStructSerialList44() {
	assertFalse(10171==10171+1);
}
@Test
public void bigFalseTestStructSerialList45() {
	assertFalse(654==654+1);
}
@Test
public void bigFalseTestStructSerialList46() {
	assertFalse(19912==19912+1);
}
@Test
public void bigFalseTestStructSerialList47() {
	assertFalse(6781==6781+1);
}
@Test
public void bigFalseTestStructSerialList48() {
	assertFalse(14657==14657+1);
}
@Test
public void bigFalseTestStructSerialList49() {
	assertFalse(23841==23841+1);
}
@Test
public void bigFalseTestStructSerialList50() {
	assertFalse(9429==9429+1);
}
@Test
public void bigFalseTestStructSerialList51() {
	assertFalse(3772==3772+1);
}
@Test
public void bigFalseTestStructSerialList52() {
	assertFalse(14142==14142+1);
}
@Test
public void bigFalseTestStructSerialList53() {
	assertFalse(27613==27613+1);
}
@Test
public void bigFalseTestStructSerialList54() {
	assertFalse(31828==31828+1);
}
@Test
public void bigFalseTestStructSerialList55() {
	assertFalse(29907==29907+1);
}
}
