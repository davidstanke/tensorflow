IMAGE=3.jpg

java -cp ../bazel-bin/tensorflow/java/libtensorflow.jar -Djava.library.path=../bazel-bin/tensorflow/java -jar ../bazel-bin/next2018/tfjavademo_deploy.jar ./model ./img/$IMAGE
