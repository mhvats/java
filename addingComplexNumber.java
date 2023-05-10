class Complex {
    float real, img;

    Complex(float r, float i) {
        real = r;
        img = i;
    }

    public void show() {
        System.out.print(real + " + " + img + "i ");
    }

    public static void main(String args[]) {
        Complex c1 = new Complex(2.5f, 3.6f);
        Complex c2 = new Complex(6.5f, 9.8f);

        c1.show();
        c2.show();
    }
}