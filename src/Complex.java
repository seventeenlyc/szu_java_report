public class Complex {
    public double realPart,imagePart;
    public Complex(){this.realPart = 0;this.imagePart = 0;}
    public Complex(double realPart,double imagePart){
        this.realPart = realPart;this.imagePart = imagePart;
    }
    public Complex complexSub(Complex c){
        return new Complex(realPart-c.realPart,imagePart-c.imagePart);
    }
    public Complex complexMul(Complex c){
        return new Complex(realPart*c.realPart-imagePart*c.imagePart,realPart*c.imagePart+imagePart*c.realPart);
    }
    public String toString(){
        return realPart+"+"+imagePart+"i";
    }
}
void main(){
    Complex c1 = new Complex(3,9);
    Complex c2=new Complex(2,5);
    IO.println("c1-c2: "+c1.complexSub(c2).toString());
    IO.println("c1*c2: "+c2.complexMul(c1).toString());
}
