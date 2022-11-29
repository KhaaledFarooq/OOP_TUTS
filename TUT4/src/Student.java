public class Student implements Printable{
    String name;
    String grades[] = new String[5];
    Student(String name,String[] grade){
        this.name =name;
        for(int i=0;i<5;i++){
            grades[i]=grade[i];
        }
    }
    public void print(){
        System.out.println("name: " + name);
        System.out.print("grades: ");
        for(int i=0;i<5;i++){
            System.out.print(" "+grades[i]+" ");;
        }
    }
}
