import Math;
class Box {
double width;
double height;
double length;

Box(double wid,double hei, double len){
        this.width = wid;
        this.height=hei;
        this.length=len;
}
float volume(){
        return (float)(this.width*this.height*this.length);
}
}

class BoxDemo {
public static void main(String[] args) {
        Box b1 = new Box(4.5,9.8,2.6);
        System.out.println(b1.volume());

//    Box b2 = new Box();


}
}
