class Person2(val firstName:String = "Peter", val lastName:String = "Parker") {
   // by default getters for val n getters n setters for vars
   //overiding setter n getter
   var nickName:String? = null
      set(value) {
         field = value
         println("new nick name is $value")
      }
      get() {
         println("returned nickname is $field")
         return field
      }

   fun printInfo() {
      val nickNameToPrint = nickName ?: "no nick name" //elvis operator
      println("$firstName $nickNameToPrint $lastName")
   }

}