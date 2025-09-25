public class Student {
    String name;
    String family;
    String nationalCode;

     public Student(String name, String family, String nationalCode) {
          this.name = name;
          this.family = family;
          this.nationalCode = nationalCode;
     }

    @Override
    public String toString() {
            return name + "," + family + "," + nationalCode;
    }

}
