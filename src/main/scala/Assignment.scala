import scala.language.postfixOps

//Task 1
50 until(101) toList

//Task 2
val Set_One = Set (11, 13, 15, 20, 10)
val set_Two = Set (10, 7, 8, 19, 10)
Set_One intersect  set_Two
Set_One &~  set_Two
set_Two &~  Set_One
Set_One &~  set_Two union  set_Two &~  Set_One

//Task 3
val A = Set (99, 10, 5, 5, 7, 10, 1)
val B = Set (10, 30, 50, 4, 5)
val C = A.union(B)
println(C)
C.head
C.last
C.take(5).last

//Task 4
case class Course(courseName: String,  coursePrice: Double)
def courseID(course: Course): Unit = {
  println("Course Name: "+course.courseName+ " Course ID: "+course.hashCode())
}

val ICE362S = Course("ICE362S Elective, FT",40000.0)
val ICE262S = Course("ICE262S Elective, FT,",35000.0)
val ICE152S = Course("ICE152S Elective, FT",30000.0)

println(ICE362S.courseName + ", Course Price : R"+ICE362S.coursePrice+"0")
courseID(ICE362S)

println(ICE262S.courseName + ", Course Price : R"+ICE262S.coursePrice+"0")
courseID(ICE262S)

println(ICE152S.courseName + ", Course Price : R"+ICE152S.coursePrice+"0")
courseID(ICE152S)
