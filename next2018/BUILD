# Description:
# A simple Java application based on TensorFlow's java example

java_binary(
    name="tfjavademo",
    srcs=glob(["src/main/java/com/davidstanke/**/*.java"]),
    main_class = "com.davidstanke.tfjavademo.TFJavaDemo",
    deps = [":commons_lang3","//tensorflow/java:tensorflow"],
    data = [":images"]
#	deps=[":tensorflowjava",":commons_lang3"]
)

filegroup(
	name = "images",
	srcs = glob([
		"img/*",
	]),
)


java_library(
	name="commons_lang3",
	srcs=glob(["src/main/java/org/apache/**/*.java"]),
)

java_test(
	name="GreeterTest",
	srcs=["src/test/java/com/davidstanke/tfjavademo/GreeterTest.java"],
	deps=[":tfjavademo"]
)


java_test(name="AnnotationUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/AnnotationUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="ArchUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/ArchUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="ArrayUtilsAddTest", srcs=["src/test/java/org/apache/commons/lang3/ArrayUtilsAddTest.java"], deps=[":commons_lang3"],)
java_test(name="ArrayUtilsRemoveMultipleTest", srcs=["src/test/java/org/apache/commons/lang3/ArrayUtilsRemoveMultipleTest.java"], deps=[":commons_lang3"],)
java_test(name="ArrayUtilsRemoveTest", srcs=["src/test/java/org/apache/commons/lang3/ArrayUtilsRemoveTest.java"], deps=[":commons_lang3"],)
java_test(name="ArrayUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/ArrayUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="BitFieldTest", srcs=["src/test/java/org/apache/commons/lang3/BitFieldTest.java"], deps=[":commons_lang3"],)
java_test(name="CharEncodingTest", srcs=["src/test/java/org/apache/commons/lang3/CharEncodingTest.java"], deps=[":commons_lang3"],)
java_test(name="CharRangeTest", srcs=["src/test/java/org/apache/commons/lang3/CharRangeTest.java"], deps=[":commons_lang3"],)
java_test(name="CharSequenceUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/CharSequenceUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="CharSetTest", srcs=["src/test/java/org/apache/commons/lang3/CharSetTest.java"], deps=[":commons_lang3"],)
java_test(name="CharSetUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/CharSetUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="ClassPathUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/ClassPathUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="ConversionTest", srcs=["src/test/java/org/apache/commons/lang3/ConversionTest.java"], deps=[":commons_lang3"],)
java_test(name="EnumUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/EnumUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="JavaVersionTest", srcs=["src/test/java/org/apache/commons/lang3/JavaVersionTest.java"], deps=[":commons_lang3"],)
java_test(name="LocaleUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/LocaleUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="NotImplementedExceptionTest", srcs=["src/test/java/org/apache/commons/lang3/NotImplementedExceptionTest.java"], deps=[":commons_lang3"],)
java_test(name="ObjectUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/ObjectUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="RandomUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/RandomUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="RangeTest", srcs=["src/test/java/org/apache/commons/lang3/RangeTest.java"], deps=[":commons_lang3"],)
java_test(name="SerializationUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/SerializationUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="StringUtilsStartsEndsWithTest", srcs=["src/test/java/org/apache/commons/lang3/StringUtilsStartsEndsWithTest.java"], deps=[":commons_lang3"],)
java_test(name="StringUtilsSubstringTest", srcs=["src/test/java/org/apache/commons/lang3/StringUtilsSubstringTest.java"], deps=[":commons_lang3"],)
java_test(name="StringUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/StringUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="SystemUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/SystemUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="ThreadUtilsTest", srcs=["src/test/java/org/apache/commons/lang3/ThreadUtilsTest.java"], deps=[":commons_lang3"],)
java_test(name="ValidateTest", srcs=["src/test/java/org/apache/commons/lang3/ValidateTest.java"], deps=[":commons_lang3"],)
