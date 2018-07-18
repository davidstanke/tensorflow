IMAGE=3.jpg

java -cp ../bazel-bin/tensorflow/java/libtensorflow.jar -Djava.library.path=../bazel-bin/tensorflow/java -jar ../bazel-bin/tensorflow/java/src/main/java/org/tensorflow/examples/label_image_deploy.jar ./model ./img/$IMAGE
