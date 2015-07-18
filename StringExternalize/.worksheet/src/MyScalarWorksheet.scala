object MyScalarWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ))}
}
