public class Test01 {
    public static void main(String[] args) {
        student[] studentsaving = new student[3];
        student s1 = new student("张三",1,100);
        student s2 = new student("李四",2,60);
        student s3 = new student("王五",3,80);
        studentsaving[0] = s1;
        studentsaving[1] = s2;
        studentsaving[2] = s3;
        for (int i = 0; i <studentsaving.length-1; i++) {
            for (int j = 0; j<studentsaving.length-1-i;j++){
                //asc if studentsaving[j]>j+1 就换位置
                if (studentsaving[j].compareTo(studentsaving[j+1])>0){
                    student temp = studentsaving[j];
                    studentsaving[j] = studentsaving[j+1];
                    studentsaving[j+1] = temp;
                }
            }
        }
        System.out.println(studentsaving[0]);
        System.out.println(studentsaving[1]);
        System.out.println(studentsaving[2]);
    }

}
