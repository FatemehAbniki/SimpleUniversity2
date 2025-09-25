public class Teacher {
    String name;
    String family;
    String nationalCode;
    String teacherCode;

     public Teacher(String name, String family, String nationalCode, String teacherCode) {
         this.name = name;
         this.family = family;
         this.nationalCode = nationalCode;
         this.teacherCode = teacherCode;
     }

     public String toString() {
         return name + "," + family + "," + nationalCode + "," + teacherCode;
     }

}
