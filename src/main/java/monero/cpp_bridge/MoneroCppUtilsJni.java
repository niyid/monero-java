package monero.cpp_bridge;

/**
 * JNI calls for the cpp utilities.
 * 
 * These are separated because otherwise JNI header file cannot be
 * automatically generated without pulling in maven dependencies.
 */
public class MoneroCppUtilsJni {
  
  static {
    //System.out.println(System.getProperty("java.library.path"));
    //System.load("/Users/Eric/git/monero-java-rpc/lib/monero-java.dylib");
    System.loadLibrary("monero");
  }
  
  public native static void sayHello();

  public native static int[] jsonToBinary(String json);
  
  public native static String binaryToJson(int[] bin);
  
  public native static String binaryBlocksToJson(int[] binBlocks);
}