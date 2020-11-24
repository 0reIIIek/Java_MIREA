package ex1;

public class Complex extends ConcreteFactory{
    public static int m_real;
    public static int m_image;
    public Complex() {
        m_real = 1;
        m_image = 1;
    }
    public Complex(int real, int image){
        m_real = real;
        m_image = image;
    }
}
