#!/bin/sh

TARGETDIR_MAIN=~/src/davidstanke/tensorflow/next2018/src/main/java/com/davidstanke/tfjavademo/helpers
TARGETDIR_TEST=~/src/davidstanke/tensorflow/next2018/src/test/java/com/davidstanke/tfjavademo/helpers
BUILD_CONTENTS=add_to_buildfile.txt

mkdir -p $TARGETDIR_MAIN
mkdir -p $TARGETDIR_TEST
rm $BUILD_CONTENTS
touch $BUILD_CONTENTS

for i in 'ProxyStringIOWriteFetch' 'APIProcArrayListArray' 'TensorNumMapListStream' 'TensorLibFetchArrayMap' 'APIProcWriteStringFetch' 'StructProxyStructStructStream' 'StringUtilDataWriteProxy' 'StreamListLibMapLib' 'StructAPIIODataProc' 'AsyncStreamProxyAsyncArray' 'MapReadProcIOFetch' 'FetchFetchFetchAsyncTensor' 'AsyncStreamProcUtilNum' 'AsyncUtilIOAsyncAPI' 'SerialProxyTensorStructNum' 'StringNumDataReadFetch' 'ArrayStreamStreamAPIWrite' 'WriteLibArrayWriteMap' 'ProxyArrayUtilReadIO' 'NumWriteWriteArraySerial' 'TensorProxyMapIOIO' 'ProxyAsyncLibIOList' 'WriteUtilUtilIOArray' 'DataProcProcStructSerial' 'ProcProxyMapProxyStruct' 'ProcMapNumProcStream' 'APIAPISerialAsyncWrite' 'MapAsyncArrayStructRead' 'LibIOListAsyncData' 'NumTensorFetchReadTensor' 'ProcFetchMapDataStruct' 'ReadFetchDataStreamStruct' 'DataNumLibListWrite' 'TensorStructIOFetchString' 'IOIOLibAPILib' 'StructSerialFetchMapMap' 'NumAsyncMapIOFetch' 'ListStringArrayMapFetch' 'ReadDataStringFetchArray' 'TensorArrayMapDataList' 'UtilWriteStringUtilArray' 'StructWriteUtilAsyncMap' 'ProxyAPIReadSerialArray' 'APIWriteProcProxyTensor' 'StructTensorUtilUtilAsync' 'ProcStringDataIOTensor' 'StreamNumStreamStringIO' 'LibLibProcUtilStream' 'LibStructArrayTensorMap' 'ProxyProcNumAsyncStruct' 'APIStreamProxyUtilArray' 'DataStreamListAsyncList' 'StructProxyProcArrayData' 'StreamFetchTensorSerialData' 'APITensorDataListLib' 'TensorMapFetchAsyncStream' 'StructStructLibIOIO' 'TensorTensorSerialIOAsync' 'DataAsyncTensorIOWrite' 'APIAPIReadDataIO' 'AsyncStreamAsyncWriteWrite' 'StringMapMapProcProc' 'IOTensorStreamListIO' 'IOIOTensorFetchString' 'TensorStructStreamStringRead' 'ProxyListArrayFetchList' 'UtilProxyTensorSerialTensor' 'IOAPIAPIReadIO' 'AsyncUtilNumListList' 'APINumStreamListFetch' 'DataStructListStreamTensor' 'UtilDataSerialWriteAPI' 'StreamIODataMapStream' 'FetchAPILibStringNum' 'ArrayStringStreamTensorFetch' 'NumDataAPIStringList' 'StreamAPIProxyArrayProxy' 'TensorSerialMapList' 'DataWriteIOArray' 'SerialLibNumProc' 'APIAPIAPIList' 'ProcMapAPIAsync' 'FetchNumStructList' 'MapListAPIUtil' 'ProxyMapMapProc' 'AsyncFetchSerialAPI' 'ListReadDataArray' 'AsyncAsyncNumFetch' 'ProxySerialStringAsync' 'DataTensorProxyProxy' 'DataDataStreamUtil' 'IOMapSerialSerial' 'IONumStringRead' 'StructFetchAsync' 'LibProxyList' 'IOMapFetch' 'AsyncAPINum' 'ListStructStruct' 'IOFetchAsync' 'UtilStringProxy'

do
THIS_METHOD=${i}Helper
FILENAME_MAIN=${TARGETDIR_MAIN}/${THIS_METHOD}.java

echo "writing $FILENAME_MAIN"

cat > $FILENAME_MAIN << EOF
package com.davidstanke.tfjavademo.helpers;

public class ${THIS_METHOD} {
	public static String help() {
		return "valid";
	}
}
EOF

FILENAME_TEST=${TARGETDIR_TEST}/${THIS_METHOD}Test.java

echo "writing $FILENAME_TEST"

cat > $FILENAME_TEST << EOF
package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ${THIS_METHOD}Test {
    @Test
    public void testHelper${i}() {
		${THIS_METHOD} helper = new ${THIS_METHOD}();
		assertEquals(helper.help(),"valid");
    }
}

EOF

cat >> $BUILD_CONTENTS << EOF
java_library(name="${THIS_METHOD}",srcs=["src/main/java/com/davidstanke/tfjavademo/helpers/${THIS_METHOD}.java"])
java_test(name="${THIS_METHOD}Test",srcs=["src/test/java/com/davidstanke/tfjavademo/helpers/${THIS_METHOD}Test.java"],deps=[":${THIS_METHOD}"])
EOF
	
done