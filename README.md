Call scala script : type "scala script.scala args"

Call scala object :
1 - type "scalac Object.scala"
2- type "scala"
3- type "Object.method(args)"

compilation :

scalac -d classes src/main/scala/com/palvair/scala/*

execution :
cd classes
scala com.palvair.scala.HelloWorld

run maven compilated classes :

cd target/classes
scala com.palvair.scala.Application
