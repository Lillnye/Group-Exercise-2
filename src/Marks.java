abstract class  Marks {
    public abstract int getPercentage();
}

class A extends Marks{
    int marks1, marks2, marks3;
    A(int m1, int m2, int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    public int getPercentage(){
        return ((marks1+marks2+marks3)/3);
    }
}

class B extends Marks{
    int marks1, marks2, marks3, marks4;
    B(int m1, int m2, int m3, int m4){
        marks1=m1;
        marks2=m2;
        marks3=m3;
        marks4=m4;
    }

    public int getPercentage(){
        return ((marks1+marks2+marks3+marks4)/4);
    }
}

class implement {

    public static void main(String[] args) {
        A a = new A(100, 75, 100);
        System.out.println(a.getPercentage() + "%");
        B b = new B(50, 93, 90, 86);
        System.out.println(b.getPercentage() + "%");
    }
}