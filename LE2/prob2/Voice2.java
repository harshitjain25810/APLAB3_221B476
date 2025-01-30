abstract class Voice2 {
    // Template method
    final void templateMethod() {
        prepareVoice();
        hear();
    }

    abstract void prepareVoice();
    abstract void hear();
}
