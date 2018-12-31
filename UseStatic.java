class UseStatic {
static int a = 5;
static int b=6;

static {
        System.out.println("Static block initialized- this is before main");
        b=a*4;

}

static void method1(int x){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
}

public static void main(String[] args) {
        method1(55);
        AnotherStatic as = new AnotherStatic(); //only at this statement the static method will statements are executed

}

}


class AnotherStatic {
static int a = 10;
static int b=15;

static {
        System.out.println("Static Method in another class-without a call"); // first stmt
}

AnotherStatic(){
  System.out.println("Inside AnotherStatic constructor"); //second stmt
}
}
