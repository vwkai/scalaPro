import scala.collection.mutable.ListBuffer;

//创建list
val list = ListBuffer[Int]()
for( i <- 1 to 100){
  list += i
}

//求和方式1
var sum1 = list.sum

//求和方式2
var x = 0
var sum2 = 0
var list_length = list.length
while(x < list_length) {
  sum2 += list(x)
  x += 1
}

//求和方式3
var sum3 = 0
list.foreach(x=> sum3 += x)

//求和方式4
var sum4 = 0
sum4 = list.reduce(_ + _)

//结果打印
println("求和方式1的结果:"+sum1)
println("求和方式2的结果:"+sum2)
println("求和方式3的结果:"+sum3)
println("求和方式4的结果:"+sum4)
