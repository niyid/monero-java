package utils;

/**
 * Utility class to start mining.
 */
public class StartMining {

  public static void main(String[] args) {
    startMining();
  }
  
  public static void startMining() {
    long numThreads = 6;
    //TestUtils.getWalletRpc().startMining(numThreads, false, true);
    TestUtils.getDaemonRpc().startMining("56SWsnhejUTbgNs2EgyXdfNXUawymMMuAC9voZZSQrHzJHNxGsAvMnoUja7JcKVtPwNc1oKAkoAt1cv6EmtKRQ22U37B7cT", numThreads, false, false);  // random subaddress
  }
}
