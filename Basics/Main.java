public class Main {
  static {
    System.loadLibrary("hello"); // <- C++Loading the library
  }
  public static void main(String[] args) {
    hello.hello();
  }
}
