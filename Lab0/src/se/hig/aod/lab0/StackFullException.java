package se.hig.aod.lab0;

class StackFullException extends RuntimeException {
    /**
     * A constructor that takes a message about which error has been generated.
     * This can be written to the user when the exception is caught.
     */
    public StackFullException(String m) {
        super(m);
    }

}
