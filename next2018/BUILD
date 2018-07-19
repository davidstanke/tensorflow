# Description:
# A simple Java application based on TensorFlow's java example

#java_binary(
#   name="demo",
#   srcs=["LabelImage.java"],
#   main_class = "org.tensorflow.examples.LabelImage",
#   deps = ["//tensorflow/java:tensorflow"],
#)

java_binary(
    name="tfjavademo",
    srcs=glob(["src/main/java/com/davidstanke/**/*.java"])
         + glob(["src/main/java/org/apache/**/*.java"]),
    main_class = "com.davidstanke.tfjavademo.TFJavaDemo",
    deps = ["//tensorflow/java:tensorflow"],
)


